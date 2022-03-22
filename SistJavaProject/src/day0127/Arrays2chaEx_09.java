package day0127;

public class Arrays2chaEx_09 {
	public static void main(String[] args) {
		
		int[][] arr;
		arr=new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=5;
		arr[1][1]=15;
		arr[1][2]=25;
		
		System.out.println("행의 길이: "+arr.length);
		System.out.println("열의 길이: "+arr[0].length);
		
		
		System.out.println("***2차원 배열 데이터 출력***");
		for(int i=0;i<arr.length;i++) {		// 행
			for(int j=0;j<arr[i].length;j++) {		// 열
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("%d-%d=%2d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
		//값 변경
		System.out.println("***값 변경***");
		arr[0][1]=55;
		arr[1][0]=77;
		arr[1][2]=99;
		for(int i=0;i<arr.length;i++) {	
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d-%d=%2d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}
}
