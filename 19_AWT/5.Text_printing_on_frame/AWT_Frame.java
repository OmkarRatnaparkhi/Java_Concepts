// Program to demonstrate text printing on frame
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
*	- Since this is triggered by such events, the programmer seldom needs to call paint() or paintComponent() explicitly
*	
*	- The programmer can call repaint() (also a Component method) to force the paint operation, if the need arises (i.e. some situation not covered by the automatic calls to paint()
*	
*	- These methods both take as a parameter a reference variable of type Graphics -- which is an abstract class. The object will be a subtype that handles the drawing context for the
*      given platform
*	
*	- For Swing components, it is usually sufficient to just define paintComponent() for drawing aspects, unless you want to control the other parts (border, children) as well
*	
*	- So, what can we DO in the paint() or paintComponent() methods? Pretty much anything that's available in the Graphics class, and then some.
********************************************************************************************************************************************************************************************/

/********************************************************************************************************************************************************************************************

Class Graphics 
public abstract class Graphics
extends Object

The Graphics class is the abstract base class for all graphics contexts that allow an application to draw onto components that are realized on various devices, as well as
onto off-screen images.
A Graphics object encapsulates state information needed for the basic rendering operations that Java supports. This state information includes the following properties:
The Component object on which to draw.
A translation origin for rendering and clipping coordinates.
The current clip.
The current color.
The current font.
The current logical pixel operation function (XOR or Paint).
The current XOR alternation color (see setXORMode(java.awt.Color)).

Coordinates are infinitely thin and lie between the pixels of the output device. Operations that draw the outline of a figure operate by traversing an infinitely thin 
path between pixels with a pixel-sized pen that hangs down and to the right of the anchor point on the path. Operations that fill a figure operate by filling the interior
of that infinitely thin path. Operations that render horizontal text render the ascending portion of character glyphs entirely above the baseline coordinate.

The graphics pen hangs down and to the right from the path it traverses. This has the following implications:
		-If you draw a figure that covers a given rectangle, that figure occupies one extra row of pixels on the right and bottom edges as compared to filling a figure that is 
		 bounded by that same rectangle.
		-If you draw a horizontal line along the same y coordinate as the baseline of a line of text, that line is drawn entirely below the text, except for any descenders.

All coordinates that appear as arguments to the methods of this Graphics object are considered relative to the translation origin of this Graphics object prior to the invocation
of the method.

All rendering operations modify only pixels which lie within the area bounded by the current clip, which is specified by a Shape in user space and is controlled by the program 
using the Graphics object. This user clip is transformed into device space and combined with the device clip, which is defined by the visibility of windows and device extents. 
The combination of the user clip and device clip defines the composite clip, which determines the final clipping region. The user clip cannot be modified by the rendering system 
to reflect the resulting composite clip. The user clip can only be changed through the setClip or clipRect methods. All drawing or writing is done in the current color, using 
the current paint mode, and in the current font.



Commonly used methods of Graphics class:
1.	public abstract void drawString(String str, int x, int y): is used to draw the specified string.
2.	public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
3.	public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
4.	public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
5.	public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
6.	public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
7.	public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
8.	public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
9.	public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
10.	public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
11.	public abstract void setFont(Font font): is used to set the graphics current font to the specified font.

	drawString is one of the most used method from Graphics class to generate text out in a Swing Window. The drawString() method can be used with abstract 
	and void modifiers. 
	General Syntax:
	i)drawString(String str, int x, int y)
	String str is the string that can be displayed on the screen. Integer type x and y are the variables hold the x and y position on the graphical window. 
	
	ii)drawString(AttributedCharacterIterator iterator, int x, int y)
	Renders the text of the specified iterator applying its attributes in accordance with the specification of the TextAttribute class. An AttributedCharacterIterator 
	allows iteration through both text and related attribute information. An attribute is a key/value pair, identified by the key. No two attributes on a given character 
	can have the same key. The values for an attribute are immutable, or must not be mutated by clients or storage. They are always passed by reference, and not cloned.

********************************************************************************************************************************************************************************************/

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

	public void paint(Graphics g)
	{
		// set background of frame
		this.setBackground(new Color(255,255,255));
		
		// Create font object for printing
		Font fn = new Font("Century",Font.BOLD,55);

		// set the font
		g.setFont(fn);
	
		// set font color
		g.setColor(Color.blue);

		// Draw string on frame
		g.drawString("Welcome",500,250);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame f = new AWT_Frame();
		
		// set size of window
		f.setSize(1200,500);
		
		// set title of window
		f.setTitle("Main Frame");

		// Display that frame
		f.setVisible(true);
	}
}