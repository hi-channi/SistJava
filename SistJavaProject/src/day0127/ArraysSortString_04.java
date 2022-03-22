package day0127;

public class ArraysSortString_04 {
	public static void main(String[] args) {
		// 문자열 배열을 오름차순을 출력하기
		
		String[] data= {"차동현","류슬영","임현정","이경룡","이용기","신지환","원연욱","장수빈"};
		
		System.out.println("***정렬 전 출력***");
		
		
		// 문자열 반환
		System.out.println("a".compareTo("b")); // -
		System.out.println("가".compareTo("나")); // -
		System.out.println("하".compareTo("가")); // +
		// 문자열이 같으면 0, 오름차순 기준 비교 대상이 앞이면 양수반환, 뒤면 음수 반환
		
		for(int i=0;i<data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i].compareTo(data[j])>0) {
					String temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
