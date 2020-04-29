package ex1003_피보나치함수;
import java.util.Scanner;

public class ex1003 {
	static int count1;
	static int count0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int answer0 = 0, answer1 = 0;
			int a = sc.nextInt();
			System.out.println(fibonacci(a));
		}
	}
	
	public static int fibonacci(int a) {
		if(a == 1) {
			System.out.println("여기왕????");
			count1++;
			System.out.println(count1);
			return count1;
		}
		else if(a == 0) {
			System.out.println("여기도왕???");
			count0++;
			System.out.println(count0);
			return count0;
		}
		else
			return fibonacci(a-1) + fibonacci(a-2);
	}
}
