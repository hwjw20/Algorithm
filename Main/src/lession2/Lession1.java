package lession2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession1 {

//	N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//	(첫 번째 수는 무조건 출력한다)
//	첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//	자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

//	6
//	7 3 9 5 6 12

//	7 9 6 12
	public int[] solution(int n, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i = 1; i <= arr.length - 1; i++) {
			if(arr[i] > arr[i-1]) {
				list.add(arr[i]);
			}
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lession1 T = new Lession1();
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
