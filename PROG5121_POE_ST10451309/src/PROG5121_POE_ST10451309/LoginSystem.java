/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG5121_POE_ST10451309;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class LoginSystem {
  
   
  public static String usernames, passwords;
  
  public static void main(String[] args){
    
        // Call the registration method to be the first method to run before the login page
        RegistrationSystem.RegistrationPage();
        
        // Perform login
        Login();

        // Display welcome message after successful login
        displayMessage();

        // User options in AddingTasksFeturs
        AddingTasksFeturs.UserOption();
  }
  private static void Login(){
    
         System.out.println("login\n");
   
         Scanner keyboard = new Scanner(System.in);

    
      
              // prompt user for useranm and password and if both values return a true in the if statement procced to the returnLoginStatus method
        do{ System.out.print("Enter your Username:");
                usernames = keyboard.nextLine();

            System.out.print("Enter your password:");
                passwords = keyboard.nextLine();

              if(RegistrationSystem.loginUser(usernames, passwords)) {
                   System.out.println(returnLoginStatus());
        }
                else{
                   System.out.println(returnLoginStatus());
        }

        }             while(!RegistrationSystem.loginUser(usernames, passwords));
}

  public static String returnLoginStatus(){
   
 
    if(RegistrationSystem.loginUser(usernames,passwords)){
    
    
      return "\nWelcome "+ RegistrationSystem.firstname + " " + RegistrationSystem.surname+ " it is great to see you again" ;
       
 
    }else {
    
  return "Username or password incorrect, please try again";
}
    
    }    
  public static void displayMessage() {
      JOptionPane.showMessageDialog(null,"Welcome to EasyKanban", "EasyKanban", 0);
  }
 
  
    
    
}