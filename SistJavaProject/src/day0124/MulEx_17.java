package day0124;

import java.util.Scanner;

public class MulEx_17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("두 수를 입력하세요: ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int result=1;
		
		// x의 y승은 x를 y번 만큼 곱하는 것
		
		for(int i=1;i<=y;i++) {
			result*=x;
		}
		System.out.println(x+"의 "+y+"승은 "+result+"입니다.");
	}
}
