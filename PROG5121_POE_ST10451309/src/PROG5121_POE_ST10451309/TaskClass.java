/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG5121_POE_ST10451309;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class TaskClass {
    
   // JOptionPane.showMessageDialog(null,checkTaskDescription());
  public static void main(String[] args){
     
      System.out.println( checkTaskDescription("Khensani's project") );
      System.out.println(createTaskID ("Hello","Maluleke"));
      System.out.println(printTaskDetails());
      System.out.println(returnTotalHours(2));
       
      
  }  
    
  
    
public static boolean checkTaskDescription(String taskDescription) {

   if( AddingTasksFeturs.taskDescription.length() >50){
            
           System.out.println("Please enter a task description of 50 charcters or less");  
    
    }else {   
  
            System.out.println("Task successfully captured ");  
           
   }
   return true ;
 
      
}
public static String createTaskID ( String taskName , String developerDetails) {
  Scanner scan = new Scanner (System.in);  
   int numberOfTask = 1;
    int taskLimit = 50 ;
   // int amountOfTasks = 0;
 
   for(int value = 0 ; value <  numberOfTask ; value++){ 
        
        AddingTasksFeturs.taskNumber =value +1 ;
    
        System.out.println("Task : "+ (AddingTasksFeturs.taskNumber));     
   }
   
    String character1 = (taskName.substring(0,2)).toUpperCase();
    String character2 =  ( developerDetails.substring(developerDetails.length()-3)).toUpperCase();

    AddingTasksFeturs.taskID = character1 + " : " + AddingTasksFeturs.taskNumber +  ":" + character2;
      
    
 return  AddingTasksFeturs.taskID;  

}
public static String printTaskDetails(){
   
    return 
            "Task Status: " + AddingTasksFeturs.taskStatusOptions[AddingTasksFeturs.taskStatus]+ "\n"+
           " Developer details :" + AddingTasksFeturs.developerDetails + " " + "\n" +
           " Task number : " + AddingTasksFeturs.taskNumber +  "\n"+
           " Task name : " + AddingTasksFeturs.taskName + "\n"+
           " Task description : " + AddingTasksFeturs.taskDescription + "\n" +
           " Task ID : " + AddingTasksFeturs.taskID + "\n "+
           " Task Duration : " + AddingTasksFeturs.taskDuration + "hrs";
         

}
 public static int returnTotalHours(int taskDurations){
 
     
     
    
         AddingTasksFeturs.taskDurations = Integer.parseInt( AddingTasksFeturs.taskDuration);
        AddingTasksFeturs.totalHours +=  AddingTasksFeturs.taskDurations;
   
     
     
     
  return  AddingTasksFeturs.totalHours;
     
 
 }



}