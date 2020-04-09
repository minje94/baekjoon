package ex2908_»ó¼ö;
import java.util.Scanner;

public class ex2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x!=y && x>=100 && x<1000 && y>=100 && y<1000) {
			int changeX =  (x%10)*100 + ((x/10)%10)*10 + (x/100);
			int changeY = (y%10)*100 + ((y/10)%10)*10 + (y/100);
			
			if(changeX > changeY)
				System.out.println(changeX);
			else
				System.out.println(changeY);
		}
	}
}
