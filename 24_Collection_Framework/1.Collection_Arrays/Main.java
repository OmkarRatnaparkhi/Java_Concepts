// This program is used to demonstrate Arrays

import java.lang.*;
import java.io.*;
import java.util.*;

// Arrays class contains multiple methods which are applied on one dimentional array

class Main
{
	public static void main(String args[]) throws Exception
	{
		// Create an array of integers
		int arr[] = {3,7,8,1,4,5,2};

		int index = Arrays.binarySearch(arr,4);
		System.out.println("Element 4 is found at position "+ index);

		// Display contents of array
		System.out.println("\nContents of array are:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"	");
		}
		// Sort the array in asscending order
		Arrays.sort(arr);
		System.out.println("\n\nAfter sorting contents of array are:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"	");
		}
 
		// Search element is array by using binary search technique
		index = Arrays.binarySearch(arr,4);
		System.out.println("\n\nElement 4 is found at position "+ index);
		
		index = Arrays.binarySearch(arr,1);
		System.out.println("\nElement 1 is found at position "+ index);
	}
}









