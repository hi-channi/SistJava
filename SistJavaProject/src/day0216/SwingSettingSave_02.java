package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class SwingSettingSave_02 extends JFrame {

	Container cp;
	int fsize; 
	boolean italic, bold, plain;
	static final String FILENAME="/Users/JULIV/Desktop/sist0117/setting.txt";
	JCheckBox cbItalic, cbBold;
	JRadioButton[] rbFont=new JRadioButton[4];
	JLabel lblResult;

	public SwingSettingSave_02(String title) {
		super(title);
		this.setBounds(100, 100, 400, 400);
		cp=getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 255, 155));
		readSetting();
		// setting값을 파일에서 로드해 디자인에 반영하는 과정 호출
		
		// 종료 이벤트 
		
		setDesign();
		
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				
				saveSetting();
				JOptionPane.showMessageDialog(SwingSettingSave_02.this,"setting값 저장");
				
				System.exit(0);
			}
		});
		this.setVisible(true);
	}
	
	// 생성 시 setting값 불러오는 메소드
	public void readSetting() {
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			fsize=Integer.parseInt(br.readLine());
			italic=Boolean.parseBoolean(br.readLine());
			bold=Boolean.parseBoolean(br.readLine());
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			// 기본값 지정
			fsize=15;
			bold=false;
			italic=false;
			
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			System.out.println("확인: "+fsize+" / Italic: "+italic+" / Bold: "+bold);
			try {
				if(br!=null)br.close();
	            if(fr!=null)fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 종료 시 setting값 저장하는 메소드
	public void saveSetting() {
		// fsize, italic, bold 순으로 더달
	
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			
			fw.write(fsize+"\n");
			fw.write(italic+"\n");
			fw.write(bold+"\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
	        	fw.close();
	        } catch (IOException e) {
	        	// TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	}
	
	public void setDesign() {
		this.setLayout(null);
		lblResult=new JLabel("파일 입출력 저장 확인", JLabel.CENTER);
		lblResult.setBorder(new LineBorder(Color.green,5));
		lblResult.setBounds(20, 100, 350, 80);
		this.add(lblResult);
		
		int dftFontsize=10; // 폰트 사이즈 기본값 
		int xpos=30;
		ButtonGroup bg=new ButtonGroup();
		
		for(int i=0;i<rbFont.length;i++) {
			rbFont[i]=new JRadioButton(String.valueOf(dftFontsize));
			dftFontsize+=5; // 10, 15, 20, 25
			bg.add(rbFont[i]);
			rbFont[i].setBounds(xpos, 50, 30, 30);
			rbFont[i].setOpaque(false);
			this.add(rbFont[i]);
			xpos+=50;
			
			int index=i; // 대입 후 익명 클래스에서 i대신 index로 사용
			
			// 익명 내부 클래스 
			rbFont[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					fsize=Integer.parseInt(rbFont[index].getText());
					changeFont();
				}
			});
		}
		
		// 체크박스 만들기 
		// 기울이기 생성 및 위치지정
		cbItalic=new JCheckBox("기울이기",italic);
		cbItalic.setBounds(60, 180, 80, 30);
		this.add(cbItalic);
		
		cbItalic.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 방법 1
				italic=cbItalic.isSelected(); // 선택 시 true
				
				// 방법 2
				//JCheckBox ob=(JCheckBox)e.getSource();
				//italic=ob.isSelected();
				//changeFont();
			}
		});
		
		cbBold=new JCheckBox("굵게",bold);
		cbBold.setBounds(180, 180, 80, 30);
		this.add(cbBold);
		cbBold.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 방법 1
				bold=cbBold.isSelected(); // 선택 시 true
				
				// 방법 2
				//JCheckBox ob=(JCheckBox)e.getSource();
				//bold=ob.isSelected();
				//changeFont();
			}
		});
	}

	// 메소드 
	public void changeFont() {
		if(italic && bold) {
			lblResult.setFont(new Font("나눔고딕",Font.BOLD|Font.ITALIC,15));
		} else if(italic && !bold) {
			lblResult.setFont(new Font("나눔고딕",Font.ITALIC,15));
		} else if(!italic && bold) {
			lblResult.setFont(new Font("나눔고딕",Font.BOLD,15));
		} else {
			lblResult.setFont(new Font("나눔고딕",Font.PLAIN,15));
		}
	}

	public static void main(String[] args) {
		new SwingSettingSave_02("SwingSettingSave_02");
	}

}
