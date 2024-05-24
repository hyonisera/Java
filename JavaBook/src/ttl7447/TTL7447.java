package ttl7447;

public class TTL7447 { //4bit(num 값)에서 8bit(FND)로 변환하는 클래스
	private int[] input = new int[4]; //4bit 입력 값
	private int[] output = new int[8]; //FND 8bit로 변환된 결과 저장
	private int num; //입력 값에 대한 10진수 번호를 저장
	private int[][] table = {
			{1,1,1,1,1,1,0,0},
			{0,1,1,0,0,0,0,0},
			{1,1,0,1,1,0,1,0},
			{1,1,1,1,0,0,1,0},
			{0,1,1,0,0,1,1,0},
			{1,0,1,1,0,1,1,0},
			{1,0,1,1,1,1,1,0},
			{1,1,1,0,0,1,0,0},
			{1,1,1,1,1,1,1,0},
			{1,1,1,1,0,1,1,0}
	};
	
	TTL7447() {
		num = 0; //0으로 초기화
		for(int i = 0; i < 8; i++) {
			output[i] = table[num][i]; //11111100으로 초기화
		}
	}
	void setInput(int[] in) { //입력을 설정
		input = in;
		num = input[3] * 8 + input[2] * 4 + input[1] * 2 + input[0]; //입력을 10진수로 변환
		for(int i = 0; i < 8; i++) {
			output[i] = table[num][i]; //테이블을 참조하여 출력을 설정
		}
	}
	void setNum(int num) { //num을 설정
		this.num = num; //현재의 num 값으로 변경
		for(int i = 0; i < 4; i++) { //num 값 4bit로 변환
			output[i] = num % 2; //4bit
			num = num / 2;
		}
	}
	int getNum() { //num 값을 반환
		return num;
	}
	int[] getInput() { //입력 값을 반환
		return input;
	}
	int[] getOutput() { //출력 값을 반환
		return output;
	}
 }
