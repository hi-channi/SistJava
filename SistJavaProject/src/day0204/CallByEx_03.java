package day0204;

class MyCar {
	String carName;
	int carPrice;
	String carColor;
}

public class CallByEx_03 {
	
	public static void dataIn(MyCar car) {
		car.carName="카니발";
		car.carPrice=4500;
		car.carColor="진주색";
	}
	public static void dataOut(MyCar car) {
		System.out.println("자동차명: "+car.carName);
		System.out.println("차량가격: "+car.carPrice);
		System.out.println("차량색상: "+car.carColor);
	}
	public static void main(String[] args) {
		
		MyCar car=new MyCar();
		
		dataIn(car);
		dataOut(car);
		
	}
}
