package backjoon.IO_calc;

import java.util.Scanner;

public class p_10869 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int a1 = a + b;
		int b1 = a - b;
		int c1 = a * b;
		int d1 = a / b;
		int e1 = a % b;
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		
		sc.close();
	}
	
}
