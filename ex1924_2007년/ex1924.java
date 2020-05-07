package ex1924_2007³â;
import java.util.Scanner;

public class ex1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		int day = 0;
		
		for(int i = 0; i<x-1; i ++) {
				day += month[i];
		}
		day += y;
		switch(day%7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		default:
			System.out.println("SUN");
			break;
		}
	}
}
