package day0119;

public class CastArgsTest_02 {

	public static void main(String[] args) {
		
		// 1. 변수
		String name=args[0];
		int java=Integer.parseInt(args[1]);
		int jsp=Integer.parseInt(args[2]);
		
		// 2. 계산
		int tot=java+jsp;
		
		// 3. 출력
		System.out.println("이름: "+name);
		System.out.println("JAVA 점수: "+java);
		System.out.println("JSP 점수: "+jsp);
		System.out.println("합계:"+tot+"점");

	}

}