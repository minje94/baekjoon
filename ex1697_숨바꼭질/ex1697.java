package ex1697_¼û¹Ù²ÀÁú;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int subin = sc.nextInt();
		int point = subin;
		int brother = sc.nextInt();
		int [] dir = new int[3];
		int [] visit = new int [100001];
		
		Queue<Integer> que = new LinkedList<>();
		que.add(subin);
		
		while(!que.isEmpty() && point != brother) {
			point = que.poll(); 
			dir[0] = point + 1; 
			dir[1] = point - 1; 
			dir[2] = point * 2; 
			
			for(int i=0; i<3; i++) {
				if(dir[i] >= 0 && dir[i] <= 100000) {
					if(visit[dir[i]] == 0) {
						visit[dir[i]] = visit[point] + 1;
						que.add(dir[i]);
					}
				}
				System.out.println(que);
			}
		}
		System.out.println(visit[brother]);
	}
}
