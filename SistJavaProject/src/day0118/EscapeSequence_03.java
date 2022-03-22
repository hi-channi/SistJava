package day0118;

public class EscapeSequence_03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 문자열 내에서 특별한 의미로 해석: Escape Sequence(탈출문자)
		// 모두 \로 시작함
		// \t: 다음 탭 위치로 이동
		// \n: 다음 줄로 이동(엔터)
		// \"/': 따옴표 입력
		// \\: 역슬래시(\) 입력
		
		System.out.println("Apple\tOrange");
		System.out.println("\"Apple\"");
		System.out.println("c:\\");
		System.out.println("\"apple\",\"kiwi\",\"banana\"");
	}

}