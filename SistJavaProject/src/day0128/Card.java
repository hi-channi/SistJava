package day0128;

public class Card {
	
	// 인스턴스 변수: 개별적인 저장공간, 각각 다른 값 저장
	// 참조변수명.인스턴스 변수명 으로 접근 가능 >> 객체 생성
	
	String kind; // 카드 문양 // null
	int number; // 카드 숫자  // 0
	
	// 클래스 변수: 모든 인스턴스들이 공유
	// 생성없이 [클래스 이름.클래스 변수명] 으로 접근 가능
	// 클래스가 로딩될 때 생성, 종료될 때 소멸
	static int width; // 0
	static int height; // 0
}
