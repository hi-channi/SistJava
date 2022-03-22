package day0119;

import java.util.Calendar; //API

public class CalendarTest_05 {
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		
		System.out.println("지금은 "+cal.get(cal.YEAR)+"년도 입니다");
		System.out.println("지금은 "+(cal.get(cal.MONTH)+1)+"월 입니다");
		System.out.println("지금은 "+cal.get(cal.DAY_OF_MONTH)+"일 입니다.");
	}

}