package ex4948_베르트랑_공준;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ex4948{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean primeNum[] = new boolean[123456*2+1];
		
		primeNum[1] = true;
		
		for(int i=2; i<=123456*2; i++) {
			for(int j=2; i*j<=123456*2; j++) {
				primeNum[i*j] = true;
			}
		}
		
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0 ) {
				break;
			}
			
			int sosu = 0;
			
			for(int i = num+1; i<=2*num; i++) {
				if(!primeNum[i]) {
					sosu++;
				}
			}
			System.out.println(sosu);
		}
	}
}
