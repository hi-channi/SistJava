package day0209;

public class ExceptionEx_04 {
	public static void main(String[] args) {
		
		int []arr= {4,6,7};
		
		for(int i=0;i<=arr.length;i++) {
			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("오류 발생: "+e.getMessage());
			}
 		}
	}
}
