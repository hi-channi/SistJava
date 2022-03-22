package day0210;

import java.util.StringTokenizer;

public class TokenEx_10 {

   public static void main(String[] args) {
      String str="red,blue,yellow,white,pink,purple,orange";
      
      System.out.println("String 객체에서 split을 이용한 분이");
      String[] arr=str.split(",");
      System.out.println("총"+arr.length+"개");
   
      for(int i=0;i<arr.length;i++)
      {
         System.out.println(i+":"+arr[i]);
      }
      System.out.println("StringTokenizer를 이용한 분리");
      StringTokenizer st=new StringTokenizer(str,",");
      System.out.println("총 토큰수:"+st.countTokens());
      
      while(st.hasMoreTokens()) //다음토큰 있으면 true,없으면 false반환
      {
         System.out.println(st.nextToken()); //다음토큰 열기
         
      }
   }
}