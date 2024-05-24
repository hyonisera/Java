package Chap06;

public class Array07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java"); //스트링을 새로 만들어서 문자열 s1에 저장
		String s2 = new String("Java"); //스트링을 새로 만들어서 문자열 s2에 저장
		String s3 = s1; //s1과 s3는 같은 주소
		
		//두 문자열 객체의 주소값을 비교, s1과 s2는 주소값이 다름
		if(s1 == s2) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 같지 않다");
		
		if(s1 == s3) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 같지 않다");
		
		//두 문자열 객체의 값이 같은지 비교, Java로 값이 같음
		if(s1.equals(s2)) System.out.println("s1과 s2의 값은 같다");
		else System.out.println("s1과 s2의 값은 같지 않다");
	}

}
