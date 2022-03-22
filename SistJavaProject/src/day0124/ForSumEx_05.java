package day0124;

import java.util.Iterator;

public class ForSumEx_05 {
	public static void main(String[] args) {
		
		int sum1= 0;
		int sum2= 0;
		
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sum2+=i;
			}
			if(i%2!=0) {
				sum1+=i;
			}
		}
		System.out.println("짝수의 합: "+sum2+"\n홀수의 합: "+sum1);
	}
}
