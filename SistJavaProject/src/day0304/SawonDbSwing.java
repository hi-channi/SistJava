package day0304;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SawonDbSwing extends JFrame implements ItemListener, ActionListener {

	DbConnect db=new DbConnect();
	
	Container cp;
	DefaultTableModel model;
	JTable table;
	JRadioButton[] rb=new JRadioButton[6];
	JButton in_btn, del_btn;
	
	
	public SawonDbSwing(String title) {
		super(title);
		cp=this.getContentPane();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(800, 100, 700, 500);
		cp.setBackground(new Color(255, 255, 155));
		
		this.initDesign();
		this.sawonTableWrite(1);
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(null);
		// 테이블
		String[] title= {"No.","ID","사원명","성별","소속","급여"};
		model=new DefaultTableModel(title, 0); // 제목만 넣고 행 갯수는 0
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 100, 670, 350);
		this.add(js);
		
		// 라디오 버튼 추가
		ButtonGroup bg=new ButtonGroup();
		// 1. 전체사원, 2.여자, 3. 남자, 4. 개발부, 5.홍보부, 6, 교육부
		String[] rb_label= {"전체","여자","남자","개발부","홍보부","교육부"};
		
		int xpos=10;
		for(int i=0;i<rb.length;i++) {
			// 라디오 버튼 생성 >> 전체를 기본 선택
			rb[i]=new JRadioButton(rb_label[i], i==0?true:false);
			rb[i].setBounds(50+xpos, 50, 90, 30);
			// 각 버튼에 대한 이벤트
			rb[i].addItemListener(this);
			bg.add(rb[i]);
			this.add(rb[i]);
			xpos+=100;
			rb[i].setOpaque(false);
		}
		
		in_btn=new JButton("추가");
		in_btn.setBounds(470, 15, 70, 30);
		del_btn=new JButton("삭제");
		del_btn.setBounds(550, 15, 70, 30);
		this.add(del_btn);
		this.add(in_btn);
		del_btn.addActionListener(this);
		in_btn.addActionListener(this);

	}
	
	// DB를 조회해 테이블에 출력
	// 1. 전체사원, 2.여자, 3. 남자, 4. 개발부, 5.홍보부, 6, 교육부
	// 순번을 부여
	public void sawonTableWrite(int select) {
		String sql="";
		switch (select) {
		case 1:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon";
			break;
		case 2:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon where gender='여자'";
			break;
		case 3:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon where gender='남자'";
			break;
		case 4:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon where buseo='개발부'";
			break;
		case 5:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon where buseo='홍보부'";
			break;
		case 6:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon where buseo='교육부'";
			break;
		default:
			sql="select ROWNUM no, num id, name, gender, buseo, to_char(pay,'L999,999,000') pay from sawon";
		}
		
		Connection conn = db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			// 기존 데이터 삭제 후 가져오기
			model.setRowCount(0);
			
			while(rs.next()) {
				// 테이블에 추가할 Vector 선언 후 데이터 추가
				Vector<String> data=new Vector<String>();
				data.add(rs.getString("no"));
				data.add(rs.getString("id"));
				data.add(rs.getString("name"));
				data.add(rs.getString("gender"));
				data.add(rs.getString("buseo"));
				data.add(rs.getString("pay"));
				
				// Vector를 데이터 행으로 추가
				model.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	// 추가 메소드
	public void sawonTableInsert() {
		
		String name=JOptionPane.showInputDialog("학생명을 입력해주세요.");
		String gender=JOptionPane.showInputDialog("성별을 입력해주세요.");
		String buseo=JOptionPane.showInputDialog("소속을 입력해주세요.");
		String pay=JOptionPane.showInputDialog("급여를 입력해주세요.");
		
		String sql="insert into sawon values(seq_sawon.nextval,?,?,?,?)";
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setString(3, buseo);
			pstmt.setString(4, pay);
			// 실행 *반드시 작성*
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	// 삭제 메소드
	public void sawonTableDelete(String num) {
		
		System.out.println("num="+num);
		String sql="delete from sawon where num="+num;

		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql);
			if(a==0) {
				JOptionPane.showMessageDialog(this,"존재하지 않는 ID 입니다.");
			} else {
				sawonTableWrite(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
			
		}
	}
	
	// 라디오 버튼 이벤트
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==rb[0]) {
			sawonTableWrite(1);
		} else if(ob==rb[1]) {
			sawonTableWrite(2);
		} else if(ob==rb[2]) {
			sawonTableWrite(3);
		} else if(ob==rb[3]) {
			sawonTableWrite(4);
		} else if(ob==rb[4]) {
			sawonTableWrite(5);
		} else if(ob==rb[5]) {
			sawonTableWrite(6);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==del_btn) {
			System.out.println("del");
			String num=JOptionPane.showInputDialog(this,"삭제할 사원의 ID를 입력하세요.");
			// 삭제 메소드 호출
			sawonTableDelete(num); // 데이타 삭제
		} else if(ob==in_btn) {
			sawonTableInsert();
			// 테이블 새로고침
			sawonTableWrite(1);
		}
	}

	public static void main(String[] args) {
		new SawonDbSwing("사원조회");
	}
}