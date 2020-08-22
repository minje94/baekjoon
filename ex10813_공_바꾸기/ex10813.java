package ex10813_공_바꾸기;
import java.util.Scanner;

public class ex10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxNum = sc.nextInt();
		int [] numArr = new int [maxNum];
		
		for(int i=0; i<maxNum; i++) {
			numArr[i] = i+1;
		}
		
		int changeTime = sc.nextInt();
		
		for(int i=0; i<changeTime; i++) {
			int numA = sc.nextInt();
			int numB = sc.nextInt();
			
			int temp;
			
			temp = numArr[numA-1];
			numArr[numA-1] = numArr[numB-1];
			numArr[numB-1] = temp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}
}
