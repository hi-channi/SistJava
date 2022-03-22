package day0124;

import java.util.Scanner;

public class WhileTrueScan_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int i; // 입력받을 값
		int n=0; //반복할 수
		int sum=0;
		
		System.out.println("합계를 구할 숫자를 입력하시오:");
		i=sc.nextInt();
		
		while(true) {
			n++;
			sum+=n;
			if(n==i) { //break문 없을 시 무한루프
				break;
			}
		}
		System.out.println("1부터 "+i+"까지의 합: "+sum);
	}
}
