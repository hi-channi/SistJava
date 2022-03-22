package day0127;

public class Arrays2ChaEx_10 {
	public static void main(String[] args) {
		
		// 2차열 배열 생성과 동시에 초기화
		int[][]	arr= {{23,44},{11,22,33},{10,20,30,40}};
		
		System.out.println("총 행 갯수: "+arr.length);
		
		System.out.println("1번행의 열 개수:"+arr[0].length);
		System.out.println("2번행의 열 개수:"+arr[1].length);
		System.out.println("3번행의 열 개수:"+arr[2].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("[%d][%d]=[%d]\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}
}
