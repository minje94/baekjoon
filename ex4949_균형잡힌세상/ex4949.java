package ex4949_±ÕÇüÀâÈù¼¼»ó;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String sentence = br.readLine();
			String [] arrSentence = sentence.split("");
			Stack st = new Stack();
			boolean check = true;
			
			if(sentence.equals(".")) {
				break;
			}
			
			for(int i=0; i<arrSentence.length; i++) {
				if(arrSentence[i].equals("(") 
						|| arrSentence[i].equals("[")) {
			
					st.push(arrSentence[i]);
				}
				else if( arrSentence[i].equals(")")){
					
					if(st.size() == 0) {
						check = false;
					}
					else if(st.peek().equals("(")) {
						st.pop();
					}
					else {
						check = false;
					}
				}
				
				else if(arrSentence[i].equals("]")) {
					if(st.size() == 0) {
						check = false;
					}
					else if(st.peek().equals("[")) {
						st.pop();
					}
					else {
						check = false;
					}
				}	
			}
			
			if(st.size() == 0 && check==true) {
				System.out.println("yes");		
			}
			else if(st.size() == 0 && check==false) {
				System.out.println("no");	
			}
			else {
				System.out.println("no");
			}
		}
	}
}
