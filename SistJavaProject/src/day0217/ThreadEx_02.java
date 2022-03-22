package day0217;

public class ThreadEx_02 extends Thread {
	String name;
	int num;

	public ThreadEx_02(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public void run() {
		super.run();

		for (int i = 1; i <= num; i++) {
			System.out.println(name + "==> " + i);
		}
	}

	/*
	 * public void run() { for(int i=1;i<=num;i++) {
	 * System.out.println(name+"==>"+i); } }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx_02 th1 = new ThreadEx_02("one", 300);
		ThreadEx_02 th2 = new ThreadEx_02("two", 300);
		ThreadEx_02 th3 = new ThreadEx_02("three", 300);
		// run 호출
		/*
		 * th1.run(); th2.run(); th3.run();
		 */

		// run메소드 호출은 -start // Runnable 상태에서 스케쥴러에 의해서 하나씩 running상태가 된다
		th1.start();
		th2.start();
		th3.start();
	}
}