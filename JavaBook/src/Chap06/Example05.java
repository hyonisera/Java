package Chap06;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java"; //스트링 풀: 미리 만들어놓은 메모리 공간, 가져다 쓰는 것
		String s3 = new String("Java"); //메모리 공간을 새로 만드는 것, 스트링을 새로 만드는 것
		String s4 = new String("Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
