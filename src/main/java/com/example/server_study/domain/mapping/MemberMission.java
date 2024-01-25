//package com.example.server_study.domain.mapping;
//
//import jakarta.persistence.*;
//import lombok.*;
//import  com.example.server_study.domain.Member;
//import  com.example.server_study.domain.Mission;
//import  com.example.server_study.domain.common.BaseEntity;
//import  com.example.server_study.domain.enums.MissionStatus;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class MemberMission extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Enumerated(EnumType.STRING)
//    private MissionStatus status;
//
//    @ManyToOne
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    @ManyToOne
//    @JoinColumn(name = "mission_id")
//    private Mission mission;
//
//    public void setMember(Member member){
//        this.member = member;
//        member.getMemberMissionList().add(this);
//    }
//}