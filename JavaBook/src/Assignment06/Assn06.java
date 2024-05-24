package Assignment06;

public class Assn06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //각 월의 일수를 저장한 배열
		
		for(int i = 1; i < 13; i++) { //1월부터 12월까지 반복
			System.out.print(i + "월 => "); //현재 월 출력
			
			for(int j = 1; j < 32; j++) { //1일부터 31일까지 반복
				System.out.print(j); //현재 일 출력
				
				if(iday[i - 1] == j) break; //현재 월의 일수와 현재 일이 같으면 탈출
				System.out.print(","); //마지막일 때 콤마 안 찍기
			}
			System.out.println(); //줄 바꿈
		}
	}

}
