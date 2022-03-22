package day0214;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TextLabel_07 extends JFrame {

	Container cp;
	
	JLabel label1,label2,label3,label4,lblResult;
	JTextField text1, text2;
	ImageIcon icon1=new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\swingimage\\an07.gif");
	ImageIcon icon2=new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\swingimage\\an08.gif");

	JButton btnResult;
	
	public TextLabel_07(String title) {
		super(title);
		cp=this.getContentPane();
		
		this.setBounds(200, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 200, 155));
		
		initDesign(); // 디자인 메소드 호출
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(null);
		
		text1=new JTextField();
		text1.setBounds(10, 20, 90, 30);
		this.add(text1);
		
		text2=new JTextField("Have a nice day!!");
		text2.setBounds(10, 60, 150, 30);
		this.add(text2);
		
		label1=new JLabel("안녕하세요",JLabel.CENTER);
		label1.setBounds(10, 100, 200, 30);
		label1.setBackground(Color.gray);
		label1.setOpaque(true); // 불투명 모드 활성화 해야 라벨 배경색 출력됨
		this.add(label1);
	
		label2=new JLabel("Today",icon1,JLabel.RIGHT);
		label2.setBounds(10, 150, 200, 30);
		// Border 인터페이스 구현한 LineBorder, TitleBorder
		label2.setBorder(new LineBorder(Color.red)); // 테두리 컬러 지정
		this.add(label2);
		
		label3=new JLabel("Swing 공부 중",icon2, JLabel.CENTER);
		label3.setBounds(10, 150, 200 ,50);
		label3.setBorder(new TitledBorder("SIST"));
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		label4=new JLabel(sdf.format(new Date()), icon2, JLabel.CENTER);
		label4.setBounds(10, 210, 200, 50);
		label4.setBorder(new LineBorder(Color.pink, 10));
		this.add(label4);
		
		lblResult=new JLabel("합격입니다.");
		lblResult.setBounds(250, 100, 200, 70);
		lblResult.setBorder(new LineBorder(Color.red, 10));
		lblResult.setBorder(new TitledBorder("결과 확인"));
		this.add(lblResult);
		
		btnResult=new JButton("확인");
		btnResult.setBounds(300, 200, 70, 30);
		this.add(btnResult);
		
		btnResult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=text1.getText();
				String s1=text2.getText();
				lblResult.setText(s);
			}
		});
		
	}

	public static void main(String[] args) {
		new TextLabel_07("텍스트 라벨 연습");

	}
}
