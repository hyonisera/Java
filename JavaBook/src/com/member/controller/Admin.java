package com.member.controller;

import java.util.ArrayList;
import java.util.List;
import com.member.domain.Member;

public class Admin {
	
	public Member createAdmin() {

		List<Member> mem = new ArrayList<>();
		mem.add(new Member(1, "admin", 01011112222, "관리자주소", "admin"));
		
		return mem.get(0);
	}
}
