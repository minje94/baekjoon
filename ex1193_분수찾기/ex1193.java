package ex1193_�м�ã��;
import java.util.Scanner;

public class ex1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int line=0, num=0;
		int bunja=1, bunmo=1;
		
		//�� ������� �� ��° ���̰� �� ���� �ڸ����� �˾Ƴ�
		for(int i=1; i<=4473; i++) {
			line = line + i;
			if(line>=x) {
				num = line-x; 
				line = i;
				break;
			}
		}
		
		//�Է� ���ڿ� �´� �м��� ���
		for(int i=0; i<=num; i++) {
			System.out.println("���� ����?");
			//Ȧ���� ���
			if(line%2!=0) {
				bunja=line;
				bunmo=1;
				for(int j=0; j<line-num-1; j++) {
					System.out.println("��");
					bunja -= 1;
					bunmo += 1;
				}
			}
			else {
				bunja = 1;
				bunmo = line;
				for(int j=0; j<line-num-1; j++) {
					System.out.println("�̾�");
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