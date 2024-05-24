package Chap07;

public class Encapsulation { //변수에 직접적으로 접근하지 않음 = 보안
	private String name; //멤버 클래스 내부에서만 접근 가능

	public String getName() { //접근을 위해 setter와 getter라는 장치를 만들어 내부에서 접근가능
		return name; //외부에서 name 변수의 값을 읽을 수 있도록 함
	}

	public void setName(String name) {
		this.name = name; //외부에서 name 변수의 값을 변경할 수 있도록 함
		//this는 현재 객체를 의미, 전달받은 name 매개변수의 값을 현재 객체의 name 멤버 변수에 할당
		//멤버 클래스 내에 있는 private String name
	}
	
}
