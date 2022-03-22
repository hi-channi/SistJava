package day0124;

import java.util.Scanner;

public class ScanDanEx_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int dan;
		
		System.out.println("원하는 구구단은? ");
		dan=sc.nextInt();
		
		// 조건문(숫자의 범위를 제어문을 사용해 지정 가능)
		//
		if (dan<2 || dan>9) {
			System.out.println("범위를 초과했습니다.");
			return;
		}
		
		System.out.println("***"+dan+"단***");
		for(int i=1;i<=9;i++) {
			System.out.printf("%d X %d = %2d\n",dan,i,dan*i);
		}
	}
}
