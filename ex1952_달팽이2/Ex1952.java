package ex1952_¥ﬁ∆ÿ¿Ã2;

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