package day0126;

public class ArraysMaxMinEx_06 {
	public static void main(String[] args) {
		
		int[] data= {5,12,66,88,98,100,35,67,54,18};
		System.out.println("data 갯수: "+data.length);
		
		int max=data[0]; // 배열에서는 첫 데이터를 무조건 최대값으로 저장
		int min=data[0];
		
		// 두번째 데이터부터 끝까지 max와 비교
		for(int i=1;i<data.length;i++) {
			if(max<data[i])
				max=data[i];
			if(min>data[i])
				min=data[i];
		}
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);
	}
}
