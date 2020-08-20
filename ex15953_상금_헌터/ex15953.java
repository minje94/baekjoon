package ex15953_ªÛ±›_«Â≈Õ;
import java.util.Scanner;

public class ex15953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int sum = 0;
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			if(first == 1) {
				sum = sum + 5000000;
			}
			else if(first>1 && first<=3) {
				sum = sum + 3000000;
			}
			else if(first>3 && first<=6) {
				sum = sum + 2000000;
			}
			else if(first>6 && first<=10) {
				sum = sum + 500000;
			}
			else if(first>10 && first<=15) {
				sum = sum + 300000;
			}
			else if(first>15 && first<=21) {
				sum = sum + 100000;
			}
			else {
				sum = sum + 0;
			}
			
			
			if(second == 1) {
				sum = sum + 5120000;
			}
			else if(second>1 && second<=3) {
				sum = sum + 2560000;
			}
			else if(second>3 && second<=7) {
				sum = sum + 1280000;
			}
			else if(second>7 && second<=15) {
				sum = sum + 640000;
			}
			else if(second>15 && second<=31) {
				sum = sum + 320000;
			}
			else {
				sum = sum + 0;
			}
			System.out.println(sum);
		}
	}
}
