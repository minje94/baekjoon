package ex7576_토마토;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair {
	int x;
	int y;
	
	pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ex7576 {
	static int [][] map;
	static boolean [][] visit;
	static int xlength, ylength;

	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	static Queue<pair> que = new LinkedList<pair>();
	
	public static void bfs() {
		
		int day = 0;
		
		while(!que.isEmpty()) {
			
			pair p = que.remove();
			int x = p.x;
			int y = p.y;
			
			for(int i=0; i<dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
	
				if(nx>=0 && ny>=0 && ny<ylength && nx<xlength) {
					if(map[nx][ny] == 0 && visit[nx][ny] == false) {
						visit[nx][ny] = true;
						map[nx][ny] = map[x][y] + 1;
						
						if(day < map[nx][ny]) {
							day = map[nx][ny];
						}
						que.add(new pair(nx,ny));
					}
				}
			}
		
		}
		
		Loop: for(int i=0; i<xlength; i++) {
			for(int j=0; j<ylength; j++) {
				if(map[i][j] == 0) {
					day = -1;
					break Loop;
				}
			}
		}
		if(day > 0) {
			System.out.println(day-1);
		}
		else {
			System.out.println(day);
		}
	}
	
	
	
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		ylength = sc.nextInt(); //열 -> y
		xlength = sc.nextInt(); // 행 -> x
		map = new int [xlength][ylength];
		visit = new boolean[xlength][ylength];
		
		
		for(int i=0; i<xlength; i++) {
			for(int j=0; j<ylength; j++) {
				map[i][j] = sc.nextInt();
				visit[i][j] = false;
				
				if(map[i][j] == 1) {
					que.add(new pair(i,j));
					visit[i][j] = true;
				}
			}
		}
		
		bfs();
		
	}
}
	