package day0208;

class Work {
	public void process() {
		System.out.println("아르바이트 구하는 중...");
	}
}

class Clean extends Work {
	@Override
	public void process() {
		System.out.println("**청소 알바 중...**");
	}
}

class Food extends Work{
	@Override
	public void process() {
		System.out.println("**요리 알바 중...**");
	}
}

class Delivery extends Work{
	@Override
	public void process() {
		System.out.println("**배달 알바 중...**");
	}
}

public class Inherit_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다형성 출력
		// 부모 클래스로 선언 시 누가 생성되었느냐에 따라 자식 클래스의 오버라이드 메소드가 호출됨
		// 하나의 변수로 호출 시 누가 생성되었으냐에 따라 그 기능이 달라지는데, 이를 다형성이라 함
		
		Work w=null;
		
		w=new Clean();
		w.process();
		
		w=new Food();
		w.process();
		
		w=new Delivery
				();
		w.process();
	}

}
