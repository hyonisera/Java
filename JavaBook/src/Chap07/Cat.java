package Chap07;

public class Cat implements Animal { //abstract class는 한 군데서만 상속받고, interface는 여러 군데서 상속받음

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("고양이 울음소리는 야옹야옹");
	}

	@Override
	public void Sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzz");
	}
	
}
