package ex11724_연결_요소의_개수;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex11724 {
   
   static int N, M;
   static int [][] map;
   static boolean [] visited;
   
   public static void dfs(int index) {
      Stack st = new Stack();
      st.add(index);
      
      while(!st.isEmpty()) {
         int temp = (int)st.pop();
         
         for(int i=0; i<N; i++) {
            if((map[i][temp] == 1 || map[temp][i] == 1) && visited[temp] == false) {
               st.add(i);
            }
         }
         visited[temp] = true;
      }
   }
   
   
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      N = Integer.parseInt(st.nextToken()); // 정점의 개수
      M = Integer.parseInt(st.nextToken()); // 간선의 개수
      int count = 0;
      
      map = new int[N][N];
      visited = new boolean [N];

      for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++) {
            map[i][j] = 0;
         }
         visited[i] = false;
      }
      
      
      for(int i=0; i<M; i++) {
         StringTokenizer st2 = new StringTokenizer(br.readLine());
      
         int a = Integer.parseInt(st2.nextToken())-1;
         int b = Integer.parseInt(st2.nextToken())-1;
         
         map[a][b] = 1;
         map[b][a] = 1;
         
      }
      
      for(int i=0; i<N; i++) {
         if(visited[i] == false) {
            dfs(i);
            count++;
         }
      }
      System.out.println(count);
   }
}