package lession1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession5 {

//	소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//	중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//	ksekkset
//	kset

	public String solution(String str) {
		
//		String[] split = str.split("");
//		ArrayList<String> list = new ArrayList<>();
//		
//		list.add(split[0]);
//		
//		for(int i = 1; i < split.length; i++) {
//			if(!list.contains(split[i])) {
//				list.add(split[i]);
//			}
//		}
//		String answer = "";
//		for(String s : list) {
//			answer += s;
//		}
//		
//		return answer;
		
		// indexOf() 사용
		// indexOf(str.indexOf(str.CharAt(i)) 은 그 알파벳이 처음 발견된 index만 알려준다. 뒤에 중복해서 나와도 인덱스는 처음 인데스만 출력해줌.
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			// str.charAt(i)은 i번째 문자를 출력해준다.
			
			if(str.indexOf(str.charAt(i)) == i) {  
				// indexOf값은 처음 인덱스만 반환해주기 때문에 문자열 본인의 인덱스와 indexOf 값이 같으면 처음 나온 문자이다.
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Lession5 T = new Lession5();
		
		System.out.print(T.solution(str));
	}

}
