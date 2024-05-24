package Assignment06;

public class Assn05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 13; i++) { //1월부터 12월까지 반복
			System.out.print(i + "월 => "); //현재 월 출력
			
			//LOOP는 내부 반복문에서 바깥쪽 반복문까지 한꺼번에 탈출시킴
			LOOP:for(int j = 1; j < 32; j++) { //1일부터 31일까지 반복
				System.out.print(j + ","); //현재 일 출력
				
				switch(i) {
				case 4: case 6: case 9: case 11: //4월, 6월, 9월, 11월인 경우
					if(j == 30) break LOOP; //30일이면 반복문 탈출
					break;
				case 2: //2월인 경우
					if(j == 28) break LOOP; //28일이면 반복문 탈출
					break;
				}
			}
			System.out.println(); //줄 바꿈
		}
	}

}
