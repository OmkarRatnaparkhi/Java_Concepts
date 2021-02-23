import java.lang.*;

/*
How Clone method works in Java ?
-> java.lang.Object provides default implementation of clone() method in Java. It's declared as protected and native in Object class, so implemented in native code. 
   Since its convention to return clone() of an object by calling super.clone() method, any cloning process eventually reaches to java.lang.Object clone() method.  
   This method, first checks if the corresponding object implements Cloneable interface, which is a marker interface. If that instance doesn't implement Cloneable then 
   it throws CloneNotSupportedException in Java, a checked exception, which is always required to be handled while cloning an object. If an object passes this check, 
   than java.lang.Object's clone() method creates a shallow copy of the object and returned it to the caller.
-> Since Object class' clone() method creates copy by creating new instance, and then copying field-by-field, si>milar to assignment operator, it's fine for primitives 
   and Immutable object, but not suited if your class contains some mutable data structure e.g. Collection classes like ArrayList or arrays. In that case, both original
   object and copy of the object will point to the same object in the heap. You can prevent this by using the technique known as deep cloning, on which each mutable field
   is cloned separately. In short, here is how clone method works in Java
*/

/*
Q. What if we don’t implement Cloneable interface ?
* The program would throw CloneNotSupportedException if we don’t implement the Cloneable interface.  
  A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal  
  for that method to make a field-for-field copy of instances of that class.
  
*  It gives access to clone method.

* The Java.lang.Cloneable interface is a marker interface. It was introduced in JDK 1.0. There is a method 
  clone() in the Object class. Cloneable interface is implemented by a class to make Object.clone() method 
  valid thereby making field-for-field copy. This interface allows the implementing class to have its objects 
  to be cloned instead of using a new operator. 
*/
class Demo implements Cloneable		
{
	public int iNo1,iNo2;			//characteristics
	
	public Demo(int x, int y)		//Parameterized Constructor
	{
		iNo1 = x;					//initializing characteristics
		iNo2 = y;
	}	
	
	protected Object clone() throws CloneNotSupportedException		// clone method which has by default return type Object 		//Overriding method 
	{
		return  super.clone();		//Due to keyword super it accessess method of parent class i.e Object class and returns to our method of class Demo
	}
	//Here we have defined method in our class Demo which internally calls method of parent class i.e Object class 
}//end of class Demo

class Hello
{
	public static void main(String arg[]) throws Exception
	{
		Demo obj1 = new Demo(11,21);		//Object creation of class Demo	which has reference obj1		
		Demo obj2 = obj1;					//obj2 is just another reference to same object 				//shallow copy

		System.out.println(obj1.hashCode());		//hashCode = 681842940
		System.out.println(obj2.hashCode());		//hashCode = 681842940 i.e both obj1 and obj2 are reference referring to same object this is shallow copy
		
		Demo temp1 = new Demo(51,101);		//Object creation of class Demo	which has reference temp1
		Demo temp2 = (Demo)temp1.clone();			//Another Object creation of class Demo	which has reference temp2 and this object is created using clone method 
											//i.e it is clone of temp1 object.								//deep copy
//Here we have typecasted into (Demo). As return type of Object.clone() is Object, typecasting is needed to assign the returned Object reference to a reference to an object.
											
		
		System.out.println(temp1.hashCode());		//hashCode = 1392838282 
		System.out.println(temp2.hashCode());		//hashCode = 523429237 i.e both temp1 and temp2 are different object this is deep copy.
	}
}//end of class Hello


/* Shallow Copy
1) Whenever we use default implementation of clone method we get shallow copy of object means it creates new instance and copies all the field of object 
   to that new instance and returns it as object type, we need to explicitly cast it back to our original object. This is shallow copy of the object.
2) clone() method of the object class support shallow copy of the object. If the object contains primitive as well as nonprimitive or reference type 
   variable in shallow copy, the cloned object also refers to the same object to which the original object refers as only the object references gets 
   copied and not the referred objects themselves.
3) That’s why the name shallow copy or shallow cloning in Java. If only primitive type fields or Immutable objects are there then there is no difference 
   between shallow and deep copy in Java.
*/
/* Deep Copy

1) Whenever we need own copy not to use default implementation we call it as deep copy, whenever we need deep copy of the object we need to implement 
   according to our need.
2) So for deep copy we need to ensure all the member class also implement the Cloneable interface and override the clone() method of the object class.
*/
