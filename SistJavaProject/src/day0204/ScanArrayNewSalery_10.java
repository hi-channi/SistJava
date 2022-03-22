package day0204;

import java.util.Scanner;

class Emp {
	
	private String name;
	private int pay;
	private int famcnt;
	private int overtime;
	
	// 각각의 setter, getter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamcnt() {
		return famcnt;
	}
	public void setFamcnt(int famcnt) {
		this.famcnt = famcnt;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	
	// 초과시간수당 반환(Return)하는 메소드
	public int getTimePay() {
		int n=0;
		if (overtime<5) {
			n=overtime*30000;
		} else {
			n=150000;
		}
		return n;
	}
	
	// 가족수당 반환(Return)하는 메소드
	public int getFamPay() {
		int n=0;
		if (famcnt<4) {
			n=famcnt*50000;
		} else {
			n=200000;
		}
		return n;
	}
	
	public int getTotalPay() {
		int tot=pay+getFamPay()+getTimePay();
		return tot;
	}
	public static void showTitle() {
		System.out.println("[쌍용전자 직원 급여 현황]");
		System.out.println("사원명\t급여\t가족 수\t초과시간\t가족수당\t시간수당\t총 급여");
		System.out.println("==========================================================");
	}
}

public class ScanArrayNewSalery_10 {

	public static void writeEmp(Emp[] emp) {
		Emp.showTitle();
		
		for(Emp e:emp) {
			System.out.println(e.getName()+"\t"+e.getPay()+"\t"+e.getFamcnt()+"\t"+e.getTimePay()+
					"\t"+e.getFamPay()+"\t"+e.getTimePay()+"\t"+e.getTotalPay());
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int people;
		Emp[] emp;
		
		System.out.println("직원 수를 입력하세요: ");
		people=Integer.parseInt(sc.nextLine());
		
		// 배열 할당
		emp=new Emp[people];
		
		// 입력한 인원 수만큼 데이터 입력
		for(int i=0;i<people;i++) {
			emp[i]=new Emp();
			System.out.println("이름은? ");
			String name=sc.nextLine();
			System.out.println("급여는? ");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("가족 수는? ");
			int fc=Integer.parseInt(sc.nextLine());
			System.out.println("초과시간은? ");
			int ot=Integer.parseInt(sc.nextLine());
			
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamcnt(fc);
			emp[i].setOvertime(ot);
		}
		// 출력
		writeEmp(emp);
	}

}
