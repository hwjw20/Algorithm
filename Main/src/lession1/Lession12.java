package lession1;

import java.util.Scanner;

//	#****###**#####**#####**##**

//	#****## --> 'C'
//	#**#### --> 'O'
//	#**#### --> 'O'
//	#**##** --> 'L'

public class Lession12 {
	
	public String solution(int n, String str) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0'); 
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			str = str.substring(7);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lession12 T = new Lession12();
		
		int n = scan.nextInt();
		String str = scan.next();
		
		System.out.print(T.solution(n, str));
	}

}
