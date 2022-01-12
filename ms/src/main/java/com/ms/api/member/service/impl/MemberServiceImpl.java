package com.ms.api.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.api.member.dto.domain.Member;
import com.ms.api.member.repository.MemberRepository;
import com.ms.api.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepository memberRepository;
	
	@Override
	public Member join(Member member) throws Exception {
		boolean isDuplicate = false ; 
		
		isDuplicate = memberRepository.existsById(member.getId());
		
		
		if(!isDuplicate) {
			
			member = memberRepository.save(member);
			
		} else {
			
			throw new IllegalArgumentException("this Id[" + member.getId() + "] is already exist");
			
		}
		
		return member;
	}

}

