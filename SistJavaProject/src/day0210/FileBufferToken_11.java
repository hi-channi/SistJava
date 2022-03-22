package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileBufferToken_11 {

	public static void fileOpen() {
		
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\info1.txt";
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			System.out.println("** 파일 읽기 결과 **");
			System.out.println("이름\t학교명\t학년");
			System.out.println("========================");
			
			while(true) {
				String s;
				s = br.readLine();
				
				if(s==null) {
					break;
				}
				// 1. split으로 분리하기
				//String[] data=s.split(",");
				//System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]+"학년");
				
				// 2. Token으로 분리하기
				StringTokenizer st=new StringTokenizer(s,",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken()+"학년");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
		
		fileOpen();
	}

}
