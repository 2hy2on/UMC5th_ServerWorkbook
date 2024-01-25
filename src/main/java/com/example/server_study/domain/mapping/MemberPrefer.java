//package com.example.server_study.domain.mapping;
//
//import jakarta.persistence.*;
//import lombok.*;
//import com.example.server_study.domain.FoodCategory;
//import  com.example.server_study.domain.Member;
//import  com.example.server_study.domain.common.BaseEntity;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class MemberPrefer extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_id")
//    private FoodCategory foodCategory;
//
//    public void setMember(Member member){
//        if(this.member != null)
//            member.getMemberPreferList().remove(this);
//        this.member = member;
//        member.getMemberPreferList().add(this);
//    }
//
//    public void setFoodCategory(FoodCategory foodCategory){
//        this.foodCategory = foodCategory;
//    }
//}