package day0128;

class MyFriends {
	private String name;
	private String addr;
	private String phone;
	
	public static final String schoolName="쌍용고 동창회 모임";
	
	// 인자 3개를 보내는 명시적 생성자를 생성할 것
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setInfo(String name,String addr,int age){
		this.setName(name);
		this.setAddr(addr);
		this.setPhone(phone);
	}
	public String getInfo( ) {
		
		String s="name: "+name+"\naddress: "+addr+"\nage: "+phone;
		
		return s;
}
	
public class ReviewEx_12 {

	public static void main(String[] args) {
		
		MyFriends no1=new MyFriends("강나리","경기도 수원시","010-3333-4444");
		/*
		no1.setName("강나리");
		no1.setAddr("경기도 수원시");
		no1.setPhone("010-3333-4444");
		*/
		MyFriends no2=new MyFriends();
		no2.setName("김은비");
		no2.setAddr("서울시 은평구");
		no2.setPhone("010-1111-9999");
		
		System.out.println("["+MyFriends.schoolName+"]\n");
		System.out.println("이름: "+no1.getName()+"\n주소: "+no1.getAddr()+"\n연락처: "+no1.getPhone());
		System.out.println("----------------------------");
		System.out.println("이름: "+no2.getName());
		System.out.println("주소: "+no2.getAddr());
		System.out.println("연락처: "+no2.getPhone());
	}
}
