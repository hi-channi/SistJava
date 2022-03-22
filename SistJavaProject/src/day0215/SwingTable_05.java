package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class SwingTable_05 extends JFrame  {

	Container cp;
	JTable tb1, tb2, tb3;
	JLabel lblTitle, lblOut;
	JTextArea area;
	
	public SwingTable_05(String title) {
		super(title);
		this.setBounds(100, 100, 600, 600);
		cp=getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
	
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		
		this.setLayout(new GridLayout(2, 2));
		
		tb1=new JTable(5,4); // 빈 테이블
		this.add(tb1);
		
		String[] title1= {"이름","학과","주소"};
		String[][] data1= {
				{"조아라","산업디자인","서울시 은평구"},
				{"김은지","유아교육","안양시 만안구"},
				{"신지환","경영정보","서울시 노원구"}
				};
		
		tb2=new JTable(data1, title1);
		this.add(new JScrollPane(tb2)); //JScrollPane에 넣어 추가해야 제목과 스크롤바가 나타남
		
		DefaultTableModel model=new DefaultTableModel(data1, title1);
		tb3=new JTable(model);
		this.add(new JScrollPane(tb3));
		
		// tb3은 model을 이용했기 때문에 추가가 가능함
		String[] addData1= {"유태호","컴퓨터공학","미국"};
		model.addRow(addData1);
		
		// 백터로 생성 후 tb3에 추가
		Vector<String> addData2=new Vector<String>();
		addData2.add("유재석");
		addData2.add("미디어영상");
		addData2.add("주소미정");
		
		model.addRow(addData2);
		
		// 4구역에 TextArea출력
		area=new JTextArea();
		this.add(new JScrollPane(area));
		
		// JTable Model 메소드 확인
		// 행 개수
		int rowCount=tb3.getRowCount();
		int rowCount2=model.getRowCount();
		area.append("tb3의 행 개수: "+rowCount+"\n");
		area.append("tb3의 행 개수: "+rowCount2+"\n");
		
		// 열 개수
		int columnCount=tb3.getColumnCount();
		area.append("tb3의 열 개수: "+columnCount+"\n");
		
		// 행, 열에 관한 값
		area.append("1행 1열의 값; "+tb3.getValueAt(1, 1)); // 해당 위치의 테이블 값을 출력
		area.append("3행 2열의 값: "+model.getValueAt(3, 2)+"\n");
		area.append("3행 2열의 값: "+tb3.getValueAt(3, 2)+"\n");
		
		//tb3에 마우스 클릭 이벤트를 추가해 area에 출력
		tb3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
			
				// 클릭한 행 번호 얻기
				// 클릭한 열 번호 얻기
				int rowNum=tb3.getSelectedRow();
				int columnNum=tb3.getSelectedColumn();
				
				String msg=(rowNum+1)+"행 "+(columnNum+1)+"열의 값: ";
				area.append(msg+tb3.getValueAt(rowNum, columnNum)+"\n");
				}
		}); 
}
	
	public static void main(String[] args) {
		new SwingTable_05("SwingTable_05");

	}

}