package lession3;

import java.util.Scanner;

public class Lession05 {
//	public int solution(int n) {
//		int answer = 0;
//		int sum = 0;
//		int lt = 0;
//		int[] arr = new int[n/2+1];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//		}
//		for(int rt=0; rt<n/2+1; rt++) {
//			sum+=arr[rt];
//			if(sum == n) {
//				answer++;
//			}
//			
//			while(sum >= n) {
//				sum -= arr[lt];
//				lt++;
//				if(sum == n) {
//					answer++;
//				}
//				
//			}
//		}
//		return answer;
//	}
	public int solution(int n) {
		int answer =0;
		int cnt =1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Lession05 T = new Lession05();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.print(T.solution(n));

	}

}
