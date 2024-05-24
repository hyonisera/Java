package Assignment06;

public class Assn04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 13; i++) { //1월부터 12월까지 반복
			System.out.print(i + "월 => "); //현재 월 출력
			
			for(int j = 1; j < 32; j++) { //1일부터 31일까지 반복
				System.out.print(j + ","); //현재 일 출력
				
				if(i == 4 || i == 6 || i == 9 || i == 11) { //4월, 6월, 9월, 11월인 경우
					if(j == 30) break; //30일이면 반복문 탈출
				}
				if(i == 2) { //2월인 경우
					if(j == 28) break; //28일이면 반복문 탈출
				}
				/*if((i == 4 || i == 6 || i == 9 || i == 11) && j == 30) break; //4월, 6월, 9월, 11월이고 30일인 경우 반복문 탈출
				if(i == 2 && j == 28) break; //2월이고 28일인 경우 반복문 탈출*/
			}
			System.out.println(); //줄 바꿈
		}
	}

}
