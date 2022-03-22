package day0127;

import java.util.Scanner;

public class ArraysDdi_06 {

   public static void main(String[] args) {
      /*
       * 이름입력
       * 신지환
       * 태어난 년도 입력
       * 1997
       * 신지환님은 소띠입니다.
       */
      String []ddi= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
      Scanner sc=new Scanner(System.in);
      
      String name;
      int myYear;
      
      System.out.println("이름을 입력하세요");
      name=sc.nextLine();
      System.out.println("태어난 년도를 입력하세요");
      myYear=sc.nextInt();
      
      // 계산
      String myDdi=ddi[myYear%12];
      System.out.println(name+"님은"+myDdi+"띠입니다.");
          
      
   }

}