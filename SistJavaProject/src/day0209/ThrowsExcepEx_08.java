package day0209;

import java.util.Scanner;

/* 
 * throw: 예외를 강제로 발생시킴
 * throws: 호출한 영역으로 예외처리 넘김
 */

public class ThrowsExcepEx_08 {
	
	public static void scoreInput() throws Exception{
		Scanner sc=new Scanner(System.in);
		
		int score=0;
		System.out.println("점수를 입력하세요");
		score=sc.nextInt();
		
		// 0~100 사이의 수를 입력하지 않으면 예외 강제 발생
		if(score<0 || score>100) {
			throw new Exception("점수가 잘못 입력되었습니다.");
		} else {
			System.out.println("나의 점수는 "+score+"입니다.");
		}
	}
	public static void main(String[] args) {
		
		try {
			scoreInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오류 메시지: "+e.getMessage());
		}
		
		System.out.println("정상 종료");
	}
}
