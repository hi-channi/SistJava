package day0209;


/*
 * RunTimeException: 컴파일 할 때에는 문제없지만 실행 시 에러 발생
 * NullpointException: 생성하지 않고 메소드 호출, 객체 참조가 없는 상태
 * Numberformat: 입력 데이터의 형식 오류
 */

public class ExceptionEx_03 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		try {
		int num=3/0; // 예외가 발생할 수 있는 코드
		} catch(ArithmeticException e) {
			e.printStackTrace(); // 자세한 예외정보 출력
			System.out.println(e.getMessage()); // 예외처리 코드, 메시지
		}
		System.out.println("프로그램 종료");
	}
}
