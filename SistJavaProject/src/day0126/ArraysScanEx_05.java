package day0126;

import java.util.Scanner;

public class ArraysScanEx_05 {
	public static void main(String[] args) {
		
		// 배열의 범위만큼 입력 후 출력하기
		Scanner sc=new Scanner(System.in);
		
		int[] data=new int[5];
		
		// 값 입력(배열의 길이 만큼만)
		for(int i=0;i<data.length;i++) {
			System.out.println((i+1+"번째 값: "));
			data[i]=sc.nextInt();
		}
		
		// 출력 확인
		int sum=0;
		System.out.println("입력값 확인");
		for(int i=0;i<data.length;i++) {
			System.out.print((i+1)+data[i]+" ");
			sum+=data[i];
			
		}
		System.out.println("\n배열 값의 총합: "+sum);
	}
}
