package day0210;

import java.util.HashSet;

public class HashSetReview_01 {

	public static void main(String[] args) {
		
		String []str= {"Java","Beans","Java","XML"};
		
		HashSet<String> hs1=new HashSet<String>();
		
		HashSet<String> hs2=new HashSet<String>();
	
		for(String n:str) {
			// hs1에 중복된 데이터를 hs2에 추가하는 조건문
			if(!hs1.add(n)) {
				hs2.add(n);
			}
			System.out.println("hs1: "+hs1);
			hs1.removeAll(hs2); // hs1에서 hs2에 포함된 요소를 삭제
			System.out.println("hs1: "+hs1);
			System.out.println("hs2: "+hs2);
		}

	}

}
