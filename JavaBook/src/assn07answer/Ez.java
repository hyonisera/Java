package assn07answer;

public class Ez {
		  public static void main(String[] args) {
		    int person = 30;
		    int sumeng = 0, sumkor = 0, summat = 0, sumsum = 0, sumavg = 0;
		    int avgeng, avgkor, avgmat, avgsum, avgavg;
		    InputData inData = new InputData(person);
		    for(int i=0; i<person; i++){
		      String name = "홍길" + i;
		      int kor = (int)(Math.random() * 100);
		      int eng = (int)(Math.random() * 100);
		      int mat = (int)(Math.random() * 100);
		      inData.setData(i, name, kor, eng, mat);
		    }
		    for(int i=0; i<person; i++){
		      sumkor += inData.kor[i];
		      sumeng += inData.eng[i];
		      summat += inData.mat[i];
		      sumsum += inData.sum[i];
		      sumavg += inData.avg[i];
		    }
		    avgkor = (int)(sumkor / person);
		    avgeng = (int)(sumeng / person);
		    avgmat = (int)(summat / person);
		    avgsum = (int)(sumsum / person);
		    avgavg = (int)(sumavg / person);
		    System.out.println("\t\t\t성적집계표");
		    System.out.println("\t\t\t\t\t\t\t출력일자: ");
		    System.out.println("=================================================================");
		    System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		    System.out.println("=================================================================");
		    for(int i=0; i<person; i++){
		      System.out.println(i + "\t\t" + inData.name[i] + "\t" + inData.kor[i] + "\t\t" + inData.eng[i] + "\t\t" + inData.mat[i] + "\t\t" + inData.sum[i] + "\t\t" + (int)inData.avg[i]);
		    }
		    System.out.println("=================================================================");
		    System.out.println("합계\t\t\t" + sumkor + "\t" + sumeng + "\t" + summat + "\t" + sumsum + "\t" + sumavg);
		    System.out.println("평균\t\t\t" + avgkor + "\t\t" + avgeng + "\t\t" + avgmat + "\t\t" + avgsum + "\t\t" + avgavg);
		  }
		}