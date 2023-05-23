package backjoon.condition;

public class Prac {
	public static void main(String[] args) {
		
/*		
		int money = 50300;
		int coffee = 2200;
		int target = (money % coffee);
		int[] curruncy = {1000, 500, 100};
		
		
		for (int i = 0; i < curruncy.length; i++) {

			System.out.println(curruncy[i] + " " + target / curruncy[i]);
			
			target = target % curruncy[i];
						
		}
		
*/		
		
		int[][] arr = {
				{4,7,9,8},
				{2,7,3,4},
				{9,2,8,5},
				{8,4,2,1}
		};
		
		int sum = 0;
		boolean condition = true;
		
		// arr 탐색을 하는데
		// 만약 짝수면 그 수를 출력을 하고
		// 홀수이면서 더한 값이 20이 넘으면 끝내고 아니면 더하고 더한 값을 출력하자
		
		/*
		for (int i = 0; i < arr.length; i++) {
			
			if (!condition) {
				break;
			}
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
				} else {
					sum += arr[i][j];
					
					if (sum > 20) {
						System.out.println("20넘음 정지");
						condition = false;
						break;
					}
				}
				
			}
	
		}
		
		
		System.out.println(sum);
		
		*/
		
		
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int i = 0;
		
		while(i < arr2.length) {
			
			int j = 0;
			
			while(j < arr2[i].length) {
				System.out.print(arr2[j][i]);
				j++;
			}
			
			i++;
		}
		
		
		
		
	}
}





