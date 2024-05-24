package com.section03;

import com.mypackage.Cat;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat01 = new Cat();
		Cat cat02 = new Cat();
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		System.out.println(cat01.equals(cat02)); //서로 다른 메모리 공간에 할당되어 있으므로 다른 객체
		cat01 = cat02;
		System.out.println(cat01.equals(cat02));
	}

}
