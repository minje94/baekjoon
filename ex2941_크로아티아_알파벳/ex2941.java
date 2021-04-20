package ex2941_크로아티아_알파벳;
import java.util.Scanner;

public class ex2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] croAlpha = {"dz=", "z=", "c=", "c-", "d-", "lj", "nj", "s="};
		String word = sc.next(); 
		int index = 0;
		
		
		while(index < 8) {
			word = word.replace(croAlpha[index], "_");
			index++;
		}
		
		System.out.println(word.length());
	}
}
