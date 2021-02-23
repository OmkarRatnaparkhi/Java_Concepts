import java.lang.*;

class MyInterger			//User defined Wrapper class
{
	public int no;					//characteristics
	public MyInterger(int x)		//Constructor
	{
		this.no = x;
	}
}

class Demo
{
	public void SwapOld(int x, int y)		//Call by Value
	{
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	//In swap  method we achieved explicitly call by reference
	public void Swap(MyInterger x, MyInterger y)		//Method 		//and x and y are reference to obj1 and obj2 respectively i.e they are just another name to same object obj1 and obj2 
	{								
		MyInterger temp = new MyInterger(0); 			//Object creation of MyInterger 
		temp.no = x.no;									//temp.no means object name and its characteristic
		x.no = y.no;
		y.no = temp.no;
	}
}

class Main
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();							//Object creation of Demo 
		
		MyInterger obj1 = new MyInterger(11); 			//Object creation of MyInterger
		MyInterger obj2 = new MyInterger(21);			//Object creation of MyInterger

		System.out.println("Before Swap "+obj1.no+" "+obj2.no);
		obj.Swap(obj1,obj2);
		System.out.println("After Swap "+obj1.no+" "+obj2.no);
	}	
}

