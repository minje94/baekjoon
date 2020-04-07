package ex10026_적록색약;
import java.util.Scanner;

public class ex10026 {
	
	static String [][] map;
	static int length;
	static boolean [][] visited;
	static int groupNormal = 0, group=0;
	static int [] dx = {1,0,-1,0};
	static int [] dy = {0,1,0,-1};
	
	public static void normalDfs(int x, int y) {
			
		visited[x][y] = true;
		String color = map[x][y];
		for(int i=0; i<4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(nx>=0 && ny>=0 && nx<length && ny<length) {
				if(map[nx][ny].equals(color) && visited[nx][ny] == false) {
					normalDfs(nx,ny);
				}
				else if(!map[nx][ny].equals(color) && visited[nx][ny] == false) {
					continue;
				}
			}
		}
	}
	
	public static void dfs(int x, int y) {
		
		visited[x][y] = true;
		String color = map[x][y];

		for(int i=0; i<4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(nx>=0 && ny>=0 && nx<length && ny<length) {
				if(color.equals("R") || color.equals("G")) {
					if((map[nx][ny].equals("R") || map[nx][ny].equals("G")) && visited[nx][ny] == false) {
						dfs(nx,ny);
					}
					else if(!map[nx][ny].equals(color) && visited[nx][ny] == false) {
						continue;
					}
				}
				else {
					if(map[nx][ny].equals(color) && visited[nx][ny] == false) {
						dfs(nx,ny);
					}
					else if(!map[nx][ny].equals(color) && visited[nx][ny] == false) {
						continue;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		
		map = new String[length][length];
		visited = new boolean[length][length];
		
		for(int i=0; i<length; i++) {
			map[i]= sc.next().split("");
			
			for(int j=0; j<length; j++) {
				visited[j][i] = false;
			}
		}
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				if(visited[j][i] == false) {
					normalDfs(j,i);
					groupNormal++;
				}
			}
		}
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				visited[j][i] = false;
			}
		}
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				if(visited[j][i] == false) {
					dfs(j,i);
					group++;
				}
			}
		}
		System.out.println(groupNormal + " " + group);
	}
}
