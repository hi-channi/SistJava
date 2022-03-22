package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ComboEx_04 extends JFrame implements ActionListener,ItemListener {

	Container cp;
	JComboBox<String> combo;
	String[] names= {"조정언","류슬영","이다솔","김주찬"};
	JTextField tfName;
	JButton btnAdd, btnDel;
	JLabel lblResult;
	
	int idx=-1; // 멤버 변수는 0으로 자동 초기화가 되는데, 그 과정에서 0번의 삭제를 방지하기 위함
	
	public ComboEx_04(String title){
		super(title);
		this.setBounds(100, 100, 400, 200);
		cp=getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
		
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		this.setLayout(null);
		
		combo=new JComboBox<String>(names); // 괄호 안에는 ComboBox에 담을 내용을 변수로 추가
		combo.setBounds(30, 30, 100, 30);
		this.add(combo);
		
		tfName=new JTextField();
		tfName.setBounds(30, 60, 100, 30);
		this.add(tfName);
		
		btnAdd=new JButton("추가하기");
		btnAdd.setBounds(200, 30, 80, 30);
		this.add(btnAdd);
		
		btnDel=new JButton("삭제하기");
		btnDel.setBounds(280, 30, 80, 30);
		this.add(btnDel);
		
		lblResult=new JLabel("콤보박스 편집기");
		lblResult.setBounds(20, 100, 350, 50);
		lblResult.setBorder(new LineBorder(Color.pink,4));
		lblResult.setOpaque(false);
		this.add(lblResult);
	
		// 액션 추가 
		combo.addItemListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
	
		if(ob==btnAdd) {
			String text=tfName.getText().trim(); //trim()으로 필드 내 공백제거 
			if(text.length()==0) {
				JOptionPane.showMessageDialog(this, "이름을 입력후 추가하세요");
			} else {
				combo.addItem(text); 
				JOptionPane.showMessageDialog(this, "추가되었습니다.");
				tfName.setText(""); // 추가한 뒤 필드를 비워줌 
			}
		} else if(ob==btnDel) {
			if(idx==-1) {
				JOptionPane.showMessageDialog(this, "먼저 삭제할 항목을 선하세요");
			} else {
			combo.removeItemAt(idx);
			lblResult.setText("삭제 성공!");
			}
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		idx=combo.getSelectedIndex();
		String item=(String)combo.getSelectedItem();
		lblResult.setText(">>"+idx+"번 인덱스 "+item+" 선택됨.<<");
	}
	
	public static void main(String[] args) {
		new ComboEx_04("combo");
	}
}
