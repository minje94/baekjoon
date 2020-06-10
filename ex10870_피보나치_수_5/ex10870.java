package ex10870_피보나치_수_5;
import java.util.Scanner;

public class ex10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibonacci(num));
	}
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
