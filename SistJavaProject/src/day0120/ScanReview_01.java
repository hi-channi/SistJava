package day0120;

import java.util.Scanner;

public class ScanReview_01 {
	public static void main(String[] args) {
		//메소드 호출
		Scanner sc=new Scanner(System.in);
		
		// 변수 선언
		String name;
		double weight, height, std_weight;
		
		// 입력 
		System.out.println("이름을 입력하세요:");
		name=sc.nextLine();
		System.out.println("키를 입력하세요: ");
		height=Integer.parseInt(sc.nextLine());
		System.out.println("체중을 입력하세요:");
		weight=Integer.parseInt(sc.nextLine());
		std_weight=(height-100)*0.9;
		
		// 출력
		System.out.println("이름: "+name);
		System.out.println("키와 몸무게: "+height+"cm / "+weight+"kg");
		System.out.println("표준 몸무게: "+std_weight+"kg");
		// System.out.printf("표준 몸무게: %.2fkg",std_weight);
		
		
	}

}