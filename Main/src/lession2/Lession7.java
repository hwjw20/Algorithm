package lession2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession7 {
	public int solution(int n, int[] arr) {
		int cnt = 0;
		int answer = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Lession7 T = new Lession7();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}

}
