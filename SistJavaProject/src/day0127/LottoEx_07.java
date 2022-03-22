package day0127;

public class LottoEx_07 {
	public static void main(String[] args) {
		// 로또번호 추첨기 
		// 중복된 번호가 없어야 하며, 오름차순으로 정렬해야함
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			System.out.println(i+1+"회 뽑은 값: "+lotto[i]);
			
			// 중복처리: 현재 lotto[i]와 lotto[0]~lotto[i-1]까지 비교해 중복 추출 시 i제거 
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--; // 같은 자리(index)에 다시 값을 구하기 위함
					break; // Line9의 i++로 이동
				}
			}
		}
		// 오름차순 정렬
		for(int i=0;i<lotto.length-1;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		// 출력
		System.out.print("추첨 결과: ");
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
	}
}
