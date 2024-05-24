package Chap07;

public class Constructor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****학생 주소록****");
		Student3 stObj = new Student3();
		
		stObj.insertRecord(20221004, "홍길순");
		stObj.printInfo();
		
		Student3 stObj2 = new Student3(20221005, "홍길동");
		stObj2.printInfo();
	}

}
