package ttl7447;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///*
		//CNVTbit cnvt = new CNVTbit();
		TTL7447 ttl7447_0 = new TTL7447();
		TTL7447 ttl7447_1 = new TTL7447();
		TTL7490 ttl7490_0 = new TTL7490();
		TTL7490 ttl7490_1 = new TTL7490();
		FND segment_0 = new FND();
		FND segment_1 = new FND();
		SCREEN screen = new SCREEN();
		
		int[] out0, out1 = new int[4];
		int[] fnd0, fnd1 = new int[8];
		
		for(int i = 0; i < 200; i++) {
			//cnvt.setNum(i); //현재 num 값(10진수) 저장
			//cnvt.cnvtOutput(); //현재 num 값 2진수(4bit)로 변환
			//out = cnvt.getOutput(); //변환된 4bit 배열을 받아 out에 저장
			
			//ttl7490.clkin(i % 2); //0하고 1 반복, 전 상태가 1이고 현 상태가 0이면 증가, 20번 호출
			out0 = ttl7490_0.countUp(0, i % 2);
			out1 = ttl7490_1.countUp(0, out0[3]); //일의 자리의 bit 3번이 8->9->0일 때 1->1->0 //10번에 한 번 카운트
			//System.out.println(ttl7490.getCount()); //00112233... 출력
			if(i % 2 == 0) { //짝수일 때만 출력, 10번 호출
				//out = ttl7490.getOutput(); //필요할 때만 받겠다.
			
				ttl7447_0.setInput(out0); //4bit 배열을 10진수로 바꾼 후 FND 테이블에 따라 8bit output 배열로 저장
				fnd0 = ttl7447_0.getOutput(); //output 8bit 값을 fnd에 저장
				
				ttl7447_1.setInput(out1);
				fnd1 = ttl7447_1.getOutput();
			
				//for(int j = 0; j < 8; j++) System.out.print(fnd[j]);
			
				//segment.setInit(); //FND 패턴을 공백으로 초기화
				segment_0.setFND(fnd0); //output 8bit 값을 FND 패턴으로 저장
				//screen.setScreen(0, segment_0.getFND());
				segment_0.dispFND(); //FND 패턴 출력
				
				segment_1.setFND(fnd1);
				//screen.setScreen(6, segment_1.getFND());
				segment_0.dispFND();
				
				//screen.dispScreen();
			
				System.out.println("\n\n");
			}
		}
		//*/
		/*
		CNVTbit cnvt1 = new CNVTbit(); //초기 num 값 0
		CNVTbit cnvt2 = new CNVTbit(3); //초기 num 값 3
		TTL7447 ttl7447 = new TTL7447(); //초기 output 값 11111100
		FND segment = new FND(); //초기 FND 픽셀 공백
		
		int[] out1 = new int[4];
		int[] out2 = new int[4];
		int[] fnd = new int[8];
		
		cnvt1.setNum(9); //num 값 9로 변경
		
		System.out.println(cnvt1.getNum()); //9 출력
		System.out.println(cnvt2.getNum()); //3 출력
		
		cnvt1.cnvtOutput(); //9를 4bit로 변환
		cnvt2.cnvtOutput(); //3을 4bit로 변환
		
		out1 = cnvt1.getOutput(); //1001 배열 저장(반대로)
		out2 = cnvt2.getOutput(); //0011 배열 저장(반대로)
		
		for(int i = 0; i < 4; i++) {
			System.out.print(out1[3-i]); //1001 배열 출력
		}
		System.out.println("");
		for(int i = 0; i < 4; i++) {
			System.out.print(out2[3-i]); //0011 배열 출력
		}
		System.out.println("");
		ttl7447.setInput(out1); //1001 배열(반대)을 10진수 9로 바꿔 11110110을 output에 저장
		System.out.println(ttl7447.getNum()); //9 출력
		
		fnd = ttl7447.getOutput(); //output 값 11110110을 fnd에 저장
		for(int i = 0; i < 8; i++) {
			System.out.print(fnd[i]); //11110110 출력
		}
		
		System.out.println("");
		segment.setFND(fnd); //FND 9 패턴 저장
		segment.dispFND(); //FND 9 패턴 출력
		*/
	}

}
