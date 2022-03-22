package day0203;

public class StudentInfoTest_10 {
	public static void main(String[] args) {
		
		StudentInfo []stu=new StudentInfo[3];
		
		stu[0]=new StudentInfo();
		stu[1]=new StudentInfo("이순신","010-1111-2222");
		stu[2]=new StudentInfo("조민진","010-3333-4444");
		
		for(int i=0;i<stu.length;i++) {
			// 객체 생성
			StudentInfo s=stu[i];
			s.writeData();
			//stu[i].writeData();	// Line14~15와 같은 의미
			System.out.println("------------------");
		}
	}
}
