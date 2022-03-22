package day0203;

public class Member {
	
	private String name;
	private String gender;
	private String addr;
	
	static String ban;
	static int cnt=0;
	
	// 수정 메소드(인자 3개)_setData
	public void setData(String name,String gender,String addr) {
		this.name=name;		// 동일한 클래스 내에서 this. 생략 가능
		this.gender=gender;
		this.addr=addr; 
	}
	
	// 출력 메소드_getData
	public void getData() {
		cnt++;
		System.out.println("[학생"+cnt+" 정보]");
		System.out.println("이름: "+this.name);
		System.out.println("소속: "+Member.ban+"반");
		System.out.println("성별: "+this.gender);
		System.out.println("주소: "+this.addr);
		System.out.println("------------------------");
	}
	
}
