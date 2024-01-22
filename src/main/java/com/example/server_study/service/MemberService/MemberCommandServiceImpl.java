package com.example.server_study.service.MemberService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.server_study.apiPayload.code.status.ErrorStatus;
import  com.example.server_study.apiPayload.exception.handler.FoodCategoryHandler;
import  com.example.server_study.converter.MemberConverter;
import  com.example.server_study.converter.MemberPreferConverter;
import  com.example.server_study.domain.FoodCategory;
import  com.example.server_study.domain.Member;
import  com.example.server_study.domain.mapping.MemberPrefer;
import  com.example.server_study.repository.FoodCategoryRepository;
import  com.example.server_study.repository.MemberRepository;
import  com.example.server_study.web.dto.MemberRequestDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{

    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        Member newMember = MemberConverter.toMember(request);
        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }
}
