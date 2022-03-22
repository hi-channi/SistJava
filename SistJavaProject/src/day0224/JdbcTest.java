package day0224;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	
	// Local로 오라클 연결
	static final String ORACLE_LOCAL="jdbc:oracle:thin:@localhost:1521:XE";
	// Cloud로 오라클 연결
	static final String ORACLE_CLOUD="jdbc:oracle:thin:@julivdb_high?TNS_ADMIN=C:/Users/admin/Desktop/sist0117/util/Wallet_julivDB";
	
	// sawon_oracle_sawon
	public void connectSawon() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null; // select 반드시 ResultSet 객체를 얻어야함
		
		String sql= "select * from sawon order by num";
		
		try {
			conn=DriverManager.getConnection(ORACLE_LOCAL, "JULIV", "114900");
			System.out.println("오라클 서버 접속 성공!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			// 여러 줄의 테이블을 읽어와야 하기에 while문 사용
			while(rs.next()) {
				// DB로부터 데이터 가져오기
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("서버 연결 실패: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
	}

}
