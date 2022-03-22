package day0121;

import java.util.Scanner;

public class SwitchScoreEx_06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int score;
		String grade, msg;
		System.out.println("당신의 점수는?: ");
		score=sc.nextInt();
		
		System.out.println("당신의 점수는 "+score+"점 입니다.");
		
		switch (score/10) {
		case 10: 
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
			break;
		}
		
		// 삼항연산자를 활용한 점수별 메시지 출력
		msg=score>=90?"합격입니다.":score>=80?"좀 더 노력하세요!":"다음기회에 ㅠㅠ";
		
		System.out.println("학점은 "+grade+"입니다.");
		System.out.println(msg);
	}
}
