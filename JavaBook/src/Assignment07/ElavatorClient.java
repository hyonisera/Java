package Assignment07;

public class ElavatorClient {
	private static int inVal;
	public static void up() {
		inVal++;
		System.out.println("그냥 메서드 " + inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inVal = 0;
		Elevator elev = new Elevator(); //클래스를 받아 인스턴스를 생성하여 객체에 연결
		
		up(); //메인 클래스 내의 메서드 실행
		
		for(int i = 0; i < 10; i++) {
			elev.up(); //Elevator 클래스를 찍어낸 elev 객체의 up() 메서드
			System.out.println("MSG: " + elev.help);
		}
		for(int i = 0; i < 10; i++) {
			elev.down();
			System.out.println("MSG: " + elev.help);
		}
	}

}
