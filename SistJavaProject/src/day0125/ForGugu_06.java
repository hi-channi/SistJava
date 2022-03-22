package day0125;

public class ForGugu_06 {

	public static void hight_gugu() {
		/*
		 * [2단]
		 * 2X1:2
		 * ...
		 * 아래방향으로 9단까지 출력
		 */
		
		for(int dan=2;dan<=9;dan++) {
			System.out.println("["+dan+"]");
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"X"+i+"="+dan*i);
			}
			System.out.println();
		}
	}
	
	public static void wid_gugu() {
		//2단부터 4단까지 가로로 출력하시오
		for(int dan=2;dan<=9;dan++) {
			System.out.print("["+dan+"단]\t");
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan+"X"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// hight_gugu();
		wid_gugu();

	}

}
