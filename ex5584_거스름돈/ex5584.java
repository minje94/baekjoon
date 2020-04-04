package ex5584_°Å½º¸§µ·;
import java.util.Scanner;

public class ex5584 {
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		int money = 1000 - sc.nextInt();
		int countSum = 0;
		
		while(true) {
			int count = 0;
			
			if(money == 0) {
				System.out.println(countSum);
				break;
			}
			
			if(money>=500) {
				money = money - 500;
				countSum = countSum + 1;
			}
			else if(money>=100 && money<500) {
				count = money/100;
				money = money - (count*100);
				countSum = countSum + count;
			}
			else if(money>=50 && money<100) {
				count = money/50;
				money = money - (count*50);
				countSum = countSum + count;
			}

			else if(money>=10 && money<50) {
				count = money/10;
				money = money - (count*10);
				countSum = countSum + count;
			}

			else if(money>=5 && money<10) {
				count = money/5;
				money = money - (count*5);
				countSum = countSum + count;
			}

			else if(money>=1 && money<5) {
				count = money;
				money = 0;
				countSum = countSum + count;
			}
		}
	}
}
