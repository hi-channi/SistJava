package day0118;

public class ReferVarTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String 자료형 이용 >> ""로 표현
		
		char a='A';
		char b='가';
		String str="Hello";
		String str2=new String("Happy Day");  // 모든 클래스는 new 연산자로 만들 수 있음
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		System.out.println(str2);
		
		// 실행 단계에서 문자열을 읽고 변수에 저장
		String name= args[0];
		String city=args[1];
		String age=args[2];
		
		System.out.println("이름은 "+name+"이구요. 사는 지역은 "+city+"입니다. 그리고 나이는 "+age+"세 입니다.");
		
	}
}