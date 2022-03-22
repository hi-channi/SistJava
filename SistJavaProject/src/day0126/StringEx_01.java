package day0126;

public class StringEx_01 {
	public static void main(String[] args) {
		
		System.out.println("String 객체에 대한 member 메소드 공부");
		String str1="apple";
		String str2="Apple";
		String str3="Have a nice day";
		String str4="   Happy Day   ";
		System.out.println("str3의 길이: "+str3.length());
		System.out.println("str3의 길이: "+str4.length());
		System.out.println("str4의 앞, 뒤 공백을 제거한 길이: "+str4.trim().length());
		System.out.println("*"+str4.trim()+"*"); // trim(): 문자열 앞, 뒤 공백제거
		System.out.println("str3에서 0번째 문자: "+str3.charAt(0));
		System.out.println("str3에서 7번째 문자: "+str3.charAt(7));
		System.out.println("str3에서 'H'의 인덱스 번호는? "+str3.indexOf('H')); 
		System.out.println("str3에서 'Have'만 출력하기: "+str3.substring(0,4));
		System.out.println("str3에서 'Have'만 출력하기: "+str3.substring(7,11)); 
		// a부터 b까지만 출력: str3.substring(a,b-1)
		
		System.out.println("문자열 비교: "+str1.equals(str2)); // false
		System.out.println("문자열 비교: "+str1.equalsIgnoreCase(str2)); // true
		
		// a.compareTo(b)
		// a와 b가 같은 경우: 0
		// a가 작은 경우 - (알파벳 차이만큼 음수값)
		// a가 큰 경우 + (알파벳 차이만큼 양수값)
		
		System.out.println(str1.compareTo(str2)); //ASCII: a(97), A(65) >> 97-65
		System.out.println(str1.compareTo(str1)); // 0
		System.out.println("computer".compareTo("command")); // p와 m을 비교
		System.out.println("hello".compareTo("hello"));
		System.out.println("apple".compareTo("banana"));
		System.out.println("kiwi".compareTo("orange"));
		
		System.out.println("str3가 Have로 시작하면 true 반환:"+ str3.startsWith("Have"));
		System.out.println("str3가 Happy로 시작하면 true 반환: "+ str3.startsWith("Happy"));
		
		System.out.println(str3.endsWith("Day")); //true
		System.out.println(str3.endsWith("day")); //false >> 소문자 구분
		
		// 문자열 분리 메소드
		String str5="red,blue,green,yellow,pink,white";
		System.out.println("str5를 콤마(,)로 분리해 출력하기");
		String[] arr=str5.split(",");
		System.out.println(",로 구분된 색상의 개수: "+arr.length);
		
		// 출력
		for(String color:arr) 
			System.out.println(color);
		
		System.out.println("str3의 소문자 출력: "+str3.toLowerCase());
		System.out.println("str3의 대문자 출력: "+str3.toUpperCase());
		
		String a=String.valueOf(100); // int > String
		String b=String.valueOf(12.345); // double > String
		System.out.println(a+b); // String으로 변경
		
		// 문자열 대체
		System.out.println(str3.replace("a", "*"));
		System.out.println(str3.replace("nice", "wonderful"));
				
	}
	
	
}
