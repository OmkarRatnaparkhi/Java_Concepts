// Program to demonstrate frame creation by extending frame class

//We are going to inherit the Frame class and Awt_Frame class will get all that functionality.
import java.awt.*;				//Package 

class Awt_Frame extends Frame
{
		Awt_Frame(String name)
		{
			super(name);			// call for base class i.e Frame class constructor
		}
}

class Main
{
	public static void main(String args[])					//Entry point function
	{
		
		Awt_Frame f = new Awt_Frame("Main Frame");		
		
			
		f.setSize(500,500);								

		
		f.setVisible(true);									
	}
}