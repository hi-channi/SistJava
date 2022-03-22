package day0127;

import java.util.Scanner;

public class ArraysBinggoEx_11 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[][] pz=new int[3][3];
		int binggo=0;
		
		while(true) {
			System.out.println("**같은 숫자가 나오면 빙고**");
			
			for(int i=0;i<pz.length;i++) {
				for(int j=0;j<pz[i].length;j++) {
					pz[i][j]=(int)(Math.random()*3)+1;
					
				}
			}
			for(int i=0;i<pz.length;i++) {
				for(int j=0;j<pz[i].length;j++) {
					System.out.printf("%4d",pz[i][j]);
				}
				System.out.println();
			}
			
			for(int i=0;i<pz.length;i++) {
				// 가로(행) 빙고 유효 조건
				if(pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2]) {
					binggo++;
				// 세로(열) 빙고 유효 조건
				}
				if(pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i]) {
					binggo++;
				}
			}	
			// 대각선(/) 빙고 유효 조건
			if(pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0]) {
				binggo++;
			}
			// 대각선(\) 빙고 유효 조건
			if(pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2]) {
				binggo++;	
			}
			// 빙고 출력
			if(binggo==0) {
				System.out.println("꽝");
			} else {
				System.out.println("\t빙고: "+binggo+"개");
				
			}
			// 빙고 초기화
			binggo=0;
			
			
			System.out.println("엔터를 누르면 다음 빙고를 시작합니다.(종료: Q)");
			String ex=sc.nextLine();
			if(ex.equalsIgnoreCase("q")) {
				System.out.println("빙고가 종료됩니다.");
				break;
				
			}
		}
	}
}
