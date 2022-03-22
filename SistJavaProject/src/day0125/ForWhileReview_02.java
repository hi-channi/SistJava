package day0125;

import java.util.Scanner;

public class ForWhileReview_02 {
	
	public static void scanfactorial_01() {
		Scanner sc=new Scanner(System.in);
		int k;
		int result=1;
		System.out.println("팩토리얼 구할 숫자 입력: ");
		k=sc.nextInt();
		for(int i=1;i<=k;i++) {
			result*=i;
		}
		System.out.println(k+"! ="+result);
	}
	public static void scanStringTextEx_02() {
		// String Class에서 equals, startswith 사용
		
		// 김씨가 몇 명 일까요?
		Scanner sc=new Scanner(System.in);
		String name;
		int cnt=0;
		
		while(true) {
			System.out.println("이름을 입력하세요(종료: 끝):");
			name=sc.nextLine();
			// break문
			if(name.equals("끝")){
				break;
			}
			if(name.startsWith("김")) {
				cnt++;
			}
			System.out.println("성이 김씨인 사람은 "+cnt+"명입니다.");
		}
	}
	public static void scanWhileTrueEx_03() {
		/*
		 * 합계를 구할 숫자를 입력하시오.
		 * 10
		 * 1~10까지의 합은 55입니다.
		 * while(true)를 사용할 것.
		 */
		
		Scanner sc=new Scanner(System.in);
		int input=0, i=0;
		int sum=0;
		System.out.println("합계를 구할 수 입력: ");
		input=sc.nextInt();
		
		while(true) {
			i++;
			sum+=i;
			if(i==input) {
				break;
			}
		}
		System.out.println("1부터 "+input+"까지의 합:"+sum);
	}
}
