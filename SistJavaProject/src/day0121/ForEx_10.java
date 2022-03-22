package day0121;

public class ForEx_10 {
	public static void main(String[] args) {
		
	// I Love Java1..3까지 반복하려면?
	// for(초기값; 조건문; 증감식) {}
	// 증감식에 의해 조건문이 true를 반환하면(false를 반환하기 전까지) {}를 수행함
	// false가 되면 {}를 빠져나옴
		
	for(int i=1; i<=3; i++) {
		System.out.println("I Love Java"+i);
	}
	
	// 0, 1, 2, 3, 4
	
	for(int i=0; i<5; i++) {
		System.out.println(i+" ");
	}
	}
}
