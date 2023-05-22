package backjoon.IO_calc;

import java.util.Scanner;
public class p_10926 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
		
		/*
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		
		}
		*/
		
	}
 
}
