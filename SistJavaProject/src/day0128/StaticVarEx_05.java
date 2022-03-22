package day0128;

class InstCnt{
	static int instNum;
	
	// 생성자
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: "+instNum);
	}
	// 오버로딩: 같은 

}

public class StaticVarEx_05 {
	public static void main(String[] args) {
	
		InstCnt cnt1=new InstCnt();
		InstCnt cnt2=new InstCnt();
		InstCnt cnt3=new InstCnt();
		// 생성이 된다는 것은 생성자가 있다는 것
		
	}
}
