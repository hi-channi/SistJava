package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * List 인터페이스를 구현한 클래스: Vector, ArrayList
 * 순차적으로 데이터 입력
 * 중복 데이터 허용(Set과 차이점)
 * 생성자가 디폴트인 경우 기본할당 크기는 10, 넘치면 2배씩 증가 
 * 생성자가 (5,3)일 경우 >> 할당크기 5, 증가 시에 3씩 증가(5, 8, 11, ...)
 */

public class ListEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> list=new Vector<String>();
		//List<String> list=new Vector<String>();
		//List<String> list=new ArrayList<String>();  // Line20~22 모두 동일
		
		System.out.println("초기 할당 크기: "+list.capacity());
		System.out.println("초기 데이터 갯수: "+list.size());
		
		list.add("사과");
		list.add("딸기");
		list.add("수박");
		list.add("사과");
		list.add("키위");
		list.add("바나나");
		//list.add(7); // 제너릭 타입은 명시한 자료형만 추가 가능
		
		System.out.println("할당 크기: "+list.capacity());
		System.out.println("데이터 갯수: "+list.size()); // 중복을 허용: 6
		
		System.out.println("출력 방법#1");
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
		}
		
		System.out.println("출력 방법#2");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("출력 방법#3");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("출력 방법#4");
		Object[] ob=list.toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}	
	}
}
