package lession2;

import java.util.Scanner;

public class Lession3 {

	public char[] solution(int n, int[] aArr, int[] bArr) {
		char[] answer = new char[n];
		for(int i = 0; i < n; i++) {
			int a = aArr[i];
			int b = bArr[i];
			if(a == b) {
				answer[i] = 'D';
			}
			// 가위1, 바위2, 보3
			// 1,2 = b / 1,3 = a
			// 2,1 = a / 2,3 = b
			// 3,1 = b / 3,2 = a
			
			// a가 이기는 경우
			if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)) {
				answer[i] = 'A';
			}
			// b가 이기는 경우
			if((a==1 && b==2) || (a==2 && b==3) || (a==3 && b==1)) {
				answer[i] = 'B';
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Lession3 T = new Lession3();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		for(int i=0; i<n; i++) {
			aArr[i] = scanner.nextInt();
		}
		for(int i=0; i<n; i++) {
			bArr[i] = scanner.nextInt();
		}
		
		for(char c : T.solution(n,aArr ,bArr)) {
			System.out.println(c);
		}
	}

}
