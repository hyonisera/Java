package Chap04_2;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int n1 = scan.nextInt();
		
		scan.nextLine(); //엔터를 받음(개행문자)
		
		System.out.print("사칙연산 기호를 입력하세요: ");
		String op = scan.nextLine();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int n2 = scan.nextInt();
		
		switch(op) {
		case "+":
			System.out.println(n1 + op + n2 + "=" + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + op + n2 + "=" + (n1 - n2));
			break;
		case "*":
			System.out.println(n1 + op + n2 + "=" + (n1 * n2));
			break;
		case "/":
			System.out.println(n1 + op + n2 + "=" + (n1 / n2));
			break;
		case "%":
			System.out.println(n1 + op + n2 + "=" + (n1 / n2));
			break;
		default:
			break;
		}
		
		/*if(op.equals("+")) {
			System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
		}*/
	}

}
