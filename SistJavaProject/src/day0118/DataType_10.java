package day0118;

public class DataType_10 {
	public static void main(String[] args) {
		// ASCII 코드 A=65
		// 묵시적 형변환은 자동으로 결정됨.
		// String+int=String
		// double+int=double
		// long+short=long
		// char+int=int
		
		char a='A';
		System.out.println(a); // ASCII 코드 A=65
		System.out.println(a+32); //97
		System.out.println((char)(a+32)); // 97은 다시 문자형(char)으로 변환하면 소문자 a가 됨
		System.out.println((char)(a+30)); // 95는 문자형으로 변환 시 "_(언더바)"가 됨
		
		// char은 내부적으로 ASCII 값으로 인식됨.
		System.out.println("Happy"+(5+6));
		System.out.println("A"+3);
		System.out.println('A'+3);
		System.out.println(2+'B');
		System.out.println('a'+'b'); //97+98=195
		
		// printf를 이용해 ASCII 숫자로 JAVA 출력하기
		System.out.printf("%c%c%c%c", 74,65,86,65);
	}

}