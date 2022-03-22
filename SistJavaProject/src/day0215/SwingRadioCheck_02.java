package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class SwingRadioCheck_02 extends JFrame implements ActionListener {

	Container cp;
	JRadioButton[]	rb=new JRadioButton[4];
	JCheckBox[] cb=new JCheckBox[4];
	JLabel lblmsg;
	Color[] color= {Color.red,Color.yellow,Color.blue,Color.gray};
	
	
	public SwingRadioCheck_02(String title) {
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
		String [] str= {"빨강","노랑","파랑","회색"};
		JPanel pTop=new JPanel(); // Flow
		pTop.setBorder(new TitledBorder("글자색"));
		this.add("North",pTop);
		
		ButtonGroup bg=new ButtonGroup();
		
		for(int i=0;i<rb.length;i++) {
			rb[i]=new JRadioButton(str[i], i==1?true:false); // radioButton 레이블의 초기값
			// Top Panel >> radioButton (그룹화 및 단일 선택)
			pTop.add(rb[i]);
			bg.add(rb[i]); // ButtonGroup에 추가 >> 하지 않을 경우 radioButton이 중복 선택 됨
			rb[i].addActionListener(this); // 액션 추가
			
		}
		// Center >> lblmsg
		ImageIcon icon1=new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\jquery_img\\play.png");
		lblmsg=new JLabel("Have a nice day!",icon1,JLabel.CENTER);
		lblmsg.setHorizontalTextPosition(JLabel.LEFT);
		lblmsg.setBorder(new LineBorder(Color.red, 2));
		this.add(lblmsg);
		// Bottom >> CheckBox (다중 선택 가능)
		String[] str2= {"자바","오라클","스프링","자바스크립트"};
		JPanel pBottom=new JPanel();
		pBottom.setBorder(new TitledBorder("가능한 컴퓨터 언어는?"));
		this.add(pBottom,"South");
		for(int i=0;i<cb.length;i++) {
			cb[i]=new JCheckBox(str2[i]);
			pBottom.add(cb[i]);
			cb[i].addActionListener(this); // 액션 추가
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 Object ob=e.getSource();
		for(int i=0;i<rb.length;i++) {
			if(ob==rb[i]) {
				lblmsg.setForeground(color[i]);
				lblmsg.setFont(new Font("",Font.BOLD,20));
			}
		}
		String msg="사용 가능한 언어는?";
		for(int i=0;i<cb.length;i++) {
			if(cb[i].isSelected()==true) {
				msg+=cb[i].getText()+" ";
			}
		}
		lblmsg.setText(msg);
	}
	public static void main(String[] args) {
		new SwingRadioCheck_02("스윙 라디오 체크 연습");

	}

}
