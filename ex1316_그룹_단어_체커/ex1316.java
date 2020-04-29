package ex1316_그룹_단어_체커;
import java.util.Scanner;

public class ex1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int count = testCase;

		for (int i = 0; i < testCase; i++) {
			String word = sc.next();
			char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			boolean[] check = new boolean[26];
			char[] wordArr = new char[word.length()];
			int index = 0;

			for (int j = 0; j < wordArr.length; j++) {
				
				if (j > 0 && wordArr[index - 1] == word.charAt(j)) {
					continue;
				} else {
					wordArr[index] = word.charAt(j);
					index++;
				}
			}

			Loop: for (int j = 0; j < wordArr.length; j++) {
				for (int k = 0; k < alphabet.length; k++) {
					if (wordArr[j] == alphabet[k] && check[k] == false) {
						check[k] = true;
					} else if (wordArr[j] == alphabet[k] && check[k] == true) {
						count--;
						break Loop;
					}
				}
			}
		}
		System.out.println(count);

	}
}
