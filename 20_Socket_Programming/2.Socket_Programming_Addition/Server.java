import java.io.*;
import java.net.*;

public class Server 
{
    public static void main(String[] args) 
	{
        try
		{
			ServerSocket ss = new ServerSocket(5050);
			
			while(true)
			{
				Socket socket = ss.accept();
                try
				{
					DataInputStream  input = new DataInputStream(socket.getInputStream());

                    Integer x = input.readInt();
                    Integer y = input.readInt();

                    Integer sum = (x + y);
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    out.writeInt(sum);

                }
				catch(SocketTimeoutException s)
                {
					System.out.println("Socket timed out!");
                    break;
                }
				catch(IOException e)
                {
					e.printStackTrace();
                    break;
                }
            }

        }
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
        }
    }
}