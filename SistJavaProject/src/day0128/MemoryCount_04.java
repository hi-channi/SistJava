package day0128;

public class MemoryCount_04 {
	
	//int count=0;
	static int count=0;
	
	// 생성자 >> 클래스명 (constructor)
	public MemoryCount_04() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		MemoryCount_04 mc1=new MemoryCount_04();
		MemoryCount_04 mc2=new MemoryCount_04();
		// mc1,mc2는 인스턴스 변수 >> 각각 서로 다른 메모리를 가지고 있음
		// 따라서 count는 증가하지 않음(Line5 활성화 시)
		// static 변수는 공용으로 가지기 때문에 카운트가 증가함(Line6 활성화 시)
		
		// 전역으로 자주 (공통으로)사용하는 변수는 static을 붙이는게 일반적임
	}
}
