// Program to demonstrate displaying image on frame
// It support .gif and .jpg format

import java.awt.*;
import java.awt.event.*;

class AWT_Frame extends Frame
{
	// Create Image class object
	static Image im;

	AWT_Frame()	
	{
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent w)
		{
			System.exit(0);
		}		
		});

		// Create Image object and load the image		
		im = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Omkar\\Desktop\\Practise\\19_AWT\\Givn\\New_folder\\Image.jpg");

		// Create object of MediaTracker for waiting purpose		
		MediaTracker m = new MediaTracker(this);

		// Add image
		// 1 is id for that image
		m.addImage(im,1);
		try
		{
			m.waitForID(1);
		}
		catch(InterruptedException e)
		{}		
	}

	public void paint(Graphics g)
	{
		// Draw image on screen
		g.drawImage(im,0,0,null);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame f = new AWT_Frame();
		
		// set size of window
		f.setSize(1200,800);
		
		// set title of window
		f.setTitle("Main Frame");

		// Display that frame
		f.setVisible(true);
	}
}