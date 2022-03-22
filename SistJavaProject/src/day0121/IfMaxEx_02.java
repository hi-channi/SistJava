package day0121;

import java.util.Scanner;

public class IfMaxEx_02 {
	public static void main(String[] args) {
		
		/*
		 *  3개의 수를 입력하여 더 큰 수를 출력하시오: x, y, z
		 *  if or 조건연산자를 이용해 결과를 출력할 것.
		 *  3개의 수: 10, 20, 30
		 *  출력결과: max=30
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int x, y, z, max;
		
		System.out.println("세 개의 수를 입력하세요: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		System.out.println("입력한 세 개의 수는 "+x+" ,"+y+" ,"+z+"입니다.");

		/* 
		System.out.println("-if문과 and(&&)를 사용한 대소 비교-");
		if (x>y&&x>z) {
			max=x;
		} else if(y>x&&y>z) {
			max=y;
		} else {
			max=z;
		}
		*/
		
		/* 
		System.out.println("-중첩 if문을 사용한 대소 비교-");
		if (x>y) {
			if (x>z) {
				max=x;
			} else {
				max=z;
			}
		} else {
			max=y;
		}
		*/
		
		System.out.println("-삼항 연산자를 통한 대소 비교-");
		max=x>y&&x>z?x:y>x&&y>z?y:z;
		
		System.out.println("max="+max);
		
	}
}
