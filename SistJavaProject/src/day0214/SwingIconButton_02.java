package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingIconButton_02 extends JFrame {
	
   Container cp;
   JButton btn1,btn2,btn3,btn4,btn5;
   
   // 아이콘 이미지 경로 지정
   ImageIcon icon1=new ImageIcon("C:\\sist0117\\image\\gameimage\\01.png");
   ImageIcon icon2=new ImageIcon("C:\\sist0117\\image\\gameimage\\02.png");
   ImageIcon icon3=new ImageIcon("C:\\sist0117\\image\\gameimage\\03.png");
   ImageIcon icon4=new ImageIcon("C:\\sist0117\\image\\gameimage\\04.png");
   ImageIcon icon5=new ImageIcon("C:\\sist0117\\image\\swingimage\\chick.gif");
   ImageIcon icon6=new ImageIcon("C:\\sist0117\\image\\gameimage\\a03.png");
   
   public SwingIconButton_02(String title)
   {
      super(title);
   
      cp=this.getContentPane();
      this.setBounds(200, 100, 400, 300);// 시작위치, 너비, 높이
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.getContentPane().setBackground(new Color(255,200,155));
   
      // 디자인 메소드 호출
      initDesign();
      this.setVisible(true);
      
   }
   // 디자인
      public void initDesign() {
         // 레이아웃 
         this.setLayout(new GridLayout(2,2)); //버튼을 2행 2열로 배치
         
         btn1=new JButton("hello",icon1);
         btn1.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가로위치
         btn1.setVerticalTextPosition(JButton.BOTTOM); // 텍스트 세로위치
         
         this.add(btn1);
         
         btn1.setRolloverIcon(icon4); // 마우스 올렸을 때 아이콘
         btn1.setPressedIcon(icon5);// 클릭시 아이콘
         
         btn2=new JButton(icon2);
         this.add(btn2);
         
         btn3=new JButton(icon3);
         this.add(btn3);
         
         btn4=new JButton("Hi",icon6);
         this.add(btn4);
      }
      
   public static void main(String[] args) {
      new SwingIconButton_02("버튼 레이아웃 연습");
   }

}