/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROG5121_POE_ST10451309;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class RegistrationSystem {
    
public static String firstname, surname, inputPassword, inputUsername;

public static void RegistrationPage() {
   
    Scanner scan = new Scanner(System.in);
    
   
 System.out.println("Welcome to Our app, please select an option");
 System.out.println("Register account");
      
 System.out.print("Please enter your Firstname: ");
 firstname = scan.nextLine();
 
 System.out.print("Please enter your Surname: ");
 surname = scan.nextLine();
        

            do{System.out.println("Enter Username:\n(Username should be no longer than 5 charcters and should also contain a underscore) " ); // will execute
                inputUsername = scan.nextLine(); 
                                                                                   // check if the username entered does not macth the conditions in the checkusername method and it it doesnt it will output the the statement below it
                 if(!checkUserName(inputUsername)){
                  System.out.println("Username is not correctly formatted please ensure that your surname contains an undersore and is no more than 5 charcters in length\n");
                 }                                                                          // if the above statement is a false then it will loop back to the do loop and execute whats in there again until the statement above is true then it will go out the loop
            }while(!checkUserName(inputUsername));
                      
                        System.out.println("Username successfully captured\n");  // this statement is outputed when the do-while loop is a true
       
                                                                                  //prompt the user for the password
         do{ System.out.println("Enter password:\n(at least 8 characters long,contain a capital letter, a special character and a digit");
            inputPassword = scan.nextLine();

            if(!checkPasswordComplexity(inputPassword)){               // call the checkPasswordComplexity method to add as a condition to the if statemenet 
             System.out.println("Password is not correctly formatted, please ensure that the pssword contains at least 8 character, a capital letter, a number and a special character.\n");
             }
    
        }while(!checkPasswordComplexity(inputPassword));
        
                  System.out.println("Password successfully captured\n");        // only be outputted if the conditon above it true and not false 
     
                                                                                  // calling the registerUser method to output the users name surname only if the username and password entered  meet the conditions that are set
 System.out.println(registerUser(inputPassword, inputUsername));
                         
       
           
 

} 
    public static boolean checkUserName(String inputusername){
      return inputusername.length()<=5 && inputusername.contains("_"); 
    }
    
    public static boolean checkPasswordComplexity(String inputPassword)
    { 
     
       if(inputPassword.length() >=8 )
       {
             boolean containsDigit = false;  //declare the boolean variables with a false so that the return statement returns this false if the  for loop is not true
    boolean containUpperCase = false;
    boolean containsSpecialChar = false;
   
    
    
   // for loop( initialization; condition; increase by one each time )
    for(int value = 0; value < inputPassword.length(); value++){           
    char character =inputPassword.charAt(value);
       
        if(Character.isDigit( character )){               //First loop checks if the password inputed contaians a digit and if does not it will return a false
           containsDigit = true;
        }
            if(Character.isUpperCase( character )){          //This loop checks if the password inputed contains a capital letter and if it does not it will return a false
                    containUpperCase =true;                   
        }
                if(!Character.isLetterOrDigit( character )){       // Third if checks for all charcters that are not digits or numbers and counts them as special charcters  
                        containsSpecialChar = true;                                  // (!) reverse the result, returns false if the result is true
        
        }          
          
    } 
     return containsDigit && containUpperCase && containsSpecialChar;
       }
       else
       {
           return false;
       }
      
   
    }
    
    
    
    public static String registerUser(String username, String password)  {
     // check if bot varibles meet the conditions and if true printout firstname and surname
      if(checkPasswordComplexity(inputPassword) && checkUserName(inputUsername)){   
      
           return "Welcome " + firstname + " " + surname + " " + "your new account has been successfully reqistered\n";
      }
      else
      {
           return "Registration unsucccessful! ";
      }
    
    }
   
    public static boolean loginUser(String usernames, String passwords){
    
    return inputUsername.equals(LoginSystem.usernames) && inputPassword.equals(LoginSystem.passwords);
 }

   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
