import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Server is running");
		
		ServerSocket ss = new ServerSocket(2101);
		
		Socket s = ss.accept();
		
		System.out.println("Connection is successfully established");
		
		FileInputStream fr = new FileInputStream("C:\\Users\\Omkar\\Desktop\\Practise\\om.txt");			//Path of that file

		byte []b = new byte[2048];
		fr.read(b,0,b.length);
		
		OutputStream os = s.getOutputStream();
		os.write(b,0,b.length);
	}
}