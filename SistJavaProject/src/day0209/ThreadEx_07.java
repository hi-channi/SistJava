package day0209;

public class ThreadEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요.");
		System.out.println("5초 후 헤어집시다");
		
		try {
			Thread.sleep(5000); // try/catch 처리 없을 경우InterruptException 발생
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오류: "+e.getMessage());
		}
		System.out.println("안녕히 가세요.");
		
	}

}

// 동기: 순차적, 비동기: 비순차적