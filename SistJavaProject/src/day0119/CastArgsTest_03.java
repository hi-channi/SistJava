package day0119;

public class CastArgsTest_03 {

	public static void main(String[] args) {
		/*
		 상품명: 아이폰13 mini
		 수량: 20개
		 단가: 950,000
		 총 금액: 
		 */
		
		// 1, 변수
		String goods=args[0];
		int sku=Integer.parseInt(args[1]);
		int price=Integer.parseInt(args[2]);
		
		// 2. 계산
		int tot=sku*price;
		
		// 3. 출력
		System.out.println("상품명: "+goods);
		System.out.println("수량: "+sku+"개");
		System.out.println("단가: "+price+"원");
		System.out.println("총 금액: "+tot+"원");

	}

}