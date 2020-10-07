package ex2583_영역_구하기;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class rect{
   int x, y;
   
   rect(int x, int y){
      this.x = x;
      this.y = y;
   }
}

public class ex2583 {
   static int [][] map;
   static boolean [][] visited;
   static int [] dx = {-1, 1, 0, 0};
   static int [] dy = {0, 0, -1, 1};
   static int m, n;
   static List<Integer> list = new LinkedList<Integer>();
   
   public static void bfs(int y, int x) {

      Queue <rect> que = new LinkedList();   
      rect r = new rect(x, y);
      que.add(r);
      int size = 0;
      
      while(!que.isEmpty()) {
         rect pollRect = que.poll();
         size++;
         
         visited[pollRect.y][pollRect.x] = true;
         
         for(int i=0; i<4; i++) {
            int pointX = pollRect.x + dx[i];
            int pointY = pollRect.y + dy[i];
            
            if(pointX >= 0 && pointY >= 0 && pointX <n  && pointY < m) {
               if(map[pointY][pointX] == 0 && visited[pointY][pointX] == false) {
                  rect newRect = new rect(pointX, pointY);
                  que.add(newRect);
                  visited[pointY][pointX] = true;
               }
            }
         }
      }
      
      list.add(size);
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      m = sc.nextInt(); //y
      n = sc.nextInt(); //x
      int squareNum = sc.nextInt();
      
      map = new int[m+1][n+1];
      visited = new boolean [m+1][n+1];
      
      for(int i=0; i<m; i++) { //y축
         for(int j=0; j<n; j++) { //x축
            visited[i][j] = false;
            map[i][j] = 0;
         }
      }
      
      for(int i=0; i<squareNum; i++) {
         int startX = sc.nextInt();
         int startY = sc.nextInt();
         int endX = sc.nextInt();
         int endY = sc.nextInt();
         
         
         for(int j=startY; j<endY; j++) {
            for(int k=startX; k<endX; k++) {
               map[j][k]++;
               visited[j][k] = true;
            }
         }
      }
      
      for(int i=0; i<m; i++) {
         for(int j=0; j<n; j++) {
            if(visited[i][j] == false) {
               bfs(i, j);
            }
         }
      }
      
      int size = list.size();
      
      int numArr[] = new int [size];
      
      for(int i=0; i<size; i++) {
         numArr[i] = list.remove(0);
      }
      Arrays.sort(numArr);
      
      System.out.println(size);
      
      for(int i=0; i<size; i++) {
         System.out.print(numArr[i] + " ");
      }
      
   }
}