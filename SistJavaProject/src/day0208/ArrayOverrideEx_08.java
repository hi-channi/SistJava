package day0208;

abstract class Game{
   abstract void play();
   abstract void stop();
}

////////////////////
class Nari extends Game{
   @Override
   void play() {
      System.out.println("나리가 게임을 시작합니다");
   }
   @Override
   void stop() {
      System.out.println("나리가 게임을 종료합니다");
}
}
///////////////////////
class Ara extends Game{
   @Override
   void play() {
      System.out.println("아라가 게임을 시작합니다");
   }
   @Override
   void stop() {
      System.out.println("아라가 게임을 종료합니다");
   }
}

///////////////
class Jongmin extends Game{

   @Override
   void play() {
      System.out.println("종민이가 게임을 시작합니다");
      
   }

   @Override
   void stop() {
      System.out.println("종민이가 게임을 종료합니다");
      
   }
   
}


public class ArrayOverrideEx_08 {

   public static void main(String[] args) {
      //배열선언
       Game[] game=new Game[3];

      //선언한 배열로 객체생성
       game[0]=new Nari();
       game[1]=new Ara();
       game[2]=new Jongmin();
       
       for(int i=0;i<game.length;i++)
       {
          game[i].play();
          
       }
       System.out.println("--------------");
       for(int i=game.length-1;i>=0;i--)
       {
          game[i].stop();
       }
   }

}