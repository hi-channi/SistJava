package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferEx_08 {
	
	public static void read() {
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\memo1.txt";
		BufferedReader br=null;
		FileReader fr=null;

		// 읽기 위햐서 파일 열기
		
		try {
			fr=new FileReader(fileName);
			System.out.println("파일 오픈 성공");
			
			br=new BufferedReader(fr);
			
			while(true) {
				String s=br.readLine();
				// 메모장에서 내용을 한 줄씩 읽어옴
					if(s==null) { 
						break; //null값일 경우 while문 빠져나가기
					}
					System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다"+e.getMessage());
		} catch (IOException e) {

		} finally {
			// 파일이나 DB를 닫음
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		System.out.println("정상종료");
	}
}
