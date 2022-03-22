package day0302;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcMystudent {

   DbConnect db=new DbConnect();
   Scanner sc=new Scanner(System.in);
   
   //insert
   public void insertMystudent()
   {
      String name, hp, sql;
      int age;
      
      System.out.print("Your Name?");
      name=sc.nextLine();
      System.out.print("Your Hp?");
      hp=sc.nextLine();
      System.out.print("Your Age?");
      age=Integer.parseInt(sc.nextLine());
      
      sql="insert into mystudent values(seq1.nextval,'"+name+"','"+hp+"',"+age+",sysdate)";
      System.out.println(sql);
      
      //Connection
      //Statement....excute
      
      Connection conn=db.getOracle();
      Statement stmt=null;
      
      try {
         stmt=conn.createStatement();
         int n=stmt.executeUpdate(sql);
         
         if(n==1)
            System.out.println("insert성공!!");
         else
            System.out.println("insert실패!!");
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(stmt, conn);
      }
   }
   
   //write
   public void writeMystudent()
   {
      //시퀀스   이름   핸드폰   나이   가입날짜
      Connection conn=db.getOracle();
      Statement stmt=null;
      ResultSet rs=null;
      
      String sql="select * from mystudent";
      System.out.println("시퀀스\t이름\t나이\t핸드폰\t가입일");
      System.out.println("------------------------------");
      
      try {
         stmt=conn.createStatement();
         rs=stmt.executeQuery(sql);
         
         //여러개일 경우는 while..하나일 경우 if
         while(rs.next()) //더이상 데이터가 없으면 false반환
         {
            //데이터를 가지고 오는 방법(컬럼명 or 인덱스번호)
            System.out.println(rs.getInt("num")+"\t"+rs.getString("name")+"\t"+rs.getInt("age")+"\t"+
            rs.getString("hp")+"\t"+rs.getDate("sdate"));
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         db.dbClose(rs, stmt, conn);
      }
      
   }
   
   //delete
   public void deleteMystudent()
   {
      Connection conn=db.getOracle();
      Statement stmt=null;
      
      String sql;
      int num;
      
      System.out.println("삭제할 번호는?");
      num=Integer.parseInt(sc.nextLine());
      
      sql="delete from mystudent where num="+num;
      
      try {
         stmt=conn.createStatement();
         int n=stmt.executeUpdate(sql);
         
         if(n>0)
            System.out.println(num+"번 삭제성공!!");
         else
            System.out.println(num+"은 없네요~~");
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(stmt, conn);
      }
      
   }
   
   //update
   public void updateMystudent()
   {
      String hp,sql;
      int num,age;
      
      System.out.println("수정할 번호는?-->");
      num=Integer.parseInt(sc.nextLine());
      System.out.println("수정할 핸드폰 번호는?-->");
      hp=sc.nextLine();
      System.out.println("수정할 나이는?-->");
      age=Integer.parseInt(sc.nextLine());
      
      sql="update mystudent set hp='"+hp+"',age="+age+" where num="+num;
      System.out.println(sql);
      
      Connection conn=db.getOracle();
      Statement stmt=null;
      
      try {
         stmt=conn.createStatement();
         int n=stmt.executeUpdate(sql);
         if(n==1)
            System.out.println(num+"번님 수정완료");
         else
            System.out.println("수정실패");
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         db.dbClose(stmt, conn);
      }
   }
   
   public static void main(String[] args) {
      JdbcMystudent my=new JdbcMystudent();
      Scanner sc=new Scanner(System.in);
      int n=0;
      //while,switch
      while(true)
      {
         System.out.println("**학생정보**");
         System.out.println("1.추가 2.출력 3.수정 4.삭제 5.종료");
         System.out.println("Input Number?==>");
         n=Integer.parseInt(sc.nextLine());
         if(n==5)
         {
            System.out.println("프로그램종료");
            break;
         }
         switch(n)
         {
         case 1:
            my.insertMystudent();
            break;
         case 2:
            my.writeMystudent();
            break;
         case 3:
            my.deleteMystudent();
            break;
         }
      }
   }

}