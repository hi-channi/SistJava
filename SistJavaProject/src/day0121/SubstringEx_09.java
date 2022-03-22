package day0121;

public class SubstringEx_09 {
	public static void main(String[] args) {
		
		String str="나는 강남 쌍용교육센터에서 자바를 공부 중입니다.";
		int i=str.length(); // 공백 포함 문자열 전체 길이
		
		// 문자열에서 문자 추출
		char ch=str.charAt(4);
		String word1=str.substring(3); //str.substring(beginIndex, endIndex); 
		String word2=str.substring(6, 11); // : 문자열 첫자리부터 n-1자리까지 추출;
		
		System.out.println(ch);
		System.out.println(word1); // 3번째 문자열부터 끝까지 추출
		System.out.println(word2); // 6번째부터 11-1번째까지 추출
		System.out.println(i); // 
	}
}
