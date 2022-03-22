package day0203;

/* 
 * 생성자_객체생성 시 자동호출되는 메서드
 * 일반 메소드의 차이점: 리턴형이 없음
 * 클래스명과 같고 Overloading이 가능
 * 생성자끼리의 호출은 this() >> this()는 반드시 첫 줄이어야 함
*/

class Apple{
   Apple(){
      System.out.println("디폴트 생성자 호출");
   }
}

class Banana{
   public Banana(String str) {
      System.out.println("생성자 호출: "+str);
   }
}

class Orange{
   // 생성자 오버로딩
   public Orange() {
      System.out.println("오렌지 디폴트 생성자 호출");
   }
   public Orange(String str) {
      System.out.println("오렌지 두번째 생성자 호출: "+str);
   }
   public Orange(int n) {
      this(); // this가 있기에 디폴트 생성자 호출, 반드시 첫 줄
      System.out.println("오렌지 세번째 생성자 호출: "+n);
   }
}
public class ConstEx_02 {

   public static void main(String[] args) {

      Apple ap=new Apple();
      Banana ba=new Banana("Happy");
      
      Orange or1=new Orange(); // 디폴트 생성자
      Orange or2=new Orange("Hello");
      Orange or3=new Orange(5);
   }

}