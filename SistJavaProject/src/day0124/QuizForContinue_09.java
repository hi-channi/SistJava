package day0124;

import java.util.Scanner;

public class QuizForContinue_09 {
	public static void main(String[] args) {
		/*
		 * 총 5개의 점수를 입력받아 합계를 구하시오
		 * 만약 1~100이 아닐 경우 다시 입력받기(continue 사용)
		 * for문 내부에 if문 사용
		 */

		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		int score; // 입력할 정수
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번 점수를 입력하세요: ");
			score=sc.nextInt();
			// 조건문
			if(score<1 || score>100) {
				System.out.println("잘못 입력했습니다.");
				i--; // 잘못 입력 시 반복 제외
				continue; // i++로 이동
			}
			sum+=score;
		}
		System.out.println("총점:"+sum);
	}
}
