package Java_AdvanceTraining_Day2_Wipro;

import java.io.File;

import java.net.MalformedURLException;

public class URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		URL url;
		try {
			url = new URL ("http://www.google.com");
			
			System.outprintln("Protocol :" +url.getProtocol());
			System.outprintln("Host Name :" +url.getHost());
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
