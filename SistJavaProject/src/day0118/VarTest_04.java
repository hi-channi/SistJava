package day0118;

public class VarTest_04 {
	
	public static void main(String[] args) {
		// 변수: 메모리 공간의 할당과 접근, 2가지를 해결하기 위해 변수 사용
		// 코드에서 변수 선언 >> 메모리 공간 할당 >> 할당된 메모리에 접근하기 위한 이름(변수명)
		// 선언: 컴파일러에서 무언가를 알리는 행위
		
		int num1; // 변수 선언. 자바에서는 반드시 [자료형 변수이름;]으로 선언
		num1=100;
		
		int num2=200;
		// int result=num1+num2;
				
		System.out.println(num1+num2);
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		// System.out.println(num1+"+"+num2+"="+(result));
	}
}