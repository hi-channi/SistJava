package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileToken_12 {
	
	public static void goodsList() {
		String fileName="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\goods.txt";
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			System.out.println("*** 입고 물품 현황 ***");
			System.out.println("No.\t상품명\t\t수량\t가격\t합계");
			System.out.println("================================================");
			int cnt=0;
			while(true) {
				
				String s;
				s=br.readLine();
				
				if(s==null) {
					break;
				}
				cnt++; // No. 위한 카운트 증가
				// 1. split 분리(합계 미구현)
				//System.out.print(cnt+"\t");
				//String[] data=s.split(",");
				//for(int i=0;i<data.length;i++) {
				//	System.out.print(data[i]+"\t");
				
				//}
				//System.out.println();
				
				// 2. Token 분리하기
				StringTokenizer st=new StringTokenizer(s,",");
				String goods=st.nextToken();
				String sku=st.nextToken();
				String price=st.nextToken();
				int total=Integer.parseInt(sku)*Integer.parseInt(price);
				System.out.println(cnt+"\t"+goods+"\t"+sku+"\t"+price+"\t"+total);
				
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
		goodsList();
	}
}
