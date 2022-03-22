package day0203;

class Shop {
	
	private String goods;
	private int price;
	private String color;
	
	//static SHOWTITLE="상품 목록"
	// 인자 3개를 갖는 명시적 생성자
	public Shop(String goods,int price, String color) {
		this.goods=goods;		// 동일한 클래스 내에서 this. 생략 가능
		this.price=price;
		this.color=color; 
	}
	// static 이용한 제목 메소드(showTitle)
	public static void showTitle() {
		System.out.println("상품명\t\t단가\t\t색상");
		System.out.println("--------------------------------------------");
	}
	
	// 출력 메소드(ShowGoods)
	// 인스턴스 변수는 static에서 사용할 수 없기에 출력 메소드는 static 사용 불가
	public void showGoods() {
		System.out.println(goods+"\t\t"+price+"\t\t"+color);
	}
}
public class SangpumEx_11 {
	public static void main(String[] args) {
		
		Shop [] sh=new Shop[5]; // 5개를 생성할 것이라는 선언
		//sh[0].showGoods();	// 아직 생성하지 않았기 때문에 NullPointException 오류 발생
		// 5개 Shop 배열에 생성자를 통해 입력
		sh[0]=new Shop("아이폰13",950000,"화이트");
		sh[1]=new Shop("갤럭시S22",1200000,"핑크");
		sh[2]=new Shop("아이폰11",750000,"블랙");
		sh[3]=new Shop("맥북",2100000,"그레이");
		sh[4]=new Shop("갤럭시북",2200000,"메탈");
		
		Shop.showTitle();
		
		// 방법1. for~each문 활용
		/*
		 * for(Shop goods:sh) { 
		 * 	goods.showGoods(); }
		 * System.out.println("=====================================");
		 */
		
		// 방법2. for문 활용
		for(int i=0;i<sh.length;i++) {
			sh[i].showGoods();
		}
		
	}
}
