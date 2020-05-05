package ex2884_알람시계;
import java.util.Scanner;

public class ex2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute <45) {
			if(hour == 0) {
				hour = 23;
			}
			else {
				hour = hour-1;
			}
			minute = minute + 60;
		}
		
		System.out.println(hour + " " + (minute-45));
	}
}
