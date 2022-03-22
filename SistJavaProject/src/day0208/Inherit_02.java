package day0208;

class color {
	private void hello() {
		// TODO Auto-generated method stub
		System.out.println("안녕? 오늘도 페인트 칠을 해보자");
	}
}

class Red extends color {
	public void process() {
		System.out.println("나는 모든 창틀을 빨간색으로 칠할게");
	}
}

class Blue extends color {
	public void process() {
		System.out.println("나는 모든 창틀을 파란색으로 칠할게");
	}
}

class Green extends color {
	public void process() {
		System.out.println("나는 모든 창틀을 초록색으로 칠할게");
	}
}

public class Inherit_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("** 1. Red로 선언 Red로 생성");
		Red red=new Red();
		red.hello();
		red.process();
		
		System.out.println("** 2. Red로 선언 Red로 생성");
		Red red=new Red();
		red.hello();
		red.process();
		
		System.out.println("** 3. Red로 선언 Red로 생성");
		Red red=new Red();
		red.hello();
		red.process();
		
		
		c.hello()
	}

}
