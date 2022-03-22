package day0210;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopArrayListQuiz_07 {
	
	List<Shop> list=new ArrayList<Shop>();
	
	// 데이터 입력
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		String goods; 
		int price, sku;
		
		System.out.println("상품명: ");
		goods=sc.nextLine();
		System.out.println("상품가격: ");
		price=sc.nextInt();
		System.out.println("수량: ");
		sku=sc.nextInt();
		
		list.add(new Shop(goods, price, sku));
		System.out.println("목록 갯수: "+list.size()+"개");
	}
	
	// 데이터 출력
	public void outputData( ) {
		System.out.println("------------- 상품 재고 현황 -------------");
		System.out.println("No.\t상품명\t단가\t수량\t총액");
		System.out.println("=======================================");
		
		for(int i=0;i<list.size();i++) {
			Shop k=list.get(i);
			//System.out.println(i+1+"\t"+k.getGoods()+"\t"+k.getPrice()+"\t"+k.getSku()+"\t"+((double)k.getPrice()*k.getSku()));
			System.out.printf("%d\t%s\t%d\t%d\t%.0f",i+1,k.getGoods(),k.getPrice(),k.getSku(),((double)k.getPrice()*k.getSku()));
		}
		System.out.println("\n=======================================");
	}

	public static void main(String[] args) {
		
		ShopArrayListQuiz_07 quiz=new ShopArrayListQuiz_07();
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		System.out.println("\t[재고 관리 시스템] \t");
		while(true) {
			System.out.println("<메뉴> 1.상품입고  2.재고현황  0. 종료");
			cnt=Integer.parseInt(sc.nextLine());
			switch (cnt) {
			case 1:
				quiz.inputData();
				break;
			case 2:
				quiz.outputData();
				break;
			case 0:
				System.out.println("시스템 종료");
				break;
			default:
				System.out.println("메뉴 입력이 잘못되었습니다.");
				continue;
			}
		}
	}
}
