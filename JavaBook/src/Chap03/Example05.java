package Chap03;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x++); //x를 먼저 뽑았으니 10이 출력되지만 뽑은 후에 더했으니 11이 담겨져 있음
		System.out.println(++x);
		System.out.println(x--); 
		System.out.println(--x);
	}

}
