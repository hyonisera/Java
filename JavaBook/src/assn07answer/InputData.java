package assn07answer;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
class InputData{
	  int person;
	  int[] kor;
	  int[] eng;
	  int[] mat;
	  String[] name;
	  int[] sum;
	  double[] avg;
	  InputData(int person){
	    this.person = person;
	    kor = new int[person];
	    eng = new int[person];
	    mat = new int[person];
	    sum = new int[person];
	    avg = new double[person];
	    name = new String[person];
	  }
	  void setData(int num, String name, int kor, int eng, int mat){
	    this.name[num] = name;
	    this.kor[num] = kor;
	    this.eng[num] = eng;
	    this.mat[num] = mat;
	    sum[num] = kor + eng + mat;
	    avg[num] = sum[num] / 3;
	  }
	}