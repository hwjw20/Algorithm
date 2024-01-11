package lession2;

import java.util.Scanner;

public class Lession11 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=1; i<=n; i++) {
			int count = 0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
			}
			if(count > max) {
				max = count;
				answer = i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession11 T = new Lession11();
		int n = scanner.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
