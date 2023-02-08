package HistorynBeginingg;

public class jvm_jre_jdk {
	
	public static void main(String args[]) {
		
		/*JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist. 
		It is a specification that provides a runtime environment in which Java bytecode can be executed. It can also run those programs 
		which are written in other languages and compiled to Java bytecode.
		*/
		/*JVMs are available for many hardware and software platforms. JVM, JRE, and JDK are platform dependent because the configuration 
		of each OS is different from each other. However, Java is platform independent. There are three notions of the JVM: specification,
		implementation, and instance.
		
		A ..specification.. where working of Java Virtual Machine is specified. But implementation provider is independent to choose the algorithm.
		Its has been provided by Oracle and other companies.
		An ..implementation.. Its implementation is known as JRE (Java Runtime Environment).
        ..Runtime Instance.. Whenever you write java command on the command prompt to run the java class, an instance of JVM is created.
		*/
		/*
		 * The JVM performs the following main tasks:
		 * Loads code
		 * Verifies code
		 * Executes code
		 * Provides runtime environment
		 * 
		 * 
		 * JVM provides definitions for the:

         Memory area
         Class file format
         Register set
         Garbage-collected heap
          Fatal error reporting etc.
		 */
		/*
		 Let's understand the internal architecture of JVM. It contains classloader, memory area, execution engine etc.
		 
		 Classloader is a subsystem of JVM which is used to load class files. Whenever we run the java program, it is loaded first by the classloader. 
		 There are three built-in classloaders in Java.
		 
		 *Bootstrap ClassLoader: This is the first classloader which is the super class of Extension classloader.
		 It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes,
		 java.util package classes, java.io package classes, java.sql package classes etc.
		 
         *Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader.
         It loades the jar files located inside $JAVA_HOME/jre/lib/ext directory.
         
         *System/Application ClassLoader: This is the child classloader of Extension classloader. 
         It loads the classfiles from classpath. By default, classpath is set to current directory. You can change the classpath
          using "-cp" or "-classpath" switch. It is also known as Application classloader.

		 */
		
		 // Let's print the classloader name of current class.   
        //Application/System classloader will load this class  
        Class c=jvm_jre_jdk.class;  
        System.out.println(c.getClassLoader());  //jdk.internal.loader.ClassLoaders$AppClassLoader@22d8cfe0
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader());  //null
        
        
        
        /*
         * Class(Method) Area stores per-class structures such as the runtime constant pool, field and method data, the code for methods.
         * 
         * Heap- It is the runtime data area in which objects are allocated.
         * 
         * Java Stack stores frames. It holds local variables and partial results, and plays a part in method invocation and return.
           Each thread has a private JVM stack, created at the same time as thread.
           A new frame is created each time a method is invoked. A frame is destroyed when its method invocation completes.
         *
         * PC (program counter) register contains the address of the Java virtual machine instruction currently being executed.
         * 
         * native method stack - It contains all the native methods used in the application.
         * 
         * 
         * Execution Engine
          It contains:

          
          A virtual processor
        
          Interpreter: Read bytecode stream then execute the instructions.
        
          Just-In-Time(JIT) compiler: It is used to improve the performance. 
          JIT compiles parts of the byte code that have similar functionality at the same time, and hence reduces the amount 
          of time needed for compilation. Here, the term "compiler" refers to a translator from the instruction
          set of a Java virtual machine (JVM) to the instruction set of a specific CPU.
        
        *Java Native Interface
         Java Native Interface (JNI) is a framework which provides an interface to communicate with another application 
         written in another language like C, C++, Assembly etc. Java uses JNI framework to send output to the Console or interact with OS libraries.
         
         */
        
        
        /*JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. The Java Runtime Environment
         *  is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment.
         *   It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

             The implementation of JVM is also actively released by other companies besides Sun Micro Systems.
         * 
         * inside a box, we have jvm and then set of libraries eg rt.jar etc and other files
         */
        
        /*
         * JDK is an acronym for Java Development Kit. The Java Development Kit (JDK) is a software development 
         * environment which is used to develop Java applications and applets. It physically exists. It contains JRE + development tools.

        JDK is an implementation of any one of the below given Java Platforms released by Oracle Corporation:

         Standard Edition Java Platform
         Enterprise Edition Java Platform
         Micro Edition Java Platform
        
           The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), 
           a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application.
         * 
         * 
         * inside a box for jre we have jvm, set of libraries, other files and then in another box we got development tools eg., javac, java etc
         */
		


		
	}

}
