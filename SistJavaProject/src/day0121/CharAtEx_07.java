package day0121;

import java.util.Scanner;

public class CharAtEx_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char ch;
		
		System.out.println("알파벳 1글자 입력:");
		
		// 입력한 문자열의 첫글자 가져오기
		ch=sc.nextLine().charAt(0); // .charAt(0): ch의 첫글자(0번째) 가져오기
		// 첫글자 뒤에 어떤 글자를 입력해도 첫번째 글자만을 받아옴.
		System.out.println("ch="+ch);
		
		switch (ch) {
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("Other Fruits");
			break;
		}
	}
}
