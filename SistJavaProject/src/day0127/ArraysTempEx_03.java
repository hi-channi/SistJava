package day0127;

import java.util.Arrays;

public class ArraysTempEx_03 {
	public static void main(String[] args) {
		
		// 데이터 역순 출력
		int[] arr= {5,7,3,9,12,45,76,89,10};
		
		// 출력
		System.out.println("원 데이터");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 역순 처리
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i]; // ex) i=1일 때, arr[1]=arr[9-1-1]: 7번째
			arr[arr.length-i-1]=temp;	// 즉, arr[1]과 arr[7]의 자리가 맞바뀜
		}
		
		System.out.println("역순 처리 데이터");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 선택 정렬: 비교하며 가장 작은 수를 앞으로 보냄
		// 오름차순 정렬 (중첩 for문: 비교해야 하기 때문에)
		for(int i=0;i<arr.length-1;i++) {	// arr[0]~arr[7]:1번째부터 8번째
			for(int j=i+1;j<arr.length;j++) {	//arr[1]~arr[8]:2번째부터 9번째
				// 즉, arr[0]을 arr[1]~arr[8]...arr[1]을 arr[2]~arr[8]... 반복 비교하게 됨
				if(arr[i]>arr[j]) {		// 순서를 바꿔야 할 조건(경우)에 대한 조건을 만들어야함.
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("오름차순 출력 데이터");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*
		Arrays.sort(arr); // 배열을 오름차순으로 정렬
		System.out.println(arr.toString()); // 주소값이 반환되므로 Arrays를 이용한다.
		System.out.println(Arrays.toString(arr));
		*/
	}
}
