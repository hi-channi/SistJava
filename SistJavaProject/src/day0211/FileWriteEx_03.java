package day0211;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriteEx_03 {
	
	public static void fileWrite() {
		FileWriter fw=null;
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\test1.txt";
		
		try {
			fw= new FileWriter(fileName);
			fw.write("Have a nice day!!\n");
			fw.write(new Date().toString());
			
			System.out.println("성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void fileWrite2() {
		FileWriter fw=null;
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\test2.txt";
		
		try {
			fw= new FileWriter(fileName, true); // true는 반복 작성함
			fw.write(" 내 이름은 김주찬 입니다.\n");;
			fw.write("===========================\n");
			
			System.out.println("성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileWrite();
		fileWrite2();
	}

}
