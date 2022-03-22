package day0208;

interface InterA {
	public void draw();
	public void write();

}

interface InterB extends InterA { // 같은 인터페이스 끼리는 extends
	public void play();
	
}

class InterImpl implements InterB, InterA { // 다중 상속은 불가, 다중 구현은 가능

	@Override
	public void draw() {
		System.out.println("그림을 그려요");
		
	}

	@Override
	public void write() {
		System.out.println("글을 써요");
		
	}
}
public class InterEx_05 {
	public static void main(String[] args) {
		

		InterImpl interimpl=new InterImpl();
		interimpl.draw();
		interimpl.play();
		interimpl.write();
		
		System.out.println("다형성 출력");
		InterA inA=new InterImpl();
		inA.draw();
		inA.write();
		
		InterB inB=new InterImpl();
		inB.play();
	}
}
