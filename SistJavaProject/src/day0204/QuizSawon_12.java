package day0204;

import java.util.Scanner;

class Sawon {
	
	private static String empName;
	private String name;
	private int pay;
	private int salary;
	
	
	public static String getEmpName() {
		return empName;
	}
	public static void setEmpName(String empName) {
		Sawon.empName = empName;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 총 수령액
	public int getNetPay() {
		int m=pay+salary;
		return m;
	}
}
public class QuizSawon_12 {
	
	public static void writeSawon(Sawon s) {
		System.out.println(s.getName()+"\t"+s.getPay()+"\t"+s.getSalary()+"\t"+s.getNetPay());
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int people;
		String empName;
		Sawon[] sawon;
		String name;
		int pay, salary;
		
		System.out.println("회사이름 입력");
		empName=sc.nextLine();
		
		// 회사이름 >> static 멤버 변수에 저장
		Sawon.setEmpName(empName);
		
		// 총 사원수
		System.out.println("총 사원수 입력");
		people=Integer.parseInt(sc.nextLine());
		
		// 인원 수(people)만큼 People 배열 할당
		sawon=new Sawon[people];
		
		// 입력
		for(int i=0;i<people;i++) {
			sawon[i]=new Sawon();
			System.out.println("사원명 입력:");
			name=sc.nextLine();
			System.out.println("월 급여 입력:");
			pay=Integer.parseInt(sc.nextLine());
			System.out.println("수당 입력:");
			salary=Integer.parseInt(sc.nextLine());
			
			sawon[i].setName(name);
			sawon[i].setPay(pay);
			sawon[i].setSalary(salary);
		}
		System.out.println("회사명: "+Sawon.getEmpName());
		System.out.println("사원명\t기본급\t수당\t실수령");
		System.out.println("==================================");
		
		for(Sawon s:sawon) {
			writeSawon(s);
		}
	}
}
