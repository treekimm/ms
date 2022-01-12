package com.ms.api.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ms.api.member.dto.domain.Member;
import com.ms.api.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@PostMapping(value = "/member")
	@ResponseBody
	public Member saveMamber(Member member, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Member result = new Member();
		
		result = memberService.join(member);
		
		return result;
	}
	
}
