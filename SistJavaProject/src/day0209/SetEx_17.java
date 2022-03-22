package day0209;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx_17 {
	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<Integer>();
		
		set1.add(5);
		set1.add(11);
		set1.add(45);
		set1.add(78);
		set1.add(5);
		
		System.out.println("갯수:"+set1.size()); // 4개: 중복 허용 X
		
		System.out.println("출력1");
		for(int s:set1) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("출력2");
		Object []ob=set1.toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.print(ob[i]+" ");
		}
		System.out.println();
		
		System.out.println("출력3");
		Iterator<Integer> iter=set1.iterator();
		while(iter.hasNext()) {
			int s=iter.next();
			System.out.print(s+" ");
		}
	}
}
