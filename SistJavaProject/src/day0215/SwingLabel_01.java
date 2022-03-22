package day0215;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLabel_01 extends JFrame implements ActionListener {

	Container cp;
	JLabel[] lblLabel=new JLabel[9];
	String[] str= {"미국","영국","러시아","일본","중국","프랑스","캐나다","대한민국","독일"};
	JButton btnOk;
	
	public SwingLabel_01(String title) {
		super(title);
		cp=getContentPane();
		this.setBounds(100, 100, 600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
	
		setDesign();
		this.setVisible(true);
	}
	
	public void setDesign() {
		Panel pCenter=new Panel(new GridLayout(3, 3));
		this.add(pCenter,BorderLayout.CENTER);
		for(int i=0;i<lblLabel.length;i++) {
			lblLabel[i]=new JLabel(str[i],JLabel.CENTER);
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
		
			lblLabel[i].setBackground(new Color(r,g,b));
			lblLabel[i].setFont(new Font("궁서체",Font.BOLD,17));
			lblLabel[i].setOpaque(true);
			lblLabel[i].setBounds(0, 0, 200, 200);
			pCenter.add(lblLabel[i]);
		}
		// 버튼 생성
		btnOk=new JButton("라벨 색상 변경");
		this.add(btnOk,BorderLayout.SOUTH);
		// 이벤트 발생 버튼
		btnOk.addActionListener(this);
	}
	
	// 발생 이벤트 설정
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<lblLabel.length;i++) {
		int r=(int)(Math.random()*256);
		int g=(int)(Math.random()*256);
		int b=(int)(Math.random()*256);
		lblLabel[i].setBackground(new Color(r,g,b));
		}
	}

	public static void main(String[] args) {
		new SwingLabel_01("스윙");
		
	}

}
