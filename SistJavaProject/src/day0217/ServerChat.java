package day0217;



import java.awt.Font;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerChat extends JFrame implements Runnable{
	
	JTextArea area;
	ServerSocket serverSocket;
	
	public ServerChat(){
		super("서버 로그");
		this.setBounds(100, 100, 400, 200);
		this.getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		setDesign();
		
	}
	
	// run1
	@Override
	public void run() {
		try {
			serverSocket=new ServerSocket(5001); // 5000~
			area.append("[sysmsg]소켓 생성 성공\n");
		} catch (IOException e) {
			// TODO: handle exception
			area.append("[sysmsg]소켓 생성 실패: "+e.getMessage()+"\n");
		}
		
		// 접속을 시도하는 클라이언트 허용 대기 상태 >> 쓰레드 내부에서 계속 동작해야 누가 접속해도 허용 가능
		// 쓰레드 2개 (접속 허용, 클라이언트 대화용)
		while(true) {
			try {

				Socket socket=serverSocket.accept();
				area.append("Success! 접속 IP: "+socket.getInetAddress().getHostAddress()+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				area.append("클라이언트 접속 실패: "+e.getMessage());
			}
		}
	}
	public void setDesign() {
		area=new JTextArea();
		area.setFont(new Font("",Font.BOLD, 16));
		this.add(new JScrollPane(area));
	}
	public static void main(String[] args) {
		ServerChat ex=new ServerChat();
		Thread th=new Thread(ex);
		th.start();
	}
}
