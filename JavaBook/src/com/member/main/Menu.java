package com.member.main;

import java.util.Scanner;
import com.member.controller.*;
import com.member.domain.Member;

public class Menu {
	
	public void printMenu() {
		ManageMemberImpl m = new ManageMemberImpl();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("***************************************************");
			System.out.println("\t\t회원 관리 프로그램");
			System.out.println("***************************************************");
			System.out.println("  1. 고객 정보 등록하기\t2. 고객 정보 조회하기");
			System.out.println("  3. 고객 정보 수정하기\t4. 고객 정보 삭제하기");
			System.out.println("  5. 고객 정보 목록보기\t6. 고객 정보 파일출력");
			System.out.println("  7. 종료");
			System.out.println("***************************************************");
			System.out.print("메뉴 번호를 선택해주세요 ");
			int menuNum = s.nextInt();
			
			switch(menuNum) {
			case 1:
				m.createMember("", 0);
				continue;
			case 2:
				s.nextLine();
				System.out.print("조회할 회원 이름을 입력해주세요 ");
				String readName = s.nextLine();
				m.readMember(readName);
				continue;
			case 3:
				s.nextLine();
				System.out.print("수정할 회원 이름을 입력해주세요 ");
				String updateName = s.nextLine();
				m.updateMember(updateName);
				continue;
			case 7:
				System.out.println("회원 관리 프로그램을 종료합니다.");
				return;
			}
		}
	}
}
