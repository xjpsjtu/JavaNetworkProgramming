import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(URLEncoder.encode("This string has spaces", "UTF-8"));
			System.out.println(URLEncoder.encode("This*string*has*asterisks","UTF-8"));
			System.out.println(URLEncoder.encode("This%string%has%percent%signs","UTF-8"));
			System.out.println(URLEncoder.encode("This+string+has+pluses","UTF-8"));
			System.out.println(URLEncoder.encode("This/string/has/slashes","UTF-8"));
			System.out.println(URLEncoder.encode("This\"string\"has\"quote\"marks","UTF-8"));
			System.out.println(URLEncoder.encode("This:string:has:colons","UTF-8"));
			System.out.println(URLEncoder.encode("This~string~has~tildes","UTF-8"));
			System.out.println(URLEncoder.encode("This(string)has(parentheses)","UTF-8"));
			System.out.println(URLEncoder.encode("This.string.has.periods","UTF-8"));
			System.out.println(URLEncoder.encode("This=string=has=equals=signs","UTF-8"));
			System.out.println(URLEncoder.encode("This&string&has&ampersands","UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Broken VM does not support UTF-8");
		}
	}

}
