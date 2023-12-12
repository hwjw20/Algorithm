package lession1;

import java.util.Scanner;

public class Lession2 {

	// 문장 속 가장 긴 단어 추출하기
	// 입: it is time to study
	// 출: study 
	
	public String solution(String str) {
		String answer = "";
		String[] arr = str.split(" ");
		int max = 0;
		
		for(String target : arr) {
			if(target.length() > max) {
				max = target.length();
				answer = target;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lession2 T = new Lession2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.solution(str));
	}

}
