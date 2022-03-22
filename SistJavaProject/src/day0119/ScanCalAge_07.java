package day0119;

import java.util.Scanner;
import java.util.Calendar;

public class ScanCalAge_07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		// 1. 변수 선언
		String name;
		int myYear;
		int curYear=cal.get(Calendar.YEAR);
		
		// 2. 입력 받기 위한 출력문 작성
		System.out.println("현재연도: "+curYear+"년");
		System.out.print("이름을 입력하세요: ");
		name=sc.nextLine();
		System.out.print("출생연도를 입력하세요: ");
		myYear=Integer.parseInt(sc.nextLine());
		
		// 3. 출력
		System.out.println("--------------------");
		System.out.printf("%s님의 나이는 %s세 입니다.", name, myYear);
	}

}