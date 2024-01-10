package lession2;

import java.util.Scanner;

public class Lession8 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					count++;
				} 
			}
			answer[i] = count+1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession8 T = new Lession8();
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int s : T.solution(n, arr)) {
			System.out.print(s + " ");
		}
	}

}
