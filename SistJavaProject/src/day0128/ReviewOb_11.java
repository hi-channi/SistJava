package day0128;

class Goods{
	private String Goods;
	int sku;
	int price;
	static String SHOPNAME="이마트";
	public static String getSHOPNAME() {
		return SHOPNAME;
	}
	
	// Goods는 private이기 때문에 setter, getter를 만들어야함
	public String getGoods() {
		return Goods;
	}
	public void setGoods(String goods) {
		Goods = goods;
	}
	
}
public class ReviewOb_11 {

	public static void main(String[] args) {

		Goods gd1=new Goods();
		gd1.setGoods("핸드크림");
		gd1.sku=10;
		gd1.price=2500;
		
		Goods gd2=new Goods();
		gd2.setGoods("마우스");
		gd2.sku=20;
		gd2.price=12000;
		
		System.out.println("상점명: "+Goods.SHOPNAME+"\n");
		System.out.println("상품명: "+gd1.getGoods());
		System.out.println("수량: "+gd1.sku);
		System.out.println("단가: "+gd1.price);
		System.out.println("---------------------------");
		System.out.println("상품명: "+gd2.getGoods());
		System.out.println("수량: "+gd2.sku);
		System.out.println("단가: "+gd2.price);
	}

}
