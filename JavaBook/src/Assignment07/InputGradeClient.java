package Assignment07;

public class InputGradeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 30;
		
		InputGrade inGrade = new InputGrade(person);
		
		for(int i = 0; i < person; i++) {
			String num = String.format("%03d", (i + 1));
			String name = "홍길" + String.format("%02d", (i + 1));
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			inGrade.setGrade(i, num, name, kor, eng, mat);
		}
		inGrade.headliner();
		for(int i = 0; i < person; i++) {
			System.out.println(inGrade.num[i] + "\t" + inGrade.name[i] + "\t" + inGrade.kor[i] + "\t" + 
						inGrade.eng[i] + "\t" + inGrade.mat[i] + "\t" + inGrade.sum[i] + "\t" + inGrade.avg[i]);
		}
		System.out.println("============================================================");
		
	}

}
