package day0209;

import java.util.Scanner;

// 사용자 정의 Exception

class UserException extends Exception {
	public UserException(String msg) {
		super(msg);
	}
}

public class UserException_11 {
	
	public static void process() throws UserException {
		Scanner sc=new Scanner(System.in);
		
		int age=0;
		// 나이가 20~40세가 아니라면 UserException 강제 발생
		System.out.println("나이를 입력하세요: ");
		age=sc.nextInt();
		
		if(age<20 || age>40) {
			throw new UserException("멤버 연령은 20~40세 입니다.");
		} else {
			System.out.println("당신은 "+age+"세 이므로 멤버로 등록 가능합니다.");
		}
	}
	public static void main(String[] args) {
		
		try {
			process();
		} catch (UserException e) {
			e.printStackTrace();
		}
		System.out.println("정상 종료");
		
	}
}
