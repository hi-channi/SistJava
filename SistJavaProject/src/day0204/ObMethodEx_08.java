package day0204;

public class ObMethodEx_08 {

   public static void hello(int age,double height) {
      System.out.println("전달 순서대로 저장");
      System.out.println("제 나이는 "+age+"세");
      System.out.println("저의 키는"+height+"cm");
   }
   public static void good()
   {
      System.out.println("안녕 담에 봅시다");
   }
   
   
   public static void main(String[] args) {
      // 메소드 호출
      System.out.println("메서드 호출");
      hello(22,165.9);
      good();
   }

}