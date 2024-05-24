package Chap07;

public class Constructor02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****학생 주소록*****");
		Student3_2 stObj1 = new Student3_2();
		stObj1.insertRecord(20221004, "홍길순");
		stObj1.printInfo();
		
		Student3_2 stObj2 = new Student3_2(20221005, "홍길동");
		stObj2.printInfo();
	}

}
