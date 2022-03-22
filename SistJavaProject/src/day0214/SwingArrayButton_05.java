package day0214;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingArrayButton_05 extends JFrame implements ActionListener{
	
	JButton[] btn=new JButton[6];
	String[] btnLabel= {"Red","Cyan","Magenta","Yellow","Gray","Blue"};
	Color[] btnColor= {Color.red,Color.cyan,Color.magenta,Color.yellow,Color.gray,Color.blue};
	
	public SwingArrayButton_05(String title) {
		super(title);
		this.setBounds(200, 100, 500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 200, 155));
	
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 패널 생성 >> 기본이 FlowLayout
		//JPanel panel=new JPanel();
		JPanel panel=new JPanel(new GridLayout(1,6));
		panel.setBackground(Color.orange);		
		this.add(panel,BorderLayout.NORTH); // 프레임 상단에 패널배치
		
		//버튼 생성
		for(int i=0;i<btn.length;i++) {
			// 6개의 버튼을 생성
			btn[i]=new JButton(btnLabel[i]);
			// 6개의 버튼을 라벨에 맞게 색상 변경
			btn[i].setBackground(btnColor[i]);
			// 6개의 버튼을 패널에 추가
			panel.add(btn[i]);
			// 6개의 버튼에 이벤트 추가
			btn[i].addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		for(int i=0;i<btn.length;i++) {
			if(ob==btn[i]) {
				// 프레임의 배경색 변경
				getContentPane().setBackground(btnColor[i]);
				// 색상에 따라 창 제목을 변경 >> Color: 색상
				this.setTitle("Color: "+btnLabel[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new SwingArrayButton_05("패널 테스트");
	}
}
