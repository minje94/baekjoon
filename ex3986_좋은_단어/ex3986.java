package ex3986_좋은_단어;

import java.util.Scanner;
import java.util.Stack;

public class ex3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<testCase; i++) {
			String [] word = sc.next().split("");
			Stack<String> st = new Stack<String>();
			
			for(int j=0; j<word.length; j++) {
				if(st.size()==0 || !st.peek().equals(word[j])) {
					st.push(word[j]);
				}
				else {
					st.pop();
				}
			}
			if(st.size() == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
