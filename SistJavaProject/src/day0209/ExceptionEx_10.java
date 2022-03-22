package day0209;

import java.util.Random;
import java.util.Scanner;

public class ExceptionEx_10 {

	public static void process() {
		Scanner sc=new Scanner(System.in);
		int su1, su2;
		
		System.out.println("두 수를 입력하세요.");
		su1=sc.nextInt();
		su2=sc.nextInt();
		
		try {
			System.out.println("su1/su2="+su1/su2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음!: "+e.getMessage());
		}
	}
	
	public static void process2() throws NullPointerException {
		// 난수발생 random(), Random
		// 방법1. random()
		//int rnd=(int)(Math.random()*10)+1;
		//System.out.println("random() 메소드로 발생한 난수는 "+rnd+"입니다.");
		
		// 방법2. Random
		Random r=null; // 선언만 하고 생성하지 않음 >> 생성: Random r=new Random();
		int rnd2=r.nextInt(10); // 0~9 사이의 난수 발생
		System.out.println("Random 클래스로 발생한 난수는 "+rnd2+"입니다.");
	}

	public static void main(String[] args) {
		
		//process();
		
		try {
		process2();
		} catch (NullPointerException e) {
			System.out.println("Main에서 예외처리 함: "+e.getMessage());
		}
		System.out.println("정상 종료");

	}
	
}
