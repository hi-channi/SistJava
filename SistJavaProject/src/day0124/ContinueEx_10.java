package day0124;

public class ContinueEx_10 {

	public static void main(String[] args) {
		// 1 2 4 5 7 8 10 을 continue문을 통해 출력하기
		// break문의 차이점은 반복문을 벗어나지 않음
		// continue 이후의 문장은 수행되지 않음
		
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue; // i++로 이동
			}
			System.out.println(i+" ");
		}
		System.out.println();
		
		/* continue 이용
		 * 홀수값: 1
		 * 홀수값: 3
		 * 홀수값: 5
		 * 홀수값: 7
		 * 홀수값: 9
		 */
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue; // 반복문으로 이동 >> i++
			}
			System.out.println("홀수값: "+i);
		}
	}

}
