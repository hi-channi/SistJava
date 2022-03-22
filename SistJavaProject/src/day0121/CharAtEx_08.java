package day0121;

public class CharAtEx_08 {
	public static void main(String[] args) {
		
		String jumin="030105-4276564";
		
		char seventh=jumin.charAt(7);
		
		// 조건문을 이용하여 남자, 여자, 2000년 이후 남자 여자인지 구하시요.
		
		switch (seventh) {
		case '1':
			System.out.println("1900년대 출생한 남자입니다.");
			break;
		case '3':
			System.out.println("2000년대 출생한 남자입니다.");
			break;
		case '2':
			System.out.println("1900년대 출생한 여자입니다.");
			break;
		case '4':
			System.out.println("2000년대 출생한 여자입니다.");
			break;
		default:
			break;
		}
	}
}
