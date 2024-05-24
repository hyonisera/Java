package Chap04;

public class Break01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) { //int형 변수 i가 0부터 9까지 1씩 증가
			if(i == 5) //변수 i가 5인 경우
				break; //종료
			System.out.println("i : " + i); //변수 i는 0부터 4까지 출력됨
		}
	}

}
