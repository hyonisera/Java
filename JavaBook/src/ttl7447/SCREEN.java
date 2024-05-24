package ttl7447;

public class SCREEN {
	int[][] screen = new int[5][40];
	
	SCREEN() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 40; j++) {
				screen[i][j] = ' ';
			}
		}
	}
	void clearScreen() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 40; j++) {
				screen[i][j] = ' ';
			}
		}
	}
	void setScreen(int x, int[][] fnd) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				screen[i][j + x] = fnd[i][j];
			}
		}
	}
	void dispScreen() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 40; j++) {
				System.out.printf("%c", screen[i][j]);
			}
			System.out.println("");
		}
	}
}
