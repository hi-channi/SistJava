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


public class SwingButtonEx_08 extends JFrame implements ActionListener{
	
	Container cp;
	JButton btn1, btn2, btn3;
	
	public SwingButtonEx_08(String title) {
		super(title); 
		cp=this.getContentPane();
		
		this.setBounds(200,100,400,500); // 시작너비, 시작높이, 너비, 높이
		cp.setBackground(new Color(255,255,200));
		
		// 디자인 메소드 호출
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 버튼은 레이아웃 생략 시 BorderLayout
		// 레이아웃 생성
		this.setLayout(new FlowLayout()); //FlowLayout: 옆으로 나열
		
		// 버튼 생성
		btn1=new JButton("버튼1");
		btn2=new JButton("버튼2");
		btn3=new JButton("버튼3");
		
		// 프레임에 추가
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		// 버튼 속성
		btn1.setBackground(Color.pink);
		btn2.setBackground(Color.blue);
		btn3.setBackground(Color.yellow);
		
		// Event 발생 >> Event 핸들러 메소드와 Event 발생 객체를 연결해야함.
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	// Action 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생할 컴포넌트를 object로부터 얻어옴
		Object ob=e.getSource(); // 버튼 3개 
		
		//JOptionPane.showMessageDialog(this, "버튼 클릭!");  // 어떤 버튼을 해도 동일한 메시지가 출력됨
		// 따라서 메시지를 출력할 버튼을 명확하게 지정하려면?
		if(ob==btn1) {
			JOptionPane.showMessageDialog(this, "1번째 버튼 작동");
		} else if (ob==btn2) {
			JOptionPane.showMessageDialog(this, "2번째 버튼 작동!"); //.showConfirmDialog: 예, 아니오를 묻는 창 출력
		} else {
			JOptionPane.showMessageDialog(this, "폭파!");
		}
	}

	public static void main(String[] args) {
		new SwingButtonEx_08("레이아웃 연습");
	}
}
