package ex1110_���ϱ�_����Ŭ;

import java.util.Scanner;

public class ex1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int basen,changen = 0;
		int i = 0;
		basen = n;
		while(true) {
			changen = ((n/10)+(n%10))%10+(n%10)*10;
			n = changen;
			i++;
			if(basen == changen)
				break;
		}
		System.out.println(i);
	}
}
