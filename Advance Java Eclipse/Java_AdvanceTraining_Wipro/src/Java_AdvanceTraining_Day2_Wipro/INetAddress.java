package Java_AdvanceTraining_Day2_Wipro;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class INetAddress {
	public static void main (String args[]) {
		
		try {

			InetAddress IA = InetAddress.getByName ("www.google.com");
			System.out.println("Host Name : " + IA.getHostName()); 
			System.out.println("IP Address: "+ IA.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
