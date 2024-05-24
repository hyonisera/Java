package Chap05;

public class Method06_2 {
	//sum() 메서드 오버로딩
	public static int sum(int x, int y) { //매개변수가 int형 변수 x, y이고 반환 값이 int형인 메서드
		return (x + y); //변수 x, y를 더한 값을 반환
	}
	public static int sum(int x, int y, int z) { //매개변수가 int형 변수 x, y, z이고 반환 값이 int형인 메서드
		return (x + y + z); //변수 x, y, z을 더한 값을 반환
	}
	public static double sum(double x, double y) { //매개변수가 double형 변수 x, y이고 반환 값이 double형인 메서드
		return (x + y); //변수 x, y를 더한 값을 반환
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum(10, 20)의 값: " + sum(10, 20)); //매개변수 x, y가 int형인 메서드 호출하고, 큰따옴표 안의 문자열과 결합하여 출력
		System.out.println("sum(10, 20, 30)의 값: " + sum(10, 20, 30)); //매개변수 x, y, z가 int형인 메서드 호출하고, 큰따옴표 안의 문자열과 결합하여 출력
		System.out.println("sum(10.5, 20.5)의 값: " + sum(10.5, 20.5)); //매개변수 x, y가 double형인 메서드 호출하고, 큰따옴표 안의 문자열과 결합하여 출력
	}

}
