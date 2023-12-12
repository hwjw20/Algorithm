package lession1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession3 {

	// N개의 단어 뒤집기
	// 3, dog, Mark
	// god, kraM
	
	public ArrayList<String> solution(int N, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		String tmp = "";
		for(String x : str) {
			//한 글자씩 배열에 넣기
			// d,o,g
			String[] tmpArr = x.split("");
			
			// 뒤집어진 단어 만들어서 answer에 넣기
			for(int i = 0; i < tmpArr.length; i++) {
				tmp += tmpArr[tmpArr.length - 1 - i];
				answer.add(tmp);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession3 T = new Lession3();
		
		int N = scanner.nextInt();
		String[] str = {};
		for(int i = 0; i < N; i++) {
			String s = scanner.next();
			str[i] = s;
		}
		System.out.println(T.solution(N, str));
		
	}

}
