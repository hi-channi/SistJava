package day0209;

import java.util.Scanner;

class PayOuter {
	private String sawonName;
	private int gibonPay, timePay, familySu;
	
	// 내부 클래스 선언
	InputInner input=new InputInner();
	SudangInner output=new SudangInner();
	
	// 외부 메소드_내부 클래스 호출
	public void process() {
		// 데이터 입력
		input.inputData();
		output.writeData();
	}
	
	class InputInner {
		public void inputData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("사원명 입력: ");
			sawonName=sc.nextLine();
			System.out.println("기본급 입력: ");
			gibonPay=Integer.parseInt(sc.nextLine());
			System.out.println("초과시간 수당 입력:");
			timePay=sc.nextInt();
			System.out.println("가족 수 입력: ");
			familySu=sc.nextInt();
		}
	}
	
	// 출력 메소드 (내부 클래스 이용)
	class SudangInner {
		// 시간외수당
		public int getTimeSudang() {
			return timePay*1000;
		}
		
		public int getFamilySudang() {
			if(familySu<=3) {
				return 200000;
			} else {
				return 300000;
			}
		}
		public int getNetPay() {
			return gibonPay+getFamilySudang()+getTimeSudang();
		}
		// 출력 메소드
		public void writeData() {
			System.out.println("사원명\t기본급\t초과시간 수\t가족 수\t시간수당\t가족수당\t실수령액");
			System.out.println("================================================================");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timePay+"\t"+familySu+"\t"+getTimeSudang()+"\t"+getFamilySudang()+"\t"+getNetPay());
		}
	}
}

public class InnerReview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 방법1
		PayOuter pay=new PayOuter();
		pay.process();
		*/
		
		// 방법2. 내부 클래스의 메소드 직접 호출
		PayOuter pay=new PayOuter();
		PayOuter.InputInner input=pay.new InputInner();
		input.inputData();
		
		PayOuter.SudangInner output=pay.new SudangInner();
		output.writeData();
	}

}
