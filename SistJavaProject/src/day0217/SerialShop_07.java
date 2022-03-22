package day0217;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SerialShop_07 {

   ArrayList<Shop_07> list=new ArrayList<Shop_07>();
   Scanner sc=new Scanner(System.in);
   
   public void addShop() {
      System.out.println("상품명: ");
      String sang=sc.nextLine();
      System.out.println("수량: ");
      int su=Integer.parseInt(sc.nextLine());
      System.out.println("단가: ");
      int dan=Integer.parseInt(sc.nextLine());
      
      
      // Shop 
      Shop_07 s=new Shop_07(sang, su, dan);
      // list에 추가
      list.add(s);
      
      System.out.println(list.size()+"번째 상품이 추가되었습니다.");
   }
   
   // list를 파일에 저장 >> 직렬화 이용
   public void writeFile() {
      FileOutputStream fos=null;
      ObjectOutputStream oos=null;
      
      try {
         fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\shop0217.txt");
         oos=new ObjectOutputStream(fos);
         
         // 파일에 Object 통째로 저장
         oos.writeObject(list);
         
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         try {
            oos.close();
            fos.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   public void process() {
      while(true) {
         System.out.println("1.Shop정보 추가 2. 전체 목록 파일에 저장 3. 종료");
         int n=Integer.parseInt(sc.nextLine());
         
         switch (n) {
         case 1:
            addShop();
            break;
         case 2:
            this.writeFile();
            break;
         default:
        	System.out.println("시스템을 종료합니다.");
            System.exit(0);
            break;
         }
      }
   }
   
   public static void main(String[] args) {
      SerialShop_07 ss=new SerialShop_07();
      ss.process();
   }

}