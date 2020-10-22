package ex1743_음식물_피하기;
import java.util.Scanner;
import java.util.Stack;

class Pair {
	int x, y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ex1743 {
	static int N, M;
	static int [][] map;
	static boolean [][] visited;
	static int [] dx = {1,-1, 0, 0};
	static int [] dy = {0, 0, 1,-1};
	static int maxTrash = 0;
	
	public static void dfs(int x, int y) {
		Pair pair = new Pair(x, y);
		Stack <Pair> st = new Stack<Pair>();

		visited[y][x] = true;
		st.add(pair);
		int trash = 0;
		
		while(!st.isEmpty()) {
			Pair popQue = st.pop();
			int popX = popQue.x;
			int popY = popQue.y;

			for(int i=0; i<4; i++) {
				int newX = popX + dx[i];
				int newY = popY + dy[i];
				
				if(newX<M && newY<N && newX>=0 && newY>=0) {
					if(map[newY][newX] == 1 && visited[newY][newX] == false) {
						Pair addPair = new Pair(newX, newY);
						st.add(addPair);
						visited[newY][newX] = true;
					}
				}
			}
			trash++;
		}
		
		if(trash > maxTrash) {
			maxTrash = trash;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		int K = sc.nextInt();
		

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = 0;
				visited[i][j] = false;
			}
		}
			
		for(int i=0; i<K; i++) {
			int r = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			
			map[r][c] = 1;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 1 && visited[i][j] == false) {
					dfs(j,i);
					
				}
			}
		}
		System.out.println(maxTrash);
	}
}
