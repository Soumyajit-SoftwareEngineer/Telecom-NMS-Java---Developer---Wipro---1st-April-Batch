package Java_AdvanceTraining_Day2_Wipro;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket_Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

		ServerSocket ss = new ServerSocket (6666);
        System.out.println("Server is waiting at port 6666");

        Socket s = ss.accept(); //Establlishes a connection.

			//Connected with the client data..
	DataInputStream dis = new DataInputStream (s.getInputStream());
	String str = dis.readUTF(); //Reads the client data..
	System.out.println("Received data from client is: "+str);
          ss.close();
 	} catch (IOException ex) { 
				System.out.println(ex);

	}

	}
}
