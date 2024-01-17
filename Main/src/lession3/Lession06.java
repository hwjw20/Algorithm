package lession3;

import java.util.Scanner;

public class Lession06 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		// count는 0을 1로 바꾸는 횟수로 k보다 작아야 한다.
		int count = 0;
		int lt = 0;
		for(int rt=0; rt<n; rt++) {
			if(arr[rt] == 0) {
				count++;
			}
			while(count > k) {
				if(arr[lt] == 0) {
					count--;
					lt++;
				}
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lession06 T = new Lession06();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}

}
