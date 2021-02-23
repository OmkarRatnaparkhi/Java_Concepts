# Java_Concepts

**Java:**
Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA)

**History of java :**
- Java was originally developed by James Gosling at Sun Microsystems and released in 1995 as a core component of Sun Microsystems Java platform.
Later Sun Microsystems was acquired by Oracle. 
- The designed target of java was for interactive televisions but it was too advanced for the digital cable television industry at the time.
- The language was initially called Oak after an oak tree that stood outside Gosling's office. 
- Later the project went by the name Green and was finally renamed Java, from Java coffee, the coffee from Indonesia. 
- Gosling designed Java with a C/C++-style syntax that system and application programmers would find familiar.

**Characterstics of java :**
1. Pure object oriented : Everything in Java is considered as class due to which it is considered as pure object oriented language. 
2. Internationally accepted (Unicode) : Java supports unicode strategy by increasing the size of character. In Java size of character is two byte due to which it can hold all international languages.
3. Network savy(based) : There is an inbuild support for Java, to design such application which uses the networking concepts.
4. Compiled and interpreted : Java program is compiled into the bytecode and that bytecode gets interpreted by JVM for the execution purpose.
5. Multitreaded language : There is an inbuilt support for multitreading in Java.
6. Platform independent : As Java is virtual machine based language the Java program gets executed on any operating system.
7. Architecture neutral : Java application gets executed on any type of microprocessor(intel, Amd, Arm etc) due to its virtual machine.
8. Automatic Garbage Collection : As a programmer there is no need to deallocate the memory explicitly. Memory deallocation is performed by Garbage collector of Java. 
9. Dynamic :  Everthing in Java is considered as dynamic(memory allocation and function binding).
10. Statically typed language - In Java datatype of variable should be fixed at compile time itself.
11. Simple - As compared to C & C++ Java is simple. There are many complicated concept which are removed from Java are like pointer, virtual, copy constructor,multiple inheritance,
operatog overloading, friend function etc.

**Tool chain in Java:**
<p align="center">
  <img src="https://github.com/OmkarRatnaparkhi/Java_Concepts/blob/main/%23Assets/Toolchain.jpeg" alt="Toolchain">
</p>

- As a programmer we can write our program on any editor or IDE.
- After writing the program we save that file with extension .java example:Demo.java,Hello.java .
- Our .java file is passed towards the java compiler(javac) after successful compilation .class file(Demo clas) gets generated which contain bytecode in it.
- Bytecode is code which is understandable by JVM(Java virtual machine).Java bytecode is the instruction set for the Java Virtual Machine. It acts similar to an assembler which is an   alias representation of a C++ code. 
- Interpreter interprets our .class file and execute the instruction inside JVM. 
- If instruction is handled by JVM then it get executed internally otherwise that instruction gets forwarded towards the operating system.  
