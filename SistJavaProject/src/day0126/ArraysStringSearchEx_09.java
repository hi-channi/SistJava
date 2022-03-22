package day0126;

import java.util.Scanner;

public class ArraysStringSearchEx_09 {
	public static void main(String[] args) {
		/*
		 * 이름을 입력해서 그 이름이 몇 번째에 있는지 찾기
		 * 이름을 찾을 수 없으면 "검색 실패"
		 * "끝"이라고 입력하면 검색을 종료
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String[] data= {"최준영","조정언","임현정","장수빈","조아라","이용기","이경룡","유태호","원연욱"};
		
		String name;
		boolean flag=false;
		//boolean flag;
		
		while(true) {
			System.out.println("찾으려는 이름을 입력하세요: ");
			name=sc.nextLine();
			// 종료 조건
			if(name.equals("끝")) {
				break;
			}					
			// equals 조건에 따른 순차 검색
			for(int i=0;i<data.length;i++) {
				if(name.equals(data[i])) {
					flag=true;
					System.out.println(i+1+"번째에 있습니다.");
				}
			}
			//flag=false;
			// 검색 실패
			if(!flag) { // flag==false
				System.out.println("검색 실패: 결과 없음");
			}
		}
	}
}

