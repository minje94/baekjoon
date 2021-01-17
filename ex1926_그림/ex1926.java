package ex1926_그림;
import java.util.Scanner;
import java.util.Stack;

class Pair{
	int x, y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ex1926 {
	static int [][] map;
	static boolean [][] visit;
	static int maxSize=0, count=0, N, M;
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};

	public static void dfs(int x, int y) {
		Pair newPair = new Pair(x,y);
		Stack <Pair> st = new Stack<Pair>();
		st.push(newPair);
		
		visit[y][x] = true;
		int size = 0;
		
		while(!st.isEmpty()) {
			Pair popPair = st.pop();
			int popX = popPair.x;
			int popY = popPair.y;
			size++;
			
			for(int i=0; i<4; i++) {
				int newX = popX + dx[i];
				int newY = popY + dy[i];
				
				if(newX >= 0 && newY >= 0 && newX < M && newY<N) {
					if(map[newY][newX] == 1 && visit[newY][newX] == false) {
						Pair pushPair = new Pair(newX,newY);
						visit[newY][newX] = true;
						st.push(pushPair);
					}
				}
			}
		}
		if(size > maxSize) {
			maxSize = size;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //세로
		M = sc.nextInt(); //가로
		
		map = new int [N][M];
		visit = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = sc.nextInt();
				visit[i][j] = false;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 1 && visit[i][j] == false) {
					dfs(j, i);
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(maxSize);
	}
}
