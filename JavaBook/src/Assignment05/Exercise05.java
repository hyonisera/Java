package Assignment05;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop();
	}

	public static void loop() {
		// TODO Auto-generated method stub
		int check = 1;
		Scanner s = new Scanner(System.in);
		
		while(check == 1) {
			System.out.println("숫자를 입력하세요.");
			int i  = s.nextInt();
			
			if(i % 2 == 0) System.out.println("짝수 입니다.");
			else System.out.println("홀수 입니다.");
			
			System.out.println("계속하고 싶으면 예 1, 그만하고 싶으면 아니오 0을 입력하세요.");
			
			check = s.nextInt();
			while(check != 0 && check!= 1) {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				check = s.nextInt();
			}
		}
	}

}
