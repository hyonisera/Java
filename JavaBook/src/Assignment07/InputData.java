package Assignment07;

public class InputData {
	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] avg;
	
	public InputData(int person) {
		name = new String[person];
		kor = new int[person];
		eng = new int[person];
		mat = new int[person];
		sum = new int[person];
		avg = new double[person];
	}
	public void setData(int i, String name, int kor, int eng, int mat) {
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng;
		this.mat[i] = mat;
		this.sum[i] = kor + eng + mat;
		this.avg[i] = this.sum[i] / 3.0;
	}
}
