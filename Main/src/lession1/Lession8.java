package lession1;

import java.util.Scanner;

public class Lession8 {
//	문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//	만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//	추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	
//	g0en2T0s8eSoft
//	208
	
	
	// 아스키 넘버 사용
//	public int solution(String s) {
//		
//		// answer 를 0으로 초기화하고 숫자가 나올때마다 
//		// answer = answer * 10 + (X -48)을 해준다.
//		// char 형 숫자들은 아스키 넘버로 구분한다. 48과 57사이가 숫자
//		
//		int answer = 0;
//		for(char x : s.toCharArray()) {
//			if(x >= 48 && x <= 57) {
//				answer = answer * 10 + (x -48);
//			}
//		}
//		
//		return answer;
//	}
	
	public int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		
		// Integer.parseInt() 쓰면 앞에 0은 자동으로 사라지고 정수형태로 변환.
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Lession8 T = new Lession8();
		String str = scan.next();
		
		System.out.println(T.solution(str));
	}

}
