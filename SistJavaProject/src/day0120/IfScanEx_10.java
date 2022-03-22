package day0120;

import java.util.Scanner;

public class IfScanEx_10 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int score; // 입력할 점수
		String msg,grade; // 조건에 따른 결과값
		
		System.out.print("점수를 입력하세요: ");
		score=sc.nextInt();
		
		// 조건
		msg=score>=90?"상품권 10만원":
			score>=80?"상품권 5만원":"다음 기회에! -재시험-";
			
		// 결과 출력
		System.out.println("당신의 점수는 "+score+"점 입니다\n평가메시지: "+msg);
		
		//
		
		if(score>=90) {
			grade="상품권 10만원";
		} else if(score>=80) {
			grade="상품권 5만원";
		} else if(score>=70) {
			grade="상품권 3만원";
		} else if(score>=60) {
			grade="상품권 1만원";
		} else {
			grade="돈 내놔";
		}
		System.out.println("점수: "+score+"\n평가메시지: "+grade);
	}

}