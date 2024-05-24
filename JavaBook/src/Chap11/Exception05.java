package Chap11;

public class Exception05 {
	void check(int weight) throws InvalidException {
		if(weight < 100) { //100보다 작으면 에러 처리
			throw new InvalidException("InvalidException 클래스 호출입니다.");
		}
	}
	public static void main(String[] args) {
		Exception05 obj = new Exception05();
		try {
			obj.check(60); //100보다 작은 숫자
		}
		catch(InvalidException ex) {
			System.out.println("예외 처리입니다.");
			System.out.println(ex.getMessage());
		}
	}
}
