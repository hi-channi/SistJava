package day0217;

// 직렬화 - 직렬화 객체

import java.io.Serializable;

public class Shop_07 implements Serializable {

   private String sang;
   private int su;
   private int dan;
   
   public Shop_07() {
      
   }
   public Shop_07(String sang,int su,int dan) {
      this.sang=sang;
      this.su=su;
      this.dan=dan;

   }
   
   public String getSang() {
      return sang;
   }
   public void setSang(String sang) {
      this.sang = sang;
   }
   public int getSu() {
      return su;
   }
   public void setSu(int su) {
      this.su = su;
   }
   public int getDan() {
      return dan;
   }
   public void setDan(int dan) {
      this.dan = dan;
   }
}

