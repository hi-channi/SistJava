package day0121;

import java.util.Scanner;

public class SwitchEx_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("숫자를 입력해주세요.: ");
		num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("input 1");
			break;
		case 2:
			System.out.println("input 2");
			break;
		case 3:
			System.out.println("input 3");
			break;
		default:
			System.out.println("not 1, 2, 3 ");
			break;
		}
		
		// switch문을 통한 짝수, 홀수 판별
		
		switch(num%2) {
		case 0:
			System.out.println(num+"은 짝수입니다.");
			break;
		case 1:
			System.out.println(num+"은 홀수입니다.");
			break;
		}
	}
}
