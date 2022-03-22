package day0209;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * <제네릭> 명시한 자료형
 * <컬렉션> 자료구조(set,vector,arraryList...)
 * (인터페이스 or 클래스명) <데이터형> 객체이름=new 클래스명<데이터형>;
 * 컬렉션은 배열과 달리 가변적임
 * 
 * List: 순서가 중요할 때, 인덱스 위치를 알고 있을 때
 * Set: 유일성이 중요할 때, 중복 허용 X
 * Map: key, value
 * 
 * Hashset: 클래스형 set: 인터페이스
 */
public class HashSetEx_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1=new HashSet<String>(); // 객체 생성 불가 
		// Set 안에 String(문자열) 데이터를 담겠다는 의미
		
		set1.add("사과");
		set1.add("바나나");
		set1.add("키위");
		set1.add("사과");
		set1.add("오렌지");
		set1.add("수박");
		
		System.out.println("데이터 개수: "+set1.size()); // 중복된 사과는 개수에 포함되지 않음: 5개
		
		/*
		 * Iterator 인터페이스: 꺼내서 출력
		 * 컬렉션 클래스에 대해서 Iterlator를 얻은 다음 반복. 주로 while문을 돌려서 읽어온다. 
		 */
		
		System.out.println("출력1");
		for(String s:set1) {
			System.out.println(s);
		}
		
		System.out.println("출력2");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext()) {  //.hasNext(): 반환할 값이 없을 때 까지 출력, 반환할 값이 더 이상 없으면 false
			// 마지막 요소까지 돌려줌
			String s=iter.next();
			System.out.println(s);
		}
		
		System.out.println("출력#3");
		Object[] ob=set1.toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
		
		set1.clear(); // 모든 데이터 삭제
		if(set1.isEmpty()) {
			System.out.println("set1에 데이터가 존재하지 않습니다.");
		} else {
			System.out.println("데이터가 존재합니다. (그럴리가?)");
		}
		
	}	

}
