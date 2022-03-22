package day0203;

class Score {
	private String name;
	private int java;
	private int spring;
	
	public static final String TITLE="중간고사 시험 결과";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}
	
	public int getTot() {
		int s=this.java+this.spring;
		return s;
		//return java+spring; // Line35~36과 동일
	}
	public double getAvg() {
		return getTot()/2.0;
	}
}

public class ObScoreEx_09 {

	public static void main(String[] args) {
		
		Score s=new Score();
		
		s.setName("박지윤");
		s.setJava(90);
		s.setSpring(87);
		
		int tot=s.getTot();
		double avg=s.getAvg();
		
		System.out.println("Score 클래스");
		System.out.println(Score.TITLE);
		System.out.println("이름: "+s.getName());
		System.out.println("JAVA 점수: "+s.getJava());
		System.out.println("Spring 점수: "+s.getSpring());
		System.out.println("합계: "+s.getTot());
		System.out.println("평균: "+s.getAvg());
	}

}
