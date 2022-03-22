package day0211;

import java.rmi.registry.LocateRegistry;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatEx_01 {
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-mm-dd hh:mm");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-mm-dd hh:mm EEEE"); // EEE: 요일 짧게, EEEE: 요일 길게
		System.out.println(sdf3.format(date));
		
		int money=674500;
		double num=45.3246;
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance(); // 원단위+콤마(,) 제공
		NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(money));
		System.out.println(nf3.format(money));
		
		NumberFormat nf2=NumberFormat.getInstance();  // 콤마(,) 제공
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
	}
}
