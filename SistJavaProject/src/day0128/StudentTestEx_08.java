package day0128;

public class StudentTestEx_08 {

   public static void main(String[] args) {
	   
      // 1.객체생성
      /*
       * 클래스명 참조변수명=new 클래스명([값]);
       * 참조변수명.변수명; (private은 접근안됨)
       * 참조변수명.메소드명; 
       */

      Student08 stu1=new Student08();
      
      // setter 메소드를 이용해서 값을 설정, 수정
      stu1.setName("임현정");
      stu1.setAge(28);
      
      // getter 메소드를 이용한 값 얻기
      // System.out.println(stu1.getName());
      int age=stu1.getAge(); 
      String name=stu1.getName();
      
      // 출력
      System.out.println(name+","+age);
      
      // 2번째 명시적 생성자를 통한 생성
      Student08 stu2=new Student08("이다솔",23);
      
      // get메서드를 통한 출력
      System.out.println(stu2.getName());
      System.out.println(stu2.getAge());
   }

}