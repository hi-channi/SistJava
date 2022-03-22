package day0125;

import java.util.Scanner;

public class QuizOper_05 {
	public static void ex_01() {
		/* for문으로 10번 질문할 것
		 * 1:21
		 * 2:-23
		 * ...
		 * 10:88
		 * =========
		 * 양수갯수:4
		 * 음수갯수:6
		 */
		
		int k;
		int pcnt=0;//양수개수
		int ncnt=0;//음수개수
		
		for(int i=1;i<=10;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println(i+": ");
			k=sc.nextInt();
			if(k>0)
				pcnt++;
			else
				ncnt++;
		}
		System.out.println("양수 갯수: "+pcnt);
		System.out.println("음수 갯수: "+ncnt);
		
	}

	public static void ex_02() {
		/*
		 * while(true)문 이용할 것
		 * continue를 이용해 1~100까지의 짝수의 합을 구하시오
		 * 1~100까지의 짝수의 합: ****
		 */
		
		int i=0;
		int sum=0;
		
		while(true) {
			i++;
			if(i%2==1) 
				continue;
			sum+=i;
			if(i==100)
				break;
		}
		System.out.println("1~100까지의 합은: "+sum);
	}
	
	public static void ex_03() {
		/*while(true)문을 써서 1~100까지 3의 배수의 갯수를 구
		 * 3의 배수 개수:33개
		 */
		
		int i=0;
		int cnt=0;
		while(true) {
			i++;
			//3의 배수이면cnt변수가 1증가
			if(i%3==0)
				cnt++;
			if(i==100)
				break;
			}
		System.out.println("3의 배수의 개수는? "+cnt);
		}
	
	public static void ex_04() {
		/*
		 * while(true)을 이용할 것
		 * 
		 * 1~10까지 팩토리얼 구할 것
		 * 10! =*****
		 * 9! =*****
		 * 
		 */
		
		int i=0;
		int mul=1;
		while(true) {
			i++;
			mul*=i;
			System.out.println(i+"!="+mul);				
			if(i==10)
				break;
		}
	}
		
	public static void main(String[] args) {
		// ex_01();
		// ex_02();
		// ex_03();
		ex_04();
	}

}