package Assignment06;

public class Assn03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 13; i++) { //1월부터 12월까지 반복
			System.out.print(i + "월 => "); //현재 월 출력
			
			for(int j = 1; j < 32; j++) { //1일부터 31일까지 반복
				System.out.print(j + ","); //현재 일 출력
				
				if(i == 1 && j == 31) break; //1월이고 31일인 경우 반복문 탈출
				if(i == 2 && j == 28) break; //2월이고 28일인 경우 반복문 탈출
				if(i == 3 && j == 31) break; //3월이고 31일인 경우 반복문 탈출
				if(i == 4 && j == 30) break; //4월이고 30일인 경우 반복문 탈출
				if(i == 5 && j == 31) break; //5월이고 31일인 경우 반복문 탈출
				if(i == 6 && j == 30) break; //6월이고 30일인 경우 반복문 탈출
				if(i == 7 && j == 31) break; //7월이고 31일인 경우 반복문 탈출
				if(i == 8 && j == 31) break; //8월이고 31일인 경우 반복문 탈출
				if(i == 9 && j == 30) break; //9월이고 30일인 경우 반복문 탈출
				if(i == 10 && j == 31) break; //10월이고 31일인 경우 반복문 탈출
				if(i == 11 && j == 30) break; //11월이고 30일인 경우 반복문 탈출
				if(i == 12 && j == 31) break; //12월이고 31일인 경우 반복문 탈출
			}
			System.out.println(); //줄 바꿈
		}
	}

}
