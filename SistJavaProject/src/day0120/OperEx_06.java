package day0120;

public class OperEx_06 {
	public static void main(String[] args) {
		
		// 대입연산자: +=,-=,*=,/=, %=
		
		int a,b,c,d,e;
		
		a=b=c=d=e=10;
		
		a+=2;
		b-=3;
		c*=3;
		d/=3;
		e%=3;
		
		System.out.println("a="+a); //10+2
		System.out.println("b="+b); //10-3
		System.out.println("c="+c); //10*3
		System.out.println("d="+d); //10/3
		System.out.println("e="+e);	//10%3
	
	}
}