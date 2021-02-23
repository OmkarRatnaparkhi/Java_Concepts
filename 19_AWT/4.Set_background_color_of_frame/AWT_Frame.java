// Program to demonstrate background color setting of frame

/*********************************************************************************************************************************************************************************************
*
*	paint() methods :
*	- Lightweight Swing components that extend class JComponent have a method called paintComponent, with this prototype:
*	  public void paintComponent(Graphics g)
*
*	- Another similar method is the paint method in class Component (and thus all its children) with this prototype:
*	  public void paint(Graphics g)
*	
*	- The JComponent version of paint() actually delegates its work to three methods: paintComponent, paintBorder, and paintChildren
*	  The idea behind paint() is that they are invoked for any component automatically whenever that component needs to be drawn or re-drawn. Some examples of triggering events:
*		1.	When the component first is placed on the application
*		2.	When the component is resized
*		3.	When the component is covered by some other application, then uncovered and comes to the forefront again
*	
*	- Since this is triggered by such events, the programmer seldom(not often) needs to call paint() or paintComponent() explicitly. Indirectly this method is automatically 
*	  called i.e callback method.
*	
*	- The programmer can call repaint() (also a Component method) to force the paint operation, if the need arises (i.e. some situation not covered by the automatic calls to paint()
*	
*	- These methods both take as a parameter a reference variable of type Graphics -- which is an abstract class. The object will be a subtype that handles the drawing context for the
*      given platform
*	
*	- For Swing components, it is usually sufficient to just define paintComponent() for drawing aspects, unless you want to control the other parts (border, children) as well
*	
*	- So, what can we DO in the paint() or paintComponent() methods? Pretty much anything that's available in the Graphics class, and then some.	
*
********************************************************************************************************************************************************************************************/

/*********************************************************************************************************************************************************************************************
*
*	public void paint(Graphics g)
*	-It is true that this method will be invoked when it is time to paint, but painting actually begins higher up the class heirarchy, 
*	 with the paint method (defined by java.awt.Component.) This method will be executed by the painting subsystem whenever you component 
*	 needs to be rendered. Its signature is : public void paint(Graphics g).
*	-When an applet starts executing, paint( Graphics g ) is automatically called.
*
*
*	Constructor present in Color class:	
*	Color(int r, int g, int b)
*	Creates an opaque sRGB color with the specified red, green, and blue values in the range (0 - 255).
*
*	RGB Colors
*	-RGB color values are supported in all browsers.
*	-An RGB color value is specified with: rgb(red, green, blue).
*	-Each parameter (red, green, and blue) defines the intensity of the color as an integer between 0 and 255.
*	-For example, rgb(0, 0, 255) is rendered as blue, because the blue parameter is set to its highest value (**255) and the others are set to 0.	
*
********************************************************************************************************************************************************************************************/


/*

*/

import java.awt.*;
import java.awt.event.*;

class AWT_Frame extends Frame
{
	AWT_Frame()	
	{
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent w)
		{
			System.exit(0);
		}		
		});
	}

	public void paint(Graphics g)				//g is reference to the Graphics class
	{
		//Color class is extended from Object class and here we have created anonymous object of color class and to that  
		//object we have passed some integer values and this values are passed to constructor of that class 		
		this.setBackground(new Color(255,155,55)); 	//this R=255,G=155,B=55 are RGB values.		
		
		//Here 
//		this.setBackground(Color.blue);				//Here Color.blue gives built-in java colors
	}	

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame f = new AWT_Frame();
		
		// set size of window
		f.setSize(300,300);
		
		// set title of window
		f.setTitle("Main Frame");

		// Display that frame
		f.setVisible(true);
	}
}