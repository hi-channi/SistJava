package day0210;

import java.util.ArrayList;
import java.util.List;

public class ArraryListEx_04 {
	
	public static void main(String[] args) {
		String[] flower= {"장미","프리지아","다알리아","백합","수국"};
		
		List<String> list=new ArrayList<String>();
		
		for(String s:flower) {
			list.add(s);
		}
		
		System.out.println("출력1. for~each");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("출력2. for");
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
		}
				
	}
}
			
