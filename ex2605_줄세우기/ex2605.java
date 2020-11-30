package ex2605_줄세우기;
import java.util.LinkedList;
import java.util.Scanner;

public class ex2605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList list = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			list.add(num, i+1);
		}
		for(int i=list.size()-1; i>=0; i--) {
			if(i==0) {
				System.out.println(list.get(i));	
			}
			else {
				System.out.print(list.get(i) + " ");	
			}
		}
	}
}
