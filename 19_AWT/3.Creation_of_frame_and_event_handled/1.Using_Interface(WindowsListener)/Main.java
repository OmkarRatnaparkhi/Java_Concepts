//Java Application which is used to create window as well as use to handle the event on that window. 
//Program to demonstrate event delegation model using ActionListener

import java.awt.*;				//Package 
import java.awt.event.*;

class Awt_Frame extends Frame   //Class which gets inherited from Frame class.
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
		
		Awt_Frame f = new Awt_Frame("Main Frame");			//Object creation of class and we have passed string.
		
		f.setSize(1500,1500);								
		
		f.setVisible(true);		
		
//		f.addWindowListener(new ActionListener());			//addWindowListener is method and to that method we have passed anonymous object of ActionListener as parameter.
		
		ActionListener ALobj = new ActionListener();		//Hello ALobj = new Hello();
		f.addWindowListener(ALobj);							//f.addWindowListener(ALobj);
	}
}
		
//class Hello implements WindowListener
class ActionListener implements WindowListener   // Class which implements WindowListener and WindowListener is interface
{
	public void windowActivated(WindowEvent e)
	{}
	
	public void windowClosed(WindowEvent e)
	{}
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
	public void windowDeactivated(WindowEvent e)
	{}
	
	public void windowIconified(WindowEvent e)
	{}
	
	public void windowDeiconified(WindowEvent e)
	{}
	
	public void windowOpened(WindowEvent e)
	{}	
}
