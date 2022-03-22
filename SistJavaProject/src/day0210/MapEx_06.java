package day0210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* key와 value(값)으로 이루어진 데이터 집합 >> key로 구분
 * 순서는 유지되지 않는다
 * 키는 중복허용하지않고, 값은 중복한다
 */
public class MapEx_06 {

   public static void main(String[] args) {
      Map<String, String>map=new HashMap<String, String>();
      
      map.put("name", "유재석");
      map.put("age", "23");
      map.put("addr", "서울시 노원구");
      map.put("name", "수지"); //같은 키 값일 경우 먼저 데이터는 없어짐
      System.out.println("size: "+map.size());
      System.out.println("키값을 알면 정확하게 value값을 얻는다");
      System.out.println("이름: "+map.get("name"));
      System.out.println("나이: "+map.get("age"));
      System.out.println("주소: "+map.get("addr"));
   // Map에 없는 key값은 null을 반환함
      System.out.println("혈액형: "+map.get("blood"));
      
      System.out.println("키값을 먼저 한번에 얻은 후 값을 얻기");
      Set<String>KeySet=map.keySet();
      
      System.out.println("방법#1");
      for(String key:KeySet)
      {
         System.out.println(key+"==>"+map.get(key));
      }
      System.out.println("방법#2");
      Iterator<String>keyIter=KeySet.iterator();
      while(keyIter.hasNext())
      {
         String key=keyIter.next();
         System.out.println(key+"===>"+map.get(key));
      }
   }

}



