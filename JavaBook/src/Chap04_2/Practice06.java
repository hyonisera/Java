package Chap04_2;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int m = 10;
		
		while(true) {
			for(int i = 0; i < m; i++) System.out.print(" ");
			for(int i = 0; i < n; i++) System.out.print("*");
			System.out.println();
			
			m = m - 1;
			n = n + 2;
			if(m < 0) break;
		}
	}

}
