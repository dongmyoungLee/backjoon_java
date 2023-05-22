package backjoon.IO_calc;

import java.util.Scanner;

public class p_2588 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int result1 = a * (b % 10);
		int result2 = a * ((b / 10) % 10);
		int result3 = a * (b / 100);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(a * b);
		
	}
	
}
