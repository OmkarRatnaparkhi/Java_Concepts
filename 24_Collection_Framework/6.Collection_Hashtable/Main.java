// This program is used to demonstrate Hashtable

/******************************************************************************************************************************************************************
Java Hashtable class
Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface

- A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable 
  contains values based on the key.
- Java Hashtable class contains unique elements.
- Java Hashtable class doesn't allow null key or value.
- Java Hashtable class is synchronized.
- The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
******************************************************************************************************************************************************************/

import java.lang.*;
import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[]) throws Exception
	{
		// Where String is key and integer is value
		Hashtable <String,Integer> ht = new Hashtable<String,Integer>();

		// Insert the contents in Hashtable
		ht.put("Google",10);			
		ht.put("Quick heal",20);
		ht.put("Persistant",30);
		ht.put("Avaya",40);
		ht.put("Infosys",50);

		// We can use enumerator to enumerate the Hashtable
		System.out.println("Enumeratinging the Hashtable");
		Enumeration it = ht.keys();
		while(it.hasMoreElements())
		{
			System.out.println(it.nextElement() + " ");
		}
		
		// We can retrive the contents from hash table 
		System.out.println("\nValue of Google is " + ht.get("Google"));

		// We can remove element by specifying key
		ht.remove("Infosys");

		// We can retrive size of Hash table
		System.out.println("Size of hash table is "+ht.size());

		// We can remove all elements from Hashtable
		ht.clear();
	}
}