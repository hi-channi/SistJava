package day0118;

public class DataType_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리형
		boolean flag=false;
		// 문자형: 2byte, 기본적으로 정수형, ASCII코드로 변환가능
		char ch='가';
		// 정수형
		byte a=-128; // 단 1byte로 -128~127까지 가능
		short b=32000;
		int c=670000;
		long num=100l; // int와 구별하기 위해 l(혹은 L)을 붙여줌. 붙이지 않으면 int로 인식
		
		// 실수형
		double d=4356.1433; // 소숫점 숫자를 의미, double이 기본
		float f=3.1435f; // double과 구별하기 위해 f(혹은 F)을 붙여줌. 붙이지 않으면 double로 인식
		
		// int, float는 같은 32bit을 사용하지만 기본적으로 실수형을 더 크게 처리함
		
		// 출력
		System.out.println("flag="+flag);
		System.out.println("not flag="+!flag);
		System.out.println("ch="+ch);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("num="+num);
		System.out.println("d="+d);
		System.out.println("f="+f);
		System.out.printf("금번 성장률 %10.2f와 같습니다.",d);  // %10.2f: %(전체 자릿수를 10자리로 고정).(소숫점 자리수를 2자리로 고정)f




	}

}