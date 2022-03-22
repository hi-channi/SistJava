package day0209;

import java.io.IOException;
import java.io.InputStream;

/*
 * 문자 스트림: Reader.Writer _ 문자 단위
 * 바이트 스트림: InputStream,OutputStream _ 바이트 단위
 * BufferReader 클래스는 readLine(); _ 한 줄씩 읽어온다(flush라는 버퍼 내용을 스트림으로 전송하는 작업 필요)
 */

public class IoExceptionEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is=System.in; // 콘솔창에 입력받을(할) 수 있음
		
		int a=0;
		
		System.out.println("한 글자 입력: ");
		try {
			a=is.read(); // read()는 1byte밖에 읽지 못함. 따라서 한글(2byte) 읽기 불가. >> Return값은 ASCII // 반드시 try/catch 작업을 필요로 함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오류: "+e.getMessage());
		} 
		
		System.out.println("3초 뒤에 출력합니다.");
		try {
			Thread.sleep(3000); // 3000=3sec // 반드시 try/catch 작업을 필요로 함
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("입력값은 "+a+"입니다.(ASCII 값)");
		System.out.println("입력값은 "+(char)a+"입니다.");
		
 	}

}
