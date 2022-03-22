package day0208;

abstract class AbstEx1 {
	abstract public void dataAdd();
	abstract public void dataList();
}

class SubAbst extends AbstEx1 {
	@Override
	public void dataAdd() {
		// TODO Auto-generated method stub
		System.out.println("회원 추가");
		
	}
	@Override
	public void dataList() {
		// TODO Auto-generated method stub
		System.out.println("회원목록 출력");
	}
	
}

public class AbstAnonyEx_16 {
	
	// 익명 내부 클래스
	
	AbstEx1 ab1=new AbstEx1() {
		public void dataAdd() {
			// TODO Auto-generated method stub
			System.out.println("회원 추가");
			
		}
		@Override
		public void dataList() {
			// TODO Auto-generated method stub
			System.out.println("회원목록 출력");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstAnonyEx_16 ex=new AbstAnonyEx_16();
		
		// 익명 내부 클래스
		ex.ab1.dataAdd();
		ex.ab1.dataList();
		System.out.println("-----------------------------");
		
		// 상속 받은 클래스
		SubAbst sub=new SubAbst();
		sub.dataAdd();
		sub.dataList();
		
	}

}
