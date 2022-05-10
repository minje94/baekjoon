package ex2525_¿Àºì_½Ã°è;
import java.util.Scanner;

public class ex2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cookingTime = sc.nextInt();
		
		answer(hour, minute, cookingTime);
	}
	
	public static void answer(int hour, int minute, int cookingTime) {
		
		minute = minute + cookingTime;
		int cookingHour = minute/60;
		hour = hour + cookingHour;
		
		if(hour >= 24) {
			hour = hour - 24;
		}
		
		minute = minute - (cookingHour*60);
		
		System.out.println(hour + " " + minute);
	}

}
