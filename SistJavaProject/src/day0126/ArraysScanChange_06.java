package day0126;

import java.util.Scanner;

public class ArraysScanChange_06 {
	public static void main(String[] args) {
		
	/*
	 * 입력할 학생의 인원 수가 몇 명인지 출력 후 학생의 이름과 점수를 입력 후 출력
	 * 합계와 평균도 출력
	 */
		
	int student;
	String[] name;
	int[] score;
	int tot=0;
	int[] rank; // 순위기능 추가
	double avg=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("인원 수를 입력하세요: ");
	student=Integer.parseInt(sc.nextLine());
	
	// 인원 수 만큼 이름, 점수의 배열 할당
	name=new String[student];
	score=new int[student];
		rank=new int[student]; // 순위기능 추가
	
	for(int i=0;i<student;i++) {
		System.out.println(i+"번째 학생 이름");
		name[i]=sc.nextLine();
		System.out.println(i+"번째 학생 점수");
		score[i]=Integer.parseInt(sc.nextLine());
		//총점
		tot+=score[i];
	}
	
	for(int i=0;i<student;i++) {
		rank[i]=1; // for문이 돌 때마다 i값을 1로 초기화
		for(int j=0;j<student;j++) {
			if(score[i]<score[j])
				rank[i]++;
				
				
		}
	}
	
	avg=(double)tot/student;
	
	
	System.out.println("번호\t이름\t점수\t등수");
	System.out.println("--------------------");
	for(int i=0;i<student;i++) {
		System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
	}
	System.out.println("--------------------");
	
	System.out.println("총점: \t\t"+tot);
	System.out.printf("평균: \t\t%.2f",avg);
	}
}
