package lession3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession01 {
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0; 
		int p2=0;
		
		while(p1<n && p2<m) {
			if(a[p1] < b[p2]) {
				answer.add(a[p1++]); //p1 값을 add하고 p1값 ++
			} else {
				answer.add(b[p2++]);
			}
		}
		while(p1<n) {
			answer.add(a[p1++]);
		}
		while(p2<m) {
			answer.add(b[p2++]);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Lession01 T = new Lession01();
		
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = scan.nextInt();
		}
		for(int x : T.solution(n, a, m, b)) {
			System.out.print(x + " ");
		}
		
	}
	

}
