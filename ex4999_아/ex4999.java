package ex4999_¾Æ;
import java.util.Scanner;

public class ex4999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jewhan = sc.next();
		String doctor = sc.next();
		
		if(jewhan.length()-1 >= doctor.length()-1) {
			System.out.println("go");
		}
		else
			System.out.println("no");
	}
}
