package ex1012_¿Ø±‚≥ÛπË√ﬂ;
import java.util.*;
import java.io.*;

public class ex1012 {
	
	static int [][] map;
	static boolean [][] visit;
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	static int width, height;
	
	public static void DFS(int x, int y) {
		
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx<width && ny<height && ny>=0 && nx>=0 && 
					visit[nx][ny]==false && map[nx][ny] == 1) {
				DFS(nx,ny);
			}
		}
	}	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<testCase; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int count = 0;
			width = Integer.parseInt(st1.nextToken());
			height = Integer.parseInt(st1.nextToken());
			int baechuNum = Integer.parseInt(st1.nextToken());
			map = new int[width][height];
			visit = new boolean[width][height];
			
			
			for(int j=0; j<width; j++) {
				for(int k=0; k<height; k++) {
					visit[j][k] = false;
					map[j][k] = 0;
				}
			}

			
			for(int j=0; j<baechuNum; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st2.nextToken());
				int y = Integer.parseInt(st2.nextToken());
				map[x][y] = 1;
			}
			
			for(int j=0; j<width; j++) {
				for(int k=0; k<height; k++) {
					if(map[j][k] == 1 && visit[j][k] == false) {
						count++;
						DFS(j,k);
					}
				}
			}
			
			System.out.println(count);
		}
	}
}
