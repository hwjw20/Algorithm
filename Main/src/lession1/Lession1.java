package lession1;

import java.util.Scanner;

public class Lession1 {

	// 대소문자 변환
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) {
				answer += Character.toLowerCase(x);
			} else {
				answer += Character.toUpperCase(x);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Lession1 T = new Lession1();
		String str = scanner.next();
		
		System.out.println(T.solution(str));

	}

}
