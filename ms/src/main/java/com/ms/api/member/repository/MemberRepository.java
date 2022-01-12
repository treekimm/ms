package com.ms.api.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.api.member.dto.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	boolean existsById(String id);
}
