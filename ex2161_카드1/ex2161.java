package ex2161_Ä«µå1;
import java.util.*;
import java.io.*;

public class ex2161 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		Queue <Integer> que = new LinkedList<Integer>();
		
		for(int i=1; i<=num; i++) {
			que.add(i);
		}
		bf.close();
		
		while(true) {
			if(que.size() == 1) {
				System.out.print((int)que.poll());
				break;
			}
			
			System.out.print((int)que.poll() + " ");
			que.add(que.poll());
	
		}
		
		for(int i=1; i<=num; i++) {
			que.add(i);
		}
		bf.close();
		
		while(true) {
			if(que.size() == 1) {
				System.out.print((int)que.poll());
				break;
			}
			
			System.out.print((int)que.poll() + " ");
			que.add(que.poll());
	
		}
	}
}
