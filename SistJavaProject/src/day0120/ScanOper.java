package day0120;

import java.util.Scanner;

public class ScanOper {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int su1,su2;
		int add,sub,mul,div;
		
		System.out.println("input 1st number?");
		su1=sc.nextInt();
		System.out.println("input 2nd number?");
		su2=sc.nextInt();
		
		add=su1+su2;
		sub=su1-su2;
		mul=su1*su2;
		div=su1/su2;
		
		System.out.println("-------결과값 출력-------");
		System.out.println("su1+su2="+add);
		System.out.println("su1+su2="+sub);
		System.out.println("su1+su2="+mul);
		System.out.println("su1+su2="+div);
	}
	
}