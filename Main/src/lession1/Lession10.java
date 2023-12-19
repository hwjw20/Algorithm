package lession1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Lession10 {
		
//		한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//		첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//		문자열의 길이는 100을 넘지 않는다.
//		첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
		
//		teachermode e
//		1 0 1 2 1 0 1 2 2 1 0
	
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
			p = 1000;
			for(i = s.length() - 1; i >= 0; i--) {
				if(s.charAt(i) == t) {
					p = 0;
				} else {
					p++;
					answer[i] = Math.min(answer[i], p);
				}
			}
		}
		
		return answer;
	} 
	
	public static void main(String[] args) {
		Lession10 T = new Lession10();
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		char c = scanner.next().charAt(0);
		for(int x : T.solution(s, c)) {
			System.out.print(x + " ");
		}
		
	}

}
