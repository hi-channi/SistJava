package day0209;

interface Sawon {
	public void addSawon();
	public void deleteSawon();
	public void listSawon();
	
}

public class InnerReview_01 {
	
	// Sawon 인터페이스를 익명 내부 클래스 형식으로 선언 후 메인에서 각 메소드 호출
	Sawon sa=new Sawon() {
		
		@Override
		public void listSawon() {
			System.out.println("사원 명단 출력");
			// TODO Auto-generated method stub
		}
		
		@Override
		public void deleteSawon() {
			System.out.println("사원 퇴사");
			// TODO Auto-generated method stub
		}
		
		@Override
		public void addSawon() {
			System.out.println("사원 입사");
			// TODO Auto-generated method stub
		}
	};
	
	public static void main(String[] args) {
		
		InnerReview_01 in=new InnerReview_01();
		
		in.sa.addSawon();
		in.sa.deleteSawon();
		in.sa.listSawon();
		
	}
}
