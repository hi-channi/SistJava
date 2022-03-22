package day0126;

import java.util.Scanner;

public class ArraysIntSearchEx_07 {
	public static void main(String[] args) {
		/*
		 * 숫자를 입력받고 그 숫자가 배열의 몇 번째 위치에 있는지 찾기
		 * 0을 입력 시 종료
		 */
		
		// 배열에 찾고자 하는 값이 있을 때
		// 접근 방법: 1. 존재 여부 판단 > 2. 위치 판단
		
		int[] data= {12,45,77,82,67,23,90,66,4,52};
		
		Scanner sc=new Scanner(System.in);
		boolean flag;
		int input;
		
		while(true) { 
			System.out.println("검색할 숫자를 입력해주세요(종료: 0) ");
			input=sc.nextInt();
			// 종료구문
			if(input==0) {
				break;
			}
			flag=false; // 값을 찾으면 true
			
			// 값 찾기
			for(int i=0;i<data.length;i++) {
				if(input==data[i]) {
					flag=true;
					System.out.println((i+1)+"번째에서 검색");
				}
			}
			if(!flag) { //flag=false
				System.out.println(input+"은(는) 존재하지 않습니다.");
			}
		}
	}
}
