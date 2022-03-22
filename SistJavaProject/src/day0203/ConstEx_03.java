package day0203;

import java.util.Calendar;

import day0203_1.TestP;
public class ConstEx_03 {

   public static void main(String[] args) {
      //TestP t1=new TestP(); // private는 다른 패키지에서는 생성 안 됨
      TestP t1=TestP.getInstance();
      t1.writeMessage();
      
      //Calendar cal=new Calendar(); // 생성자가 protected이므로 에러
      Calendar cal=Calendar.getInstance();
      int y=cal.get(Calendar.YEAR);
      
      System.out.println(y+"년입니다.");

   }

}