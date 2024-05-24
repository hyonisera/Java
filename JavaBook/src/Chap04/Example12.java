package Chap04;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++) { //초기화식: i = 0; 조건식: i <= 10; 증감식: i++
			if(i == 3 || i == 6 || i == 9) { //변수 i가 3 또는 6 또는 9일 경우
				continue; //건너뛰고 계속 실행
			}
			System.out.print(i + " "); //변수 i를 띄엄띄엄 출력
		}
	}

}
