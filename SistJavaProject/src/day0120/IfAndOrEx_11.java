package day0120;

import java.util.Scanner;

public class IfAndOrEx_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Q. 합격조건: 평균이 60점 이상
		
		int oracle, java, eng;
		String name, msg;
		double avg;
		
		System.out.print("이름을 입력하세요: ");
		name=sc.nextLine();
		System.out.println("오라클 과목 점수를 입력하세요:");
		oracle=Integer.parseInt(sc.nextLine());
		System.out.println("자바 과목 점수를 입력하세요:");
		java=Integer.parseInt(sc.nextLine());
		System.out.println("기초영어 과목 점수를 입력하세요:");
		eng=Integer.parseInt(sc.nextLine());
		
		avg=(oracle+java+eng)/3.0;
		
		if(avg>=60&&
				oracle>=40&&java>=40&&eng>=40) {
			msg="합격입니다.";
		} else {
			msg="탈락입니다.";
		}
		System.out.println("-----결과-----");
		System.out.println("이름: "+name);
		System.out.println("오라클, 자바, 영어 과목 점수: "+oracle+" ,"+java+" ,"+eng);
		System.out.printf("점수 평균: %.2f\n", avg);
		System.out.println(name+"님은 "+msg);

	}

}