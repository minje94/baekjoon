package ex8393_гу;
import java.util.Scanner;

public class ex8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int i;
	    int sum = 0;
		
		for(i=1; i<=n; i++) {
			sum = i+sum;
		}
		System.out.println(sum);
	}

}
