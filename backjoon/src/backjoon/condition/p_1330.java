package backjoon.condition;

import java.util.Scanner;

public class p_1330 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
			return ;
		}
		
		if (a < b) {
			System.out.println("<");
			return;
		}
		
		System.out.println("==");
	}
	
}
