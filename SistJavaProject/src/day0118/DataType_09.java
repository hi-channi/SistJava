package day0118;

public class DataType_09 {
	public static void main(String[] args) {
		
		byte a=-127; // -128~127;
		
		byte b=(byte)128; // 더 작은 자료형으로의 변환(디모션), 아주 작은 값손실 발생
		// byte c=(byte)256;
		System.out.println("a="+a); 
		System.out.println("b="+b); // 출력은 128이 아닌 -128이 나옴(why? 자료형 byte에서 127의 다음 수는 -128)
		// System.out.println(c);
		
		// 강제 형변환(cast)
		int x=7;
		int y=4;
		System.out.println(x/y); // 정수형끼리의 계산은 결과도 무조건 정수형.
		System.out.println((double)x/y); // double로 변환 >> 결과도 double.
		System.out.println(x/(double)y); // 수식 중 하나라도 double이 있을 경우 결과도 double이 됨.
		
		double d=100.0;
		int i=100;
		int result=(int)d+i;
		double result2=(double)d+i;
		
		System.out.println("result="+result);
		System.out.println("result2="+result2);
	}
}