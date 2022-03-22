package day0210;

public class Board {
	private String name;
	private String subject;
	private String content;
	
	// 디폴트 생성자
	public Board() {
		
	}
	
	// 명시적 생성자
	public Board(String name,String subj,String cont) {
		this.name=name;
		this.subject=subj;
		this.content=cont;
		
	// setter, getter
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
