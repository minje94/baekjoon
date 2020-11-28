package ex2238_°æ¸Å;
import java.util.Arrays;
import java.util.Scanner;

public class ex2238 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maximum = sc.nextInt();
		int people = sc.nextInt();
		
		int [] countArr = new int [maximum];
		String [] name = new String [people];
		int [] price = new int [people];
		
		for(int i=0; i<people; i++) {
			name[i] = sc.next();
			price[i] = sc.nextInt();
			countArr[price[i]-1]++;
		}
		
		int minCount = people;
		for(int i=0; i<people; i++) {
			if(countArr[price[i]-1] < minCount) {
				minCount = countArr[price[i]-1];
			}
		}
		
		String anName = ""; 
		int anPrice = maximum;
		
		for(int i=0; i<people; i++) {
			if(countArr[price[i]-1] == minCount) {
				if(anPrice > price[i]) {
					anPrice = price[i];
					anName = name[i];
				}
			}
		}
		
		System.out.println(anName + " " + anPrice);
	}
}
