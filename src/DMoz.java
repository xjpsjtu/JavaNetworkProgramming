import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DMoz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL u = new URL(args[0]);
			try(InputStream in = new BufferedInputStream(u.openStream())){
				InputStreamReader theHTML = new InputStreamReader(in);
				int c;
				while((c = theHTML.read()) != -1){
					System.out.print((char)c);
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		} catch(IOException ex){
			System.err.println(ex);
		}
	}

}
