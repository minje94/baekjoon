package ex14501_Επ»η;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex14501 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int workday = Integer.parseInt(br.readLine());
		int [] workingDay = new int [workday];
		int [] score = new int [workday];
		int [] dp = new int [workday+1];
		
		for(int i=0; i<workday; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			workingDay[i] = Integer.parseInt(st.nextToken());
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<workday; i++) {
			dp[i+1] = Math.max(dp[i], dp[i+1]);
			if(i  + workingDay[i] <= workday) {
				dp[i+workingDay[i]] = Math.max(dp[i + workingDay[i]], dp[i] + score[i]);
			}
		}
		System.out.println(dp[workday]);
	}
}
