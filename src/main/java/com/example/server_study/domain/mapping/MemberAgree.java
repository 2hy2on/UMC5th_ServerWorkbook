//package com.example.server_study.domain.mapping;
//
//import jakarta.persistence.*;
//import lombok.*;
//import com.example.server_study.domain.Member;
//import  com.example.server_study.domain.Terms;
//import  com.example.server_study.domain.common.BaseEntity;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class MemberAgree extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "terms_id")
//    private Terms terms;
//}
