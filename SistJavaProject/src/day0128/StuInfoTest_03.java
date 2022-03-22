package day0128;

public class StuInfoTest_03 {
	public static void main(String[] args) {
		
	
	String name; //iv
	
	StudentInfo stu1=new StudentInfo();
	StudentInfo stu2=new StudentInfo();
	
	
	stu1.name="곽경태";
	stu1.age=18;
	
	stu2.name="조아라";
	stu2.age=19;
	
	StudentInfo.schoolName="쌍용고등학교";
	
	System.out.println("***클래스 멤버값 출력***");
	System.out.println("학교명: "+StudentInfo.schoolName);
	System.out.println("***학생1 정보***");
	System.out.println("이름: "+stu1.name);
	System.out.println("나이: "+stu1.age);
	System.out.println("***학생2 정보***");
	System.out.println("이름: "+stu2.name);
	System.out.println("나이: "+stu2.age);
	}
}
