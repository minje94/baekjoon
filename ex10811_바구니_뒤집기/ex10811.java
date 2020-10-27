package ex10811_바구니_뒤집기;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex10811{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bucket = Integer.parseInt(st.nextToken());
		int [] bucketArr = new int [bucket];
		
		for(int i=0; i<bucket; i++) {
			bucketArr[i] = i+1;
		}
		
		int testCase = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<testCase; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st2.nextToken())-1;
			int end = Integer.parseInt(st2.nextToken())-1;
			Stack stack = new Stack<>();
			
			for(int j=start; j<=end; j++) {
				stack.add(bucketArr[j]);
			}
			
			for(int j=start; j<=end; j++) {
				bucketArr[j] = (int)stack.pop();
			}

		}

		for(int j=0; j<bucket; j++) {
			System.out.print(bucketArr[j] + " ");
		}
	}
}
