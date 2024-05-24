package Assignment04;

public class Assn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) { //int형 변수 i가 1부터 10까지 1씩 증가: 세로
			for(int j = 0; j < i; j++) { //int형 변수 j가 0부터 변수 i-1까지 1씩 증가: 가로
				System.out.print("*"); //별 출력
			}
			System.out.println(); //줄 바꿈
		}
	}

}
