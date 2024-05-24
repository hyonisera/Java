package Assignment04;

public class Assn8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; //int형 변수 i 선언 및 1로 초기화
		while(i <= 10) { //변수 i 값이 1부터 10 이하인 경우 (조건식): 세로
			int j = 0; //int형 변수 j 선언 및 초기화
			while(j < i) { //변수 j 값이 0부터 변수 i 값 미만인 경우 (조건식): 가로
				System.out.print("*"); //별 출력
				j++; //변수 j 1씩 증가 (증감식)
			}
			System.out.println(); //줄 바꿈
			i++; //변수 i 1씩 증가 (증감식)
		}
	}

}
