package Assignment04;

public class Assn9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) { //int형 변수 i가 1부터 9까지 1씩 증가: 구구단의 각 단을 제어
			System.out.println("**********"); //큰따옴표 안의 문자열 출력
			System.out.println("구구단 " + i + " 단"); //큰따옴표 안의 문자열과 변수 i 결합하여 출력: 현재 출력하는 단 표시
			System.out.println("**********"); //큰따옴표 안의 문자열 출력
			for(int j = 1; j < 10; j++) { //int형 변수 j가 1부터 9까지 1씩 증가: 각 단의 곱셈을 제어
				System.out.println(i + " * " + j + " = " + i * j); //각 단의 곱셈 결과 출력
			}
		}
	}

}
