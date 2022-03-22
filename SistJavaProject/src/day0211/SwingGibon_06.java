package day0211;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;


public class SwingGibon_06 extends JFrame{
	
	Container cp;
	
	public SwingGibon_06(String title) {
		super(title); // JFrame 부모 생성자를 통해서 창 제목을 보냄
		cp=this.getContentPane();
		
		// 메인 프로그램이 종료될 때 프로그램도 종료됨
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 내부 클래스 호출
		//this.addWindowListener(new Winclose());
		
		this.setBounds(200,100,300,300); // 시작위치, 너비, 높이
		//cp.setBackground(new Color(255,255,200));
		cp.setBackground(Color.MAGENTA);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingGibon_06("레이아웃 연습");
	}
}
