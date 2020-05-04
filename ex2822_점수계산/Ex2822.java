package ex2822_점수계산;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] scoreArr = new int[8];
		int [] sortArr = new int [8];
		
		for(int i=0; i<8; i++) {
			scoreArr[i] = sc.nextInt();
			sortArr[i] = scoreArr[i];
		}
		Arrays.sort(sortArr);
		
		int sum = 0;
		
		for(int i=scoreArr.length-1; i>2; i--) {
			sum = sum + sortArr[i];
		}
		
		System.out.println(sum);
		
		int count = 0, index = 0;
		int [] indexArr = new int[5];
		
		for(int i=sortArr.length-1; i>2; i--) {
			for(int j=0; j<8; j++) {
				if(sortArr[i] == scoreArr[j]) {
					indexArr[index] = j+1;
					index++;
				}
			}
		}
		Arrays.sort(indexArr);
		
		for(int i=0; i<index; i++) {
			System.out.print(indexArr[i] + " ");
		}
	}
}
