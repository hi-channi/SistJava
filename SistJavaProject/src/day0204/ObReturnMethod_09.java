package day0204;

public class ObReturnMethod_09 {

   public static void main(String[] args) {
      System.out.println("두 수의 합 :"+add(10,20));
      System.out.println("두 수의 곱 :"+square(4.5));
      divide(6,2);
      divide(3,0);
      divide(4,2);
   }
   public static int add(int num1,int num2)
   {
      int result=num1+num2;
      return result;
   }
   public static double square(double num)
   {
      return num*num;
   }
   public static void divide(int num1,int num2)
   {
      if(num2==0)
      {
         System.out.println("0으로는 나눌 수 없습니다");
         return; //메소드의 종료
      }
      System.out.println("나눗셈 결과: "+num1/num2);
   }
}