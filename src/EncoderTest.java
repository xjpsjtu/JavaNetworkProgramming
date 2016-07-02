import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(URLEncoder.encode("This string has spaces", "UTF-8"));
			System.out.println(URLEncoder.encode("This*string*has*asterisks","UTF-8"));
			System.out.println(URLEncoder.encode("This%string%has%percent%signs","UTF-8"));
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
