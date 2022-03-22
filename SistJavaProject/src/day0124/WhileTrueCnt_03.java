package day0124;

public class WhileTrueCnt_03 {
	public static void main(String[] args) {
	
		
		int n=0;
		int cnt=0;
	
		while(true) {
			n++;
			if (n%3==0) {
			cnt++;
			}
			if (n==100) {
			break;
			}
		}
		System.out.println("3의 배수 갯수: "+cnt+"개");
	}
}
