package ex1475_방_번호;
import java.util.Scanner;

public class ex1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String roomNum = sc.nextLine();
		int arr[] = new int[10];
		int [] num = new int[roomNum.length()];
		int count=0;
		
		//배열에 입력받은 숫자 입력
		for(int i=0; i<roomNum.length(); i++) {
			num[i] = roomNum.charAt(i)-'0';
		}	
		
		for(int i=0; i<roomNum.length(); i++) {
			if(arr[num[i]] == 0) {
				if(num[i]==6 && arr[9]!=0) { //6이 없는데 9가 있는 경우
					arr[9] -=1;
					continue;
				}
				else if(num[i]==9 && arr[6]!=0) { //9가 없는데 6이 있는 경우
					arr[6] -= 1;
					continue;
				}
				else {
					for(int j=0; j<10; j++) {
						arr[j] +=1;
					}
					count++; //세트 수 
					arr[num[i]] -=1; //해당 값 개수 감소
				}
			}
			else
				arr[num[i]] -= 1;
		}
		System.out.println(count);
	}
}
