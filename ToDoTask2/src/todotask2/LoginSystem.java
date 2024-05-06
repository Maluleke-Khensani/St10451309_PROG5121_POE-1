/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todotask2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class LoginSystem {
  
   
  public static String usernames, passwords;
  
  public static void main(String[] args){
    
     RegistrationSystem.RegistrationPage();                    // calling the registration method to be the first method torun before the login page 
       
    Login();
    

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
      System.out.println("Welcome to EasyKanban"); 
      return "\nWelcome "+ RegistrationSystem.firstname + " " + RegistrationSystem.surname+ " it is great to see you again" ;
       
 
    }else {
    
   return "Username or password incorrect, please try again";
}
    
    }    
   
 
  
    
    
}