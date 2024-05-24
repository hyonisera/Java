package com.member.main;

import java.util.Scanner;
import com.member.controller.*;
import com.member.domain.Member;

public class Login {
	Admin admin = new Admin();
	Member member = admin.createAdmin();

	public void printLogin() {
		Scanner s = new Scanner(System.in);
		int countPwd = 0;
		
		while(true) {
			System.out.println("***************************************************");
			System.out.println("\t\t    로그인");
			System.out.println("***************************************************");
			
			System.out.print("아이디를 입력하세요 : ");
			String name = s.nextLine();
			
			if(!name.equals(member.getName())) {
				System.out.println("일치하는 아이디가 없습니다.");
				continue;
			}
			
			System.out.print("비밀번호를 입력하세요 : ");
			String pwd = s.nextLine();
			
			if(!pwd.equals(member.getPwd())) {
				countPwd++;
				System.out.println("비밀번호가 틀렸습니다.");
				
				if(countPwd >= 3) {
					System.out.println("로그인 횟수 초과");
					break;
				}
			} else {
				System.out.println("로그인 성공");
				break;
			}
		}
	}
}
