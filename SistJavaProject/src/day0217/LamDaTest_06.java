package day0217;

// 람다 표현식은 인터페이스를 사용하는 익명 내부 클래스의 다른 표현식
// 단 하나의 추상 메소드만 가지고 있는 경우만 가능
interface Orange {

	public void write();
	// public void play();
}

public class LamDaTest_06 {

	// 익명 내부 클래스
	public void abstMethod1() {
		Orange or = new Orange() {

			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("나는 익명내부 오렌지클래스입니다.");

			}
		};
		or.write();
	}

	// 람다식으로 오버라이드하기
	public void abstMethod2() {
		Orange or = () -> System.out.println("나는 람다의 오렌지");
		or.write();

		System.out.println("안에 여러줄 코드일경우");
		Orange or2 = () -> {
			System.out.println("나는 여러줄");
			System.out.println("람다 오렌지");
		};
		or2.write();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LamDaTest_06 ex = new LamDaTest_06();
		ex.abstMethod1();
		System.out.println("-----------------------------");

		ex.abstMethod2();
	}

}