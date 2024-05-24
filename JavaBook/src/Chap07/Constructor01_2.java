package Chap07;

public class Constructor01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****학생 주소록*****");
		Student2_2 stObj = new Student2_2(); //기본 생성자 호출하며 stObj 객체 생성
		
		stObj.insertRecord(20221004, "홍길순"); //멤버 메서드 호출해서 정보 입력
		stObj.printInfo(); //멤버 메서드 호출
	}

}
