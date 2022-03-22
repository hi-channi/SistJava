package day0208;

class CarA {
	private String carName;
	private String carColor;
	
	// 디폴트 생성자
	public CarA() {
		// TODO Auto-generated constructor stub
	}
	// 명시적 생성자
	public CarA(String name, String color) {
		this.carName=name;
		this.carColor=color;
	}
	
	// setter, getter
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	// 출력 메소드
	public void writeCar() {
		System.out.println("내 차는 "+carName+"이고 "+carColor+"입니다.");
	}
}

class MyCar extends CarA{
	private int carPrice;
	
	public MyCar() {
		// TODO Auto-generated constructor stub
	}
	public MyCar(String name, String color, int price) {
		super(name, color);
		this.carPrice=price;
	}
	
	// setter, getter
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
	// 메소드 Overriding
	@Override
	public void writeCar() {
		super.writeCar();
		System.out.println("내 차의 가격은 "+carPrice+"원 입니다.");
	}
	
	
}
public class Inherit_01 {
	public static void main(String[] args) {
		
		System.out.println("** 디폴트로 생성 **");
		MyCar m1=new MyCar();
		m1.writeCar();
		
		System.out.println();
		System.out.println("** 명시적 객체 생성 **");
		MyCar m2=new MyCar("그랜져","진주색",3500);
		m2.writeCar();
		
		System.out.println();
		System.out.println("** 1번째 Car 값 수정해보기 **");
		m1.setCarName("테슬라");
		m1.setCarColor("블루");
		m1.setCarPrice(5000);
		
		m1.writeCar();
		
	}
}
