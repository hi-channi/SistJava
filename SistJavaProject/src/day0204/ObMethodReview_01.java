package day0204;

class Mango {
	
	private String writer;
	private String subject;
	private static String mes="Happy Friday!!";
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMes() {
		return mes;
	}
	public static void setMes(String mes) {
		Mango.mes = mes;
	}
}

public class ObMethodReview_01 {
	
	// Mango 클래스의 변수 값을 출력하기 위한 메소드
	public static void writeMango(Mango m) {
		System.out.println("** Mango 클래스 출력 **");
		System.out.println("작성자: "+m.getWriter());
		System.out.println("제목: "+m.getSubject());
	}
	
	public static void main(String[] args) {
		
		// Mango 클래스 mes 호출
		// static 메소드도  static 변수처럼 클래스명으로 호출함
		
		System.out.println(Mango.getMes());
		Mango m1=new Mango();
		m1.setWriter("임현정");
		m1.setSubject("즐거운 금요일");
		
		Mango m2=new Mango();
		m2.setWriter("곽경태");
		m2.setSubject("안녕~");

		// 같은 클래스의 static 메소드 호출은 클래스명 생략 가능
		writeMango(m1);
		writeMango(m2);
		
		
	}
}
