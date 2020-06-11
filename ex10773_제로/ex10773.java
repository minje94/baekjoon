package ex10773_Á¦·Î;
import java.util.Scanner;
import java.util.Stack;

public class ex10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		Stack stack = new Stack();
		int sum = 0;
		
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			if(num != 0 ) {
				stack.push(num);
			}
			else {
				stack.pop();
			}
		}
		if(stack.size() == 0) {
			System.out.println("0");
		}
		else {
			while(stack.size() > 0) {
				sum = sum + (int)stack.pop();
			}
			System.out.println(sum);
		}
	}
}
