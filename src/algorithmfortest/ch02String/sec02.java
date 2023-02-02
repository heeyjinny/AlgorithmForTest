package algorithmfortest.ch02String;

import java.util.*;

public class sec02 {

	public static void main(String[] args) {

	}

}

/** 대소문자 변환  **/

class Main{
	
	public static String solution(String str) {
		String answer = "";
		//for each문 사용
		//배열요소를 하나하나 x에대입
		for(char x : str.toCharArray()) {
			
			//Character클래스 사용하여 대문자나 소문자 탐
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));
	}
}