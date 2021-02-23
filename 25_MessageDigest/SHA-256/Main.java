// This program is used to generate checksum of string using SHA-256

import java.security.MessageDigest;
import java.util.Scanner;

public class Main 
{
   public static void main(String args[]) throws Exception
   {
		//Reading data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message");
		String message = sc.nextLine();
	  
		//Creating the MessageDigest object  
		MessageDigest MD = MessageDigest.getInstance("SHA-256");

		//Passing data to the created MessageDigest Object
		MD.update(message.getBytes());
		
		//Compute the message digest
		byte[] digest = MD.digest();      
		System.out.println(digest);  
		
		//Converting the byte array in to Hexa String format
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0;i<digest.length;i++) 
		{
			sb.append(Integer.toHexString(0xFF & digest[i]));
		}
		
		System.out.println("Hex format : " + sb.toString());     
	}
}