package day0128;

import java.util.Scanner;

public class ArraysLottoReview_01 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] lotto=new int[6];
		int cnt=0;
		
		while(true) {
			System.out.println("로또 구입 금액을 입력하세요: ");
			cnt=sc.nextInt();
			if(cnt<1000) {
				System.out.println("로또 구입을 위한 금액이 부족합니다.");
				return;
			} 
			for(int n=0;n<cnt/1000;n++) { 
				System.out.printf("%3d회: ",n+1);
				
				for(int i=0;i<lotto.length;i++) {
					lotto[i]=(int)(Math.random()*45)+1;
					for(int j=0;j<i;j++) {
						if(lotto[i]==lotto[j]) {
							i--; 
							break; 
						}
					}
				}
				for(int i=0;i<lotto.length-1;i++) {
					for(int j=i+1;j<lotto.length;j++) {
						if(lotto[i]>lotto[j]) {
							int temp=lotto[i];
							lotto[i]=lotto[j];
							lotto[j]=temp;
						}	
					}
				}

				for(int i=0;i<lotto.length;i++) {
					System.out.print("\t"+lotto[i]);
				}
				System.out.println();
			}
		}
	}
}

