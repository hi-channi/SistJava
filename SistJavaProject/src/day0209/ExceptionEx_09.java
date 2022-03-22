package day0209;

public class ExceptionEx_09 {
	public static void process() {
		int []arr= {2,5,7,8};
		for(int i=0;i<=arr.length;i++) {
			try {
			System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("오류 메시지 1: "+e.getMessage());
			}
		}
	}
		public static void process2() throws NumberFormatException {
			// throws: 예외 발생을 직접 처리하지 않고 호출 하는 곳으로 넘김
		String a="12a";
		String b="30";
		int sum=0;
	
		sum=Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("두 수의 합은 "+sum);
	}
	
	public static void main(String[] args) {
		
		process();
		
		try { 
		process2();
		} catch (NumberFormatException e) {
			System.out.println("예외 처리를 main에서 수행함: "+e.getMessage());
		}
		System.out.println("종료");
	}
}
