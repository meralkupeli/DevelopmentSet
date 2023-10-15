import java.util.Scanner;

public class stars {

	public static void main(String[] args) {
		stars star = new stars();
		star.first(10, 5);
		star.second(10, 5);
		star.third(10, 5);
		star.fourthd(10, 5);

	}

	void first(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (i == 0 | i == row - 1) {
					System.out.print("*");
					if (j == column - 1)
						System.out.println();
				}
			}
		}
	}

	void second(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (i == 0 | i == row - 1) {
					System.out.print("*");
				} else {
					if (j == 0 | j == column - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void third(int row, int column) {
		for (int i = 1; i <= row; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 0; j <i; j++) System.out.print("*");
			for (int k = 0; k < (row - i) / 2; k++) System.out.print(" ");
			System.out.println();
		}
	}


		void fourthd ( int row, int column){
			for (int i = 1; i <= row; i++) {
				if (i % 2 == 0) {
					continue; // skip double rows
				}
				for (int j = 0; j < (row - i) / 2; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();

				//done using just for
			/*for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= (row - i); j++) {
					System.out.print(" ");
				}
				for (int l = 1; l <= (2 * i) - 1; l++) {
					System.out.print("*");
				}
				System.out.println();
			}*/
			}
		}
	}



