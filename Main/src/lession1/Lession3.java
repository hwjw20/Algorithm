package lession1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lession3 {

	// N개의 단어 뒤집기
	// 3, dog, Mark
	// god, kraM
	
	public ArrayList<String> solution(int N, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			// d, o, g
			char[] arr = x.toCharArray();
			int left = 0;
			int right = arr.length - 1;
			 
			while(left < right) {
				// tmp = d
				char tmp = arr[left];
				//
				arr[left] = arr[right];
				arr[right] = tmp;
				
				left ++;
				right --;
			}
			
			//char들을 String화 시켜준다.
			String tmp = String.valueOf(arr);  //valudOf() 는 static으로 선언된 메소드이므로 String.으로 사용한다.
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lession3 T = new Lession3();
		
		int N = scanner.nextInt();
		String[] str = new String[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = scanner.next();
		}
		
		for(String x : T.solution(N, str))  {
			System.out.println(x);
		}
		
	}

}
