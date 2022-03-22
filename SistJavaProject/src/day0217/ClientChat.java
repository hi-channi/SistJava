package day0217;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientChat extends JFrame {
	
	JTextArea area;
	String nickName;
	JTextField tfServerIp, tfNickName, tfMessage;
	JButton btnConnect,btnSend;
	Socket socket;
	
	public ClientChat(String title){
		super(title);
		this.setBounds(800, 100, 400, 500);
		this.getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(new Color(255, 255, 155));
		
		setDesign();
		this.setVisible(true);
	}
	
	public void setDesign() {
		
		this.setLayout(null);
		
		JLabel lbl1=new JLabel("서버 IP");
		lbl1.setBounds(20, 20, 50, 30);
		
		tfNickName=new JTextField("Juliv"); // 본인 이름
		tfNickName.setBounds(70, 20, 80, 30);
		this.add(tfNickName);
		
		tfServerIp=new JTextField("192.168.0.29"); // 본인 IP
		tfServerIp.setBounds(160, 20, 100, 30);
		this.add(tfServerIp);
		
		btnConnect= new JButton("접속하기");
		btnConnect.setBounds(270, 20, 90, 30);
		this.add(btnConnect);
	
		// 접속 이벤트
		btnConnect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 서버 IP 읽어오기
				String serverIp=tfServerIp.getText().trim();
				
				// 서버 접속
				try {
					socket=new Socket(serverIp, 5001);
					
					area.append("접속 성공!\n");
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					area.append(e1.getMessage()+" : 서버주소 혹은 IP를 확인하세요.");
					e1.printStackTrace();
				} catch (IOException e1) {
					area.append(e1.getMessage()+" : 접속오류");
					e1.printStackTrace();
				}
				
				area.append("[서버에 성공적으로 접속했습니다.]\n");
			}
		});
		
		
		area=new JTextArea();
		area.setFont(new Font("",Font.BOLD,15));
		JScrollPane js=new JScrollPane(area);
		js.setBounds(20, 20, 340, 330);
		this.add(js);
		
		tfMessage=new JTextField();
		tfMessage.setBounds(20, 400, 60, 30);
		this.add(tfMessage);
		
		btnSend=new JButton("전송");
		btnSend.setBounds(290, 400, 60, 30);
		this.add(btnSend);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientChat("안뇽");
	}

}
