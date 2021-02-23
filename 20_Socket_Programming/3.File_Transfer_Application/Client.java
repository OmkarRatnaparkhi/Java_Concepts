import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[]) throws Exception
	{
		byte []b = new byte[2048];
		System.out.println("Client is running....");
		
		Socket s = new Socket("localhost",2101);
		
		System.out.println("Connection Established");
		
		InputStream is = s.getInputStream();
		FileOutputStream fr = new FileOutputStream("E:\\Replace\\newom.txt");
		is.read(b,0,b.length);
		fr.write(b,0,b.length);	
	
		System.out.println("File Successfully transferred");
	}
}