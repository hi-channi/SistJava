package day0214;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 버튼은 2개 가로로 생성
 */
public class ButtonEvent_04 extends JFrame {
	
	JButton btn1, btn2;
	
	public ButtonEvent_04(String title) {
	super(title);
	this.setBounds(200, 100, 400, 300);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.getContentPane().setBackground(new Color(255, 200, 155));
	
	// 디자인 메소드 호출
	initDesign();
	this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(new FlowLayout());
		
		btn1=new JButton("배경색 변경_초록");
		btn1.setBounds(50, 50, 100, 100);
		btn1.setBackground(Color.green);
		this.add(btn1);
		
	
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.green);
			}
		});
		
		btn2=new JButton("배경색 변경_노랑");
		btn2.setBounds(200, 50, 100, 100);
		btn2.setBackground(Color.yellow);
		this.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.yellow);
			}
		});
	}
	
	public static void main(String[] args) {
		new ButtonEvent_04("퀴즈");
	}
}
