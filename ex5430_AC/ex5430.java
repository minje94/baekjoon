package ex5430_AC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class ex5430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String command = br.readLine();
			String[] commandArr = command.split("");
			int length = Integer.parseInt(br.readLine());
			String[] numArr = br.readLine().replace("[", "").replace("]", "").split(",");

			Deque<String> deq = new LinkedList<String>();

			//길이가 0일때를 처리하는 부분
			if(length == 0) {
				if(command.contains("D")) {
					System.out.println("error");
				}
				else {
					System.out.println("[]");
				}
				continue;
			}
			
			//길이가 0이 아닐때 
			for (int j = 0; j < numArr.length; j++) {
				deq.addLast(numArr[j]);
			}
			boolean r = true;
			boolean errorFlag = false;
			
			for (int j = 0; j < commandArr.length; j++) {
				
				//R이 입력되면 r값을 변환한다.
				if (commandArr[j].equals("R")) {
					r = !r;
				}
				else {
					if(deq.isEmpty()) {
						errorFlag = true;
						break;
					}
					
					//정방향인 경우는 앞에서 poll
					if (r==true) {
						deq.pollFirst();
					} 
					//반대방향인 경우는 뒤에서 poll
					else {
						deq.pollLast();
					}
					
				} 
			}
			
			//화면 출력부분
			if(errorFlag == false) {
				System.out.print("[");
				if(r) {
					while(deq.size()>1) {
						System.out.print(deq.pollFirst()+ ",");
					}
				}
				else {
					while(deq.size()>1) {
						System.out.print(deq.pollLast() + ",");
					}
				}
				
				//덱의 마지막 값 출력
				if(deq.size() == 1) {
					System.out.print(deq.peek());
				}
				System.out.println("]");
			}
			
			else {
				System.out.println("error");
			}	
		}
	}
}
