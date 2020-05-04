package ex2440_º°Âï±â3;
import java.util.Scanner;

public class ex2440 {
	public static void main(String[] arfs) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>=1 && N<100) {
			for(int i=0; i<N; i++) {
				for(int j=1; j<=N-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
