package ex11718_�״������ϱ�;
import java.util.Scanner;

public class ex11718 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String word = sc.nextLine();
			if(word.startsWith(" ") || 
			   word.endsWith(" ") || word.length() > 100) {
				break;
			}
			else {
				System.out.println(word);
			}
		}
	}
}
