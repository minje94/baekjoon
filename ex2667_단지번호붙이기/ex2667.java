package ex2667_단지번호붙이기;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2667 {
	
	static String [][] map;
	static boolean [][] visit;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int count = 0;
	static int testCase;
	
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
		
			if(nx>=0 && ny>=0 && nx<testCase && ny<testCase) {
				if(Integer.parseInt(map[nx][ny]) == 1 && visit[nx][ny] == false) {
					count++;
					DFS(nx,ny);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		testCase = sc.nextInt();
		
		map = new String [testCase][testCase];
		visit = new boolean [testCase][testCase];
		ArrayList total = new ArrayList();
		
		for(int i=0; i<testCase; i++) {
			map[i] = sc.next().split("");
		}
		
		for(int i=0; i<testCase; i++) {
			for(int j=0; j<testCase; j++) {
				visit[i][j] =  false;
			}
		}
		
		for(int i=0; i<testCase; i++) {
			for(int j=0; j<testCase; j++) {
				if(Integer.parseInt(map[i][j]) == 1 &&visit[i][j] == false) {
					count = 1;
					DFS(i,j);
					total.add(count);
				}
			}
		}
		
		//출력 화면
		System.out.println(total.size());
		Collections.sort(total); //ArrayList인 total 정렬하는 부분
		for(int i=0; i<total.size(); i++) {
			System.out.println(total.get(i));
		}
	}
}
