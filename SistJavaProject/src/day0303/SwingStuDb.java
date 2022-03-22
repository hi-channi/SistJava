package day0303;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SwingStuDb extends JFrame implements ActionListener {

	DbConnect db=new DbConnect();
	Container cp;
	DefaultTableModel model;
	JTable table;
	JButton btnAdd, btnDel, btnUpdate; // 추가, 삭제, 수정버튼

	// addFrame
	AddFrame addFrame=new AddFrame("성적 추가");
	// updateFrame
	UpdateFrame uFrame=new UpdateFrame("성적 수정");

	public SwingStuDb(String title) {
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 400, 300);
		cp.setBackground(new Color(255, 255, 200));
		this.initDesign();
		this.setVisible(true);
	}

	// 디자인
	public void initDesign() {

		String[] title={ "번호", "이름", "반", "Java", "Jsp", "Spring", "총점", "평균" };
		model=new DefaultTableModel(title, 0);
		table=new JTable(model);
		this.add("Center", new JScrollPane(table));

		// 테이블에 DB 데이터 출력
		tableWrite();
		JPanel pTop=new JPanel();
		this.add("North", pTop);
		btnAdd=new JButton("추가");
		btnAdd.addActionListener(this);
		pTop.add(btnAdd);
		btnDel=new JButton("삭제");
		btnDel.addActionListener(this);
		pTop.add(btnDel);
		btnUpdate=new JButton("수정");
		btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);

		// 새로 생성된 추가 프레임 버튼
		addFrame.btnAdd.addActionListener(this);

		// 실제 수정 이벤트 버튼
		uFrame.btnMod.addActionListener(this);
	}

	// 추가 메소드 insert >> addFrame.btnAdd를 클릭할 경우
	public void insertData() {
		String name=addFrame.tfName.getText();
		String java=addFrame.tfJava.getText();
		String jsp=addFrame.tfJsp.getText();
		String spring=addFrame.tfSpring.getText();
		String ban=(String) addFrame.cbBan.getSelectedItem();
		
		int tot=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		double avg=tot/3.0;
		
		String sql="insert into studentinfo values(seq_test.nextval,?,?,?,?,?,?,?)";
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			// 7개 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, ban);
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	// 수정 메소드 update
	public void updateData() {
		String num=uFrame.num;
		String name=addFrame.tfName.getText();
		String java=addFrame.tfJava.getText();
		String jsp=addFrame.tfJsp.getText();
		String spring=addFrame.tfSpring.getText();
		String ban=(String) addFrame.cbBan.getSelectedItem();
		
		int tot=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		double avg=tot/3.0;
		
		String sql="update studentinfo set name=?,java=?,jsp=?,spring=?,ban=?,total=?,average=? where num=?";
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			// 8개 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setString(5, ban);
			pstmt.setInt(6, tot);
			pstmt.setDouble(7, avg);
			pstmt.setString(8, num);
			// 실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	// 삭제 메소드
	public void deleteData(String num) {
		System.out.println("num="+num);
		
		String sql="delete from studentinfo where num="+num;
		// sql문 실행 후 해당번호가 없으면 메시지, 삭제되면 새로고침
		// 새로고침의 의미는 tableWrite()호출
		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql);
			if(a==0) {
				JOptionPane.showMessageDialog(this,"없는 데이타 번호 입니다");
			} else {
				tableWrite();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	// 테이블에 출력하는 메소드
	public void tableWrite() {

		// 테이블 초기화
		model.setRowCount(0);
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		// 시퀀스 오름차순
		String sql="select * from studentinfo order by num asc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector<String> data=new Vector<String>();
				data.add(rs.getString("num"));
				data.add(rs.getString("name"));
				data.add(rs.getString("ban"));
				data.add(rs.getString("java"));
				data.add(rs.getString("jsp"));
				data.add(rs.getString("spring"));
				data.add(rs.getString("total"));
				data.add(rs.getString("average"));
				// 테이블에 추가
				model.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	// 버튼3개 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource();
		if(ob==btnAdd) { // 추가 프레임 노출
			System.out.println("add");
			addFrame.setVisible(true);
		} else if(ob==btnDel) {
			System.out.println("del");
			String num=JOptionPane.showInputDialog("삭제할 데이터 번호를 입력하세요.");
			// 삭제 메소드 호출
			deleteData(num);// 데이타 삭제
		} else if(ob==btnUpdate) {
			System.out.println("update");
			//uFrame.setVisible(true);
			String num=JOptionPane.showInputDialog("수정할 데이터의 번호를 입력하세요.");
			String sql="select * from studentinfo where num="+num;
			Connection conn=db.getOracle();
			Statement stmt=null;
			ResultSet rs=null;
			try {
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				// 가져올 데이터가 여러 개(모든 데이터를 나타낼 때) while, 하나일땐 if
				if(rs.next()) {
					// 수정창에 해당 데이터 값을 가지고 옴
					uFrame.num=num; // hidden으로 num값 넘김 >> form에는 노출되지 않음.
 					uFrame.tfName.setText(rs.getString("name"));
					uFrame.tfJava.setText(rs.getString("java"));
					uFrame.tfJsp.setText(rs.getString("jsp"));
					uFrame.tfSpring.setText(rs.getString("spring"));
					uFrame.cbBan.setSelectedItem(rs.getString("ban"));
					uFrame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "해당 번호는 없는 번호입니다");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				db.dbClose(rs, stmt, conn);
			}
		} else if (ob==addFrame.btnAdd) {// 실제 insert
			//System.out.println("추가프레임 액션테스트");
			// 입력 데이터 읽어와서 db추가
			insertData();
			// 테이블을 다시출력
			tableWrite();
			// 초기화
			addFrame.tfName.setText("");
			addFrame.tfJava.setText("");
			addFrame.tfJsp.setText("");
			addFrame.tfSpring.setText("");
			addFrame.cbBan.setSelectedIndex(0); // 체크박스를 A반으로 초기화
			//addFrame.tfName.requestFocus(); // 커서의 위치 초기화
			// 추가프레임 사라지게
			addFrame.setVisible(false);
		} else if(ob==uFrame.btnMod) {
			updateData();
			tableWrite();
			uFrame.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new SwingStuDb("성적관리DB");
	}
}