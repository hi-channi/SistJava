package day0128;

class NumConst{
	
	int num; // 0
	
	// 인자없는 생성자
	public NumConst() {
		//num=10;
		System.out.println("생성자 호출");
	}
	// 오버로딩: 같은 메소드를 가지고 있는 생성자(단, 인자값, 인자 갯수 혹은 순서가 틑려야 함)
	// 인자를 가진 생성자
	public NumConst(int num) {
		this.num=num+1;
		// 레퍼런스 변수 this는 나 자신을 의미함. (Line5의 num을 의미)
		System.out.println("num값을 인자로 가진 생성자를 호출"+num);
	}
	// 메소드
	public int getNumber() {
	// void: 반환값이 없음, String: 반환값이 문자열
		num=50;
		//this.num=50; //this를 생략 가능(Line22와 동일)
		return num;
	}
}

public class ConstEx_06 {
	public static void main(String[] args) {
		
		// 디폴트 생성자 객채 생성
		NumConst num1=new NumConst();
		System.out.println(num1.num);
		// 인자 num을 가진 객체 생성
		NumConst num2=new NumConst(5);  // 값을 보냄과 동시에 생성
		System.out.println(num2.num);
		// 메소드 호출
		NumConst num3=new NumConst();
		System.out.println(num3.getNumber());
	}
}
