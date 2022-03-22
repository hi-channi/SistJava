package day0121;

import java.util.Scanner;

public class IfScanReview_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x,y, max;
		
		System.out.println("두개의 숫자를 입력하세요: ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("입력한 두 수:"+x+" ,"+y);
		
		// if 문을 사용한 대소비교
		if (x>y) {
			max=x;
		} else {
			max=y;
		}
		// 삼항 연산자를 사용한 대소 비교
		max=x>y?x:y;
		
		System.out.println("두 수 중 더 큰 값은 "+max+"입니다.");
		System.out.println("첫번째 수가 더"+(x>y?" 크다":" 작다"));
	}
}