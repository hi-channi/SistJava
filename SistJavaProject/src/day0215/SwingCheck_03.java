package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class SwingCheck_03 extends JFrame implements ActionListener, ItemListener {

	Container cp;
	JCheckBox cbDriver, cbBold; // 운전면허 소지여부
	JCheckBox[] cbCity=new JCheckBox[4];
	JButton btnOk;
	JLabel lblLabel;
	
	public SwingCheck_03(String title) {
		super(title);
		cp=getContentPane();
		this.setBounds(100, 100, 600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
	
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		this.setLayout(null);
		
		cbDriver=new JCheckBox("운전면허");
		cbDriver.setBounds(20, 20, 100, 100);
		cbDriver.setOpaque(false);
		this.add(cbDriver);
		cbDriver.addItemListener(this);
		
		// 라벨 굵게
		cbBold=new JCheckBox("라벨을 굵게");
		cbBold.setBounds(20, 100, 250, 30);
		cbBold.setOpaque(false);
		this.add(cbBold);
		cbBold.addItemListener(this);
		
		// 결과 라벨
		lblLabel=new JLabel("결과 출력",JLabel.CENTER);
		lblLabel.setBounds(20, 250, 350, 50);
		lblLabel.setBorder(new LineBorder(Color.pink,5));
		this.add(lblLabel);
		
		// 체크박스
		String[] city= {"프라하","도쿄","빈","시드니"};
		int xpos=20;
		for(int i=0;i<cbCity.length;i++) {
			cbCity[i]=new JCheckBox(city[i]);
			cbCity[i].setBounds(xpos, 150, 80, 30);
			cbCity[i].setOpaque(false);
			xpos+=100;
			this.add(cbCity[i]);		
		}
		btnOk=new JButton("확인");
		btnOk.setBounds(60, 200, 200, 30);
		this.add(btnOk);
		btnOk.addActionListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob=e.getSource();
		if(ob==cbDriver) {
			String s="체크 상태: "+cbDriver.isSelected()+", 텍스트: "+cbDriver.getActionCommand();
			lblLabel.setText(s);
		} else if(ob==cbBold) {
			if(cbBold.isSelected()) {
				lblLabel.setFont(new Font("",Font.BOLD,20));
			} else {
				lblLabel.setFont(new Font("",Font.PLAIN,10));
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int select=0;
		String s="내가 가고싶은 도시는? ";
		for(int i=0;i<cbCity.length;i++) {
			if(cbCity[i].isSelected()) {
				select++;
				s+="["+cbCity[i].getText()+"]";
				
			}
		}
		if(select==0) {
			s="저는 가고싶은 도시가 없네요 ㅠ";
		} else {
			s+=" 를 가고 싶어요!";
		}
		lblLabel.setText(s);
	}
	public static void main(String[] args) {
		new SwingCheck_03("03");
	}
}
