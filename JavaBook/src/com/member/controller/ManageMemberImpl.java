package com.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.member.domain.Member;

public class ManageMemberImpl extends ManageMember {
	List<Member> mem = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	int num = 1;

	@Override
	public boolean createMember(String name, int phone) {
		System.out.print("등록하실 회원의 이름을 입력하세요: ");
		name = s.nextLine();
		
		System.out.print("등록하실 회원의 연락처를 입력하세요: ");
		phone = s.nextInt();
		
		s.nextLine();
		System.out.print("등록하실 회원의 주소를 입력하세요: ");
		String addr = s.nextLine();
		
		System.out.print("등록하실 회원의 비밀번호를 입력하세요: ");
		String pwd = s.nextLine();
		
		mem.add(new Member(num, name, phone, addr, pwd));
		System.out.println("등록 완료되었습니다.");
		num++;
		
		return true;
	}

	@Override
	public boolean readMember(String name) {
		for(Member member : mem) {
			if(member.getName().equals(name)) {
				System.out.println(name + " 고객 정보: ");
				System.out.println("회원번호: " + member.getNum() + "\t이름: " + member.getName() 
									+ "\t연락처: " + member.getPhone() + "\t주소: " + member.getAddr());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateMember(String name) {
		for(Member member : mem) {
			if(member.getName().equals(name)) {
				System.out.print(name + " 회원의 비밀번호를 입력하세요: ");
				String pwd = s.nextLine();
				if(!pwd.equals(member.getPwd())) {
					System.out.println("비밀번호가 일치하지 않아 수정할 수 없습니다.");
					return false;
				}
				
				System.out.print(name + " 회원의 이름을 수정하세요: ");
				String newName = s.nextLine();
				if(newName.isEmpty()) {
					newName = member.getName();
				}
				System.out.print(name + " 회원의 연락처를 수정하세요: ");
				String phoneInput = s.nextLine();
				int newPhone = member.getPhone();
				if(!phoneInput.isEmpty()) {
					try {
						newPhone = Integer.parseInt(phoneInput); //문자열을 숫자로 변환
					} catch(NumberFormatException e) { 
						//예외가 발생해도 newPhone은 초기값으로 유지됨
					}
				}
				System.out.print(name + " 회원의 주소를 수정하세요: ");
				String newAddr = s.nextLine();
				if(newAddr.isEmpty()) {
					newAddr = member.getAddr();
				}
				
				member.setName(newName);
				member.setPhone(newPhone);
				member.setAddr(newAddr);
				System.out.println("수정 완료되었습니다.");
				return true;
			}
		}
		return false;
	}

	@Override
	boolean deleteMember(int num) {
		
		return false;
	}

	@Override
	boolean fileMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void listMember() {
		// TODO Auto-generated method stub
		
	}

}
