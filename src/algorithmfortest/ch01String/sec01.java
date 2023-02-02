package algorithmfortest.ch01String;

import java.util.*;

public class sec01 {

	public static void main(String[] args) {
		
		
	}

}


/**  문자 찾기  **/

class Main {
	public static int solution(String str, char t) {
		int answer = 0;
		
		//대소문자를 구분하지 않기 때문에 전부 대문자로 변경
		//문자열 대문자로 변경: toUpperCase()
		str = str.toUpperCase();
		//문자 대문자로 변경: Character.toUpperCase(문자변수)
		t = Character.toUpperCase(t);
		
		//대문자로 잘 변경되었는지 확인 
		//System.out.println(str + " " + t);
		
		//01
		//인덱스로 찾기 (for문사용)
		//문자열의 길이를 반복하여 문자열의 문자 한 개씩 검색하면서
		//일치하는 문자의 개수 증가시켜서 개수 탐색
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == t) answer++;
//		}
		
		//02
		//for each문으로 찾기 
		//향상된 for문에는 문자열이 올 수 없고 배열이 와야함
		//문자열을 한글자씩 저장하여 배열로 만들기: .toCharArray()
		//문자배열은 하나씩 x에 대응되면서 실행됨
		for(char x : str.toCharArray())
			if(x == t) answer++;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//문자열 읽어들이기: .next()
		String str = kb.next();
		//문자 하나 읽기: 문자열읽고 문자한개가져오기
		char c = kb.next().charAt(0);
		
		//솔루션 함수에 입력받은 문자열과 문자 보내기
		System.out.println(solution(str, c));
		
	}
	
}
