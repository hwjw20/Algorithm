package lession2;

import java.util.Scanner;

public class Lession12 {
	public int solution(int n, int m, int[][] arr) {
		// 모든 경우의 짝꿍에서 멘토가 앞서는 경우에만 개수 세기
		// n*n 의 경우에서 k번째 테스트에서 등수s 확인
		
		int answer = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int count = 0;
				for(int k=0; k<m; k++) {
					int pi = 0;
					int pj = 0;
					
					for(int s=0; s<n; s++) {
						if(arr[k][s] == i) {
							pi = s;
						}
						if(arr[k][s] == j) {
							pj = s;
						}
					}
					if(pi < pj) {
						count++;
					}
				}
				if(count == m) {
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Lession12 T = new Lession12();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][]	arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}

}
