package ex1157_단어공부;

import java.util.Scanner;

public class ex1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toUpperCase();
		
		int arr[] = new int[26];
		int max = 0;
		char answer = 0;
		
		for(int i=0; i<text.length(); i++) {
			arr[text.charAt(i)-65]++;
			if(arr[text.charAt(i)-65]>max) {	
				answer = text.charAt(i);
				max = arr[text.charAt(i)-65];
			}
			else if(max == arr[text.charAt(i)-65]) {
				answer = '?';
			}

			System.out.println(arr[text.charAt(i)-65]);
		}
		System.out.println(answer);
		
	}
}
