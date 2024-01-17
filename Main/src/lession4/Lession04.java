package lession4;

import java.util.HashMap;
import java.util.Scanner;

public class Lession04 {
	public int solution(String a, String b) {
		int answer = 0;
		
		HashMap<Character, Integer> bm = new HashMap<>();
		HashMap<Character, Integer> am = new HashMap<>();
		
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0)+1);
		}
		
		int leng = b.length()-1;
		for(int i=0; i<leng; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		}
		
		int lt=0;
		for(int rt=leng; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if(am.equals(bm)) {
				answer++;
			}
			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			if(am.get(a.charAt(lt))== 0) {
				am.remove(a.charAt(lt));
			}
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession04 T = new Lession04();
		
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		System.out.print(T.solution(s1, s2));
	}
}
