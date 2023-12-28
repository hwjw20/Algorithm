package lession2;

import java.util.Scanner;

public class Lession4 {
	public int[] soluton(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2; i < n; i++) {
			//answer[2] = answer[0] + answer[1] = 2
			//answer[3] = answer[1] + answer[2] = 3
			// answer[9]=
			
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Lession4 T = new Lession4();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int a : T.soluton(n)) {
			System.out.print(a + " ");
		}
	}

}
