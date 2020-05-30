package ex5622_´ÙÀÌ¾ó;
import java.util.Scanner;

public class ex5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] number = sc.next().split("");
		int sum = 0;
		for(int i=0; i<number.length; i++) {
			if(number[i].equals("A") || number[i].equals("B") || number[i].equals("C")) {
				sum= sum + 3;
			}
			else if(number[i].equals("D") || number[i].equals("E") || number[i].equals("F")) {
				sum= sum + 4;
			}
			else if(number[i].equals("G") || number[i].equals("H") || number[i].equals("I")) {
				sum= sum + 5;
			}
			else if(number[i].equals("J") || number[i].equals("K") || number[i].equals("L")) {
				sum= sum + 6;
			}
			else if(number[i].equals("M") || number[i].equals("N") || number[i].equals("O")) {
				sum= sum + 7;
			}
			else if(number[i].equals("P") || number[i].equals("Q") || number[i].equals("R") || number[i].equals("S")) {
				sum= sum + 8;
			}
			else if(number[i].equals("T") || number[i].equals("U") || number[i].equals("V")) {
				sum= sum + 9;
			}
			else {
				sum= sum + 10;
			}
		}
		System.out.print(sum);
	}
}
