/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first.java.project;

/**
 *
 * @author Kerry
 */
public class ConstantsAndVariables
{
// Constants
public static final int MAX_VALUE = 100; //Final means constant//
public static final String APPLICATION_NAME = "My App";
//---------------------------------------------------------------------------//
// Method to demostrate constant and varibles 
public static void ConstantsAndVariables()
{
// Variables
 int currentValue = 50; 
 String message = "Hello World!";

//Trying to change constant will cause and error to occur
//MAX_VALUE = 200; cannot change a constant as it is a set value

// Changing a variable
currentValue = 75;

System.out.println("");
System.out.println("=> Constants and Variables");
System.out.println("Current value: " + currentValue);
System.out.println("Message: " + message);
System.out.println("Max value: " + MAX_VALUE);
System.out.println("Application name: " + APPLICATION_NAME);
 
}
}
