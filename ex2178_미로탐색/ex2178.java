package ex2178_¹Ì·ÎÅ½»ö;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex2178 {
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	static int height, width, minCount=Integer.MAX_VALUE;
	static boolean [][] visit;
	static String [][] map;

	static Queue <String> que = new LinkedList<String>();
	
	public static void bfs(int x, int y) {
		que.add(x + "/" + y);
		visit[x][y] = true;
		
		Loop: while(!que.isEmpty()) {
			
			String [] xy = que.poll().split("/");
			
			x = Integer.parseInt(xy[0]);
			y = Integer.parseInt(xy[1]);
			
			
			for(int j=0; j<4; j++) {
				int nx = x+dx[j];
				int ny = y+dy[j];
				
				if(nx<width && ny<height && nx>=0 && ny>=0
						&& visit[nx][ny] == false && map[nx][ny].equals("1")) {
					que.add(nx+ "/" + ny);
					visit[nx][ny] = true;
					map[nx][ny] = (Integer.parseInt(map[x][y]) + Integer.parseInt(map[nx][ny]) + "");
					
					if(nx==width-1 && ny == height-1) {
						minCount = Math.min(minCount,  Integer.parseInt(map[nx][ny]));
					}
				}
			}
		}
		System.out.println(minCount);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		width = sc.nextInt();
		height = sc.nextInt();
		map = new String [width][height];
		visit = new boolean [width][height];
		
		for(int i=0; i<width; i++) {			
			map[i] = sc.next().split("");
		}
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				visit[i][j] = false;
			}
		}
		bfs(0,0);
	}
}
