package ex1188_음식평론가;
import java.util.Scanner;

public class ex1188 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int max = 0, num = 2;
		
		while(num <= (N<M ? N: M)) {
			if(N%num==0 && M%num==0) {
				max = num;
			}
			num++;
		}
		if(max == 0) {
			System.out.println(M-1);
		}
		else {
			System.out.println(M-max);
		}
	}
}