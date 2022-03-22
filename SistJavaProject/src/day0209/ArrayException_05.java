package day0209;

public class ArrayException_05 {

	public static void main(String[] args) {

		String []arr= {"apple","Orange","Kiwi","Banana"};
		
		System.out.println("차례대로 출력");
		
		for(int i=0;i<=arr.length;i++) { // i<arr.length
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		for(int i=arr.length;i>=0;i--) { // i=arr.length-1
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
