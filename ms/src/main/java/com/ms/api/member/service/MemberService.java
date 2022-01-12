package com.ms.api.member.service;

import com.ms.api.member.dto.domain.Member;

public interface MemberService {
	public Member join(Member member) throws Exception;
}
