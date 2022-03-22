package day0125;

public class MathRandomEx_03 {

	public static void main(String[] args) {
		// 10개의 난수발생
		for(int i=1;i<=10;i++) {
			Double n=Math.random();
			System.out.println(n);
		}
		
		System.out.println("---------------------");
		System.out.println("-0~99사이의 난수 발생-");
		//100개의 난수발생
		for(int i=1;i<=10;i++) {
			int n=(int)(Math.random()*100);
			System.out.println(n);
		}
		
		System.out.println("---------------------");
		System.out.println("-1~99사이의 난수 발생-");
		//100개의 난수발생
		for(int i=1;i<=10;i++) {
			int n=(int)(Math.random()*100)+1;
			System.out.println(n);
		}
		/*
		 * Math.random()함수는 실수형태이기 때문에 int를 사용해 정수형으로 변환
		 * 1자리 수의 난수 추출을 위해서 *10을 추가/ ex) 1~45 사이일 때에는 *45
		 * Line22) 난수 범위가 1~99 이기 때문에 +1, 0부터 일 경우 +1을 삭제.
		 */
		
		System.out.println("---------------------");
		System.out.println("-65~90사이의 난수 발생-");
		//100개의 난수발생
		for(int i=1;i<=10;i++) {
			//int n=(int)(Math.random()*m)+n;
			//n~(m+n-1)
			int n=(int)(Math.random()*26)+65; 
			System.out.println(n);
		}
	}
}