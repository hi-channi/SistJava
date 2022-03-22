package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingRadioCheckQuiz extends JFrame implements ActionListener, ItemListener {

	Container cp;
	JRadioButton[] rb=new JRadioButton[4];
	JCheckBox[] cb=new JCheckBox[4];
	JLabel lblmsg;
	
	public SwingRadioCheckQuiz(String title) {
		super(title);
		cp=getContentPane();
		this.setBounds(100, 100, 600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
	
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		// 상단 패널에 Border로 감싼 4개의 라디오 버튼 생성 
		String [] str= {"인문계열","사회계열","자연계열","공학계열"};
		JPanel pTop=new JPanel(); // Flow
		pTop.setBorder(new TitledBorder("전공 구분"));
		this.add("North",pTop);
		
		ButtonGroup bg=new ButtonGroup();
		
		for(int i=0;i<rb.length;i++) {
			rb[i]=new JRadioButton(str[i], i==1?true:false); // radioButton 레이블의 초기값
			// Top Panel >> radioButton (그룹화 및 단일 선택)
			pTop.add(rb[i]);
			bg.add(rb[i]); // ButtonGroup에 추가 >> 하지 않을 경우 radioButton이 중복 선택 됨
			rb[i].addItemListener(this);; // 액션 추가
		}
		// Center >> lblmsg
		ImageIcon icon1=new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\gameimage\\dd.png");
		
		lblmsg=new JLabel("자기 소개를 해주세요.",icon1,JLabel.CENTER);
		lblmsg.setFont(new Font("나눔고딕",Font.ITALIC,20));
		lblmsg.setHorizontalTextPosition(JLabel.LEFT);
		lblmsg.setBorder(new LineBorder(Color.red, 2));
		this.add(lblmsg);
		
		// Bottom >> CheckBox (다중 선택 가능)
		String[] str2= {"노래","축구","독서","요리"};
		JPanel pBottom=new JPanel();
		pBottom.setBorder(new TitledBorder("취미 선택"));
		this.add(pBottom,"South");
		for(int i=0;i<cb.length;i++) {
			cb[i]=new JCheckBox(str2[i]);
			pBottom.add(cb[i]);
			cb[i].addActionListener(this); // 액션 추가
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob=e.getSource();
		String msgMajor="내 전공은 ";
		for(int i=0;i<rb.length;i++) {
			if(ob==rb[i]) {
				msgMajor+=rb[i].getText()+"입니다.";
				lblmsg.setFont(new Font("나눔고딕",Font.BOLD,20));
			}
		}
		lblmsg.setText(msgMajor);
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		String msgHobby="내 취미는 ";
		int select=0;
		for(int i=0;i<cb.length;i++) {
			if(cb[i].isSelected()) {
				select++;
				msgHobby+=cb[i].getText()+" ";
				lblmsg.setFont(new Font("나눔고딕",Font.BOLD,20));
			}
		} 
		if (select==0) {
			msgHobby="저는 취미가 없어요.";
		} else {
			msgHobby+="입니다.";
		}
		lblmsg.setText(msgHobby);
	}
	public static void main(String[] args) {
		new SwingRadioCheckQuiz("스윙 퀴즈");
	}
}
