package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class RadioReview_01 extends JFrame implements ActionListener{

	Container cp;
	JTable table;
	JRadioButton rbMan, rbWoman;
	JRadioButton[] rbColor=new JRadioButton[6];
	JLabel lblResult;
	String[] strColor= {"빨강","노랑","초록","파랑","회색","핑크"};
	Color[] bgColor= {Color.red,Color.yellow,Color.green,Color.blue,Color.GRAY,Color.pink};
	
	
	public RadioReview_01(String title) {
		super(title);
		this.setBounds(100, 100, 400, 400);
		cp=getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
	
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		this.setLayout(null);
		rbMan=new JRadioButton("남자", true);
		rbMan.setBounds(20, 30, 60, 30);
		rbMan.setOpaque(false);
		this.add(rbMan);
		
		this.setLayout(null);
		rbWoman=new JRadioButton("여자");
		rbWoman.setBounds(20, 30, 60, 60);
		rbWoman.setOpaque(false);
		this.add(rbWoman);
		
		// ButtonGroup 처리를 통해 중복 선택 방지
		ButtonGroup bgGender=new ButtonGroup();
		bgGender.add(rbMan);
		bgGender.add(rbWoman);
		
		// 각각의 성별 라디오 버튼에 이벤트 추가
		rbMan.addActionListener(this);
		rbWoman.addActionListener(this);
		
		// 라벨 생성
		lblResult=new JLabel("결과 출력하는 곳",JLabel.CENTER);
		lblResult.setBounds(20, 200, 200, 50);
		lblResult.setBorder(new LineBorder(Color.pink,5));
		lblResult.setFont(new Font("",Font.BOLD,18));
		lblResult.setOpaque(true);  // 색상 변경 안될 때 확인
		this.add(lblResult);
		
		// 배경색 지정 >> 익명 내부 클래스
		ButtonGroup bg=new ButtonGroup();
		int xpos=30;
		for(int i=0;i<rbColor.length;i++) {
			rbColor[i]=new JRadioButton(strColor[i]);
			bg.add(rbColor[i]); // 버튼 그룹에 추가
			rbColor[i].setBounds(xpos, 90, 70, 30);
			rbColor[i].setOpaque(false);
			this.add(rbColor[i]);
			xpos+=50;
			
			int index=i;
			
			rbColor[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					lblResult.setBackground(bgColor[index]); 
					// i가 인식되지 않는 경우 i가 대입되는 시점에 index로 재선언(Line76)
				}
			});
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==rbMan) {
			lblResult.setText("나는 남자입니다.");
		} else if(ob==rbWoman) {
			lblResult.setText("나는 여자입니다.");
		}
		
	}
	public static void main(String[] args) {
		new RadioReview_01("RadioReview_01");
	}
}
