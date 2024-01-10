package lession2;

import java.util.Scanner;

public class Lession10 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int[][]	newArr = new int[n+2][n+2];
		for(int i=0; i<n+2; i++) {
			newArr[0][i] = 0;
			newArr[i][0] = 0;
			newArr[i][n+1] = 0;
			newArr[n+1][i] = 0;
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				newArr[i][j] = arr[i-1][j-1];
			}
		}
		for(int i=1; i<=n+1; i++) {
			for(int j=1; j<=n+1; j++) {
				if((newArr[i][j] > newArr[i][j-1]) && (newArr[i][j] > newArr[i][j+1])
						&& (newArr[i][j] > newArr[i-1][j]) && (newArr[i][j] > newArr[i+1][j])) {
					answer++;
				}
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		Lession10 T = new Lession10();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
