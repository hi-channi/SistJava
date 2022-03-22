package day0217;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress myAddr=InetAddress.getLocalHost();
			
			System.out.println("Local IP: "+myAddr.getHostAddress());
			System.out.println("Local Name: "+myAddr.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String hostName="www.naver.com";
		
		try {
			InetAddress[] addr=InetAddress.getAllByName(hostName);
			
			for(InetAddress ia:addr) {
				System.out.println("name: "+ia.getHostName());
				System.out.println("IP: "+ia.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
