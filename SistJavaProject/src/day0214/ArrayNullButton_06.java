package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ArrayNullButton_06 extends JFrame {

	Container cp;
	JButton[] btn=new JButton[6];
	Color[] btnColors= {Color.pink,Color.gray,Color.cyan,Color.yellow,Color.green,Color.orange};
	String[] text= {"핑크","그레이","블루","옐로우","그린","오렌지"};
	
	public ArrayNullButton_06(String title) {
		super(title);
		cp=getContentPane();
		this.setBounds(200, 100, 500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 200, 155));
	
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 레이아웃 삭제
		this.setLayout(null);
		
		// 시작위치 지정
		int top=20;
		// 	각각의 버튼 생성
		for(int i=0;i<btn.length;i++) { 
			btn[i]=new JButton(text[i]); // 버튼 6개 생성
			btn[i].setBounds(20, top, 90, 30); // 위치, 크키 지정
			top+=40; // 버튼 하나가 추가될 때마다 40씩 증가
			btn[i].setBackground(btnColors[i]); // 버튼 배경색 설정
			this.add(btn[i]);
			btn[i].addActionListener(new MyButton());
		}
	}
	
	class MyButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object ob=e.getSource();
			for(int i=0;i<btn.length;i++) {
				if(ob==btn[i]) {
					cp.setBackground(btnColors[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ArrayNullButton_06("Default");
	}
}
