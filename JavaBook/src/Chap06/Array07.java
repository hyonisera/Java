package Chap06;

public class Array07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java"); //똑같은 이름이여도 영역을 따로 잡아줘서 밑에랑 다름
		String s2 = new String("Java");
		String s3 = s1;
		
		if(s1 == s2) System.out.println("s1과 s2는 같다"); //정확히하려면 or조건 넣어줘야함
		else System.out.println("s1과 s2는 같지 않다");
		
		if(s1 == s3) System.out.println("s1과 s3은 같다");
		else System.out.println("s1과 s3는 같지 않다");
		
		if(s1.equals(s2)) System.out.println("s1과 s2의 값은 같다");
		else System.out.println("s1과 s2의 값은 같지 않다");
	}

}
