package ex18258_ť_2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		Queue que = new LinkedList();
		int lastNum = 0;
		
		for(int i=0; i<testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			
			switch(command) {
			case "push": 
				int num = Integer.parseInt(st.nextToken());
				que.add(num);
				lastNum = num;
				break;
			case "pop": 
				if(que.size() == 0) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write((int)que.poll() + "\n");
				}
				break;
			case "size": 
				bw.write((int)que.size() + "\n");
				break;
			case "empty": 
				if(que.isEmpty()) {
					bw.write(1 + "\n");
				}
				else{
					bw.write(0 + "\n");
				}
				break;
			case "front": 
				if(que.isEmpty()) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write((int)que.peek() + "\n");
				}
				break;
			case "back":
				if(que.isEmpty()) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(lastNum + "\n");
				}
				break;
			};
			
		}

		bw.flush();
		bw.close();
	}
}
