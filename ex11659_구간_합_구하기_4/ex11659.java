package ex11659_구간_합_구하기_4;
import java.util.Scanner;

public class ex11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalNum = sc.nextInt();
		int testCase = sc.nextInt();
		int [] numArr = new int [totalNum];
		int [] answerArr = new int [testCase];
		
		for(int i=0; i<totalNum; i++) {
			if(i==0) {
				numArr[0] = sc.nextInt();
			} else {
				numArr[i] = numArr[i-1] + sc.nextInt();
			}
		}
		
		for(int i=0; i<testCase; i++) {
			int startNum = sc.nextInt()-1;
			int endNum = sc.nextInt()-1;
			
			if(startNum == 0) {
				answerArr[i] = numArr[endNum];
			} else {
				answerArr[i] = numArr[endNum] - numArr[startNum-1];
			}
		}
		
		answer(answerArr);
		
	}
	
	public static void answer(int [] answerArr) {
		for(int i=0; i<answerArr.length; i++) {
			System.out.println(answerArr[i]);
		}
	}
}
