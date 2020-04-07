package ex1260_BFS와DFS;

import java.util.*;
//bfs는 큐, dfs는 스택, 그냥 재귀로 쓰는 경우가 많음

public class ex1260 {
	static int jeongJeom;
	static int ganSeun;
	static int startPoint;
	static int[][] map;
	static boolean[] visitBfs;
	static boolean[] visitDfs;

	public static void dfs(int i) {
		visitDfs[i] = true;
		System.out.print(i + " ");

		for (int j = 0; j <= jeongJeom; j++) {
			if (map[i][j] == 1 && visitDfs[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int i) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(i);
		visitBfs[i] = true;
		System.out.print(i + " ");

		int temp;
		while (!que.isEmpty()) {
			temp = que.poll();
			for (int j = 0; j <= jeongJeom; j++) {
				if (map[temp][j] == 1 && visitBfs[j] == false) {
					que.offer(j);
					visitBfs[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		jeongJeom = sc.nextInt();
		ganSeun = sc.nextInt();
		startPoint = sc.nextInt();
		visitBfs = new boolean[10001];
		visitDfs = new boolean[10001];
		map = new int[1001][1001];

		for (int i = 0; i < ganSeun; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			map[a][b] = map[b][a] = 1;

		}

		dfs(startPoint);

		for (int j = 0; j <= jeongJeom; j++) {
			visitDfs[j] = false;
			visitBfs[j] = false;
		}
		System.out.println("");

		bfs(startPoint);
	}
}
