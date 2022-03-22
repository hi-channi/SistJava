package day0119;

public class CastArgsTest_01 {

	public static void main(String[] args) {
		// 레퍼런스 변수: String과 Class는 실제 8가지 자료형에 들어가지 않는 클래스
		
		//String name="김주찬";
		//String age="22";
		String name=args[0];
		String age=args[1];
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
		// 1. 변수 선언
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		// 2. 계산
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		double div=(double)num1/num2;
		
		// 3. 출력
		System.out.println("두 수의 합"+sum);
		System.out.println("두 수의 차"+sub);
		System.out.println("두 수의 곱"+mul);
		System.out.printf("두 수의 나누기: %.2f",div );
	}

}
