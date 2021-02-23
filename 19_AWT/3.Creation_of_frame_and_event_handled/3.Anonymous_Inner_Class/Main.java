import java.awt.*;
import java.awt.event.*;

class Main extends Frame
{
	Main(String name)	
	{
		// call Frame class constructor
		super(name);
	}

	public static void main(String args[])
	{
		// Create new frame
		Main f = new Main("Main Frame");
		
		// Decide size of that Frame
		f.setSize(500,500);

		// Display that frame
		f.setVisible(true);
		
		// anonymous inner class
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
	}
}