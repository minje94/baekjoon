package ex1475_��_��ȣ;
import java.util.Scanner;

public class ex1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String roomNum = sc.nextLine();
		int arr[] = new int[10];
		int [] num = new int[roomNum.length()];
		int count=0;
		
		//�迭�� �Է¹��� ���� �Է�
		for(int i=0; i<roomNum.length(); i++) {
			num[i] = roomNum.charAt(i)-'0';
		}	
		
		for(int i=0; i<roomNum.length(); i++) {
			if(arr[num[i]] == 0) {
				if(num[i]==6 && arr[9]!=0) { //6�� ���µ� 9�� �ִ� ���
					arr[9] -=1;
					continue;
				}
				else if(num[i]==9 && arr[6]!=0) { //9�� ���µ� 6�� �ִ� ���
					arr[6] -= 1;
					continue;
				}
				else {
					for(int j=0; j<10; j++) {
						arr[j] +=1;
					}
					count++; //��Ʈ �� 
					arr[num[i]] -=1; //�ش� �� ���� ����
				}
			}
			else
				arr[num[i]] -= 1;
		}
		System.out.println(count);
	}
}
