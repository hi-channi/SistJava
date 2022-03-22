package day0119;

import java.util.Scanner;

public class ScanScoreTest_08 {

   public static void main(String[] args) {
      /*
       학생명 ==> 홍길동
       국어, 수학, 영어 점수를 차례대로 입력하시오.
       88
       100
       55
       =============
       학생명: 홍길동
       국어: 88점
       수학: 100점
       영어: 55점
       평균: 77점
       */

      Scanner sc=new Scanner(System.in);
      String name; // 변수
      int kor;
      int mat;
      int eng;
      
      System.out.println("학생 이름: ");
      name=sc.nextLine();
      System.out.println("국어, 수학, 영어 점수를 차례로 입력하세요: ");
      kor=Integer.parseInt(sc.nextLine());
      mat=Integer.parseInt(sc.nextLine());
      eng=Integer.parseInt(sc.nextLine());
      
      int tot=kor+mat+eng;
      int avg=tot/3;
            
      System.out.println("이름:"+name);
      System.out.println("국어:"+kor+"점");
      System.out.println("수학:"+mat+"점");
      System.out.println("영어:"+eng+"점");
      System.out.println("평균:"+avg+"점");
   }

}