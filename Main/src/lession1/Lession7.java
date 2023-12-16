package lession1;

import java.util.Scanner;

public class Lession7 {
//	앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//	문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//	단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//	알파벳 이외의 문자들의 무시합니다.
	
//	found7, time: study; Yduts; emit, 7Dnuof
//	YES
	
	// 내풀이
//	public String solution(String str) {
//		
//		str = str.toLowerCase();
//		String a = "";
//		char[] arr = str.toCharArray();
//		for(char c : arr) {
//			if(Character.isAlphabetic(c)) {
//				a += c;
//			}
//		}
//		
//		String reverse = new StringBuilder(a).reverse().toString();
//		if(reverse.equals(a)) {
//			return "YES";
//		}
//		
//		return "NO";
//	}
	
	public String solution(String str) {
		String answer = "NO";
		
		// A부터 Z까지가 아니면 빈문자""로 대체해서 없애기
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			return "YES";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Lession7 T = new Lession7();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(T.solution(str));
	}

}
