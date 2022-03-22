package day0125;

import java.util.Scanner;

public class ForWhileReview_01 {
	
	public static void test1(){
		// 1부터 5까지의 합
		int sum=0;
	
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void test2() {
		// 1부터 10까지 홀수의 합
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("총 합계는 "+sum+"입니다.");
	}
	public static void test3() {
		// 10까지의 합을 출력
		int sum=0;
		int i=1; // 전역변수 처리 해야 i값을 for문 밖에서 출력 가능함
		for(;i<=10;i++) {
			sum+=i;
		}
		System.out.println((i-1)+"까지의 합은 "+sum+"입니다.");
	}
	public static void whileTest4() {
		// 1~100까지의 짝수의 합을 출력
		int sum=0;
		int i=0; // 전역변수 처리 해야 i값을 for문 밖에서 출력 가능함
		while(true) {
			i+=2;
			sum+=i;
			if (i==100) {
				break;
			}
		}
		System.out.println((i-1)+"까지의 합은 "+sum+"입니다.");
	}
	
	public static void scoreSum_05() {
		// for, continue 사용
		
		Scanner sc=new Scanner(System.in);
		int score=0;
		int sum=0;
		for(int i=1;i<=3;i++) {
			System.out.println("1에서 100사이의 점수를 입력하세요: ");
			score=sc.nextInt();
			if(score<1 || score>100) {
				i--;
				System.out.println("범위 내 숫자가 아닙니다. 다시 입력하세요.");
			}
			sum+=score;
			
		}
		System.out.println("점수합계: "+sum);
		
	}
	
	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		//whileTest4();
		scoreSum_05();
	}
}
