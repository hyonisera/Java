package ttl7447;

public class TTL7490 {
	private int clk;
	private int r0;
	private int count;
	private int[] output = new int[4];
	
	TTL7490() { //0으로 초기화
		clk = 0;
		r0 = 0;
		count = 0;
		for(int i = 0; i < 4; i++) {
			output[i] = 0;
		}
	}
	TTL7490(int r0) { //지금은 사용X, 시계 count 2부터 시작할 때 count 2로 바꿔줌
		this.r0 = r0;
		if(r0 == 1) {
			count = 0;
			for(int i = 0; i < 4; i++) {
				output[i] = 0;
			}
		}
	}
	void resetCount() { //count를 강제로 0으로 만듦
		count = 0;
		for(int i = 0; i < 4; i++) {
			output[i] = 0;
		}
	}
	void clkin(int clk) { //clk 입력을 위한 것
		if(this.clk == 1 && clk == 0) { //이전 clk은 1이고 현재 clk이 0이면 증가, clk는 받은 것, this.clk는 저장된 것
			if(++count == 10) {
				count = 0;
			}
		}
		this.clk = clk; //현 상태 저장
	}
	int getCount() {
		return count;
	}
	int[] getOutput() {
		int cnt = count;
		for(int i = 0; i < 4; i++) {
			output[i] = cnt % 2;
			cnt = cnt / 2; //count로 하면 값이 변하니까 cnt로
		}
		return output; //4bit 반환
	}
	int[] countUp(int r0, int clk) { //구분되어 있는 메서드들을 하나로
		if(r0 == 1) resetCount();
		else clkin(clk);
		return getOutput();
	}
}
