package ex2947_나무_조각;

import java.util.Scanner;

public class ex2947 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [] numArr = new int[5];
      
      for(int i=0; i<5; i++) {
         numArr[i] = sc.nextInt();
      }
      
      
      for(int i=0; i<4; i++) { 
         for(int j=0; j<4; j++) { 
            if(numArr[j] > numArr[j+1]) {
               int temp = numArr[j];
               numArr[j] = numArr[j+1];
               numArr[j+1] = temp;
               
               for(int k=0; k<5; k++) {
                  System.out.print(numArr[k] + " ");
               }
               System.out.println("");
            }
         }
      }
   }

}