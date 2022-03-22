package day0210;

public class Shop {
	private String goods;
	private int price, sku;
	
	public Shop() {
	
	}
	
	public Shop(String goods, int price, int sku) {
		this.goods=goods;
		this.price=price;
		this.sku=sku;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}
}
