package day0209;

public class StringEx_13 {
	public static void main(String[] args) {
		
		int a=100;
		
		//String aa=String.valueOf(a); // 문자형으로 변환 가능
		String  aa=a+" ";
		System.out.println(aa);
		
		char []b= {'a','b','c','d','e'};
		String bb=String.valueOf(b);
		
		System.out.println(bb);
		
		String str="Happy My Life!!";
		System.out.println(str.length());
		
		System.out.println(str.substring(6)); // my life!!
		System.out.println(str.substring(6,8));
		
		String s1=str.replace('a', '*');
		System.out.println(s1);
		String s2=str.replace("Happy","Wonderful");
		System.out.println(s2);
	}
	
}
