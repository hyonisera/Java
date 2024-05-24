package Assignment06;

public class Assn07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; //숫자 한글 표기 배열
		for(int i = 0; i < 101; i++) { //0부터 100까지 반복
			if(i >= 0 && i < 10) { //일의 자리인 경우
				System.out.println(" 일의 자리: " + units[i]); //일의 자리를 한글로 출력
			}
			else if(i >= 10 && i < 100) { //십의 자리인 경우
				int i10, i0; 
				i10 = i / 10; //십의 자리를 계산
				i0 = i % 10; //일의 자리를 계산
				
				if(i0 == 0) { //일의 자리가 0인 경우
					System.out.println(" 십의 자리: " + units[i10] + "십"); //십의 자리만 출력
				}
				else { //일의 자리가 0이 아닌 경우
					System.out.println(" 십의 자리: " + units[i10] + "십" + units[i0]); //십의 자리와 일의 자리를 한글로 출력
				}
			}
			else { //그 외의 경우
				System.out.println("==> " + i); //숫자 그대로 출력
			}
		}
	}

}
