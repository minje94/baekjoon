package ex1966_프린터_큐;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int length = Integer.parseInt(st1.nextToken());
			int num = Integer.parseInt(st1.nextToken());
			
			int [] importArr = new int [length];
			Queue numQue = new LinkedList<>();
			Queue importQue = new LinkedList<>();
			
			//숫자와 중요도 정리
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			for(int j=0; j<length; j++) {
				numQue.add(j+1);
				importArr[j] = Integer.parseInt(st2.nextToken());
				importQue.add(importArr[j]);
			}
			Arrays.sort(importArr);
			
			int maxImport = importArr[length-1], count=1;
			
			while(true) {
				if((int)importQue.peek() == maxImport) {
					if((int)numQue.peek() == num+1) {
						System.out.println(count);
						break;
					}
					else {
						count++;
						importQue.poll();
						numQue.poll();
						maxImport = importArr[length-count];
					}
				}
				else {
					importQue.add(importQue.poll());
					numQue.add(numQue.poll());
				}
			}
			
		}
	}
}
