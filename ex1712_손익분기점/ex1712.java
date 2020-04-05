package ex1712_손익분기점;
import java.util.*;
import java.io.*;


public class ex1712 {
	public static void main(String[] arsg) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		bf.close();
		
		if(B >= C){
			System.out.println(-1);
		}
		else {
			System.out.println((A/(C-B))+1);
		}
	
	}
}
