package ex5543_상근날드;
import java.util.Scanner;

public class ex5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] buger = new int [3]; 
		for(int i=0; i<3; i++) {
			buger[i] = sc.nextInt();
		}
		int [] drink = new int [2];
		
		for(int i=0; i<2; i++) {
			drink[i] = sc.nextInt();
		}
		
		int minbuger = buger[0], mindrink = drink[0];
		
		for(int i=0; i<3; i++) {
			if(buger[i]<minbuger) {
				minbuger= buger[i];
			}
		}
		for(int i=0; i<2; i++) {
			if(drink[i]<mindrink) {
				mindrink= drink[i];
			}
		}
		
		System.out.println(minbuger + mindrink - 50);
	}
}
