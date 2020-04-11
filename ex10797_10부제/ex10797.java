package ex10797_10∫Œ¡¶;
import java.util.Scanner;

public class ex10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int offDay = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<5; i++) {
			if(offDay == sc.nextInt()) {
				count++;
			}
		}
		System.out.println(count);
	}
}
