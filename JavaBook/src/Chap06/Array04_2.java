package Chap06;

public class Array04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 2, columns = 3; //int형 변수 rows, columns 선언 및 초기화
		int[][] firstMatrix = { {2, 3, 4}, {3, 2, 1} }; //2행 3열의 2차원 배열 선언 및 초기화
		int[][] secondMatrix = { {1, 2, 3}, {-4, -2, 1} }; //2행 3열의 2차원 배열 선언 및 초기화
		
		int[][] sum = new int[rows][columns]; //2행 3열의 2차원 배열 생성
		for(int i = 0; i < rows; i++) { //각 2차원 배열의 합을 sum 2차원 배열에 저장
			for(int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("두 행렬의 합: ");
		for(int i = 0; i < rows; i++) { //sum 2차원 배열을 출력
			for(int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
