package ex11022_A_¥ı«œ±‚_B_ª©±‚_8;
import java.util.Scanner;

public class ex11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		String [] answerArr = new String[testCase];
		
		for(int i=0; i<testCase; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			answerArr[i] = "Case #" + (i+1) +": " + A + " + " + B + " = " + (A+B);
		}
		
		answer(answerArr);
	}
	
	public static void answer(String [] answerArr) {
		for(int i=0; i<answerArr.length; i++) {
			System.out.println(answerArr[i]);
		}
	}
}
