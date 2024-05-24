package com.member.controller;

public abstract class ManageMember {
	
	abstract boolean createMember(String name, int phone);
	
	abstract boolean readMember(String name);
	
	abstract boolean updateMember(String name);
	
	abstract boolean deleteMember(int num);
	
	abstract boolean fileMember();
	
	abstract void listMember();
}
