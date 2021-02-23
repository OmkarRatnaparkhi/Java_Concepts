// This program is used to demonstrate ArrayList
import java.lang.*;
import java.io.*;
import java.util.*;

class Student												
{
	int rno;												//characteristics
	String name;
	int age;
	int marks;
	
	Student(int rollno,String name,int age,int marks) 		//constructor 
	{
		this.rno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}

public class Main
{
	public static void main(String arg[])
	{
		//Creating user-defined class objects 
		Student s1 = new Student(101,"A",21,78);		
		Student s2 = new Student(102,"B",24,76);
		Student s3 = new Student(103,"C",23,59);
		Student s4 = new Student(104,"D",20,80);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);		//adding Student class object
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator itr = al.iterator();
		//traversing elements of ArrayList object  
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rno+" "+st.name+" "+st.age+" "+st.marks);
		}
	}
}