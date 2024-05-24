package Assignment05;

public class Assn04 {
	public static void star() { //매개변수와 반환 값 모두 없는 star() 메서드 선언
		for(int i = 1; i <= 10; i++) { //int형 변수 i가 1부터 10까지 1씩 증가: 세로
			for(int j = 0; j < i; j++) { //int형 변수 j가 0부터 변수 i-1까지 1씩 증가: 가로
				System.out.print("*"); //별 출력
			}
			System.out.println(); //줄 바꿈
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star(); //star() 메서드 호출
	}

}
