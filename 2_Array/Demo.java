import java.lang.*;
class Demo
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		System.out.println(arr.length);

		int brr[] = {10,20,30,40,50};
		System.out.println(brr.length);
		
		int iSum = 0;
		for(int i = 0; i<brr.length; i++)
		{
			iSum = iSum + brr[i];
		}
		System.out.println("Value of iSum :" + iSum);
		
		int iSum1=0;
		for(int no:brr)
		{
			iSum1 = iSum1 + no;
		}
		System.out.println("Value of iSum1 :" + iSum1);
	}
}