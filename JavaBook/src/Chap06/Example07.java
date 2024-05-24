package Chap06;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		
		String s5 = "10000"; //int로 형변환하면 더해짐
		String s6 = "300";
		System.out.println(s5 + s6);
		
		System.out.println(s1 == s2);
		System.out.println(s1 != s2);
		
		System.out.println(s2 == s3);
		System.out.println(s2 != s3);
		String s4 = s2 + s3;
		System.out.println(s4);
	}

}
