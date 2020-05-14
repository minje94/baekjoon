package ex8958_OXÄûÁî;
import java.util.Scanner;

public class ex8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer;
		int scoreSum, score;
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			answer = sc.nextLine();
			score = 0;
			scoreSum = 0;
			
			for(int j=0; j<answer.length(); j++) {
				if(answer.charAt(j)=='O') {
					score++;
					scoreSum += score;
				}
				else {
					score=0;
				}
			}
			System.out.println(scoreSum);
		}
	}
}
