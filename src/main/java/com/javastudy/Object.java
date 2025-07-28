// example of creation of user-defined package
package com.javastudy;

// import all classes from java.util package
import java.util.*;
// import a class from java.util package
import java.util.Scanner;

// classes
// OOP - Object-Oriented Programming
// classes must be inside their own .java file
// classes names must start with uppercase letter at the beginning and must match the .java file name

//how to define a class
// <accessModifier> class <className> {}
public class Object {
	// attributes: <dataType> <attributeName>; or to declare a default value: <dataType> <attributeName> = <value>; 
	String name;
	String category;
	int size;
	// constant properties: add final at the beginning
	final int weight = 100;
	
	// constructor: special methods to initialize objects
	// <accessModifier> <className>( optional: <dataType> <attributeName>, ...) {}
	public Object() {
		// this: a keyword that refers to the current object in a method/constructor
		// this: in below case, 'this' is used to refer to the constructor of the current class
		this("non-specified", "non-specified");
	}
	
	public Object(String name, String category) {
		// this: a keyword that refers to the current object in a method/constructor
		// this: in below case, 'this' is used to refer to the attributes inside the current class
		this.name = name;
		this.category = category;
	}
	
	// -------------------------------------- Methods -------------------------------------------------- //
	
	// static methods: no need to create an instance of the class, just call the class
	// optional: <accessModifier> static <returnType> <methodName>(optional: <dataType> <parameterName>, ...) {}
	public static void staticShowName() {
		System.out.println("This is a static method.");
	}
	
	// non-static methods: need to create an instance of the class
	// optional: <accessModifier> static <returnType> <methodName>(optional: <dataType> <parameterName>, ...) {}
	public void showName() {
		System.out.println(this.name);
	}
	
	// -------------------------------------- Modifiers -------------------------------------------------- //
	
	// modifiers: change the properties of classes/methods/variables
	// two types:
	// - access modifier: controls the access level
	// - non-access modifier: provides other functionalities non-related to access
	
	// -------------------------------------- Access Modifiers -------------------------------------------------- //
	
	// there are only two access modifiers for CLASSES:
	// public: accessible by any other class
	public Object(int size) {
		this.size = size;
	}
	// default (when we don't specify any modifier): only accessible by classes in the same package 
	Object(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	// there are 4 access modifiers for attributes/methods/constructors
	// public: accessible for all classes
	public int age;
	// private: accessible only within the declared class
	private String color;
	// default (when we don't specify any modifier): only accessible in the same package
	boolean isAlive;
	// protected: accessible in the same package and subclasses
	protected double height;
	
	// -------------------------------------- Non-Access Modifiers -------------------------------------------------- //
	
	// there are only two non-access modifiers for CLASSES:
	// final: class cannot be inherited by other classes
	// final class nonInheritedClass() { ... }
	// abstract: class cannot be used to create objects (it must be inherited from another class to access it)
	// abstract class abstractClass() { ... }
	
	// there are 4 non-access modifiers for attributes/methods
	// final: attribute/method cannot be overridden/modified
	final String origin = "Universe"; 
	// static: attribute/method belong to the class rather than an object
	static String usage = "Entertainment only";
	// abstract: only usable in an abstract class on methods; the method does not have a body, it must be provided by the subclass 
	// abstract void run() {};
	// transient: attributes/methods are skipped when serializing the object containing them
	transient String myTransient;
	// synchronized: methods can only be accessed by one thread at a time
	synchronized void synchronizedMethod() {
		System.out.println("This method can be accessed only by one thread at a time");
	}
	// volatile: the value of an attribute is not cached thread-locally, it's always read from the 'main memory'
	volatile String myVolatile;
	
	// -------------------------------------- Packages -------------------------------------------------- //
	
	// a package in Java is used to group related classes.
	// we use it to avoid name conflicts and write a better maintainable code
	// there are two categories:
	// - built-in: packages from the Java API
	// - user-defined: packages created by the programmer
	
	// built-in packages
	// how to use a package (example at the top):
	// import <package>.<name>.<className> or import <package>.<name>.*
	
	// user-defined packages
	// java uses a file system directory to store the packages
	// root > mypackage > mypackageclass.java
	// just by defining the package (example at the top) and compiling it twice (first one as usual ('javac Myclass.java') and second one adding '-d <path>' option we can create the package 
	
	// -------------------------------------- 4 pillars of OOP -------------------------------------------------- //
	
	// these are 4 software design principles to help you write clean Object-Oriented code:
	
	// ENCAPSULATION: the objective is to make sure that 'sensitive' data is hidden from users
	// we achive this by:
	// - declaring variables/attributes as private
	// - providing getters and setters to access those private variables
	
	// why encapsulation?
	// more security, possibility to make read-only or write-only attributes, code is more readable
	
	private String sensitiveData;
	
	public String getSensitiveData() { return sensitiveData; };
	public void setSensitiveData(String sensitiveData) { this.sensitiveData = sensitiveData; }; 
	
	// INHERITANCE: capability of a class to derive properties and characteristics from another class
	// two categories:
	// - subclass: (child) the class that inherits from another class
	// - superclass: (parent) the class being inherited from
	
	// why inheritance?
	// for code reusability
	
	// we need the keyword 'extends' to inherit from a class
	public class AliveObject extends Object { }
	
	// POLYMORPHISM: allows objects to behave differently based on their specific class type
	// multiple behaviors (same method with different behavior depending on the object)
	// method overriding (child class can redefine a method of its parent class)
	// method overloading (define multiple methods with the same name but different parameters)
	// runtime decision (at runtime, Java determines which method to call based on the object's actual class)
	
	// polymorfism is commonly used together with inheritance
	
	// in below example, we can see that even when extending from Animal, the animalSound() changes depending on the type of animal
	public class Animal extends AliveObject {
		public void animalSound() {
			System.out.println("Generic animal that make a sound");
		}
	}
	
	public class Dog extends Animal {
		public void animalSound() {
			System.out.println("The dog says: wof wof");
		}
	}
	
	public class Cat extends Animal {
		public void animalSound() {
			System.out.println("The cat says: miau miau");
		}
	}
	
}
