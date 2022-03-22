package day0124;

import java.util.Scanner;

public class ScanCntSum_04 {
	public static void main(String[] args) {
		
	/*
	 * while(true)를 이용할 것
	 * 총 횟수와 입력한 값의 합을 구하시오
	 * 숫자 0을 입력할 경우 종료
	 */
		
		Scanner sc=new Scanner(System.in);
		
		int input;
		int sum=0;
		int cnt=0;
		double avg=0;
		
		while(true) {
			System.out.println("값을 입력하세요: (입력종료: 0)");
			input=sc.nextInt();
			if(input==0) {
				break;
			}
			sum+=input;
			cnt++;
			avg=sum/cnt;
		}
		System.out.println("총 합계:"+sum+"\n더한 횟수:"+cnt+"\n입력 숫자 평균: "+avg);
	}
}
