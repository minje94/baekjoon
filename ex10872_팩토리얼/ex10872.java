package ex10872_ÆÑÅä¸®¾ó;
import java.util.Scanner;

public class ex10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = i * factorial;
		}
		System.out.println(factorial);
	}
}
