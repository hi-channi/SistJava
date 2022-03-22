package day0208;

interface ColorA{
   String INITCOLOR="WHITE";//상수..final생략
   public void showColor(); //abstract생략
}
//////////
class RedA implements ColorA{

   @Override
   public void showColor() {
      System.out.println("기본색상: "+INITCOLOR);
      System.out.println("레드로 도색할 예정입니다.");
   }
   
}
//////////////////
class BlueA implements ColorA{

   @Override
   public void showColor() {
      System.out.println("파란색으로 도색할 예정입니다.");
   }
   
}
////////////////////
class WhiteA implements ColorA{

   @Override
   public void showColor() {
      System.out.println("다시 하얀색으로 도색할 예정입니다.");
   }
   
}

//////////////
public class InterfaceEx_06 {

   public static void main(String[] args) {

      // 다형성
      
      ColorA color;
      color=new RedA();
      color.showColor();
      
      color=new BlueA();
      color.showColor();
      
      color=new WhiteA();
      color.showColor();
      
      
   }

}