package day0203;

class Person{
   String name;
   int age;
   
   public Person() {
      this("이수연",5); // 4번째 생성자 호출
   }
   public Person(String name) {
      this(name,5); // name을 생성하면서 전달
      this.name=name; // name값에 전달
   }
   public Person(int age) {
      this("홍길동",age);
   }
   // 인스턴스와 지역변수를 일치시켜 생성
   public Person(String name,int age) {
      this.name=name;
      this.age=age;
      System.out.println("호출");
   }
   
   public void write() {
      System.out.println("이름: "+name+"\t나이: "+age);
   }
   
}

public class ConstEx_04 {

   public static void main(String[] args) {
      Person p1=new Person();
      Person p2=new Person("유재석");
      Person p3=new Person(22);
      Person p4=new Person("강호동",34);
      
      p1.write();
      p2.write();
      p3.write();
      p4.write();
   }

}