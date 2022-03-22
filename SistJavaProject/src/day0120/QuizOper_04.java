package day0120;

import java.util.Scanner;

public class QuizOper_04 {
	public static void main(String[] args) {
		/*
		 월 급여를 입력해, 만원, 천원, 백원, 십원, 일원 갯수를 구하기
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int money, m10000, m1000, m100, m10, m1;
		
		System.out.print("급여를 입력하세요:");
		money=sc.nextInt();
		
		m10000=(money/10000);
		m1000=((money%10000)/1000);
		m100=((money%1000)/100);
		m10=((money%100)/10);
		m1=((money%10)/1);
		
		System.out.println("만원: "+m10000);
		System.out.println("천원: "+m1000);
		System.out.println("백원: "+m100);
		System.out.println("십원: "+m10);
		System.out.println("일원: "+m1);
	}

}