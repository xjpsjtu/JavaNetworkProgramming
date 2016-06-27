package inetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress machine = InetAddress.getLocalHost();
			String localhost = machine.getHostName();
			String localaddress = machine.getHostAddress();
			System.out.println(localhost + " " + localaddress);
			InetAddress ia = InetAddress.getByName("bbs.sjtu.edu.cn");
			byte[] bbsAd = ia.getAddress();
			for(byte b:bbsAd){
				int a = b > 0 ? b : b + 256;
				System.out.print(a+".");
			}
			System.out.println();
			System.out.println(ia.getHostAddress());
			InetAddress ore = InetAddress.getByName("202.120.58.161");
			System.out.println(ore.getHostName());
			System.out.println(ore.isReachable(20));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
