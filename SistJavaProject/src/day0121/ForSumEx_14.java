package day0121;

public class ForSumEx_14 {
	public static void main(String[] args) {
		// 반복문을 활용해 숫자 합계 구하기
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("-for문 결과값-\n1부터 10까지의 합: "+sum);
		System.out.println();
		
		// while문
		int x=1, y=0;
		while(x<=10) {
			y+=x; 
			x++;
			/*
			 x++;
			 y+=x;
			 위 순서로 작성할 경우 초기 k값을 0으로 설정해야 함.
			 */
		}
		System.out.println("-while문 결과값-\n1부터 10까지의 합: "+y);
		
		//1~10까지 홀수의 합 구하기
		int tot=0;
		for(int k=1;k<=10;k++) {
			if(k%2!=0) {
				tot+=k;
			}
		}
		System.out.println("1부터 10까지 홀수의 합: "+tot);
	}
}
