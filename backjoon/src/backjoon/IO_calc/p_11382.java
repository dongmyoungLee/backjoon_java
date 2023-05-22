package backjoon.IO_calc;

import java.util.Scanner;

public class p_11382 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] aArr = a.split(" ");
		
		int result = 0;
		
		for (int i = 0; i < aArr.length; i++) {
			result += Integer.parseInt(aArr[i]);
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
	
}
