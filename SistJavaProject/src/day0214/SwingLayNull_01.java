package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingLayNull_01 extends JFrame {

	Container cp;
	JButton btn1, btn2;
	
	public SwingLayNull_01(String title) {
		super(title);
		cp=this.getContentPane();
		
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 200, 155));
		
		initDesign(); // 디자인 메소드 호출
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 레이아웃 직접 배치 할 경우
		this.setLayout(null);
		
		btn1=new JButton("◀");
		btn2=new JButton("▶");
		// 프레임에 버튼 추가
		this.add(btn1);
		this.add(btn2);
		
		// 버튼 위치 및 크기 사용자 지정
		btn1.setBounds(50, 100, 80, 30);
		btn2.setBounds(150, 100, 80, 30);
		
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.red);
		
		// 익명 내부클래스 이벤트
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(cp, "완쪽으로 이동");
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(cp, "오른쪽으로 이동");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingLayNull_01("레이아웃 설정 연습");
	}

}