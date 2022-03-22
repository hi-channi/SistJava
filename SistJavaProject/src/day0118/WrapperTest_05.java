package day0118;

public class WrapperTest_05 {

	public static void main(String[] args) {
		
		// String(문자열) 타입을 int(정수형) 타입으로 변경하려면??
		// Integer.parseInt("1")  >> 문자열 1이 정수 1로 반환
		// Double.parseDouble("3.14") >> 문자열 3.14가 실수 3.14로 반환
		// Float.parseFloat("-10") >> 문자열 -10이 실수 -10으로 반환

		String su1="5";
		String su2="3";
		
		System.out.println("두 수 더하기: "+(su1+su2));
		
		// 문자열 su1, su2를 정수 타입으로 변환 후 계산해보자
		// Wrapper class: 기본형과 클래스형 간의 변환을 위한 클래스(Integer, Double, Long)
		
		int num1=Integer.parseInt(su1);
		int num2=Integer.parseInt(su2);
		System.out.println("두 수의 합: "+(num1+num2)); // 정수형끼리 연산 시 결과도 정수형
		System.out.println("두 수의 곱:" +(num1*num2));
		System.out.println("두 수의 차:"+(num1-num2));
		System.out.println("두 수의 나누기:" + (num1/num2));
	}
}
