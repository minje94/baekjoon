package ex11650_좌표_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex11650 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());

		int [][] point = new int [testCase][2];

		for(int i=0; i<testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());

			point[i][0] = Integer.parseInt(st.nextToken());
			point[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//Comparator 재정의
		Arrays.sort(point, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[0] ==o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for(int i=0; i<testCase; i++) {
			System.out.println(point[i][0] + " " + point[i][1]);
		}
	}
}