package day0121;
import java.util.Iterator;

public class ForEx_11 {
	public static void main(String[] args) {
		
		//1 2 3 4 5 6 7 8 9 10
		int i;
		for (i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nfor문 빠져나온 후의 값: "+i);
		
		int a=10;
		for (;a<=50;a+=5) {
			System.out.print(a+" ");
		}
		System.out.println("\nfor문 빠져나온 후의 a값: "+a);
		
		// 가로로 Hello를 5번 출력
		for (int n=5;n>=1;n--) {
			System.out.print("Hello"+" ");
		}
		System.out.println();
		
		// 1~10까지의 수 중에 짝수만 출력하기 >> for, if문 사용
		for (int x=2;x<=10;x+=2) {
			System.out.print(x+" ");
		}
		System.out.println();
			
		for (int y=1;y<=10;y++) {
			if(y%2==0) {
				System.out.print(y+" ");
			}
		}
		System.out.println();
	}
}
