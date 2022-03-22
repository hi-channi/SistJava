package day0120;

import java.util.Calendar;
import java.util.Scanner;

public class CalAgeDdi_08 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		int curYear=cal.get(cal.YEAR);
		
		int myYear,age;
		String name,ddi;
		
		System.out.print("이름 입력:");
		name=sc.nextLine();
		System.out.println("태어난 연도 입력:");
		myYear=sc.nextInt();
		
		age=curYear-myYear+1;
		// 삼항연산자
		// 수식? "참":"거짓"
		// 로직에서 사용 순서는 원숭이부터 시작
		ddi=myYear%12==0?"원숭이":
				myYear%12==1?"닭":
					myYear%12==2?"개":
						myYear%12==3?"돼지":
							myYear%12==4?"쥐":
								myYear%12==5?"소":
									myYear%12==6?"호랑이":
										myYear%12==7?"토끼":
											myYear%12==8?"용":
												myYear%12==9?"뱀":
													myYear%12==10?"원숭이":"양";
													
		System.out.println("-----결과-----");
		System.out.println("나이-띠 구하기");
		System.out.println("이름: "+name);
		System.out.println("현재나이: "+age+"세");
		System.out.println("띠: "+ddi+"띠");
	}
}