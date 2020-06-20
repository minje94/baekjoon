package ex1526_가장_큰_금민수;
import java.util.Scanner;

public class ex1526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] numArr = new int [126];
		int count = 0;
		
		for(int i=1; i<=777777; i++) {
			String temp = i+"";
			String [] tempArr = temp.split("");
			
			
			for(int j=0; j<tempArr.length; j++) {
				
				if(j == tempArr.length-1 && (tempArr[j].equals("4") || tempArr[j].equals("7"))) {
					numArr[count++] = Integer.parseInt(temp);
				}
				else if(!(tempArr[j].equals("4") || tempArr[j].equals("7"))) {
					break;
				}
				else {
					continue;
				}
			}
		}
		
		for(int i=0; i<numArr.length; i++) {
			if(num <numArr[i]) {
				System.out.println(numArr[i-1]);
				break;
			}
			else if (num > numArr[numArr.length-1]) {
				System.out.println(numArr[numArr.length-1]);
				break;
			}
		}
		
	}

}
