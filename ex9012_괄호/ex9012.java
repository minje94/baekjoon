package ex9012_°ýÈ£;
import java.util.*;
import java.io.*;
import java.util.Stack;

public class ex9012{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			String [] bracket = br.readLine().split("");
			Stack st = new Stack();
			
			if(bracket.length %2 != 0) {
				System.out.println("NO");
			}
			else {
				int j=0;
				while(true) {
					if(bracket[j].equals("(")){
						st.add(bracket[j]);
					}
					else {
						if(st.size()==0) {
							System.out.println("NO");
							break;
						}
						else {
							st.pop();
						}
					}
					
					if(j == bracket.length-1) {
						if(st.size()!=0) {
							System.out.println("NO");
							break;
						}
						else {
							System.out.println("YES");
							break;
						}
					}
					j++;
				}
			}
		}
	}
}