package day0211;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReadEx_02 {
	
	public static void sawonData() {
		
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\sawon.txt";
		
		FileReader fr=null;
		BufferedReader br=null;
		
		System.out.println("*** 사원 재직 현황 ***");
		System.out.println("No.\t사원명\t기본급\t가족 수\t초과근무\t가족수당\t시간수당\r총 급여");
		System.out.println("================================================");
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			int cnt=0;
			while(true) {
				String s;
				s=br.readLine();
				
				if(s==null) {
					break;
				}
				cnt++;
				StringTokenizer st=new StringTokenizer(s,",");
				String name=st.nextToken();
				String gibon=st.nextToken();
				String famcnt=st.nextToken();
				String overtime=st.nextToken();
				int fampay=Integer.parseInt(famcnt)*30000;
				int timepay=Integer.parseInt(overtime)*30000;
				int totalpay=Integer.parseInt(gibon)+fampay+timepay;
				System.out.println(cnt+"\t"+name+"\t"+gibon+"\t"+famcnt+"\t"+overtime+"\t"+fampay+"\t"+timepay+"\t"+totalpay);
			}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
		sawonData();
	}
}
