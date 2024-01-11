package lession3;

import java.util.Scanner;

public class Lession04 {
	public int solution(int n, int m, int[] arr) {
		// lt와 rt의 투포인터 이용
		// lt와 rt 인덱스 사이의 값들의 합을 sum이라 하고
		// sum이 m보다 작으면 rt를 하나씩 더하고 다시 sum 계산 후 확인
		// sum이 m보다 커지면 sum 값에서 lt 인덱스의 값을 빼고 m과 비교 후 lt++
		
		int answer = 0;
		int lt = 0;
		int sum = 0;
		
		for(int rt = 0; rt<n; rt++) {
			sum += arr[rt];
			if(sum==m) {
				answer++;
			}
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Lession04 T = new Lession04();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
