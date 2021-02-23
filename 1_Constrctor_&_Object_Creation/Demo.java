import java.lang.*;

class Arithematic 
{ 	
	public int iNo1;
	public int iNo2;
	
	Arithematic()
	{
		this.iNo1 = 10;
		iNo2 = 30;
	}
	
	Arithematic(int x, int y)
	{
		iNo1 = x;
		iNo2 = y;
	}
	
	public int add()
	{
		return iNo1 + iNo2;
	}
}

class Demo
{
	public static void main(String args[])
	{
		Arithematic obj1;
		obj1 = new Arithematic();
		int ret = obj1.add();
		System.out.println(ret);
	}
}