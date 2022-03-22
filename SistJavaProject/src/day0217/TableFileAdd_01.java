package day0217;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableFileAdd_01 extends JFrame implements ActionListener {

	Container cp;

	JButton btnAdd, btnDel;
	JTextField tfSang, tfSu, tfDan;
	DefaultTableModel model;
	JTable table;
	int selectRow = -1;
	static final String FILENAME = "C:\\sist0117\\javawork\\SistJavaProject\\tabledata.txt";

	public TableFileAdd_01(String title) {
		super(title);
		this.setBounds(700, 100, 430, 400);
		setDesign();

		// 테이블 생성 후 파일데이터 추가
		tableReadData();

		// 종료 시 이벤트 데이터 저장
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				// 파일 저장 메소드 호출
				tableDataSave();// 닫을 때 저장되면서 닫힐 것
				System.exit(0);// 강제종료
			}
		});

		this.setVisible(true);
	}

	// 데이터 저장
	// 바나나: 3:1000
	public void tableDataSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);

			for (int i = 0; i < table.getRowCount(); i++) {
				String s = "";
				for (int j = 0; j < table.getColumnCount(); j++) {
					s += table.getValueAt(i, j) + ":";
				}
				
				// 마지막 한글자 >> 제거
				s = s.substring(0, s.length() - 1);
				fw.write(s + "\n");

			}
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

	// 데이터 불러오기
	public void tableReadData() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while (true) {
				String s = br.readLine();

				if (s == null)
					break;

				String[] data = s.split(":");

				// 테이블에 배열형 데이터 추가
				model.addRow(data);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void setDesign() {
		this.setLayout(null);

		// null이기 때문에 다 해줘야함
		JLabel lbl1 = new JLabel("상품명");
		JLabel lbl2 = new JLabel("수량");
		JLabel lbl3 = new JLabel("단가");

		lbl1.setBounds(30, 20, 80, 30);
		this.add(lbl1);
		lbl2.setBounds(150, 20, 80, 30);
		this.add(lbl2);
		lbl3.setBounds(270, 20, 80, 30);
		this.add(lbl3);

		tfSang = new JTextField();
		tfSang.setBounds(20, 60, 100, 30);
		this.add(tfSang);

		tfSu = new JTextField();
		tfSu.setBounds(140, 60, 100, 30);
		this.add(tfSu);

		tfDan = new JTextField();
		tfDan.setBounds(280, 60, 100, 30);
		this.add(tfDan);

		// 버튼
		btnAdd = new JButton("추가하기");
		btnAdd.setBounds(50, 120, 100, 30);
		this.add(btnAdd);

		btnDel = new JButton("삭제하기");
		btnDel.setBounds(200, 120, 100, 30);
		this.add(btnDel);

		// 버튼 2개 이벤트 추가
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);

		// 테이블 생성
		String[] title = { "상품명", "수량", "단가", "총금액" };
		model = new DefaultTableModel(title, 0); // 0은 행갯수
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(20, 170, 380, 180);
		this.add(js);

		// 테이블 클릭 시 선택한 행번호를 selectRow에 저장
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				selectRow = table.getSelectedRow();// 행 번호를 selectRow에 저장
			}
		});
	}

	// 버튼 이벤트 2개
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();
		if (ob == btnAdd) {
			String sang = tfSang.getText().trim();
			String su = tfSu.getText().trim();
			String dan = tfDan.getText().trim();

			if (sang.length() == 0 || su.length() == 0 || dan.length() == 0) {
				JOptionPane.showMessageDialog(this, "3개 값 모두 입력해 주세요");
				return;
			}

			int total = 0;
			total = Integer.parseInt(su) * Integer.parseInt(dan);

			NumberFormat nf = NumberFormat.getInstance();
			Vector<String> data = new Vector<String>();
			data.add(sang);
			data.add(su);
			data.add(dan);
			data.add(nf.format(total));

			// 테이블에 추가
			model.addRow(data); // addRow할 때 Vector로

			// 입력 값 지워주기
			tfSang.setText("");
			tfSu.setText("");
			tfDan.setText("");
		} else if (ob == btnDel) {
			if (selectRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 행을 먼저 선택해주세요");
			} else {
				model.removeRow(selectRow);
			}
		}
	}

	public static void main(String[] args) {
		new TableFileAdd_01("테이블 파일 추가삭제 연습");

	}
}