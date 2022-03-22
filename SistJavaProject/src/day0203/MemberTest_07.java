package day0203;

public class MemberTest_07 {
	public static void main(String[] args) {
		
		Member no1=new Member();
		Member no2=new Member();
		Member no3=new Member();
		
		no1.setData("이나영", "여자", "서울시 용산구");
		no2.setData("원빈", "남자", "서울시 용산구");
		no3.setData("정우성", "남자", "경기도 수원시");
		
		Member.ban="JAVA";
				
		no1.getData();
		no2.getData();
		no3.getData();
		
	}
}
