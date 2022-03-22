package day0121;

import java.util.Scanner;

public class ScanIfOperEx_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// 수량과 단가를 입력 해 총 금액을 알아보자.
		// 일정 수량 이상을 구입하면 일정 금액을 할인.
		
		String goods;
		int sku, price, total;
		
		// 상품명, 단가, 수량 입력
		System.out.println("상품명: ");
		goods=sc.nextLine();
		System.out.println("단가: ");
		price=sc.nextInt();
		System.out.println("수량: ");
		sku=sc.nextInt();
		
		total=price*sku;
		
		System.out.println(goods+" "+sku+"개는 "+total+"원 입니다.");
		
		// 5개 이상 구입할 경우 할인 
		int discount=0;
		
		if (sku>=5) {
			discount=9/10; // 0.9로 입력할 경우 int가 아닌 double이 되기 때문에 분수 형태로 입력
			// 양 변의 자료형이 다를 경우(선언된 변수명 속성과 변수값 속성이 다를 경우) 에러 발생
		} else {
		}
		
		total*=discount;
		System.out.println(goods+" "+sku+"개는 "+total+"원 입니다.");
	}
}
