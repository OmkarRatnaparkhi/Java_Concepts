// This program is used to generate MD5 Checksum for Files
/*********************************************************************************************************************************************************************************

-An alphanumeric value i.e. the sequence of letters and numbers that uniquely defines the contents of a file is called a checksum.
-Checksums are generally used to check the integrity of files downloaded from an external source 
-MD5 and SHA are the two most widely used checksum algorithms. You must ensure that you use the same algorithm that has been used to generate the checksum when checking checksums. 
 For example, the MD5 checksum value of a file is totally different from its SHA-256 checksum value.
-To produce a checksum, you run a program that puts that file through an algorithm. Typical algorithms used for this include MD5, SHA-1, SHA-256, and SHA-512.
-These algorithms use a cryptographic hash function that takes an input and generates a fixed-length alphanumeric string regardless of the size of the file.


MD5
Message Digest Algorithm 5 (MD5) is a cryptographic hash algorithm that can be used to create a 128-bit string value from an arbitrary length string. Although there has been 
insecurities identified with MD5, it is still widely used. MD5 is most commonly used to verify the integrity of files. 

getInstance
public static MessageDigest getInstance(String algorithm) throws NoSuchAlgorithmException
-Returns a MessageDigest object that implements the specified digest algorithm.
-This method traverses the list of registered security Providers, starting with the most preferred Provider. A new MessageDigest object encapsulating the MessageDigestSpi 
implementation from the first Provider that supports the specified algorithm is returned.Note that the list of registered providers may be retrieved via the Security.getProviders() 
method.
-Parameters:
algorithm - the name of the algorithm requested. See the MessageDigest section in the Java Cryptography Architecture Standard Algorithm Name Documentation for information about standard algorithm names.
-Returns:
a Message Digest object that implements the specified algorithm.

*********************************************************************************************************************************************************************************/

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class Main
{
	public static void main(String args[]) throws IOException, NoSuchAlgorithmException 
	{
		//Object creation of File class with reference file and path of file is passed as parameter(We want to generate checksum of this file)
		File file1 = new File("C:\\Users\\Omkar\\Desktop\\Practise\\25_MessageDigest\\MD5\\Data\\Data(1).txt");			
		File file2 = new File("C:\\Users\\Omkar\\Desktop\\Practise\\25_MessageDigest\\MD5\\Data\\Data(2).txt");
		File file3 = new File("C:\\Users\\Omkar\\Desktop\\Practise\\25_MessageDigest\\MD5\\Data\\Data(3).txt");
		
		//The getInstance() method of java.security.MessageDigest class used to return a object of MessageDigest type that applys the assigned MessageDigest algorithm.
		//Returns a MessageDigest object that implements the specified digest algorithm.
		//Parameters: This method accepts the name of the standard Algorithm as a parameter.		Return Value: This method provides an object of type MessageDigest.
		//instantiate a MessageDigest Object by passing string "MD5" this means that this object will use MD5 hashing algorithm to generate the checksum 
		MessageDigest MD = MessageDigest.getInstance("MD5");    
		if(MD == null)
		{
			System.out.println("Unable to get the MD5");
			System.exit(0);
		}
		
		String checksum1 = Checksum(MD,file1);													//Call for checksum method.
		System.out.println("File name : " +file1.getName()+"\tChecksum : "+checksum1);			//Display checksum of file	
		
		String checksum2 = Checksum(MD,file2);													//Call for checksum method.		
		System.out.println("File name : " +file2.getName()+"\tChecksum : "+checksum2);			//Display checksum of file	
		
		String checksum3 = Checksum(MD,file3);													//Call for checksum method.
		System.out.println("File name : " +file3.getName()+"\tChecksum : "+checksum3);			//Display checksum of file	
					
	}
	
	public static String Checksum(MessageDigest digest, File file) throws IOException 				//this method return the complete  hash(checksum) of the file 
	{
		FileInputStream fis = new FileInputStream(file);						//Get file input stream for reading the file(data of file)
		
		byte byteArray[] = new byte[1024];										//Create byte array to read data of file in chunks 
		int Rcount = 0;
		
		
		while((Rcount = fis.read(byteArray)) != -1)								//read the data from file and update that data in the message digest
		{
			digest.update(byteArray,0,Rcount);									//update() -> Updates the digest using the specified byte.
		}
		
		
		byte bytes[] = digest.digest();											//store the bytes returned by the digest() method. digest() is used to return hashbytes 
		//this array of bytes has bytes in decimal format so we need to convert it into hexadecimal format 
	
        // for this we create an object of StringBuilder since it allows us to update the string i.e. its mutable 
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < bytes.length; i++)									// loop through the bytes array
		{
			// the following line converts the decimal into hexadecimal format and appends that to the StringBuilder object
			sb.append(Integer.toString((bytes[i] & 0Xff) + 0X100, 16).substring(1));
		}
		//The toString() method of java.security.MessageDigest class is used to provide the object of message digest in string format.
		//The java string substring() method returns a part of the string.We pass begin index and end index number position in the java substring method where start index is 
		//inclusive and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.
		
		// close the input stream 
        fis.close(); 
		 
        return sb.toString();					//return the complete hash 
	}
}

/*********************************************************************************************************************************************************************************
*	
*	Generating Checksum in Java:
*	- Java provides an inbuilt functionality of generating these hash functions through MessageDigest Class present in the security package of Java. Message digests are encrypted 
*	  one-way hash functions that take data of arbitrary size and produce a hash value of fixed length.
*	- We first start with instantiating the MessageDigest Object by passing any valid hashing algorithm string.
*	- Then we update this object till we read the complete file. Although we can use the digest(byte[] input) which creates a final update on the MessageDigest object by reading 
* 	  the whole file at once in case the file is too big/large we might not have enough memory to read the entire file as a byte array and this could result in 
*	  Java.lang.OutOfMemoryError: Java Heap Space.
*	- So, It’s better to read data in parts and update MessageDigest.
*	- Once the update is complete one of the digest method is called to complete the hash computation. Whenever a digest method is called the MessageDigest object is reset to 
*	  its initialized state. The digest method returns a byte array that has bytes in the decimal format so we Convert it to hexadecimal format. And the final string is the 
*	  checksum.
*
*********************************************************************************************************************************************************************************/