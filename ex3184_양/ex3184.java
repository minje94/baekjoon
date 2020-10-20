package ex3184_¾ç;
import java.util.Scanner;
import java.util.Stack;

class Pair{
	int x, y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ex3184 {
	
	static int R, C;
	static String [][] map;
	static boolean [][] visited;
	static int sheep, wolf;
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	
	public static void bfs(int x, int y) {
		Stack<Pair> st = new Stack <Pair>();
		Pair pair = new Pair(x, y);
		int mapSheep=0, mapWolf=0;
		
		st.add(pair);
		
		while(!st.isEmpty()) {
			Pair popPair = st.pop();
			int popX = popPair.x;
			int popY = popPair.y;
			
			for(int i=0; i<4; i++) {
				int newX = popX + dx[i];
				int newY = popY + dy[i];
				
				if(newX>=0 && newY>=0 && newX<C && newY<R ) {
					if(map[newY][newX].equals(".") && visited[newY][newX] == false) {
						visited[newY][newX] = true;
						Pair addPair = new Pair(newX,newY);
						st.add(addPair);
					}
					else if(map[newY][newX].equals("o") && visited[newY][newX] == false) {
						visited[newY][newX] = true;
						mapSheep++;
						Pair addPair = new Pair(newX,newY);
						st.add(addPair);
					}
					else if(map[newY][newX].equals("v") && visited[newY][newX] == false) {
						visited[newY][newX] = true;
						mapWolf++;
						Pair addPair = new Pair(newX,newY);
						st.add(addPair);
					}
				}
			}
		}
		if(mapSheep > mapWolf) {
			sheep = sheep + mapSheep;
		}
		else {
			wolf = wolf + mapWolf;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		R = sc.nextInt();
		C = sc.nextInt();
		
		map = new String [R][C];
		visited = new boolean [R][C];
		
		for(int i=0; i<R; i++) {
			String temp = sc.next();
			String [] tempArr = temp.split("");
			
			for(int j=0; j<C; j++) {
				map[i][j] = tempArr[j];
				visited[i][j] = false;
			}
		}
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(visited[i][j] == false) {
					bfs(j, i);
				}
			}
		}
		
		System.out.println(sheep + " " + wolf);
		
	}
}
