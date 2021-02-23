import java.io.*;  

class Main
{  
	public static void main(String args[])
    {  
		try
		{  
			FileReader fr=new FileReader("f1.txt");  
			int i;  
			
			while((i=fr.read())!=-1)  
			System.out.print((char)i);   
        }
		catch(Exception e)
		{
			System.out.println(e);
		}  
		System.out.println("\nsuccess");  
    }  
}  