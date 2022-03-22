package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddFrame extends JFrame {
	
	Container cp;
	JTextField tot;
	JLabel logo;
	
	public AddFrame(String title) {
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(600, 300, 300, 500);
		cp.setBackground(new Color(255, 253, 177));
		this.initDesign();
		
		// this.setVisible(true);
		
	
	}
	
	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	
	public void initDesign() {
		
		ImageIcon logo_img = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\kfc_logo.png");
		logo_img = imageSetSize(logo_img, 230, 90);
		
		this.setLayout(null);
		logo = new JLabel(logo_img, JLabel.CENTER);
		logo.setBounds(15, 30, 250, 150);
		logo.setHorizontalTextPosition(JLabel.CENTER);
		logo.setVerticalTextPosition(JLabel.BOTTOM);
		this.add(logo);
		
		
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * new AddFrame("주문확인");
	 * 
	 * }
	 */
}