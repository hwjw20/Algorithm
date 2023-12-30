package lession2;

import java.util.Scanner;

public class Lession5 {
	public int solution(int n) {
		// 이중 for문, 제곱근보다 시간복잡도 작은 에라토스테네스 체
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j+=i) {
					ch[j]=1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Lession5 T = new Lession5();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.print(T.solution(n));
			
	}

}
