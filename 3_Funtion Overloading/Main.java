import java.lang.*;

class Hello
{
	public int add(int no1,int no2)
	{
		return no1 + no2;
	}
	
	public int add (int no1,int no2, int no3)
	{
		return no1+no2+no3;
	}
	
	public float add(float no1, float no2)
	{
		return no1 + no2;
	}
}

class Main
{
	public static void main(String args[])
	{
		System.out.println("Inside main");
		
		Hello hobj = new Hello();
		
		int iRet = 0;
		iRet = hobj.add(10,12);
		System.out.println("Addition of two numbers is:" +iRet);
		
		iRet = hobj.add(10,20,40);
		System.out.println("Addition of two numbers is:" +iRet);
	
		float fRet = 0.0f;
		fRet = hobj.add(15.5f,15.5f);
		System.out.println("Addition of two numbers is:" +fRet);
	}
}