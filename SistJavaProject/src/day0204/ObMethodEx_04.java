package day0204;

/*
 * 메소드 장점 및 작성 요령
 * Public static + 리턴형(void: 없음) + 메소드명(인자1, 인자2, ...)
 * 반복적인 코드를 줄여 관리가 용이
 * 하나의 메소드에는 하나의 기능만 수행하도록 작성
 */

public class ObMethodEx_04 {
	
	// boolean
	public static boolean aaa() {
		return false;
	}
	
	// int
	public static int bbb() {
		int a=45;
		return a;
	}
	// int 인자2
	public static int ccc(int x, int y) {
		int z=x+y;
		return z;
	}
	
	public static void main(String[] args) {
		
		boolean a=aaa();
		System.out.println("a="+a);
		
		int b=bbb();
		System.out.println("b="+b);
		
		int c=ccc(20,30);
		System.out.println("c="+c);
	}
}
