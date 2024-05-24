package Chap06;

public class Array06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java Programming "; //공백이 포함된 문자열을 생성
		String s1 = "Java"; //문자열 생성
		String s2 = " Programming"; //공백이 포함된 문자열을 생성
		String s3 = s1.concat(s2); //문자열 s1에 문자열 s2를 이어 붙여 새로운 문자열 생성
		String s4 = s.trim(); //문자열 s의 앞뒤 공백을 제거한 새로운 문자열 생성
		
		System.out.println("s3 " + s3); //문자열 s3 출력
		System.out.println("s4 " + s4); //문자열 s4 출력
		System.out.println("s3.equals(s4) " + s3.equals(s4)); //두 문자열이 동일한지 여부를 출력
	}

}
