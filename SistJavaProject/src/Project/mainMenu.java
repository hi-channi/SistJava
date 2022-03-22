package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class mainMenu extends JFrame implements ActionListener, ItemListener {

	Container cp;
	JTable table, totTable;
	DefaultTableModel model, totModel;
	String totPrice;
	int tot;
	JButton btnOrder, btnReset, btnDel;
	JRadioButton rbHere, rbTogo;
	JRadioButton[] rbColor = new JRadioButton[6];
	JLabel otResult;
	JCheckBox setToggle1, setToggle2;
	JPanel menuPanel;

	DbConnect db = new DbConnect();

	JButton btnck1, btnck2, btnck3, btnck4, btnck5;;
	JButton btnbg1, btnbg2, btnbg3, btnbg4, btnbg5;
	JButton btns1, btns2, btns3, btns4, btns5;
	JButton btnd1, btnd2, btnd3, btnd4, btnd5;
	
	AddFrame addFrame=new AddFrame("주문 확인");
	
	public mainMenu(String title) {
		super(title);
		this.setBounds(150, 150, 1500, 1000);
		cp = getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(new Color(249, 168, 56));

		menuPanel = new JPanel();
		menuPanel.setBounds(50, 100, 1000, 1000);
		// menuPanel.add(this);

		menuTitleDesign();
		ckMenu();
		bgMenu();
		sideMenu();
		drinkMenu();
		extraChoice();
		sideDesign();
		this.setVisible(true);
	}

	public void menuTitleDesign() {
		JLabel ckTitle, bgTitle, sideTitle, drinkTitle;

		ckTitle = new JLabel("치킨", JLabel.CENTER);
		ckTitle.setBounds(50, 100, 100, 30);
		ckTitle.setBorder(new LineBorder(Color.red, 2));
		ckTitle.setBackground(Color.yellow);
		ckTitle.setOpaque(true);
		this.add(ckTitle);

		bgTitle = new JLabel("버거", JLabel.CENTER);
		bgTitle.setBounds(50, 300, 100, 30);
		bgTitle.setBorder(new LineBorder(Color.red, 2));
		bgTitle.setBackground(Color.yellow);
		bgTitle.setOpaque(true);
		this.add(bgTitle);

		sideTitle = new JLabel("사이드", JLabel.CENTER);
		sideTitle.setBounds(50, 500, 100, 30);
		sideTitle.setBorder(new LineBorder(Color.red, 2));
		sideTitle.setBackground(Color.yellow);
		sideTitle.setOpaque(true);
		this.add(sideTitle);

		drinkTitle = new JLabel("음료", JLabel.CENTER);
		drinkTitle.setBounds(50, 700, 100, 30);
		drinkTitle.setBorder(new LineBorder(Color.red, 2));
		drinkTitle.setBackground(Color.yellow);
		drinkTitle.setOpaque(true);
		this.add(drinkTitle);

	}

	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	public void ckMenu() {
		JPanel menuCk = new JPanel();
		menuCk.setBounds(50, 100, 1000, 200);
		menuCk.setBackground(new Color(255, 217, 164));
		menuCk.setLayout(null);

		setToggle1 = new JCheckBox("콤보 메뉴");
		setToggle1.setBounds(120, 5, 80, 20);
		menuCk.add(setToggle1);
		setToggle1.addItemListener(this);

		cp.add(menuCk);

		JLabel ck1, ck2, ck3, ck4, ck5;
		ImageIcon img_ck1 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\ck1.png");
		ImageIcon img_ck2 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\ck2.png");
		ImageIcon img_ck3 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\ck3.png");
		ImageIcon img_ck4 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\ck4.png");
		ImageIcon img_ck5 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\ck5.png");

		img_ck1 = imageSetSize(img_ck1, 170, 120);
		img_ck2 = imageSetSize(img_ck2, 170, 120);
		img_ck3 = imageSetSize(img_ck3, 170, 120);
		img_ck4 = imageSetSize(img_ck4, 170, 120);
		img_ck5 = imageSetSize(img_ck5, 170, 120);

		btnck1 = new JButton("담기");
		btnck1.setBounds(110, 120, 60, 30);
		menuCk.add(btnck1);

		btnck2 = new JButton("담기");
		btnck2.setBounds(310, 120, 60, 30);
		menuCk.add(btnck2);

		btnck3 = new JButton("담기");
		btnck3.setBounds(510, 120, 60, 30);
		menuCk.add(btnck3);

		btnck4 = new JButton("담기");
		btnck4.setBounds(710, 120, 60, 30);
		menuCk.add(btnck4);

		btnck5 = new JButton("담기");
		btnck5.setBounds(910, 120, 60, 30);
		menuCk.add(btnck5);

		btnck1.addActionListener(this);
		btnck2.addActionListener(this);
		btnck3.addActionListener(this);
		btnck4.addActionListener(this);
		btnck5.addActionListener(this);

		ck1 = new JLabel("<html>치르르치킨<br>21,400원</html>", img_ck1, JLabel.CENTER);
		ck1.setBounds(10, 30, 170, 150);
		ck1.setHorizontalTextPosition(JLabel.CENTER);
		ck1.setVerticalTextPosition(JLabel.BOTTOM);
		menuCk.add(ck1);

		ck2 = new JLabel("<html>핫크리스피치킨<br>19,400원</html>", img_ck2, JLabel.CENTER);
		ck2.setBounds(210, 30, 170, 150);
		ck2.setHorizontalTextPosition(JLabel.CENTER);
		ck2.setVerticalTextPosition(JLabel.BOTTOM);
		menuCk.add(ck2);

		ck3 = new JLabel("<html>갓양념치킨<br>20,600원</html>", img_ck3, JLabel.CENTER);
		ck3.setBounds(410, 30, 170, 150);
		ck3.setHorizontalTextPosition(JLabel.CENTER);
		ck3.setVerticalTextPosition(JLabel.BOTTOM);
		menuCk.add(ck3);

		ck4 = new JLabel("<html>쏘랑이치킨<br>21,400원</html>", img_ck4, JLabel.CENTER);
		ck4.setBounds(610, 30, 170, 150);
		ck4.setHorizontalTextPosition(JLabel.CENTER);
		ck4.setVerticalTextPosition(JLabel.BOTTOM);
		menuCk.add(ck4);

		ck5 = new JLabel("<html>오리지널<br>19,400원</html>", img_ck5, JLabel.CENTER);
		ck5.setBounds(810, 30, 170, 150);
		ck5.setHorizontalTextPosition(JLabel.CENTER);
		ck5.setVerticalTextPosition(JLabel.BOTTOM);
		menuCk.add(ck5);

	}

	public void bgMenu() {
		JPanel menuBg = new JPanel();
		menuBg.setBounds(50, 300, 1000, 200);
		menuBg.setBackground(new Color(255, 217, 164));
		menuBg.setLayout(null);

		setToggle2 = new JCheckBox("세트 메뉴");
		setToggle2.setBounds(120, 5, 80, 20);
		menuBg.add(setToggle2);
		setToggle2.addItemListener(this);

		cp.add(menuBg);

		JLabel bg1, bg2, bg3, bg4, bg5, bg6;
		ImageIcon img_bg1 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg1.png");
		ImageIcon img_bg2 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg2.png");
		ImageIcon img_bg3 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg3.png");
		ImageIcon img_bg4 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg4.png");
		ImageIcon img_bg5 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg5.png");
		ImageIcon img_bg6 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg6.png");
		// ImageIcon img_bg7=new
		// ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\bg7.png");

		img_bg1 = imageSetSize(img_bg1, 170, 120);
		img_bg2 = imageSetSize(img_bg2, 170, 120);
		img_bg3 = imageSetSize(img_bg3, 170, 120);
		img_bg4 = imageSetSize(img_bg4, 170, 120);
		img_bg5 = imageSetSize(img_bg5, 170, 120);
		img_bg6 = imageSetSize(img_bg6, 170, 120);

		bg1 = new JLabel("<html>블랙라벨더블다운맥스<br>10,000원</html>", img_bg1, JLabel.CENTER);
		bg1.setBounds(10, 30, 170, 150);
		bg1.setHorizontalTextPosition(JLabel.CENTER);
		bg1.setVerticalTextPosition(JLabel.BOTTOM);
		menuBg.add(bg1);

		bg2 = new JLabel("<html>블랙라벨폴인치즈<br>9,400원</html>", img_bg2, JLabel.CENTER);
		bg2.setBounds(210, 30, 170, 150);
		bg2.setHorizontalTextPosition(JLabel.CENTER);
		bg2.setVerticalTextPosition(JLabel.BOTTOM);
		menuBg.add(bg2);

		bg3 = new JLabel("<html>핫통삼겹베이컨<br>9,000원</html>", img_bg3, JLabel.CENTER);
		bg3.setBounds(410, 30, 170, 150);
		bg3.setHorizontalTextPosition(JLabel.CENTER);
		bg3.setVerticalTextPosition(JLabel.BOTTOM);
		menuBg.add(bg3);

		bg4 = new JLabel("<html>징거더블다운맥스<br>9,000원</html>", img_bg4, JLabel.CENTER);
		bg4.setBounds(610, 30, 170, 150);
		bg4.setHorizontalTextPosition(JLabel.CENTER);
		bg4.setVerticalTextPosition(JLabel.BOTTOM);
		menuBg.add(bg4);

		bg5 = new JLabel("<html>켄터키치킨업그레이비<br>8,000원</html>", img_bg5, JLabel.CENTER);
		bg5.setBounds(810, 30, 170, 150);
		bg5.setHorizontalTextPosition(JLabel.CENTER);
		bg5.setVerticalTextPosition(JLabel.BOTTOM);
		menuBg.add(bg5);

		bg6 = new JLabel("<html>타워버거<br>7,800원</html>", img_bg6, JLabel.CENTER);
		bg6.setBounds(1010, 30, 170, 150);
		bg6.setHorizontalTextPosition(JLabel.CENTER);
		bg6.setVerticalTextPosition(JLabel.BOTTOM);
		menuBg.add(bg6);

		// 담기 버튼

		btnbg1 = new JButton("담기");
		btnbg1.setBounds(160, 420, 60, 30);
		this.add(btnbg1);

		btnbg2 = new JButton("담기");
		btnbg2.setBounds(360, 420, 60, 30);
		this.add(btnbg2);

		btnbg3 = new JButton("담기");
		btnbg3.setBounds(560, 420, 60, 30);
		this.add(btnbg3);

		btnbg4 = new JButton("담기");
		btnbg4.setBounds(760, 420, 60, 30);
		this.add(btnbg4);

		btnbg5 = new JButton("담기");
		btnbg5.setBounds(960, 420, 60, 30);
		this.add(btnbg5);

		btnbg1.addActionListener(this);
		btnbg2.addActionListener(this);
		btnbg3.addActionListener(this);
		btnbg4.addActionListener(this);
		btnbg5.addActionListener(this);
	}

	public void sideMenu() {
		JPanel menuSide = new JPanel();
		menuSide.setBounds(50, 500, 1000, 200);
		menuSide.setBackground(new Color(255, 217, 164));
		menuSide.setLayout(null);
		cp.add(menuSide);

		JLabel side1, side2, side3, side4, side5;
		ImageIcon img_side1 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\side1.png");
		ImageIcon img_side2 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\side2.png");
		ImageIcon img_side3 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\side3.png");
		ImageIcon img_side4 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\side4.png");
		ImageIcon img_side5 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\side5.png");

		img_side1 = imageSetSize(img_side1, 170, 120);
		img_side2 = imageSetSize(img_side2, 170, 120);
		img_side3 = imageSetSize(img_side3, 170, 120);
		img_side4 = imageSetSize(img_side4, 170, 120);
		img_side5 = imageSetSize(img_side5, 170, 120);

		side1 = new JLabel("<html>치르르치즈볼<br>2,900원</html>", img_side1, JLabel.CENTER);
		side1.setBounds(10, 30, 170, 150);
		side1.setHorizontalTextPosition(JLabel.CENTER);
		side1.setVerticalTextPosition(JLabel.BOTTOM);
		menuSide.add(side1);

		side2 = new JLabel("<html>너겟 6조각<br>3,000원</html>", img_side2, JLabel.CENTER);
		side2.setBounds(210, 30, 170, 150);
		side2.setHorizontalTextPosition(JLabel.CENTER);
		side2.setVerticalTextPosition(JLabel.BOTTOM);
		menuSide.add(side2);

		side3 = new JLabel("<html>케이준후라이<br>2,400원</html>", img_side3, JLabel.CENTER);
		side3.setBounds(410, 30, 170, 150);
		side3.setHorizontalTextPosition(JLabel.CENTER);
		side3.setVerticalTextPosition(JLabel.BOTTOM);
		menuSide.add(side3);

		side4 = new JLabel("<html>닭껍질튀김<br>2,900원</html>", img_side4, JLabel.CENTER);
		side4.setBounds(610, 30, 170, 150);
		side4.setHorizontalTextPosition(JLabel.CENTER);
		side4.setVerticalTextPosition(JLabel.BOTTOM);
		menuSide.add(side4);

		side5 = new JLabel("<html>텐더떡볶이<br>2,900원</html>", img_side5, JLabel.CENTER);
		side5.setBounds(810, 30, 170, 150);
		side5.setHorizontalTextPosition(JLabel.CENTER);
		side5.setVerticalTextPosition(JLabel.BOTTOM);
		menuSide.add(side5);

		// 담기 버튼
		btns1 = new JButton("담기");
		btns1.setBounds(160, 620, 60, 30);
		this.add(btns1);

		btns2 = new JButton("담기");
		btns2.setBounds(360, 620, 60, 30);
		this.add(btns2);

		btns3 = new JButton("담기");
		btns3.setBounds(560, 620, 60, 30);
		this.add(btns3);

		btns4 = new JButton("담기");
		btns4.setBounds(760, 620, 60, 30);
		this.add(btns4);

		btns5 = new JButton("담기");
		btns5.setBounds(960, 620, 60, 30);
		this.add(btns5);

		btns1.addActionListener(this);
		btns2.addActionListener(this);
		btns3.addActionListener(this);
		btns4.addActionListener(this);
		btns5.addActionListener(this);
	}

	public void drinkMenu() {
		JPanel menuDrink = new JPanel();
		menuDrink.setBounds(50, 700, 1000, 200);
		menuDrink.setBackground(new Color(255, 217, 164));
		menuDrink.setLayout(null);
		cp.add(menuDrink);

		JLabel drink1, drink2, drink3, drink4, drink5;
		ImageIcon img_drink1 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\drink1.png");
		ImageIcon img_drink2 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\drink2.png");
		ImageIcon img_drink3 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\drink3.png");
		ImageIcon img_drink4 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\drink4.png");
		ImageIcon img_drink5 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\drink5.png");

		img_drink1 = imageSetSize(img_drink1, 170, 120);
		img_drink2 = imageSetSize(img_drink2, 170, 120);
		img_drink3 = imageSetSize(img_drink3, 170, 120);
		img_drink4 = imageSetSize(img_drink4, 170, 120);
		img_drink5 = imageSetSize(img_drink5, 170, 120);

		drink1 = new JLabel("<html>코카콜라<br>2,000원</html>", img_drink1, JLabel.CENTER);
		drink1.setBounds(10, 30, 170, 150);
		drink1.setHorizontalTextPosition(JLabel.CENTER);
		drink1.setVerticalTextPosition(JLabel.BOTTOM);
		menuDrink.add(drink1);

		drink2 = new JLabel("<html>스프라이트<br>2,000원</html>", img_drink2, JLabel.CENTER);
		drink2.setBounds(210, 30, 170, 150);
		drink2.setHorizontalTextPosition(JLabel.CENTER);
		drink2.setVerticalTextPosition(JLabel.BOTTOM);
		menuDrink.add(drink2);

		drink3 = new JLabel("<html>환타오렌지<br>2,000원</html>", img_drink3, JLabel.CENTER);
		drink3.setBounds(410, 30, 170, 150);
		drink3.setHorizontalTextPosition(JLabel.CENTER);
		drink3.setVerticalTextPosition(JLabel.BOTTOM);
		menuDrink.add(drink3);

		drink4 = new JLabel("<html>코카콜라 ZERO<br>2,000원</html>", img_drink4, JLabel.CENTER);
		drink4.setBounds(610, 30, 170, 150);
		drink4.setHorizontalTextPosition(JLabel.CENTER);
		drink4.setVerticalTextPosition(JLabel.BOTTOM);
		menuDrink.add(drink4);

		drink5 = new JLabel("<html>생수<br>1,000원</html>", img_drink5, JLabel.CENTER);
		drink5.setBounds(810, 30, 170, 150);
		drink5.setHorizontalTextPosition(JLabel.CENTER);
		drink5.setVerticalTextPosition(JLabel.BOTTOM);
		menuDrink.add(drink5);

		// 담기 버튼
		btnd1 = new JButton("담기");
		btnd1.setBounds(160, 820, 60, 30);
		this.add(btnd1);
		btnd2 = new JButton("담기");
		btnd2.setBounds(360, 820, 60, 30);
		this.add(btnd2);

		btnd3 = new JButton("담기");
		btnd3.setBounds(560, 820, 60, 30);
		this.add(btnd3);

		btnd4 = new JButton("담기");
		btnd4.setBounds(760, 820, 60, 30);
		this.add(btnd4);

		btnd5 = new JButton("담기");
		btnd5.setBounds(960, 820, 60, 30);
		this.add(btnd5);

		btnd1.addActionListener(this);
		btnd2.addActionListener(this);
		btnd3.addActionListener(this);
		btnd4.addActionListener(this);
		btnd5.addActionListener(this);
	}

	public void sideDesign() {
		// 테이블
		String[] title = { "번호", "상품명", "가격" };
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		table.getColumn("번호").setPreferredWidth(1);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(1100, 100, 350, 375);
		this.add(js);
		deleteData(); //새 창을 열었을 경우 장바구니는 항상 비어있어야 함.
		
		String[] title1= {"총 금액"};
		totModel=new DefaultTableModel(title1,1);
		totTable=new JTable(totModel);
		JScrollPane js1=new JScrollPane(totTable);
		js1.setBounds(1100, 475, 100, 50);
		js1.setBackground(new Color(255, 217, 164));
		this.add(js1);

		this.setLayout(null);
		btnDel = new JButton("상품삭제");
		btnDel.setBounds(1350, 475, 100, 25);
		btnDel.addActionListener(this);
		this.add(btnDel);

		rbHere = new JRadioButton("매장 식사(HERE)");
		rbHere.setBounds(1130, 750, 200, 50);
		rbHere.setOpaque(false);
		rbHere.setSelected(false);
		this.add(rbHere);

		rbTogo = new JRadioButton("<html>포장 주문(TO GO)<br>(1000원 할인)</html>");
		rbTogo.setBounds(1275, 750, 200, 50);
		rbTogo.setOpaque(false);
		rbTogo.setSelected(false);
		this.add(rbTogo);

		// ButtonGroup 처리를 통해 주문 형태 중복 선택 방지
		ButtonGroup orderType = new ButtonGroup();
		orderType.add(rbHere);
		orderType.add(rbTogo);

		// 각각의 주문 형태 라디오 버튼에 이벤트 추가
		rbHere.addActionListener(this);
		rbTogo.addActionListener(this);

		// 라벨 생성
		otResult = new JLabel("메뉴를 선택한 뒤 주문 형태를 선택해주세요", JLabel.CENTER);
		otResult.setBounds(1100, 800, 350, 30);
		otResult.setBorder(new LineBorder(Color.red, 2));
		otResult.setFont(new Font("나눔고딕", Font.BOLD, 15));
		otResult.setOpaque(true); // 색상 변경 안될 때 확인
		this.add(otResult);

		// 주문 확인 버튼
		btnOrder = new JButton("주문하기");
		btnOrder.setFont(new Font("돋움", Font.BOLD, 20));
		btnOrder.setBounds(1100, 850, 250, 50);
		this.add(btnOrder);
		btnOrder.addActionListener(this);

		btnReset = new JButton("다시하기");
		btnReset.setFont(new Font("돋움", Font.BOLD, 12));
		btnReset.setBounds(1365, 850, 85, 50);
		this.add(btnReset);
		btnReset.addActionListener(this);
	}

	public void extraChoice() {
		JPanel extraC = new JPanel();
		JCheckBox cbextra1, cbextra2, cbextra3, cbextra4;
		extraC.setBounds(1100, 530, 350, 220);
		extraC.setBackground(new Color(255, 253, 177));
		extraC.setBorder(new TitledBorder("  소스 선택 "));
		// menuBg.setLayout(new GridBagLayout());
		extraC.setLayout(null);

		cp.add(extraC);

		JLabel extra1, extra2, extra3, extra4;
		ImageIcon img_extra1 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\extra1.png");
		ImageIcon img_extra2 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\extra2.png");
		ImageIcon img_extra3 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\extra3.png");
		ImageIcon img_extra4 = new ImageIcon("C:\\Users\\admin\\Desktop\\sist0117\\img\\pj_image\\extra4.png");

		img_extra1 = imageSetSize(img_extra1, 90, 60);
		img_extra2 = imageSetSize(img_extra2, 90, 60);
		img_extra3 = imageSetSize(img_extra3, 90, 60);
		img_extra4 = imageSetSize(img_extra4, 75, 40);

		extra1 = new JLabel(img_extra1, JLabel.CENTER);
		cbextra1 = new JCheckBox("스파이시마요");
		cbextra1.setBounds(100, 30, 100, 15);
		cbextra2 = new JCheckBox("살사");
		cbextra2.setBounds(100, 77, 100, 15);
		cbextra3 = new JCheckBox("스위트칠리");
		cbextra3.setBounds(100, 124, 100, 15);
		cbextra4 = new JCheckBox("버터");
		cbextra4.setBounds(100, 171, 100, 15);

		extra1 = new JLabel(img_extra1, JLabel.CENTER);
		extra1.setBounds(5, 10, 90, 60);
		extraC.add(extra1);

		extra2 = new JLabel(img_extra2, JLabel.CENTER);
		extra2.setBounds(5, 60, 90, 60);
		extraC.add(extra2);

		extra3 = new JLabel(img_extra3, JLabel.CENTER);
		extra3.setBounds(5, 110, 90, 60);
		extraC.add(extra3);

		extra4 = new JLabel(img_extra4, JLabel.CENTER);
		extra4.setBounds(10, 160, 90, 60);
		extraC.add(extra4);

		extraC.add(cbextra1);
		extraC.add(cbextra2);
		extraC.add(cbextra3);
		extraC.add(cbextra4);

	}

	// 데이터 출력 메소드
	public void writeData() {
		System.out.println("TABLE UPDATE");

		model.setRowCount(0);
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select ROWNUM, name, to_char(pay, 'L999,999,000') pay from kfc order by ROWNUM";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				Vector<String> data = new Vector<String>();
				data.add(rs.getString("ROWNUM"));
				// data.add(rs.getString("num")); // 상품 코드(고유한 번호로 수정이 필요)
				data.add(rs.getString("name"));
				data.add(rs.getString("pay"));

				// 테이블에 추가
				model.addRow(data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}
	
	
	// 삭제 메소드
	public void deleteData() {

		System.out.println("TABLE RESET");
		String sql = "delete from kfc";
		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);

		}
	}
	
	// 총합 금액 추출
	public void sumdata() {
		totModel.setRowCount(0);
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//String sql="select to_char(sum(pay),'L999,999,000') sum from kfc";
		String sql="select sum(pay) sum from kfc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Vector<String> data=new Vector<String>();
				data.add(rs.getString("sum"));
				
				//테이블에 추가
				totModel.addRow(data);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt,conn);
		}
		
		totPrice = (String) totModel.getValueAt(0, 0);
		System.out.println(totPrice);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		DecimalFormat dc=new DecimalFormat("###,###,###"); // 콤마 단위 변환
		
		if (ob == rbHere) {
			tot = Integer.parseInt(totPrice);
			otResult.setText("매장 식사 / 결제금액: " + dc.format(tot) + "원");
		} else if (ob == rbTogo) {
			tot = Integer.parseInt(totPrice);
			tot -= 1000;
			otResult.setText("포장 / 결제금액: " + dc.format(tot) + "원");
		}

		// 장바구니 추가
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from kfc";
			stmt = conn.createStatement();

			if (ob == btnck1) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from ck_menu where num=1";
				sumdata();
				writeData();
			} else if (ob == btnck2) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from ck_menu where num=2";
				sumdata();
				writeData();
			} else if (ob == btnck3) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from ck_menu where num=3";
				sumdata();
				writeData();
			} else if (ob == btnck4) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from ck_menu where num=4";
				sumdata();
				writeData();
			} else if (ob == btnck5) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from ck_menu where num=5";
				sumdata();
				writeData();
			}

			if (ob == btnbg1) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from br_menu where num=1";
				sumdata();
				writeData();
			} else if (ob == btnbg2) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from br_menu where num=2";
				sumdata();
				writeData();
			} else if (ob == btnbg3) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from br_menu where num=3";
				sumdata();
				writeData();
			} else if (ob == btnbg4) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from br_menu where num=4";
				sumdata();
				writeData();
			} else if (ob == btnbg5) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from br_menu where num=5";
				sumdata();
				writeData();
			}

			if (ob == btns1) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from side_menu where num=1";
				sumdata();
				writeData();
			} else if (ob == btns2) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from side_menu where num=2";
				sumdata();
				writeData();
			} else if (ob == btns3) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from side_menu where num=3";
				sumdata();
				writeData();
			} else if (ob == btns4) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from side_menu where num=4";
				sumdata();
				writeData();
			} else if (ob == btns5) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from side_menu where num=5";
				sumdata();
				writeData();
			}

			if (ob == btnd1) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from drink_menu where num=1";
				sumdata();
				writeData();
			} else if (ob == btnd2) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from drink_menu where num=2";
				sumdata();
				writeData();
			} else if (ob == btnd3) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from drink_menu where num=3";
				sumdata();
				writeData();
			} else if (ob == btnd4) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from drink_menu where num=4";
				sumdata();
				writeData();
			} else if (ob == btnd5) {
				sql = "insert into kfc (num,name,pay) select num,name,pay from drink_menu where num=5";
				sumdata();
				writeData();
			}
			rs = stmt.executeQuery(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
		
		// 개별삭제 (WIP)
		if (ob == btnDel) { 
			// 행번호 얻기 (선택하지 않으면 -1 반환)
			int row = table.getSelectedRow();
			System.out.println(row);

			if (row == -1) {
				JOptionPane.showMessageDialog(this, "장바구니에서 삭제할 상품을 선택해주세요.");
				return;
			}
			String num = (String) model.getValueAt(row, 1);
			System.out.println(num);

			String sql = "delete from kfc where row=num";

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, num);
				pstmt.execute();
				this.writeData();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}
		}

		if (ob == btnReset) {
			deleteData(); // 데이터 삭제
			writeData(); // 테이블 새로고침
		}
		
		if (ob==btnOrder) {
			if(tot >0) {
				System.out.println("add");
				addFrame.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this,"<html>담은 메뉴가 없거나 주문 형태가 선택되지 않았습니다.<br>주문 형태를 선택해주세요.</html>");
			}
		}
		
	}
	

	public static void main(String[] args) {
		new mainMenu("KFC 주문하기");
	}
}
