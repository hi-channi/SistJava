package day0127;

import java.util.Scanner;

public class QuizReview_01 {
	public static void main(String[] args) {
		/*
		 * Scanner로 숫자를 입력받아 배열의 몇 번째에 있는지 출력하시오
		 * 없을 경우 없음 메시지를 출력하고, 0을 입력 시 종료
		 * 
		 * 예)
		 * 입력값1: 11
		 * 		11은 2번째에 있습니다.
		 * 입력값: 24
		 * 		23은 6번째에 있습니다.
		 * 입력값3: 99
		 * 		99는 없습니다.
		 * 입력값: 0
		 * 		종료합니다.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {6,11,45,66,78,23,88,77,100};
		
		int input, cnt=0;
		
		while(true) {
			cnt++;
			System.out.println("입력값"+cnt+"(0:종료): ");
			input=sc.nextInt();
			// 종료 처리
			if(input==0) {
				System.out.println("검색을 종료합니다.");//숫자형이기 때문에 == 사용, 문자열일 경우 equals 사용
			}
			// 검색 처리
			boolean find=false; // 검색 성공시 true
			for(int i=0;i<arr.length;i++) {
				if(input==arr[i]) {
					find=true;
					System.out.println("\t"+input+"은 "+i+1+"번째에 있습니다.");
				}
			// 검색 실패 처리
			}
			if(!find) {
				System.out.println(input+"을 배열 내에서 찾을 수 없습니다.");
			}
		}
	}
}
