package ex9625_BABBA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex9625 {

   public static void main(String[] args) throws IOException{
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int click = Integer.parseInt(br.readLine());
      int count = 0, countA = 0, countB = 0, bPrevPrev=0, bPrev=0;
      
      while(count < click) {
         
         if(count == 0) {
            countA = 0;
            countB = 1;
         }
         else {
            bPrevPrev = bPrev;
            bPrev = countB;
            
            countA = bPrev;
            countB = bPrev + bPrevPrev;
         }
         count++;
      }
      System.out.println(countA + " " + countB);
      
   }
}