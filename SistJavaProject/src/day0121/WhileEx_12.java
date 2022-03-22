package day0121;

public class WhileEx_12 {
	public static void main(String[] args) {
		// 1. while문 (정확한 범위가 있을 때)
		// Java1~5까지 출력 후 종료라고 표시할 것
		int i=1;
		while(i<=5) {
			System.out.println("Java"+i);
			i++;
		}
		
		// 2. while문 (명확한 범위가 없을 떄)
		// Hello1~5까지 출력 후 종료라고 표시할 것
		int x=1;
		
		while(true) {
			System.out.println("Hello"+x);
			x++; // 여기까지만 작성할 경우 무한루프 >> break;로 중지
			if(x>5) { // while문 내에서 조건 지정
				break;
			}
		}
		System.out.println("반복 종료");
	}
}