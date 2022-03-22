package day0208;

import java.util.Scanner;



public class InheritEx_09 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Command comm=null;
		
		int n;
		
		while(true) {
			System.out.println("1. 추가, 2. 수정, 3. 삭제, 4. 출력, 5~. 종료");
			System.out.println("==========================================");
			System.out.println("select>>");
			n=sc.nextInt();
			
			switch(n) {
			case 1:
				comm=new Insert();
			case 2:
				comm=new Modify();
			case 3:
				comm=new Del();
			case 4:
				comm=new ListA();
			default:
				System.out.println("종료합니다.");
				break;
			}
		}
		if
		
	}

}
