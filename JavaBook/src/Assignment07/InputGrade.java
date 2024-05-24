package Assignment07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InputGrade {
	String[] num;
	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	int[] avg;
	
	
	public InputGrade(int person) {
		num = new String[person];
		name = new String[person];
		kor = new int[person];
		eng = new int[person];
		mat = new int[person];
		sum = new int[person];
		avg = new int[person];
	}
	public void setGrade(int i, String num, String name, int kor, int eng, int mat) {
		this.num[i] = num;
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng;
		this.mat[i] = mat;
		this.sum[i] = kor + eng + mat;
		this.avg[i] = this.sum[i] / 3;
	}
	public void setTotal(int tkor, int teng, int tmat) {
		
	}
	public void headliner() {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		
		System.out.println("\t\t성적집계표");
		System.out.println("\t\t\t\t출력일자: " + formatedNow);
		System.out.println("============================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================================");
	}
	
}
