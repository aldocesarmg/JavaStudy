package com.javastudy;

public class Main {
    public static void main(String[] args) {
       // single line comment
        /*
         multiple lines comment 
        */
        
        System.out.println("I am in a new line"); // prints in a new line
        System.out.print("I am in the same line"); // prints in the same line
        
        // variables
        String example = "Hello"; // varType varName = varValue;
        final String myConstant = "World"; // this is a constant
        int x = 10, y = 20; // declaration of multiple variables of the same type
        x = y = 30; // assign same value to several variables
        
        // data types: primitives
        byte myByte; // -128 to 127
        short myShort; // -32,768 to 32,767
        int myInt; // -2,147,483,648 to 2,147,483,647
        long myLong; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat; // 6 to 7 decimal digits
        double myDouble; // 15 to 16 decimal digits
        boolean myBoolean; // true or false
        char myChar; // single char/letter/ASCII values
        
        // data types: non-primitives
        String myString;
        String[] myArray = {"Hello ", "World"};
        class myClass {};
        
        
        // System.out.println(y);
    }
}