package algorithmfortest.ch02String;

import java.util.*;

/** 대소문자 변환 **/
//아스키번호 사용...

public class sec02 {
	
	public static String solution(String str) {
		String answer = "";
		//for each문 사용
		//배열요소를 하나하나 x에대입
		for(char x : str.toCharArray()) {
			
			//대소문자는 아스키 번호 값이 부여되어 있음
			//대문자: 65~90(65 = A)
			//소문자: 97~122(97 = a)
			//대소문자는 32차이가 남
			//만약 문자가 소문자의 범위에 있다면...
			//대문자로 변경하기 위해 32를 더함
			//숫자로 계산하기 때문에 결과값은 숫자로 나오므로 
			//캐스팅하여 형변환필요
			if(x>=97 && x<=122) answer += (char)(x-32);
			else answer += (char)(x+32);
			
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));
	}

}