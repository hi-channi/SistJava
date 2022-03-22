package day0217;

// 예제 2번을 Runnable을 구현하는 클래스
public class ThreadEx_03 implements Runnable {
	String name;
	int num;

	public ThreadEx_03(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public static void main(String[] args) {
		// 인터페이스를 구현한 클래스 생성
		ThreadEx_03 ex1 = new ThreadEx_03("one", 300);
		ThreadEx_03 ex2 = new ThreadEx_03("one", 300);
		ThreadEx_03 ex3 = new ThreadEx_03("one", 300);

		// 쓰레드 생성
		Thread th1 = new Thread(ex1);
		Thread th2 = new Thread(ex2);
		Thread th3 = new Thread(ex3);

		// run 메소드 호출- start
		th1.start();
		th2.start();
		th3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= num; i++) {
			System.out.println(name + "==>" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}