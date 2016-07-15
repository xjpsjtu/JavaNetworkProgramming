package proxy;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class LocalProxySelector extends ProxySelector{
	
	private List<URI> failed = new ArrayList<URI>();
	public List<Proxy> select(URI uri){
		List<Proxy> result = new ArrayList<Proxy>();
		if(failed.contains(uri) || "http".equalsIgnoreCase(uri.getScheme())){
			result.add(Proxy.NO_PROXY);
		}else{
			SocketAddress proxyAddress = new InetSocketAddress("proxy.example.com",8000);
			Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress);
			result.add(proxy);
		}
		return result;
	}
	
	@Override
	public void connectFailed(URI arg0, SocketAddress arg1, IOException arg2) {
		// TODO Auto-generated method stub
		failed.add(arg0);
	}

}
