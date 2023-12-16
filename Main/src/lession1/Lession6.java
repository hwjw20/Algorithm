package lession1;

import java.util.Scanner;

public class Lession6 {

//	앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//	문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//	단 회문을 검사할 때 대소문자를 구분하지 않습니다.
//	
//	gooG
//	YES
	
	// 내풀이
//	public String solution(String str) {
//		char[] arr = str.toCharArray();
//		String s = "";
//		for(char c : arr) {
//			if(Character.isUpperCase(c)) {
//				c = Character.toLowerCase(c);
//			}
//			s += c;
//		}
//		
//		// 앞vs뒤 비교하기
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < s.length(); i++) {
//			sb.append(s.charAt(i));
//		}
//		
//		sb.reverse();
//		if(sb.toString().equals(s)) {
//			return "YES";
//		} else {
//			return "NO";
//		}
//	}
	
	// 인덱스 반대편끼리 같은지 비교
//	public String solution(String str) {
//		String answer = "YES";
//		int len = str.length();
//		// 첫번째 문자와 마지막 문자 비교, 두번째 문자와 마지막에서 두번재 문자 비교, ..
//		// 문자열 길이의 절반전까지만 비교해보면 된다.
//		str = str.toLowerCase();
//		for(int i = 0; i < len/2; i++) {
//			if(str.charAt(i) != str.charAt(len - i - 1)) {
//				return "NO";
//			}
//		}
//		return answer;
//	}
	
	// StringBuilder 활용하기
	public String solution(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(reverse)) {
			return "YES";
		}
		return "NO";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lession6 T = new Lession6();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(T.solution(str));
	}

}
