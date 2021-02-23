// This program is used to retrive the IP address of website

/**********************************************************************************************************************************************************************************
*
*	InetAddress -> (Class)
*	-This class represents an Internet Protocol (IP) address.
*	-The java.net.InetAddress class provides methods to get the IP of any host name for example www.google.com, www.facebook.com, etc.
*	-There are two types of address types: Unicast and Multicast. The Unicast is an identifier for a single interface whereas Multicast is an identifier for a set of interfaces.
*	-InetAddress has a cache mechanism to store successful and unsuccessful host name resolutions.
*
*	getByName(String host) -> method from class InetAddress	
*	Determines the IP address of a host, given the host's name.
*
**********************************************************************************************************************************************************************************/

import java.io.*;
import java.net.*;

class Main
{
	public static void main(String args[]) throws IOException
	{
		// Create offset of BuffredReader to accept the input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter website name");
		
		// Accept name of website
		String s = br.readLine();
		try
		{
			// Create address of InetAddress to fetch the IP address
			// getByName is used to retrive the 
			InetAddress i = InetAddress.getByName(s);
			System.out.println("IP address is :" +i);
		}
		catch(UnknownHostException e)
		{
			System.out.println("Website not found");
		}
	}
}

/*
OUTPUT :
Enter website name
www.yahoo.com
IP address is :www.yahoo.com/106.10.138.240
*/