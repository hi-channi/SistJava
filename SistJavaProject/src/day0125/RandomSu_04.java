package day0125;

import java.util.Scanner;

public class RandomSu_04 {

	public static void main(String[] args) {
		//여러회차에 걸쳐서 난수 알아맞추기
		//1: 77
		//77보다 작습니다
		//2: 66
		//맞아요~정답은 66입니다..프로그램종료
		
		Scanner sc=new Scanner(System.in);
		
		int n=(int)(Math.random()*100)+1;
		
		int k; //입력할 값
		int cnt=0; //횟수를 구하는 
		
		while(true) {
			cnt++;
			System.out.print(cnt+"회:");
			k=sc.nextInt();
			
			/*if(cnt>=10) {
				break;
			}
			*/
			
			if(k<n) {
				System.out.println(k+"보다 큽니다");
			} else if(k>n) {
				System.out.println(k+"보다 작습니다");
			} else {
				System.out.println("맞아요~정답은"+n+"입니다");
				break;
		   }
		}
		System.out.println("프로그램 종료");
		
	}
}