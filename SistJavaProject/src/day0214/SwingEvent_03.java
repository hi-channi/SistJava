package day0214;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingEvent_03 extends JFrame implements ActionListener{
	
	JButton btn1, btn2, btn3;
	
	// 이미지 경로 지정
	static final String ICON1="C:\\Users\\admin\\Desktop\\sist0117\\img\\swingimage\\img1.gif";
	static final String ICON2="C:\\Users\\admin\\Desktop\\sist0117\\img\\swingimage\\an08.gif";
	static final String ICON3="C:\\Users\\admin\\Desktop\\sist0117\\img\\swingimage\\img_msn_i10.gif";
	
	public SwingEvent_03(String title) {
		super(title);
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 200, 155));
		
		// 디자인 메소드 호출
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(null); // 레이아웃 없애기
			
		btn1=new JButton("Hello");
		btn1.setBounds(20, 30, 80, 30);
		this.add(btn1);
			
		btn2=new JButton("버튼2",new ImageIcon(ICON1));
		btn2.setBounds(20, 70, 100, 50);
		this.add(btn2);
			
		btn3=new JButton(new ImageIcon(ICON2));
		btn3.setBounds(150, 100, 150, 150);
		btn3.setPressedIcon(new ImageIcon(ICON3));
		this.add(btn3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton ob=(JButton)e.getSource();
		if(ob==btn1) {
			JOptionPane.showMessageDialog(this, "버튼1 Hello를 클릭합니다");
		} else if(ob==btn2) {
			JOptionPane.showMessageDialog(this, "버튼2 말 아이콘 클릭합니다");
		} else if(ob==btn3) {
			JOptionPane.showMessageDialog(this, "버튼3 아이콘 클릭 시 곰돌이가 됩니다.");
		}
	}
	
	public static void main(String[] args) {
		new SwingEvent_03("데이");
	}
}
