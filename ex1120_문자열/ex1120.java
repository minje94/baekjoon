package ex1120_¹®ÀÚ¿­;
import java.util.*;
import java.io.*;

public class ex1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String [] A = st.nextToken().split("");
		String [] B = st.nextToken().split("");
		int count=0, minCount = A.length;
		
		br.close();
		int seat = 0;
		
		while(seat+A.length <= B.length) {
			count = 0;
			for(int i=0; i<A.length; i++) {
				if(!A[i].equals(B[i+ seat])) {
					count++;
				}
			}
			seat++;
			if(minCount>count) {
				minCount = count;
			}
		}
		System.out.println(minCount);
	}
}
