package ex2875_대회or인턴;
import java.util.*;
import java.io.*;

public class ex2875 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int woman = Integer.parseInt(st.nextToken());
		int man = Integer.parseInt(st.nextToken());
		int participate = Integer.parseInt(st.nextToken());
		int group = 0;
	
		while(participate > 0) {
			if(woman >= 2 * man) {
				woman--;
				participate--;
			}
			else if(woman < 2*man) {
				man--;
				participate--;
			}
		}
		
		while(true) {
			man = man-1;
			woman = woman - 2;
			if(man<0 || woman <0) {
				break;
			}
			group++;
			
		}
		System.out.println(group);
		
	}
}
//5 2 4 -> 1