import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class InterfaceLister {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		while(interfaces.hasMoreElements()){
			NetworkInterface ni = interfaces.nextElement();
			Enumeration<InetAddress> ia = ni.getInetAddresses();
			System.out.println(ni);
			System.out.println(ni.getDisplayName());
			while(ia.hasMoreElements()){
				System.out.println(ia.nextElement());
			}
			System.out.println("------------");
		}
	}

}
