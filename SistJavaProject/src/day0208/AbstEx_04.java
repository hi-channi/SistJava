package day0208;

import java.util.Scanner;

abstract class Board {
	//public void process(); // 선언부만 있고 구현부가 없음
	public abstract void process(); // 하나의 추상 메소드라도 존재한다면 클래스는 추상 클래스가 됨
}

class List extends Board {
	@Override
	public void process() {
		System.out.println("게시판의 글을 출력합니다.");
	}
}
class Write extends Board {
	@Override
	public void process() {
		System.out.println("게시판의 글을 작성합니다.");
	}
}
class Modify extends Board {
	@Override
	public void process() {
		System.out.println("게시판의 글을 수정합니다.");
	}
}
class Delete extends Board {

	@Override
	public void process() {
		System.out.println("게시판의 글을 삭제합니다.");
	}
}
public class AbstEx_04 {

	public static void main(String[] args) {
		//Board b=new Board(); 	// 추상 클래스는 new로 객체 생성 안됨
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		
		Board board=null;
		
		while(true) {
			System.out.println("1. 쓰기 /2. 글 보기/ 3. 글 수정 /4. 글 삭제 /0. 종료");
			num=sc.nextInt();
			switch (num) {
			case 1:
				board=new Write();
				break;
			case 2:
				board=new List();
				break;
			case 3:
				board=new Modify();
				break;
			case 4:
				board=new Delete();
				break;
			default: // case 0:
				System.out.println("종료합니다");
				System.exit(0); // 강제종료
				break;
			}
			
			board.process();
			
		}
	}
}


