package day0211;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingButtonQuiz_09 extends JFrame implements ActionListener {

	Container cp;
	JButton btn1, btn2;
	
	public SwingButtonQuiz_09(String title) {
		super(title);
		cp=this.getContentPane();
		
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255,200,155));
		
		// 디자인 메소드 호출
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(new FlowLayout());
		
		btn1=new JButton("◀");
		btn2=new JButton("▶");
		
		this.add(btn1);
		this.add(btn2);
		
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.red);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==btn1) {
			JOptionPane.showMessageDialog(this, "뒤로");
		} else {
			JOptionPane.showMessageDialog(this, "앞으로");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingButtonQuiz_09("퀴즈9");
	}

}
