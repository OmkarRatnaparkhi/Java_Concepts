// Program to demonstrate basic frame creation 

//Just created Frame class object.
import java.awt.*;				//Package 

class Main
{
	public static void main(String args[])					//Entry point function
	{
		
		Frame f = new Frame("Main Frame");		// Create new frame	//Object creation of frame class which is present in awt pacakge and to object we have passed string
		
			
		f.setSize(500,500);									// Decide size of that Frame  //setSize method used to set size of frame.

		
		f.setVisible(true);									// Display that frame        //setVisible method used to display that frame.
	}
}