package thread;

import javax.xml.bind.DatatypeConverter;

public class CallbackDigestUserInterface {
	public static void receiveDigest(byte[] digest, String name){
		StringBuilder result = new StringBuilder(name);
		result.append(": ");
		result.append(DatatypeConverter.printHexBinary(digest));
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String filename:args){
			CallbackDigest cb = new CallbackDigest(filename);
			Thread t = new Thread(cb);
			t.start();
		}
	}

}
