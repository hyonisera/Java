package com.section03;

public class Package04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "www.google.com";
		//String str1 = "www0google0com";
		
		String[] arrStr1;
		
		arrStr1 = str1.split("\\."); //점이 갖고 있는 특수성 때문에 이스케이프 문자 2개 넣어줘야 함
		//arrStr1 = str1.split("0");
		
		for(int i = 0; i < arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}
	}

}
