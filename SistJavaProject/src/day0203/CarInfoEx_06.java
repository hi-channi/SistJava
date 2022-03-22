package day0203;

class MyCar {
	
	private String carName; // 자동차명
	private int price; // 가격
	private String carColor; // 색상
	
	public String getCarName() {
		return carName;
		
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	// 출력
	public void writeCarInfo() {
		System.out.println("자동차명: "+carName);
		System.out.println("차량가격: "+price);
		System.out.println("차량색상: "+carColor);
	}
}

public class CarInfoEx_06 {
	public static void main(String[] args) {
		
		MyCar car=new MyCar();
		car.setCarName("아반떼");
		car.setPrice(2000);
		car.setCarColor("프로스트 화이트");
		
		System.out.println("*** 차량 정보 ***");
		car.writeCarInfo();
		
		System.out.println("** 새로운 차량 정보 ***");
		car.setCarName("제네시스 G90");
		car.setPrice(8500);
		car.setCarColor("그레이");
		car.writeCarInfo();
	}
}
