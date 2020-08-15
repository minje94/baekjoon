package ex1952_달팽이2;

import java.util.Scanner;
public class Ex1952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int numM = 0;
		int numN = 0;
		int sum = 0;
		
		if(m==2 && n==2) {
			System.out.println(2);
		}
		else {
			numM = m-2;
			numN = n-2;
			int count = 0;
			
			while(true) {
				
				if(numM ==0 || numN==0) {
					break;
				}
				numM--;
				numN--;
				count++;
			}
			if(numM != 0) {
				System.out.println(3 + (count*2));
			}
			else {
				System.out.println(2+ (count*2));
			}
		}
	}
}




/*
//2020.05.02 아직 다 못함.... 좀더 고민해보기.
public class Ex1952 {
	static int row, col; // 행, 열
	static boolean[][] check;
	static int count = 0;

	static void visitRow(int x, int y, int func) {
		if (check[x][y] == true) {
			System.out.println("count: " + count);
		} else {
			check[x][y] = true;

			if (func == 1) { // x값이 증가하는 경우
				for (int i = x + 1; i < row; i++) {
					System.out.println("x값 증가. " + i + ", " + y + ", " + count);
					// 마지막인 경우.
					if (check[i][y] == true || i == row - 1) {
						row = row - 1;
						count++;
						visitCol(i, y, 1);
					} else if (check[i][y] == false) {
						check[i][y] = true;
					}
				}
			} else {
				System.out.println("row: " + row);
				for (int i = row - 1; i >= 0; i--) {
					System.out.println("x값 감소. " + i + ", " + y + ", " + count);
					if (check[i][y] == true || i == 0) {
						count++;
						visitCol(i, y, -1);
					} else {
						check[i][y] = true;
					}
				}
			}
		}
	}

	static void visitCol(int x, int y, int func) {
		if (check[x][y] == true) {
			System.out.println("count: " + count);
		} else {
			check[x][y] = true;

			if (func == 1) { // y값이 증가하는 경우
				for (int i = y + 1; i < col; i++) {
					System.out.println("y값 증가. " + x + ", " + i + ", " + count);
					// 마지막인 경우.
					if (check[x][i] == true || i == col - 1) {
						col = col - 1;
						count++;
						visitRow(x, i, -1);
					} else if (check[x][i] == false) {
						check[x][i] = true;
					}
				}
			} else {
				for (int i = col - 1; i >= 0; i--) {
					System.out.println("y값 감소. " + x + ", " + i + ", " + count);
					if (check[x][i] == true || i == 0) {
						count++;
						check[x][i+1] = false;
						visitRow(x, i + 1, 1);
					} else {
						check[x][i] = true;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = sc.nextInt();
		row = x;
		col = y;
		check = new boolean[x][y];

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				check[j][i] = false;
			}
		}
		visitRow(0, 0, 1);

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(check[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println(count);
	}

}
*/
