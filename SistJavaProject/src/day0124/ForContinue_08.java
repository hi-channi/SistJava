package day0124;

public class ForContinue_08 {

	public static void main(String[] args) {
		
		// continue: for문에서 continue가 사용되면 그 이하를 실행하지 않고 증감식으로 이동함 
		// break: 반복문에서 가장 가까운 반복문을 빠져나감
		// return: 함수 종료
		
		//break
		for(int i=1;i<=10;i++) {
			if(i%5==0)
				break;
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// continue
		for(int i=1;i<=20;i++) {
			if(i%5==0)
				continue; // i++으로 이동
			System.out.print(i+" "); 
		}
		System.out.println();
	}

}
