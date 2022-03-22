package day0119;

import java.util.Scanner;

public class ScannerTest_04 {
	public static void main(String[] args) {
		
		// Scanner라는 클래스는 문자열이나 숫자를 키보드로 입력받고 싶을 때 사용
		
		Scanner sc=new Scanner(System.in);
		
		// 1. 변수 선언
		String name;
		int age;
		String city;
		
		// 2. 입력에 관한 출력 가이드 작성
		System.out.print("이름을 입력해 보세요: ");
		name=sc.nextLine();
		
		System.out.print("당신의 나이는 몇 살인가요?: ");
		//age=sc.nextInt();
		/* 
		 Line 23과 같이 작성 시
		 숫자 입력 후 엔터를 누르면 엔터가 키보드의 버퍼로 저장되어서 다음문자보다 먼저 엔터를 읽게 됨
		 따라서 다음 문자열을 읽기 전에 엔터를 읽어 버퍼를 없애야 함 >> sc.nextLine()
		*/
		age=Integer.parseInt(sc.nextLine()); // 출력만 문자열 형태로 되고, 속성은 정수형으로 유지됨
		
		System.out.print("거주지는 어디인가요?: ");
		city=sc.nextLine();
		
		// 3. 출력
		System.out.println("------------------------");
		System.out.println("나의 이름은 "+name+"입니다.");
		System.out.println("나의 나이는 "+age+"살 입니다.");
		System.out.println("나의 거주지는 "+city+"입니다.");
		
	}
}
