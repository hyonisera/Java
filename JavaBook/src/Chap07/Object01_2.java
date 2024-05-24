package Chap07;

public class Object01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_2 stObj1 = new Student_2(); //stObj1 객체 생성
		stObj1.id = 20221004; //stObj1에 있는 id가 20221004
		stObj1.name = "홍길순"; //stObj에 있는 name이 "홍길순"
		stObj1.printInfo(); //멤버 메서드 호출
		
		Student_2 stObj2 = new Student_2(); //stObj2 객체 생성
		stObj2.insertRecord(20021005, "홍길동"); //멤버 메서드 호출해서 정보 입력
		stObj2.printInfo(); //멤버 메서드 호출
	}

}
