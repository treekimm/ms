package com.ms.membertest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ms.api.member.dto.domain.Member;
import com.ms.api.member.repository.MemberRepository;
import com.ms.api.member.service.MemberService;

@SpringBootTest
@Transactional
public class MemberTest {

	@Autowired
	MemberRepository memberRepository;
	@Autowired
	MemberService memberService;
	
	@Test
	public void saveTest() {
		
		Member member = new Member();
		
		member.setId("test2"); ;
		member.setEmail("test@test.com2");
		member.setNickName("imTest2");
		member.setPassword("test2");
		
		member = memberRepository.save(member); 
		
		Assertions.assertThat(member.getId()).isEqualTo("test2");
		
	}
	
	@Test
	public void joinTest() {
		Member member = new Member();
		
		member.setId("test2"); ;
		member.setEmail("test@test.com2");
		member.setNickName("imTest2");
		member.setPassword("test2");

		try {
			member = memberService.join(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assertions.assertThat(member.getId()).isEqualTo("test2");
		
	}
}
