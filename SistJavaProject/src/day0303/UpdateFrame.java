package day0303;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdateFrame extends JFrame {

	Container cp;
	JLabel titleName, titleBan, titleJava, titleJsp, titleSpring;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnMod; // 수정버튼
	String num; // 수정할 번호

	public UpdateFrame(String title) {
		
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 200, 300);
		cp.setBackground(new Color(255, 155, 155));
		this.initDesign();

		// this.setVisible(true);
	}

	public void initDesign() {

		this.setLayout(null);
		
		// label
		titleName=new JLabel("이름");
		titleBan=new JLabel("반");
		titleJava=new JLabel("JAVA");
		titleJsp=new JLabel("JSP");
		titleSpring=new JLabel("SPRING");

		// tf
		tfName=new JTextField(4);
		tfJava=new JTextField(4);
		tfJsp=new JTextField(4);
		tfSpring=new JTextField(4);

		// cb
		String[] ban={ "A반", "B반", "C반", "D반" };
		cbBan=new JComboBox<String>(ban); // 배열로 만들어 콤보박스에 담기

		// btn
		btnMod=new JButton("수정");

		// 컴포넌트들의 위치선정
		titleName.setBounds(30, 10, 60, 30);
		this.add(titleName);
		titleBan.setBounds(30, 40, 60, 30);
		this.add(titleBan);
		titleJava.setBounds(30, 70, 60, 30);
		this.add(titleJava);
		titleJsp.setBounds(30, 100, 60, 30);
		this.add(titleJsp);
		titleSpring.setBounds(30, 130, 60, 30);
		this.add(titleSpring);
		tfName.setBounds(90, 15, 70, 20);
		this.add(tfName);
		cbBan.setBounds(90, 45, 70, 20);
		this.add(cbBan);
		tfJava.setBounds(90, 75, 70, 20);
		this.add(tfJava);
		tfJsp.setBounds(90, 105, 70, 20);
		this.add(tfJsp);
		tfSpring.setBounds(90, 135, 70, 20);
		this.add(tfSpring);
		btnMod.setBounds(70, 180, 70, 25);
		this.add(btnMod);

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * new UpdateFrame("성적수정폼");
	 * }
	 */
}