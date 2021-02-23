import java.io.*;  

class Main
{  
	public static void main(String args[])throws Exception
	{  
		FileOutputStream fout=new FileOutputStream("f1.txt");  
		BufferedOutputStream bout=new BufferedOutputStream(fout);  

		String s="Programming is fun";  
		byte b[]=s.getBytes();  
		bout.write(b);  
		System.out.println("Successfully written");
		bout.flush();  
		bout.close();  
		fout.close();  
	}  
}   