package Assignment02; //패키지명 Assignment02로 선언

public class InformationEx { //클래스명 InformationEx로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; //문자열형 String 변수 name 선언
		int age; //정수형 int 변수 age 선언
		long studentNumber; //정수형 long 변수 studentNumber 선언
		name = "김효은"; //name 변수 초기화
		age = 26; //age 변수 초기화
		studentNumber = 2425343006L; //studentNumber 변수 초기화
		
		System.out.println("이름: " + name); //큰따옴표 안의 문자열과 name 변수 결합하여 출력
		System.out.println("나이: " + age); //큰따옴표 안의 문자열과 age 변수 결합하여 출력
		System.out.println("학번: " + studentNumber); //큰따옴표 안의 문자열과 studentNumber 변수 결합하여 출력
	}

}
