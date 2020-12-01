package ex2981_°Ë¹®;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ex2981 {
	
	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int numArr [] = new int[testCase];
		
		
		for(int i=0; i<testCase; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numArr);
		
		int result = numArr[1] - numArr[0];

		for(int i=2; i<testCase; i++) {
			result = gcd(Math.max(result, numArr[i] - numArr[i-1]),
					Math.min(result, numArr[i] - numArr[i-1]));
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=2; i<=result; i++) {
			if(result%i == 0) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb.toString());
	}
}
