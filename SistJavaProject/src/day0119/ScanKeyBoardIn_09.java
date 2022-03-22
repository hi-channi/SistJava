package day0119;

import java.util.Calendar;
import java.util.Scanner;

public class ScanKeyBoardIn_09 {

	public static void main(String[] args) {
		
		// 변수 선언 및 메소드 호출
		Calendar cal=Calendar.getInstance();
		Scanner sc=new Scanner(System.in);
		
		String name;
		int curYear, birth, age;
		String major;
		int sw_score, lt_score;
		double scoreAvg;
		
		// 입력값 받기 위한 출력값 작성
		System.out.print("응시자 이름: ");
		name=sc.nextLine();
		System.out.print("출생연도: ");
		birth=Integer.parseInt(sc.nextLine()); //버퍼 문제로 인한 캐스팅
		System.out.print("전공을 입력하세요: ");
		major=sc.nextLine();
		System.out.print("SW 사전테스트 점수 입력: ");
		sw_score=Integer.parseInt(sc.nextLine());
		System.out.print("실전 응용 테스트 점수 입력: ");
		lt_score=Integer.parseInt(sc.nextLine());
		
		curYear=cal.get(cal.YEAR);
		age=curYear-(birth-1);
		scoreAvg=(sw_score+lt_score)/2.0;
		
		
		// 출력
		System.out.println("-----------------------");
		System.out.println("[시험결과]");
		System.out.println("-----------------------");
		System.out.println("응시자 이름:"+name);
		System.out.println("전공: "+major);
		System.out.println("나이: "+age);
		System.out.printf("시험결과 평균: %.2f", scoreAvg);
		

	}

}