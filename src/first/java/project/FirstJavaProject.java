/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first.java.project;

/**
 *
 * @author Samuel Sossen ssossen23@gmail.com ST10445164
 */
public class FirstJavaProject {

    /**
     * @param args the command line arguments
     */
    //------------------------------------------------------------------------//
    // This is the main method.
    public static void main(String[] args) 
    {
        Greeting(); 
        Hello2.Greeting2();
        UserInputExample.GetUserInput();
        DataTypes.DifferentDataTypes();
        ConstantsAndVariables.ConstantsAndVariables();
    }
   //--------------------------------------------------------------------//
    // Greeting to the output stream
    static void Greeting()
    {
       System.out.println("Hello World!");
    }
}

//--------------------- End Of File ------------------------------------------//
