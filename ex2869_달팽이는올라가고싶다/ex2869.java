package ex2869_달팽이는올라가고싶다;
import java.util.*;
import java.io.*;

public class ex2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long up = Long.parseLong(st.nextToken());
		long down = Long.parseLong(st.nextToken());
		long height = Long.parseLong(st.nextToken());
		long day = 0, nowHeight = 0;
		br.close();
		
		if((height-up)%(up-down) == 0) {
			day = (height-up)/(up-down) + 1;
		}
		else {
			day = (height-up)/(up-down) + 2;
		}
		System.out.println(day);
		
	}
}