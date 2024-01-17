package lession4;

import java.util.HashMap;
import java.util.Scanner;

public class Lession02 {
	public String solution(String strA, String strB) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : strA.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : strB.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession02 T = new Lession02();
		
		String strA = scanner.next();
		String strB = scanner.next();
		System.out.print(T.solution(strA, strB));
	}

}
