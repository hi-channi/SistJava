package day0204;

/*
 * 기본형 데이터 타입: int, long, char, double 등
 * 레퍼펀스형: 클래스 형태, 배열 형태
 * 
 * call By value: 값이 전달
 * call By reference: 주소가 전달
 */

class Test1 {
	String name="김주찬";
	String addr="대치동";
}

public class CallByEx_02 {
	// 1. call By value: 값만 전달받음. main의 a와 여기의 n은 주소가 틀림
	public static void changeInt(int n) {
		
		System.out.println("전달받은 정수 값: "+n);
		n=220;
	}
	// 2. call By reference: 배열은 객체로 인식, 주소가 전달됨, 여기서 변경하면 호출된 곳은 변할까?
	public static void changeArray(int[] arr) {
		System.out.println("전달받은 배열 출력");
		for(int a:arr) {
			System.out.println(a);
		}
		arr[2]=100;
	}
	// 3. Test1 변수의 주소를 전달
	public static void changeTest(Test1 t1) {
		System.out.println("전달받은 Test1 객체 출력하기");
		System.out.println(t1.name+", "+t1.addr);
	}
	public static void main(String[] args) {
		
		// 1.
		int a=50;
		changeInt(a); // 값만 전달
		System.out.println("a의 값은 바뀌는가?"+a);
		// 2.
		int[] arr2= {10,20,30};
		System.out.println("메소드 호출 후 배열 값 학인하기");
		for(int ar:arr2) {
			System.out.println(ar); // 2번지 값이 100으로 변경
		}
		// 3.
		Test1 t1=new Test1();
		changeTest(t1); // 주소 전달 >> 김주찬, 대치동
		
		t1.name="김주형";
		t1.addr="신천동";
		System.out.println("변경후 출력:");
		System.out.println(t1.name+", "+t1.addr);
	}
}
