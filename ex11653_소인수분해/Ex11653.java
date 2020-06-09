package ex11653_소인수분해;
import java.util.Scanner;

public class Ex11653 {
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=2;
		while(true) {
			if(num == 1) {
				break;
			}
			
			if(num%i==0) {
				System.out.println(i);
				num = num/i;
			}
			else {
				i = i+1;
			}
		}
	}
}