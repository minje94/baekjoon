package ex2164_Ä«µå2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex2164{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Queue <Integer> que = new LinkedList<Integer>();
		
		for(int j=0; j<num; j++) {
			que.add(j+1);
		}
		
		while(true) {
			if(que.size()==1) {
				System.out.println(que.peek());
				break;
			}
			else {
				que.poll();
				que.add(que.poll());
			}
		}
	}
}