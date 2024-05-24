package ttl7447;

public class CNVTbit { //10진수(num)를 2진수(4bit)로 변환하는 클래스
	private int num; //내부에서만 가지고 있음
	private int[] output = new int[4];
	
	CNVTbit() {
		num = 0;
		//for(int i = 0; i < 4; i++) output[i] = 0;
	}
	CNVTbit(int num) {
		this.num = num; //this.num은 클래스의 멤버 변수를 가리킴
	}
	void setNum(int num) { //num을 설정
		this.num = num; //클래스의 멤버 변수 num을 변경
	}
	int getNum() { //num 값을 반환
		return num;
	}
	void cnvtOutput() { //num을 4bit 배열로 변환=10진수를 2진수로 변환
		for(int i = 0; i < 4; i++) {
			output[i] = num % 2;
			num = num / 2;
		}
	}
	int[] getOutput() { //변환된 4bit 배열을 반환
		return output;
	}
}
