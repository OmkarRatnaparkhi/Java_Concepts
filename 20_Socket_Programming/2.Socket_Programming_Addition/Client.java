import java.util.*;
import java.io.*;
import java.net.*;

public class Client 
{
    public static void main(String[] args) 
	{
        int port = 5050;
        String ip = "localhost";
        Scanner userInput = new Scanner(System.in);

        try
		{
			Socket socket = new Socket(ip, port);

            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            System.out.println("Enter First number: ");
            int x = userInput.nextInt();

            System.out.println("Enter Second number: ");
            int y = userInput.nextInt();

            output.writeInt(x);
            output.writeInt(y);

            DataInputStream  input = new DataInputStream(socket.getInputStream());

            int sum = input.readInt();
            System.out.println("Addition is: "+ sum);

        }
		catch(IOException ex)
		{
            System.err.println(ex.getMessage());
        }
    }
}
