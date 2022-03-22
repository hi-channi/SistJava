package day0121;

public class DoWhileEx_13 {
	public static void main(String[] args) {
		
		int i=1;
		System.out.println("1. while문 결과");
		// 조건이 true이면 무한반복
		// while(조건문) {} 형태
		
		while(i<5) {
			System.out.println(i++); // 출력 후 증가
		}
		
		System.out.println("2. do-while문 결과");
		// do-while문은 조건이 뒤에 나옴
		// do {} while(조건문) 형태
		
		int k=1;
		do {
			System.out.println(k++); //출력 후 증가
		} while(k<5); // 조건이 올바르지 않아도 최초 1회는 출력이 됨
		
		System.out.println("전체 종료");
	}
}
