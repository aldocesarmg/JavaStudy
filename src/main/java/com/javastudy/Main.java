package com.javastudy;

public class Main {
    public static void main(String[] args) {
       //Student Aldo = new Student();
    }
    
    public static void basic() {
    	// single line comment
        /*
         multiple lines comment 
        */
        
    	System.out.print("I am in the same line"); // prints in the same line
        System.out.println("I am in a new line"); // prints in the same line and adds a line break
        
        // variables
        String example = "Hello"; // varType varName = varValue;
        final String myConstant = "World"; // this is a constant
        int x = 10, y = 20; // declaration of multiple variables of the same type
        x = y = 30; // assign same value to several variables
        // variables are only accessible inside the region they are created, this is called scope
        
        // data types: primitives
        // ~ they are predefined and built into the language
        // ~ they don't have any method to be called
        // ~ they start with a lowercase letter
        // ~ they always hold a value, null is not allowed
        byte myByte = 100; // -128 to 127
        short myShort = 10000; // -32,768 to 32,767
        int myInt = 1000000; // MOST USED: -2,147,483,648 to 2,147,483,647
        long myLong = 15000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807; NEED TO HAVE "L" CHARACTER AT THE END
        float myFloat = 6.80f; // 6 to 7 decimal digits; NEED TO HAVE "f" CHARACTER AT THE END
        double myDouble = 39.9999999999d; // MOST USED: 15 to 16 decimal digits; NEED TO HAVE "d" CHARACTER AT THE END
        boolean myBoolean = true; // true or false
        char myChar = 'A'; // single char/letter/ASCII values; MUST BE SURROUNDED BY SINGLE QUOTES ''
        
        // data types: non-primitives; also called reference types because they refer to objects
        // ~ they can be used to call methods
        // ~ they are created by the programmer (except for String)
        // ~ they commonly start with an uppercase letter
        // ~ they can be null
        String myString;
        String[] myArray = {"Hello ", "World"};
        class myClass {};
        
        // scientific numbers
        double powerNumber = 10e4d; // we use "e" to indicate the power but it only works with floating numbers; can also be float
        
        // 2 types of casting (only for primitive)
        // widening casting (automatically): converts a smaller type to a larger type size 
        // byte > short > char > int > long > float > double
        int wideningCastingFrom = 10;
        double wideningCastingTo = wideningCastingFrom; // converting int to double
        System.out.println(wideningCastingTo);
        
        // narrowing casting (manually): converts a larger type to a smaller type using parentheses in front of the value
        // double > float > long > int > char > short > byte
        double narrowingCastingFrom = 9.99d;
        int narrowingCastingTo = (int) narrowingCastingFrom;
        System.out.println(narrowingCastingTo);
        
        // two ways of concatenation of String
        String concatString = "Ejemplo de ";
        System.out.println(concatString.concat("concatenaci�n") + " en Java");
        
        // Math useful methods
        System.out.println(Math.max(3, 5)); // get the maximum number out of two
        System.out.println(Math.min(3, 5)); // get the minimum number out of two
        System.out.println(Math.sqrt(9)); // get the square root of the number
        System.out.println(Math.abs(4.23d)); // get the absolute value of the number
        System.out.println(Math.random()); // get a random number between 0.0 and 1.0
        
        System.out.println(powerNumber);
        
        // Control flow
        final boolean alwaysTrue = true;
        final int alwaysOne = 1;
        // if...else if...else
        if (alwaysTrue) System.out.println("En el IF"); else if (alwaysTrue) System.out.println("No llega aqu�"); else System.out.println("No llega aqu�");
        // short hand if..else / ternary operator
        System.out.println((alwaysTrue) ? "Este es el short hand if...else" : "No llega aqu�");
        // switch
        switch(alwaysOne) {
        	case 1:
        		System.out.println("Este es el switch");
        		break;
        	default:
        		System.out.println("No llega aqu�"); // does not need a break statement
        }
        
        // Loops
        final int limit = 10;
        int counter = 0;
        // while
        while(counter<10) {
        	System.out.println(counter);
        	counter++;
        }
        // do...while
        do {
        	System.out.println(counter);
        	counter++;
        } while (counter<20);
        // for
        for (int forCounter = 0; counter<30; counter++) {
        	System.out.println(forCounter);
        }
        // for each: loop through elements in an array/other data structures
        String[] names = {"Aldo", "Dari", "Martha", "Julio"};
        for (String name : names) {
        	System.out.println(name);
        }
        
        // arrays
        int[] pairs = {2, 4, 6, 8, 10}; // dataType[] variableName = {element1, element2, ...};
        pairs[0] = 0; // change value of an element
        System.out.println(pairs.length); // get length of array
        
        // multidimensional arrays
        int[][] multiArray = {{1, 2, 3},{4, 5, 6}};
        System.out.println(multiArray[0][0]); // access first array element and return the first element in the second dimension array
        
        for (int[] row : multiArray) {
        	for (int element : row) {
        		System.out.println(element);
        	}
        }
    }
    
    public static void methods() {
    	// methods
    	// they are always declared INSIDE A CLASS
    	// structure must be as follows (example below in myMethod): accessModifier returnType methodName(parameterType parameterName, ...) {}
    	
    	// types of return
    	// void: does not return anything
    	// any primitive value: return the data type specified
    	
    	// calling a method
    	// myMethod();
    	
    	// method overloading
    	// we can have multiple methods with the same name but different parameters
    	
    	// when declaring the function, the function has "parameters", but when calling the function, the function has "arguments" 
    }
    
    // <accessModifier> <returnType> <methodName>(<parameterType> <parameterName>, ...) {}
    public static int myMethod() {
    	return 0;
    }
    
    public static void javaClasses() {
    	// OOP - Object-Oriented Programming
    	// classes must be inside their own .java file
    	// classes names must start with uppercase letter at the beginning and must match the .java file name
    }
	
    // how to define a class
    // <accessModifier> class <className> {}
    public class Student {
    	String name; // class attributes are variables within a class
    }
}
