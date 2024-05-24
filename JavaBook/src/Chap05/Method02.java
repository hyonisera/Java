package Chap05;

public class Method02 {
	
	public static int div() {
		int a = 10, b = 5;
		int result = a / b;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = div(); //div()를 바로 출력할 수 있지만, 정수형에 담긴다는 것을 보여주기 위함
		System.out.println(num);
	}

}
