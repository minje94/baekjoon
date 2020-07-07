package ex8974_희주의_수학시험;
import java.util.Scanner;

public class ex8974 {
	public static void main(String[] args) {
		int [] arr = new int [1000];
		int count = 1 , num = 1;
		
		for(int i=0; i<arr.length; i++) {
			if(num >= count) {
				arr[i] = num;
				count++;
			}
			else {
				num++;
				count = 1;
				i--;
			}
		}
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = 0;
		for(int i=a-1; i<=b-1; i++) {
			answer = answer + arr[i];
		}
		System.out.println(answer);
	}
}
