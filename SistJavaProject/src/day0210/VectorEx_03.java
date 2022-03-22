package day0210;

import java.util.List;
import java.util.Vector;

public class VectorEx_03 {
	
	public static void write(String title, List<String> list) {
		System.out.println("***"+title+"***");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+": "+list.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data= {"사과","바나나","오렌지","딸기"};
		
		List<String> list=new Vector<String>();
		
		for(String s:data) {
			list.add(s);
		}
		
		write("초기 데이터 출력", list);
		System.out.println("1번 인덱스 삭제하기");
		list.remove(1);
		write("1번 인덱스 삭제 결과", list);
		list.add("수박");
		write("수박 추가 결과", list);  // 새로운 값은 마지막 인덱스에 추가됨
		list.set(1, "자몽");
		write("인덱스 값 변경", list);
		System.out.println("전체 삭제하기");
		list.clear();
		write("전체삭제", list);
	}
}
