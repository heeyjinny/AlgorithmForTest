package algorithmfortest.ch03String;

import java.util.*;

/** 문장 속 가장 길이가 긴 단어 찾기 **/
//indexOf(), supString()사용하기

public class sec0301 {


	public static String solution(String str) {
		String answer="";
		
		//최대값으로 갱신하기 위해 
		//변수에 int형 가장 작은값으로 초기화
		int m = Integer.MIN_VALUE, pos;

		//첫 번째로 발견되는 띄어쓰기의 인덱스 리턴, 
		//발견하지 못하면 -1리턴하여 반복문 종료
		while((pos=str.indexOf(' ')) != -1) {
			
			//.substring(0, pos);
			//인덱스 0부터 pos의 인덱스 값 전까지 잘라서 저장
			//ex) pos의 인덱스가 4라면 0~3까지의 값이 저장됨
			String tmp=str.substring(0, pos);
			
			int len=tmp.length();
			if(len>m) {
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		//마지막 단어찾을 때 공백이 없기 때문에 마지막 단어를 찾지 않고
		//반복문이 끝나게 됨
		//마지막 단어를 찾을 수 있게 코드작성
		if(str.length()>m) answer = str;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//한 줄 입력받기
		String str=kb.nextLine();
		System.out.println(solution(str));
		
	}

}

