package ex2902_KMP는_왜_KMP일까;
import java.util.Scanner;

public class Ex2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		String [] wordArr = word.split("-");
		String name = "";
		
		for(int i=0; i<wordArr.length; i++) {
			String [] splitWord = wordArr[i].split("");
			name = name + splitWord[0];
		}
		
		System.out.println(name);
	}
}
