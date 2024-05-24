package com.member.main;

import com.member.controller.*;
import com.member.domain.Member;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.printLogin();
		Menu menu = new Menu();
		menu.printMenu();
	}

}
