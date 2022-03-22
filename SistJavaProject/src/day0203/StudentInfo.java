package day0203;

public class StudentInfo {
	
	private String stuName;
	private String phone;
	private int score;
	
	// 디폴트 생성자
	public StudentInfo() {
		this("홍길동","010-222-4333",99);
	}
	
	public StudentInfo(String name,String phone) {
		this(name,phone,77);
	}
	
	// 명시적 생성자 #3
	public StudentInfo(String name,String phone,int score) {
		stuName=name;
		this.phone=phone;
		this.score=score;
	}
	// 전체 출력 메소드
	public void writeData() {
		System.out.println("이름: "+this.stuName);
		System.out.println("휴대폰: "+this.phone);
		System.out.println("점수: "+this.score);
	}
}

