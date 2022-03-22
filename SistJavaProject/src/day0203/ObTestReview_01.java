package day0203;

class TestA {
	
	String name="이용기";
	static String MESSAGE="HAPPYDAY!!";
	
}

public class ObTestReview_01 {

	int a; // 자동 변수 >> 자동 초기화
	static int b; // 정적 변수: 현재 오브젝트가 공통으로 사용
	
	public static void main(String[] args) {
		// static 변수는 바로 사용 가능
		
		b=20;
		System.out.println("b="+b);
		
		// 인스턴스 변수는 인스턴스가 있어야 접근 가능
		ObTestReview_01 ob1=new ObTestReview_01();
		ObTestReview_01 ob2=new ObTestReview_01();
		
		ob1.a=10;
		ob2.a=30;
		
		System.out.println("ob1.a="+ob1.a);
		System.out.println("ob2.a="+ob2.a);
		
		// static 변수 클래스명으로 접근
		// System.out.println("정적변수b=");
		
	}
}
