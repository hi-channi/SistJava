package day0120;

public class IfTest_09 {

	public static void main(String[] args) {
		// 1.대소비교
		int n=9;
		
		if(n>5) {
		System.out.println("n은 5보다 크다.");
		}
		System.out.println("프로그램 종료");
		
		if(n%2==0) {
			System.out.println(n+"은(는) 짝수입니다.");
		} else {
			System.out.println(n+"은(는) 홀수입니다.");
		}
		
		// 2. 학점 계산기
		int score=68;
		String grade="A";
		
		if(score>=90) {
			grade="A";
		} else if(score>=80) {
			grade="B";
		} else if(score>=70) {
			grade="C";
		} else if(score>=60) {
			grade="D";
		} else {
			grade="F";
		}
		
		System.out.println("나의 학점은 "+grade+" 입니다.");
		
		// 3. 학점 계산기(삼항 연산자)
		String grade2;
				
		grade2=score>=90?"A":
					score>=80?"B":
						score>=70?"C":
							score>=60?"D":"F";
				System.out.println("나의 학점2는 "+grade2+" 입니다.");
	}
				
}
