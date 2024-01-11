package lession3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lession02 {
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
		ArrayList<Integer> list = new ArrayList<>();
		int p1=0;
		int p2=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {
				list.add(a[p1]);
				p1++;
				p2++;
			} else if(a[p1] < b[p2]){
				p1++;
			} else {
				p2++;
			}
		}
		return list;
		
	}

	public static void main(String[] args) {
		Lession02 T = new Lession02();
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = scanner.nextInt();
		}
		
		for(int x : T.solution(n,a,m,b)) {
			System.out.print(x + " ");
		}
	}

}
