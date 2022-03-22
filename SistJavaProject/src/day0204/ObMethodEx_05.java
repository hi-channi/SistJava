package day0204;

// 오버로딩 테스트

public class ObMethodEx_05 {
	
	public static int sum(int a, int b) {
		System.out.println("첫번째 함수 호출");
		return a+b; // return은 간결할수록 좋음. int k=a+b; return k; 형태 권장
	}
	
	public static double sum(int a, double b) {
		System.out.println("두번째 함수 호출");
		return a+b;
	}
	
	public static double sum(double b,int a) {
		System.out.println("두번째 함수 호출");
		return a+b;
	}
	
	public static double sum(double b, double a) {
		System.out.println("두번째 함수 호출");
		return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(1,4));
		System.out.println(sum(1,6.5));
		System.out.println(sum(7.14,6.5));
		System.out.println(sum(10.5,9.1));
	}

}
