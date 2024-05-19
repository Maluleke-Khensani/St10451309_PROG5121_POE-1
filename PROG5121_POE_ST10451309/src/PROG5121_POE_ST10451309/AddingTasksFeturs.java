/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG5121_POE_ST10451309;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class AddingTasksFeturs {
  
 // Global variables to store task details
 public static int amountOfTasks = 0;
 public static int totalHours = 0;
 public static int taskNumber, taskStatus, taskDurations, choice;
 public static String  taskDuration, taskName, taskDescription, developerDetails, taskID, choices;
 public static String[] taskStatusOptions = { "To Do", "Doing", " Done "};
 
  

public static void main(String[] args){
        
     //JOptionPane.showMessageDialog(null, "Welcome to AddingTasksFeturs!");
    
     UserOption();
    }
public static void UserOption(){
    
     String[]options = { "Add Task", "Show Report", "Quit"};
     
     
     // Loop to show options until the user chooses to quit
     for (String option : options) {   // enhanced for loop
         
    do {
             
            StringBuilder message = new StringBuilder("Please select an option:\n");

            for (int i = 0; i < options.length; i++) {
            message.append(i + 1).append(". ").append(options[i]).append("\n");
    }
            choices = JOptionPane.showInputDialog(null, message.toString());

    /* validate the users choice
    ensures user enter a whole number, makes sure the program does not crash when they press cancel or "okay without entering a whole number
    */ 
            if (!isValidChoice(choices,option.length())){
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter whole number (1 to 3) ");
            break;
             }       

            choice = Integer.parseInt(choices);
        
        
        
            switch (choice ){
                 
                 case 1:
                     numTasks(); // Call numTasks method to add tasks
                     
                     break;
                     
                 case 2:
                     showReport(); // Call showReport method to display report
                     
                     break;
                 case 3 :
                     quitEasyKanban(); // Call quitEasyKanban method to quit the program
                    
                      break;
                 default :
                     JOptionPane.showMessageDialog(null, "Invalid choice. Please select a valid option.");
             }
        
             
    }while ( choice !=3); // Continue loop until user chooses to quit
    
    }
}
 
public static void numTasks(){
    
    String numberOfTask;
    int taskLimit = 51 ;
    int amountOfTasks = 0;

    do{
           
            numberOfTask = JOptionPane.showInputDialog(null, "How many task(s) do you wish to add (limit of 50)");
           
             if (!inputValidation(numberOfTask)){
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number up to 50.");
               continue;
             }
             amountOfTasks  = Integer.parseInt(numberOfTask);
             if(amountOfTasks > taskLimit){
                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number up to 50.");
             }  
          
    }while(!inputValidation(numberOfTask) || amountOfTasks > taskLimit ); 
    
      for(int value = 0 ; value <  amountOfTasks ; value++){  // the 
        
        taskNumber =value + 1;
    
        JOptionPane.showMessageDialog(null, "Task :"
                + " " + (taskNumber));     
   
        detailsOfTask(taskNumber);
      
      }
     
        calculateDuration();   // Call calculateDuration method to calculate total hours
    
        
}
    

public static void detailsOfTask(int taskNumber){
   //String[] taskStatusOptions = { "To Do", "In Progress", " Done "};
  
  // promtp the user for the task name  
    do {
        taskName = JOptionPane.showInputDialog(null,"Please enter the task name","Task Name ", 0);
 
            if (taskName == null || taskName.isEmpty()) {  // if user cancels the dialog or the user choices not to enter anything  
                JOptionPane.showMessageDialog(null, "Developer details cannot be empty. Please enter valid details."); // output this message only if  the above if statement is true
            }
 
    }while (taskName == null || taskName.isEmpty());
  
    // taskName = "Add Login Feature"; // initailize the taskName
    
    
    //do while loop - prompt the user for a task description and if task description has more than 50 words ask the user to enter the task description again
    do{ 
       taskDescription = JOptionPane.showInputDialog(null,"Please enter task description","Task Description ", 0);
          
            if(taskDescription == null|| taskDescription.length() >50){ // if user cancels the dialog or the input is > 50 is will prompt for the input again
            
            JOptionPane.showMessageDialog (null,"Please enter a task description of less than 50 charcters");// output message only if the if statement is true 
            }else {   
  
            JOptionPane.showMessageDialog (null,"Task successfully captured "); // output message only if the if statement is false  
            }
            
    }while (taskDescription == null|| taskDescription.length() >50); // will loop back is the if statement is true 
     
    
    do {
        developerDetails = JOptionPane.showInputDialog(null, "Enter developer details (first name and last name)", "Developer Details", JOptionPane.PLAIN_MESSAGE);
           
            if (developerDetails == null || developerDetails.isEmpty()) {  // if user cancels the dialog or the user choices not to enter anything  
                JOptionPane.showMessageDialog(null, "Developer details cannot be empty. Please enter valid details."); // output this message only if  the above if statement is true
            }
   
    }while (developerDetails == null ||developerDetails.isEmpty());  // will loop back only id the if statement above is true  
    
    do {
        taskDuration = JOptionPane.showInputDialog(null, "Enter estimated duration (in hours)", "Task Duration", JOptionPane.PLAIN_MESSAGE);

        taskDurations = Integer.parseInt(taskDuration);
        totalHours += taskDurations;

            if(taskDuration == null) {// If user cancels the input dialog
                return;
                }
            if ( ! checkForDigitEmpty( taskDuration  )){
                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter a whole number ");

                }
    }while (! checkForDigitEmpty( taskDuration ));
    
    
   
    { // task ID 
        String character1 = (taskName.substring(0,2)).toUpperCase(); //  
        String character2 =  ( developerDetails.substring(developerDetails.length()-3)).toUpperCase();

        
      taskID = character1 + " : " + taskNumber +  " : " + character2;
      JOptionPane.showMessageDialog(null,taskID, "TaskID", 0);
     
    }  
   
    taskStatus =JOptionPane.showOptionDialog(null, "Please select task status", "Task status",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, taskStatusOptions, taskStatusOptions[0]);
   
    // Display task details
    JOptionPane.showMessageDialog (null,    "Task Status: " + taskStatusOptions[taskStatus]+ "\n"+
                                                        " Developer details :" + developerDetails + " " + "\n" +
                                                        " Task number : " + taskNumber +  "\n"+
                                                        " Task name : " + taskName + "\n"+
                                                        " Task description : " + taskDescription + "\n" +
                                                        " Task ID : " + taskID + "\n "+
                                                        " Task Duration : " + taskDuration + "hrs");

}

 public static void calculateDuration(){
    
     JOptionPane.showMessageDialog(null, "Total hours of all tasks: " +  totalHours + " hrs");
     
 }
 // erroe handling 
 //  checkForDigitEmpty ensures the user enters a vaild input
public static boolean checkForDigitEmpty(String taskDurations  ) {
        
    
    if (taskDurations == null || taskDurations.isEmpty()) {  // checks is task duration input is empty or the user press okay without entering a value or they pressed cancel
            return false;
        }
      
    for (int i = 0; i < taskDurations.length(); i++) {
            if (!Character.isDigit(taskDurations.charAt(i))) {  //checks if the taskDuration input does not contain a number 
                return false;                                           // if it doess not contain a digit then it will return a false
            }
        }
        return true; /// if the above if statement does indeed contain a digit it will return treu 
   


}

public static boolean inputValidation (String value){
    
   if (value== null || value.isEmpty()) {  // checks is numberOfTasks input is empty or the user press okay without entering a value or they pressed cancel
            return false;
        }
      
    for (int loopcount = 0; loopcount < value.length(); loopcount++) {
            if (!Character.isDigit(value.charAt(loopcount))) {  //checks if the numberOfTask value does not contain a number 
                return false;                                           // if it doess not contain a digit then it will return a false
            }
        }
        return true; /// if the above if statement does indeed contain a digit it will return true
   
}

public static boolean isValidChoice(String option , int arrayLength){
     if (!inputValidation(option)){
     return false;
 }
    int choice = Integer.parseInt(option);
        return choice > 0 && choice <= arrayLength;  
   
}
 
public static void showReport(){
     JOptionPane.showMessageDialog(null,"Coming soon");
     UserOption();
 }

 // Added error handling for null input when user cancels the input JOptionPane dialog
public static void quitEasyKanban(){
    String [] quitOption ={ "Quit","cancel"};
     
     
  int choice =JOptionPane.showOptionDialog(null,"Are you sure you want to quit program","Quit program",JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null,null,quitOption[0] );
  
  if(choice == 0){
  JOptionPane.showMessageDialog(null,"Quiting program....");
  System.exit(0);
 
} 
}

    
}
     
