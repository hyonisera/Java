package Chap03;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //input이라는 형태를 선언해줌
		
		System.out.println("당신의 이름을 입력하세요.");
		String name = input.nextLine(); //string 형태를 받아오려면 nextLine을 쓰면 됨, 엔터 치기 전까지의 내용을 받는게 nextLine
		System.out.println("당신의 이름: " + name);
	}

}
