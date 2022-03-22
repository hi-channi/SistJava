package day0124;

import java.util.Scanner;

public class QuizWhileTrueGugu_16 {
	public static void main(String[] args) {
		/*
		 * while(true)
		 * 1. 0 입력 시 종료
		 * 2. 단은 2~9단까지만 입력할 것(Continue 이용)
		 * 
		 * 단을 입력하시오(종료:0):5
		 * 5X1=5
		 * ....
		 * 5X9=45
		 */
		
		Scanner sc=new Scanner(System.in);
	
		int input=0;
		int k;
		
		while(true) {
			System.out.print("단을 입력하시오(종료: 0): ");
			input=sc.nextInt();
			if(input==0) {
				break;
			} else if(input<2 || input>9) {
				System.out.println("범위 내 해당하지 않는 수 입니다.");
				continue;
			}
			System.out.println("***"+input+"단***");
			for(k=2;k<=9;k++) {
					System.out.println(input+"X"+k+"="+input*k);
				}
			}
	}
}
