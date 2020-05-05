package ex3053_택시_기하학;
import java.util.Scanner;

public class ex3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		System.out.printf("%6f\n",r*r*Math.PI); //유클리드 기하학으로 원의 넓이
		System.out.printf("%6f",2*r*r); //택시 기하학으로 원의 넓이
	}
}
