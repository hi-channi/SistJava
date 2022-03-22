package day0124;

import java.util.Scanner;

public class ScanForSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int input=0;
		int sum=0;
		System.out.println("값을 입력하세요: ");
		input=sc.nextInt();
		
		for(int i=0;i<=input;i++) {
			sum+=i;
		}
		System.out.println(input+"까지의 총합: "+sum);
	}
}
