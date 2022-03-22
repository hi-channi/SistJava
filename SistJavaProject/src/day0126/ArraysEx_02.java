package day0126;

public class ArraysEx_02 {
	public static void main(String[] args) {
		
		// int [] arr=new int[3];	// 메모리 할당
		// int arr []=new int[3];	// 할당만 하고 값을 주지 않으면 0으로 초기화
		// 선언과 동시에 초기값 부여 가능
		
		int [] arr,arr2;
		arr=new int[3];
		arr2=new int[5];
		
		// 배열에 값 부여
		arr[0]=10;
		arr[1]=5;
		arr[2]=20;
		
		System.out.println("arr배열의 갯수: "+arr.length);
		
		System.out.println("***for문으로 arr 일괄 출력하기***");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("***for~each문으로 arr 일괄 출력하기***");
		for(int a:arr) { // for~each(같은 자료형 참조변수명:배열이름)
			System.out.println(a);
		}
		
		System.out.println("***for문으로 arr2 일괄 출력하기***");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("***for~each문으로 arr2 일괄 출력하기***");
		for(int s:arr2)	{
			System.out.println(s);
		}
	}
}
