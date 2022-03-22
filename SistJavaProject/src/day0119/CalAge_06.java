package day0119;

import java.util.Calendar;

public class CalAge_06 {

	public static void main(String[] args) {
		
		// Calendar을 이용해 자신의 나이 구하기
	
		String name=args[0];
		Calendar cal=Calendar.getInstance();
		int curYear=cal.get(cal.YEAR); // 나이를 계산하기 위한 현재연도
		
		// 내가 태어난 연도를 파라메타(args[0] =name)로 보낼 때 형변환(cast) 필요(String > int)
		int myYear=Integer.parseInt(args[1]);
		
		// 나이 구하기
		int myage= curYear-myYear+1; // 한국식 나(+1)
		
		// 출력
		System.out.println("이름:"+name);
		System.out.println("출생연도:"+myYear);
		System.out.println("나이: "+myage+"세");
	}

}