package day0209;

public class StringBufferEx_15 {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		sb.append("Happy");
		sb.append("Nice");
		sb.append(200);
		sb.append(3.14);
		sb.append('A');
		
		System.out.println(sb);
		sb.insert(5, "Apple"); // 5번 인덱스 앞에 Apple 추가
		System.out.println(sb);
		sb.delete(5, 10); // 5~9가 삭제
		System.out.println(sb);
		sb.replace(5, 9, "Banana");
		System.out.println(sb);
		
	}
}
