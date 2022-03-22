package day0118;

public class VarArgs_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 내 이름은 코난, 탐정이죠
		 자바점수 88
		 오라클점수 88
		 과목 합계는 176점 입니다
		 */
		// 1. 변수 선언
		String name=args[0];  // args은 문자열만 받음
		int java=Integer.parseInt(args[1]); // 따라서 문자열(args)을 정수형으로 변환 후 변수에 대입
		int oracle=Integer.parseInt(args[2]);
		
		// 2. 계산
		int result=java+oracle;
		
		// 3. 출력
		System.out.println("내 이름은 "+name+" 탐정이죠\n"+"자바점수는 "+java+
				"점\n오라클 점수는 "+oracle+"점\n과목 합계는 "+result+"점 입니다.");
		
		
	}

}