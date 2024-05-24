package Assignment06;

public class Assn08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 1001034567; //정수형 변수 iNumVal 선언 및 초기값 할당
		String sNumVal = String.valueOf(iNumVal); //정수형 변수 iNumVal을 문자열로 변환하여 문자열형 변수 sNumVal에 저장
		String sNumVoice = ""; //결과값 저장할 변수 선언 및 초기화
		
		System.out.println("==> " + sNumVal + "[" + sNumVal.length() + "자리]"); //변수 sNumVal과 그 길이를 출력
		
		//각 숫자와 단위를 나타내는 배열 생성
		String[] units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String[] unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
		
		//반복문에서 사용할 정수형 변수 i, j 초기화
		int i, j;
		i = 0; //숫자
		j = sNumVal.length() - 1; //단위
		
		while(true) { //무한반복
			if(i >= sNumVal.length()) break; //변수 i가 sNumVal의 길이 이상이면 반복문 종료
			
			//현재 숫자와 해당 숫자의 한글 표현을 출력
			System.out.print(sNumVal.substring(i, i + 1) + "[" + units[Integer.parseInt(sNumVal.substring(i, i + 1))] + "]");
			
			if(sNumVal.substring(i, i + 1).equals("0")) { //현재 숫자가 0인 경우
				if(unitX[j].equals("만") || unitX[j].equals("억")) { //현재 자리의 단위가 만이나 억인 경우
					sNumVoice = sNumVoice + "" + unitX[j]; //결과값에 단위만 추가
				}
				else {
					//그 외의 경우에는 아무 동작 하지 않음
				}
			}
			else { //현재 숫자가 0이 아닌 경우
				//결과값에 숫자와 단위 추가
				sNumVoice = sNumVoice + units[Integer.parseInt(sNumVal.substring(i, i + 1))] + unitX[j];
			}
			i++; j--; //숫자 인덱스는 증가, 단위 인덱스는 감소
		}
		System.out.println("\n" + sNumVal + "[" + sNumVoice + "]"); //결과값 출력
	}

}
