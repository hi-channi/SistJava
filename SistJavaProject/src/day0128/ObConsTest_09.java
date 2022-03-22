package day0128;

class ObConstAA{
   String name; //null
   String addr; //null
   
   public ObConstAA(String name) {
      this(name,"서울시"); 	// 생성자에서 다른 오버로딩 생성자를 호출하는 경우
      // 반드시 첫번째 라인에 this를 써야함
   }
   // 생성자 (인자있는)
   public ObConstAA(String name,String addr) {
      this.name=name; 	// 인스턴스 자기자신을 this라함. 이름이 동일할땐 반드시 표시
      this.addr=addr;
   }
   
   // get 메소드
   public String getName()
   {
      return name;
   }
   public String getAddr()
   {
      return addr;
   }
}

public class ObConsTest_09 {

   public static void main(String[] args) {
      ObConstAA ob1=new ObConstAA("홍길동");

      System.out.println("이름은 "+ob1.getName()+"이며 주소는 "+ob1.getAddr()+"입니다");

      ObConstAA ob2=new ObConstAA("김기열","경기도 용인시");

      System.out.println("이름은 "+ob2.getName()+"이며 주소는 "+ob2 .getAddr()+"입니다");
   }

}