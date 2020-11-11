package ex10810_°ø_³Ö±â;
import java.util.Scanner;

public class ex10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bucket = sc.nextInt();
		int testCase = sc.nextInt();
		int [] numArr= new int [bucket];
		
		for(int i=0; i<testCase; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int num = sc.nextInt();
			
			for(int j=start-1; j<end; j++) {
				numArr[j] = num;
			}
		}
		for(int i=0; i<bucket; i++) {
			if(i == bucket-1) {
				System.out.println(numArr[i]);
			}
			else {
				System.out.print(numArr[i] + " ");
			}
		}
	}
}
