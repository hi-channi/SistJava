package day0217;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectShopRead_08 {

	ArrayList<Shop_07> list=new ArrayList<Shop_07>();
	
	public void fileObjectRead() {
		// 파일에서 읽어 출력
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\shop0217.txt");
			ois=new ObjectInputStream(fis);
			
			list=(ArrayList<Shop_07>)ois.readObject();
			
			System.out.println("상품명\t수량\t단가");
			System.out.println("==============================");
			
			for(Shop_07 s:list) {
				System.out.println(s.getSang()+"\t"+s.getSu()+"\t"+s.getDan());
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectShopRead_08 osr=new ObjectShopRead_08();
		osr.fileObjectRead();
	}

}
