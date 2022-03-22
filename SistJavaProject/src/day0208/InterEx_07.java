package day0208;

interface GameA {
	void play();
}
interface GameB extends GameA {
	void stop();
}

class MyGame implements GameB {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play 호출");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop 호출");
	}
}

public class InterEx_07 {
	public static void main(String[] args) {
		MyGame mg=new MyGame();
		mg.play();
		mg.stop();
		
		System.out.println("-----------------------");
		
		// 다항성 출력
		GameB gb=new MyGame();
		gb.play();
		gb.stop();
	}
}
