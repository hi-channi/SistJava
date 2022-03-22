package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferEx_09 {

	public static void scoreRead() throws FileNotFoundException, IOException {
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\score.txt";
		
		// 변수 선언
		FileReader fr=null;
		BufferedReader br=null;
		
		int cnt=0;
		int total=0;
		double avg=0;
		
		// 파일 읽기
		fr=new FileReader(fileName);
		System.out.println("파일 불러오기 성공!");
		br=new BufferedReader(fr);
		
		while(true) {
			String s=br.readLine();
			if(s==null) { // 마지막 줄 아래에는 값이 없으므로(null) 종료
				break;
			}
			// 문자열 점수를 int로 변환해 합계랑 개수 구하기
			cnt++; // 읽은 Line 개수 = 점수 개수
			
			total=Integer.parseInt(s);
		}
		// 평균 구하기
		avg=(double)total/cnt;
		
		System.out.println("총 개수:"+cnt);
		System.out.println("총점: "+total);
		System.out.printf("평균: %2.f\n",avg);
		
		// 자원 닫기(반드시 오픈의 역순으로 닫을 것)
		br.close();
		fr.close();
				
	}
	
	public static void main(String[] args) {
		
		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
