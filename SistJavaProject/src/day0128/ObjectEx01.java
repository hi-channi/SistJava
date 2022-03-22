package day0128;

public class ObjectEx01 {

	// 인스턴스 변수
	// 객체 생성 후 각각 다른 값을 가질 수 있음
	String name;
	
	// 여러개체가 같은 값을 가져야 할 경우 static을 주로 선언
	// 객체생성 없이 접근 가능함 >> 클래스명.변수
	static final String MESSAGE="Happy Day!";
	
	public static void main(String[] args) {
	
		System.out.println("static 멤버 변수는 new로 생성 없이 호출 가능");
		//System.out.println(ObjectEx01.MESSAGE);
		System.out.println(MESSAGE); // 같은 클래스 내에서는 클래스명 생략 가능
		//MESSAGE="Nice!!";		// final로 인해 오류 발생 
		
		// 인스턴스 변수는 객체 생성 없이 멤버 접근 불가능
		ObjectEx01 kd=new ObjectEx01();
		kd.name="김주찬";
		System.out.println(kd.name);
		
		ObjectEx01 ar=new ObjectEx01();
		ar.name="조아라";
		System.out.println(ar.name);
		System.out.println("다 같이 사용하는 메시지: "+MESSAGE);
		
	}
}
