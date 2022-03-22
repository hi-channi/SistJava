package day0209;

import java.util.Scanner;

public class StringEx_14 {
	public static void main(String[] args) {
		
		String []names={"김은비","곽경태","이다솔","김주찬","김민지","이강진","김태민","차두리"};
		
		Scanner sc=new Scanner(System.in);
		String name="";
		int cnt=0;
		
		while(true) {
			System.out.println("검색할 이름 입력(일부 입력 가능): ");
			name=sc.nextLine();
			
			if(name.equalsIgnoreCase("q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			cnt=0;
			for(int i=0;i<=names.length-1;i++) {
				if(names[i].startsWith(name)) {
					cnt++;
					System.out.println(names[i]);
				}
			} 	
			System.out.println("검색 결과는 "+cnt+"건 입니다.");
		}
	}
}
	
