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
public class EasyKanban {
    
  public static void UserOptions(){
    
 int optionNumber;   
 int numberOfTask;
   
    Scanner scan = new Scanner(System.in);
   
   System.out.println("How many task do you wish to enter ");    //prompt the user for number of tasks
   numberOfTask = scan.nextInt();
      
      
   //array 
 String[] options = new String[3];
    options[0] = "Add tasks";   
    options[1] = "Show report  (coming soon )";
    options[2] = "Quit";       
    
 System.out.println("Chose option:");
 System.out.println("1: Add Tasks");
 System.out.println("2: Show report");
 System.out.println("3: Quit");
 
 
 
 do{System.out.println("Please chose option:");
  optionNumber = scan.nextInt();
  
    if (optionNumber >4) {
        System.out.println("invaild number shows options on to 1 to 3");
 }
 }while(optionNumber >4);
 
 // 
 
 
 
 
 
 
 
 switch(optionNumber){
     
    case 1:
         System.out.println("Add Task");
         System.out.println("How many task would you like to add");
         int numTasks= scan.nextInt();
         
         
         
         
         
         
         break;
    
    case 2:
        System.out.println("Show report");
        System.out.println("coming soon");
         break;
    
    default:
        System.out.println("Quit");
        break;
        
 } 
       
 }   
        
           
    
    
    
    
}
