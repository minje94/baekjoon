package ex4963_¼¶ÀÇ_°³¼ö;
import java.util.Scanner;
import java.util.Stack;

class Pair{
	int x, y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}


public class ex4963 {
	static int [][] map;
	static boolean [][] visited;
	static int [] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	static int [] dy = {0, 0, 1, -1, 1, -1, 1, -1};
	static int N, M;
	
	public static void bfs(int x, int y) {
		Pair pair = new Pair(x,y);
		Stack <Pair> st = new Stack<Pair>();
		
		st.add(pair);
		
		while(!st.isEmpty()) {
			Pair popPair = st.pop();
			
			int popX = popPair.x;
			int popY = popPair.y;

			for(int i=0; i<8; i++) {
				int newX = popX + dx[i];
				int newY = popY + dy[i];

				
				if(newX<N && newY<M && newX>=0 && newY>=0) {
				
					if(map[newY][newX] == 1 && visited[newY][newX] == false) {
						Pair addPair = new Pair(newX, newY);
						visited[newY][newX] = true;
						st.add(addPair);
						
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			N = sc.nextInt();
			M = sc.nextInt();
			int count = 0;
			
			if(N==0 && M==0) {
				break;
			}
			
			map = new int[M][N];
			visited = new boolean[M][N];
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
					visited[i][j] = false;
				}
			}
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j] == 1 && visited[i][j] == false) {
						bfs(j, i);
						visited[i][j] = true;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
