package Chap11;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			System.out.println("잘못된 요소에 접근: " + a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("예외 발생 ArrayIndexOutOfBoundsException : 여기에 e 출력 " + e);
		}
		finally {
			System.out.println("finally는 항상 실행됩니다.");
		}
	}

}
