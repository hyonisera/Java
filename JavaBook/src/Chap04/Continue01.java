package Chap04;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4; i++) { //int형 변수 i가 1부터 4까지 1씩 증가
			for(int j = 1; j <= 3; j++) { //int형 변수 j가 1부터 3까지 1씩 증가
				if(i == 3 && j == 2) { //변수 i가 3이고 변수 j가 2인 경우
					continue; //건너뛰고 계속 실행
				}
				System.out.println(i + "*" + j); //변수 i가 3이고 변수 j가 2인 경우를 제외한 값 출력
			}
		}
	}

}
