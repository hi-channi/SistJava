package day0124;

public class ForBreakLoop_15 {
	public static void main(String[] args) {
		
loop1:	for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5) {
					break loop1;
				}
				System.out.println(i+"X"+j+"="+i*j);
			}
		} // loop의 끝
	}
}
