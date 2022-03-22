package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx_04 extends JFrame  {

	Container cp;
	JTable table;
	JLabel lblTitle, lblOut;
	
	public JTableEx_04(String title) {
		super(title);
		cp=getContentPane();
		this.setBounds(100, 100, 600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
	
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		String[][] data= {
				{"송혜교","서울","010-7777-8888"},
				{"강호동","제주","010-8888-5264"},
				{"하하","인천","010-111-2222"}
				};
		String[] title= {"이름","주소","연락처"};
		
		// 라벨 생성
		lblTitle=new JLabel("JTable 연습", JLabel.CENTER);
		lblOut=new JLabel("JTable 연습", JLabel.CENTER);
		table= new JTable(data,title);
		JScrollPane pane=new JScrollPane(table);
		
		// 테이블에 마우스 이벤트 추가
		table.addMouseListener(new TabelEvent());
		this.add("North",lblTitle);
		this.add("Center",pane);
		this.add("South",lblOut);
	}
	
	// 테이블 클릭 시 마우스 이벤트
	class TabelEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			System.out.println("테이블 클릭!");
			
			 //선택한 행번호 얻기
			int rowNum=table.getSelectedRow();
			
			//JOptionPane.showMessageDialog(JTableEx_04.this, "행번호: "+rowNum);
			
			// 출력
			String str="이름: "+table.getValueAt(rowNum, 0)
			+", 주소: "+table.getValueAt(rowNum, 1)
			+", 핸드폰: "+table.getValueAt(rowNum, 2);
			
			 lblOut.setText(str);
		}
	}

	public static void main(String[] args) {
		new JTableEx_04("JTableEx_04");

	}

}
