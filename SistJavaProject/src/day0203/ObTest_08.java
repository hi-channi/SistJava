package day0203;

class Info {
	
	private String name;
	private String addr;
	private int age;
	
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void setInfo(String name,String addr,int age){
		this.setName(name);
		setAddr(addr);
		setAge(age);
	}

	public String getInfo( ) {
		
		String s="name: "+name+"\naddress: "+addr+"\nage: "+age;
		
		return s;
	}

}
public class ObTest_08 {
	public static void main(String[] args) {
		
		Info in1=new Info();
		
		in1.setName("김태희");
		in1.setAddr("서울시 강남구");
		in1.setAge(35);
		
		System.out.println("*** 출력 ***");
		System.out.println("이름: "+in1.getName());
		System.out.println("주소: "+in1.getAddr());
		System.out.println("나이: "+in1.getAge());
		
		System.out.println("*** 3개의 값 한 번에 출력***");
		in1.setInfo("정지훈", "서울시 서초구", 44);
		
		System.out.println(in1.getInfo());
	}

}
