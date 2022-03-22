package day0120;

import java.util.Scanner;

public class OperEx_03 {
	public static void main(String[] args) {
		
		// 두 수를 입력 후 산술연산자 연습
		
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("두 수를 입력해 주세요:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("더하기 결과:"+(x+y));
		System.out.println("빼기 결과:"+(x-y));
		System.out.println("곱하기 결과:"+(x*y));
		System.out.println("나누기 결과:"+((float)x/y));
		System.out.println("나눗셈 결과:"+(x%y));
		
	}
}