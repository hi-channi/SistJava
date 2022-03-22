package day0128;

public class Student08 {

   private String name;
   private int age;
   
   // 생성자(명시적 생성자)
   public Student08(String name,int age) {
   
      this.name=name;
      this.age=age;
   }
   // 디폴트 생성자 생성하기
   public Student08() {
      
   }
   
	/*
	 * setter 메서드 
	 * 인스턴스 변수에 저장된 데이터를 수정할 목적으로 사용 
	 * 저장용도이므로 결과값이 없음 (void)
	 */
   public void setName(String name)
   {
      this.name=name;
   }
   public void setAge(int age)
   {
      this.age=age;
   }

	/*
	 * getter 메서드 
	 * 인스턴스 변수에 저장된 데이터를 조회할 목적으로 사용_get변수명 
	 * 데이터 얻는 목적, 호출데이터를 넘겨주는
	 * 데이터 없으므로 인자 없음. 
	 * 실행결과값을 돌려주므로 'return 결과값'으로 지정 
	 * 리턴타입도 결과값 타입으로 지정한다.
	 */   
   public String getName()
   {
      return name;
   }
   public int getAge()
   {
      return age; 
   }
}