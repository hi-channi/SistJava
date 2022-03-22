package day0120;

public class OperEx_05 {

	public static void main(String[] args) {
		
		boolean bool=false;
		
		System.out.println("a="+bool);
		System.out.println("b="+!bool);
		
		boolean bool1=5>3;
		
		System.out.println("c="+bool1);
		System.out.println("d="+!(5>3));
		//System.out.println("d="+!5);
		
		// 비교연산자(관계): >,<,>=,<=,==,!=
		// 논리연산자: &&(and), ||(or), !(not)
		
		int a=5,b=3,c=5;
		
		System.out.println(a>b); //t
		System.out.println(a==b); //f
		System.out.println(!(a==b)); //t
		System.out.println(a!=b); //t
		System.out.println(a==c); //t
		System.out.println(a>b&&b>c); //f
		System.out.println(a>b||b>c); //t
	}

}