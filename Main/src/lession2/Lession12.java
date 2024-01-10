package lession2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession12 {
	public int solution(int n, int m, int[][] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				// 2번학생 지정
				arr[i][n-1]
			}
		}
	}

	public static void main(String[] args) {
		Lession12 T = new Lession12();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][]	arr = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}

}
