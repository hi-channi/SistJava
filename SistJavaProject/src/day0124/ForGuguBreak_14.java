package day0124;

public class ForGuguBreak_14 {
	public static void main(String[] args) {
		
		// 2~9단까지 출력하고 break를 이용해 구구단을 4까지만 출력하기 ex)2*4=8....9*4=36
		
		for(int dan=2;dan<=9;dan++) {
			for(int j=1;j<=9;j++) {
				if(j==5) {
					break; // 가장 가까운 반복문 빠져나가기
				}
				System.out.println(dan+"X"+j+"="+dan*j);
			}
		}
	}
}
