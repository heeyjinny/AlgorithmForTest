package algorithmfortest.ch03String;

import java.util.*;

/** 문장 속 가장 길이가 긴 단어 찾기 **/

public class sec03 {


	public static String solution(String str) {
		String answer="";
		
		//최대값으로 갱신하기 위해 
		//변수에 int형 가장 작은값으로 초기화
		int m = Integer.MIN_VALUE;
		//띄어쓰기 분리 메서드 사용하여 배열변수에 저장
		String[] s = str.split(" ");
		
		//for each문
		//공백을 분리하여 각 단어들 추출한 값을
		//x에 차례대로 저장
		for(String x : s) {
			//길이를 구하기 위해 각 긴단어 저장변수 생성
			int len = x.length();
			//최대값 구하기방식
			//만약 구한 값의 길이가 더 크다면
			//변수m에 그 길이를 대입하고
			//answer에 그 단어의 값 저장
			if(len>m) {
				m=len;
				answer=x;
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//한 줄 입력받기
		String str=kb.nextLine();
		System.out.println(solution(str));
		
	}

}

