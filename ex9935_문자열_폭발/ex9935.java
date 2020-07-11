package ex9935_¹®ÀÚ¿­_Æø¹ß;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String context = br.readLine();
		String bomb = br.readLine();
		String [] contextArr = context.split("");
		String [] bombArr = bomb.split("");
		String [] checkArr = new String[bombArr.length];
		Stack<String> st = new Stack<String>();
		String check = "";
		
		for(int i=0; i<contextArr.length; i++) {
			if(contextArr[i].equals(bombArr[bombArr.length-1]) && st.size()>=bombArr.length-1) {
				check = "";
				st.push(contextArr[i]);
				
				for(int j=i-(bombArr.length-1); j<=i; j++) {
					check = st.pop() + check;
				}
				
				if(!check.equals(bomb)) {
					checkArr = check.split("");
					
					for(int j=0; j<checkArr.length; j++) {
						st.push(checkArr[j]);
					}
				}
			}
			else {
				st.push(contextArr[i]);
			}
		}
		
		int size = st.size();

		StringBuffer answer = new StringBuffer();
		
		if(size == 0) {
			System.out.println("FRULA");
		}
		else {
			for(int i=0; i<size; i++) {
				answer.append(st.pop());
			}
			System.out.println(answer.reverse());
			
		}
	}
}
