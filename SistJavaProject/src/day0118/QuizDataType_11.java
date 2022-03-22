package day0118;

public class QuizDataType_11 {

	public static void main(String[] args) {
		/*
		 메인 파라메타 값으로 3과목의 점수를 읽어 총점과 평균을 출력하시오.
		 (단, 출력은 소숫점 둘째 자리까지)
		 변수 java, jsp, spring, tot
		 
		 java=88, jsp=77, spring=68
		 총점: 233
		 평균: 77.66
		 */
		
		//1. 변수
		int java=Integer.parseInt(args[0]);  // Line5의 main 메소드의 파라메타 값이 String(문자열)로 지정되어 있기 때문에 정수형으로 변환
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		
		//2. 계산
		double tot=java+jsp+spring;
		double avg=(tot/3);
		
		//3. 출력
		System.out.printf("Java 과목 점수는 %s점,\nJsp 과목 점수는 %s점,\nSpring 과목 점수는 %s점 입니다. \n총점은 %.0f, 평균은 %.2f입니다.", java, jsp, spring, tot, avg);
	}

}