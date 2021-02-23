// Program to demonstrate concept of adapter class

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
		
		// Add action listener to frame
		// Pass the object of class which implments WindowListener
		f.addWindowListener(new ActionListener());	
	}
}

// Class which extends windowAdapter
class ActionListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}