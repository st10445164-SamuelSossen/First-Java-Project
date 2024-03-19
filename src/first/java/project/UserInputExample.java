/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first.java.project;

import java.util.Scanner;

/**
 *
 * @author Kerry
 */
public class UserInputExample
{
 // This is the main method.
    public static void GetUserInput()
    {
    //Creating a scanner instance
    Scanner scanner = new Scanner(System.in);
    //Declaring variables
    String name;
    int age;
    //Asking user to enter their name
    System.out.println("Enter your name: ");
    name = scanner.nextLine();
    
   //Asking user to enter their age
   System.out.println("Enter your age: ");
   age = scanner.nextInt();
   
   //Print the Greeting
   System.out.println("Hello, " + name + "! You are " + age + " Years old.");
   
   // Close the Scanner
   scanner.close();
    }
 //----------------------------- End Of File ---------------------------------//   


    
      
    
}
