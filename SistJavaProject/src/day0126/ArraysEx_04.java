package day0126;

public class ArraysEx_04 {
	public static void main(String[] args) {
		
		// 선언과 동시에 초기값을 지정해줄 수 있음 >> {} 사용
		
		int[] arr= {8, 7, 84, 88, 9, 43, 6, 88};
		
		System.out.println("개수: "+arr.length);
		
		System.out.println("#1");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n#2");
		for(int s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("======================");
		
		int[] arr1=new int[5];
		arr1[1]=10;
		arr1[4]=34;
		
		for(int k:arr1) {
			System.out.println(k);
		}
		
		// 방법2
		int [] arr2= {44,77,88,99,100,34,56,78};
		System.out.println("------------------");
		System.out.println(arr2.length);
		System.out.println("------------------");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int j:arr2) {
			System.out.printf("%4d",j);
		}
		System.out.println();
		
		// 문자열 배열
		String[] str1=new String[5];
		// str1에 문자열 넣기
		str1[1]="장미";
		str1[2]="프리지아";
		
		String[] str2= {"Red","Yellow","Green","Blue"};
		
		//출력1_str1
		for(int i=0;i<str1.length;i++) {
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		//출력2_str1
		for(String k:str1) {
			System.out.print(k+" ");
		}
		System.out.println();
		//출력1_str2
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
		}
		System.out.println();
		//출력2_str2
		for(String h:str2) {
			System.out.print(h+" ");
		}		
		
	}
}
