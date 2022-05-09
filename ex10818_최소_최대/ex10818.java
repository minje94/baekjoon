package ex10818_최소_최대;
import java.util.Arrays;
import java.util.Scanner;

public class ex10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int [] numArr = new int [testCase];
		
		for (int i=0; i<testCase; i++) {
			numArr[i] = sc.nextInt();
		}
		
		answer(numArr);
	}
	
	public static void answer(int [] numArr) {
		Arrays.sort(numArr);
		
		System.out.println(numArr[0] + " " + numArr[numArr.length-1]);
	}
	
}
