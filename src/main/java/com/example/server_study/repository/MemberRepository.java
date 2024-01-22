package com.example.server_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.server_study.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}