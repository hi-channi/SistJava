package day0210;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_05 {

	// 클래스(Board)로 지정했으므로 데이터를 꺼내고 받을 때도 클래스 형식이어야 함
	List<Board> list=new Vector<Board>(); 
	
	// 데이터 입력
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		String name, subject, content;
		
		System.out.println("작성자명: ");
		name=sc.nextLine();
		System.out.println("제목: ");
		subject=sc.nextLine();
		System.out.println("내용: ");
		content=sc.nextLine();
		
		// Board 생성
		Board data=new Board(name, subject, content);
		list.add(data);
		
		//list.add(new Board(name, subject, content)); // Line25~26과 동일
		System.out.println("현재 데이터 갯수: "+list.size()+"개");
	}
	
	// 데이터 출력
	public void writeData() {
		System.out.println("****** 게시판 ******");
		System.out.println("---------------------------------------");
		for(int i=0;i<list.size();i++) {
			Board b=list.get(i); // 리스트 내 지정된 위치(인덱스) 값 반환
			System.out.println("No."+(i+1)+" / 작성자: "+b.getName());
			System.out.println("- 제목: "+b.getSubject());
			System.out.println("- 내용: "+b.getContent());
			System.out.println("---------------------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VectorBoard_05 vt=new VectorBoard_05();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("1.추가  2.전체 출력  0. 종료");
			n=Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				vt.inputData();
				break;
			case 2:
				vt.writeData();
				break;
			default:
				break;
			}
		}
	}
}
