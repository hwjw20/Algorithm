package lession4;

import java.util.HashMap;
import java.util.Scanner;

public class Lession01 {
	public char solution(int n, String s) {
		// 해시 맵은 key, value 가 있는 형태로 key에는 학생 후보가, value에는 투표수를 넣는다.
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			//System.out.println(key + " " + map.get(key));
			if(map.get(key) > max) {
				max = map.get(key);
				answer=key;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession01 T = new Lession01();
		
		int n = scanner.nextInt();
		String str = scanner.next();
		System.out.print(T.solution(n, str));

	}

}
