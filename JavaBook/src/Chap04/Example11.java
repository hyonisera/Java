package Chap04;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n = 1; n <= 5; n++) { //초기화식: n = 1; 조건식: n <= 5; 증감식: n++
			System.out.println("*"); //별 출력
			if(n == 2) { //변수 n이 2일 때
				break; //종료
			}
		}
	}

}
