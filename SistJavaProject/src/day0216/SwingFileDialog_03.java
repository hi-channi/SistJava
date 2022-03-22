package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class SwingFileDialog_03 extends JFrame {

	Container cp;
	JButton btnOpen, btnSave;
	JTextArea area;
	
	public SwingFileDialog_03(String title) {
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
		
		btnOpen=new JButton("파일 불러오기");
		btnOpen.setBounds(40, 20, 120, 30);
		this.add(btnOpen);
		
		// 불러오기 버튼 이벤트 
		btnOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog flog=new FileDialog(SwingFileDialog_03.this, "파일열기", FileDialog.LOAD);
				flog.setVisible(true);
				
				// 선택한 디렉토리
				String dic=flog.getDirectory();
				String file=flog.getFile();
				System.out.println(dic+file);
				
				// 취소 누르면 종료
				if(dic==null) {
					return;
				}
				FileReader fr=null;
				BufferedReader br=null;
				
				try {
					fr=new FileReader(dic+file);
					br=new BufferedReader(fr);
					
					area.setText("");
					
					while(true) {
						String s=br.readLine();
						if(s==null) {
							break;
						}
						area.append(s+"\n");
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e2) {
					// TODO: handle exception
				} finally {
						try {
							if(br!=null)br.close();
							if(br!=null)fr.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}
			}
		});
		
		btnSave=new JButton("파일 저장하기");
		btnSave.setBounds(240, 20, 120, 30);
		this.add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog flog=new FileDialog(SwingFileDialog_03.this, "파일열기", FileDialog.SAVE);
				flog.setVisible(true);
				
				String dic=flog.getDirectory();
				String file=flog.getFile();
				System.out.println(dic+file);
				
				if(dic==null) {
					return;
				}
				
				FileWriter fw=null;
				
				try {
					fw=new FileWriter(dic+file);
					
					// area의 내용을 가지고 와서 파일에 저
					fw.write(area.getText()+"\n");
					area.setText(file+"파일로 저장됨!");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		// area
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		String day=sdf.format(new Date());
		area=new JTextArea(day);
		area.setFont(new Font("맑은 고딕",Font.BOLD,15));
		
		JScrollPane js=new JScrollPane(area);
		js.setBounds(20, 70, 350, 250);
		this.add(js);
		
	}
	
	public static void main(String[] args) {
		new SwingFileDialog_03("SwingFileDialog_03");
	}
}
