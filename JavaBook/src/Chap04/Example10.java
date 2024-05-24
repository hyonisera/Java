package Chap04;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 4; i++) { //초기화식: i = 2; 조건식: i <= 4; 증감식: i++
			System.out.println("구구단" + i + "단"); //실행 코드
			
			for(int j = 1; j <= 10; j++) { //초기화식: j = 1; 조건식: j <= 10; 증감식: j++
				System.out.println(i + "*" + j + "=" + (i * j)); //실행 코드
			}
		}
	}

}
