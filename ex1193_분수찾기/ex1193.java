package ex1193_분수찾기;
import java.util.Scanner;

public class ex1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int line=0, num=0;
		int bunja=1, bunmo=1;
		
		//줄 계산으로 몇 번째 줄이고 몇 번쨰 자리인지 알아냄
		for(int i=1; i<=4473; i++) {
			line = line + i;
			if(line>=x) {
				num = line-x; 
				line = i;
				break;
			}
		}
		
		//입력 숫자에 맞는 분수값 출력
		for(int i=0; i<=num; i++) {
			System.out.println("여기 오냐?");
			//홀수인 경우
			if(line%2!=0) {
				bunja=line;
				bunmo=1;
				for(int j=0; j<line-num-1; j++) {
					System.out.println("뀨");
					bunja -= 1;
					bunmo += 1;
				}
			}
			else {
				bunja = 1;
				bunmo = line;
				for(int j=0; j<line-num-1; j++) {
					System.out.println("이얏");
					bunmo -=1;
					bunja +=1;
				}
			}
		}
		System.out.print(bunja + "/" + bunmo + " ");
	}
}

/*
 1  2  6  7  15 16 
 3  5  8  14 17
 4  9  13 18
 10 12 19
 11 20
 21
*/