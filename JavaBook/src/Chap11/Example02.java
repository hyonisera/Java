package Chap11;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer in = new Integer("abc"); //Integer = 문자열을 정수로 변환, 변환할 수 없는 문자열이기 때문에 예외 발생
			in.intValue(); //Integer 객체에서 int형 값을 뽑아내는 메서드, 여기까지 도달하지 못함
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 ArithmeticException " + e);
		}
		catch(NumberFormatException e) { //더 자세히 알려줌, Exception e는 불친절하게 알려줌
			System.out.println("예외 발생 NumberFormatException " + e);
		}
		System.out.println("try~catch문의 외부 문장입니다.");
	}

}
