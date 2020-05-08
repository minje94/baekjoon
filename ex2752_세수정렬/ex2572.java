package ex2752_¼¼¼öÁ¤·Ä;
import java.util.Scanner;

public class ex2572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int first = a, second = 0, third = 0;
	
		for(int i=0; i<2; i++) {
			int b = sc.nextInt();
			if(first > b){
				int temp = first;
				first = b;
				if(second != 0 && temp > second) {
					third = temp;
				}
				else {
					third = second;
					second = temp;
				}
			}
			else {
				System.out.println("²ó");
				if(second!=0 && second > b) {
					int temp = second;
					second = b;
					third = temp;
				}
				else if(second == 0) {
					second = b;
				}
				else
					third = b;
			}
		}
		System.out.println(first + " " + second + " " + third);
	}
}
