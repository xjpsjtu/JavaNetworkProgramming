import java.net.InetAddress;
import java.util.concurrent.Callable;

public class LookupTask implements Callable<String>{
	private String line;
	public LookupTask(String line){
		this.line = line;
	}

	@Override
	public String call(){
		// TODO Auto-generated method stub
		try{
			int index = line.indexOf(' ');
			String address = line.substring(0, index);
			String theRest = line.substring(index);
			String hostname = InetAddress.getByName(address).getHostAddress();
			return hostname + " " + theRest;
		}catch(Exception e){
			return line;
		}
	}

}
