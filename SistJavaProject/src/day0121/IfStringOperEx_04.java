package day0121;

import java.util.Scanner;

public class IfStringOperEx_04 {
	public static void main(String[] args) {
		// 문자열 비교는 관계 연산자가 아닌 equals라는 메소드를 사용해 비교함
		
		Scanner sc=new Scanner(System.in);
		
		String msg; // 입력할 단어
		System.out.println("====미니 영어 사전====");
		System.out.println("영어단어를 입력하세요.:");
		System.out.println("입력 가능 단어) happy, angel, rose, winter, summer");
		msg=sc.nextLine();
		
		System.out.println("입력한 문자열:"+msg);
		
		// 문자열 동등연산자로 비교하려면 주소 비교를 함 >> 값 비교 equals 메소드 사용
		if(msg.equalsIgnoreCase("angel")) { // equalsIgnoreCase는 대소문자를 구별하지 않고 비교함.
			System.out.println("***천사***");
		} else if (msg.equals("happy")) {
			System.out.println("****행복하다****");
		} else if (msg.equals("rose")) {
			System.out.println("***장미***");
		} else if (msg.equals("winter")) {
			System.out.println("**겨울***");
		} else if (msg.equals("summer")) {
			System.out.println("***여름***");
		} else {
			System.out.println("사전에 없는 문자열 입니다.");
		}
		
			
	}
}
