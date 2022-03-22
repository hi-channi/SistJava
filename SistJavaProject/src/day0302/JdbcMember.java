package day0302;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcMember {
	
	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	private String sno;
	
	public void insertMember() {
		System.out.println("** 사원 정보 입력 **");
		System.out.println("사원명");
		String name = sc.nextLine();
		System.out.println("부서명");
		String buseo = sc.nextLine();
		System.out.println("직급");
		String position = sc.nextLine();
		System.out.println("성별(남자/여자)");
		String gender = sc.nextLine();
		System.out.println("월급여");
		int pay = Integer.parseInt(sc.nextLine());
		System.out.println("보너스");
		int bonus = Integer.parseInt(sc.nextLine());

		String sql = "insert into mymember values (seq_mem.nextval,'" + name + "','" + buseo + "','" + position + "','"
				+ gender + "'," + pay + "," + bonus + ")";

		System.out.println(sql);

		// 오라클에 연결
		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			stmt.execute(sql);// sql문 실행(insert,delete,update 경우에는 execute 또는 executeUpdate)
			// int a=stmt.executeUpdate(sql);//성공한 데이타의 갯수
			// System.out.println(a);
			System.out.println("DB 에 추가되었습니다");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	public void deleteMember() {
		System.out.println("삭제할 사원번호를 입력해주세요");
		int sno = Integer.parseInt(sc.nextLine());
		String sql = "delete from mymember where sno=" + sno;
		System.out.println(sql);
		
		Connection conn = db.getOracle();
		Statement stmt = null;

		try {

			stmt = conn.createStatement();
			// 삭제 성공한 레코드의 갯수를 얻기
			// 이름이 없을경우 0 이 반환
			int n = stmt.executeUpdate(sql);
			if (n == 0) {
				System.out.println(sno + "번 사원님은 사원명단에 없습니다");
			} else {
				System.out.println(sno + "번 사원을 명단에서 삭제했습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	public void updateMember() {

		String buseo, position, sql;
		int pay, bonus;
		System.out.println("수정할 사원번호를 입력해주세요");
		int sno = Integer.parseInt(sc.nextLine());
		System.out.println("** 사원 정보 수정 **");
		System.out.println("부서명수정");
		buseo = sc.nextLine();
		System.out.println("직급수정");
		position = sc.nextLine();
		System.out.println("월급여 수정");
		pay = Integer.parseInt(sc.nextLine());
		System.out.println("보너스 수정");
		bonus = Integer.parseInt(sc.nextLine());
		sql = "update mymember set buseo=?,position=?,pay=?,bonus=? where sno=?";

		// System.out.println(sql);
		// 오라클에 연결
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, buseo);
			pstmt.setString(2, position);
			pstmt.setInt(3, pay);
			pstmt.setInt(4, bonus);
			pstmt.setInt(5, sno);
			pstmt.executeUpdate();// sql문 실행(insert,delete,update 경우에는 execute 또는 executeUpdate)
			// int a=stmt.executeUpdate(sql);//성공한 데이타의 갯수
			System.out.println("DB 에 추가되었습니다");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	public void writeMemberAll() {
		String sql = "select sno,name,buseo,position,gender,to_char(pay,'L999,999,999') pay,"
				+ "to_char(bonus,'L999,999,999') bonus from mymember";
		System.out.println("\t\t**전체 사원 명단 **");
		System.out.println();
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t\t월급여\t\t보너스");
		System.out.println("--------------------------------------------------------------------");

		// db연결
		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				System.out.println(rs.getInt("sno") + "\t"

						+ rs.getString("name") + "\t"

						+ rs.getString("buseo") + "\t"

						+ rs.getString("position") + "\t"

						+ rs.getString("gender") + "\t"

						+ rs.getString("pay") + "\t"

						+ rs.getString("bonus"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	public void searchName() {
		System.out.println("검색할 이름을 입력해주세요(일부도 가능)");
		String name = sc.nextLine();
		String sql = "select sno,name,buseo,position,gender,to_char(pay,'L999,999,999') pay,to_char(bonus,'L999,999,999') bonus "
				+ "from mymember where name like '%" + name + "%'";
		System.out.println(sql);
		System.out.println("\t\t** 검색 사원 명단 **");
		System.out.println();
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스");
		System.out.println("------------------------------------------------------");

		// db연결
		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("sno") + "\t" + rs.getString("name")
						+ "\t" + rs.getString("buseo") + "\t" + rs.getString("position")
						+ "\t" + rs.getString("gender") + "\t" + rs.getString("pay")
						+ "\t" + rs.getString("bonus"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	public void process() {
		while (true) {
			System.out.println("1.사원정보입력\t2.전체사원출력\t3.사원삭제\t4.사원수정\t5.이름검색\t9.시스템종료");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				insertMember();
				break;
			case 2:
				this.writeMemberAll();
				break;
			case 3:
				this.deleteMember();
				break;
			case 4:
				this.updateMember();
				break;
			case 5:
				this.searchName();
				break;
			case 9:
				System.out.println("** 종료합니다 **");
				System.exit(0);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		JdbcMember mem = new JdbcMember();
		mem.process();
	}

}