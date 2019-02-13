import javax.swing.JOptionPane;
import java.util.Random;
/* 
Author: Helen and Tsahai 
Date: Feb 1, 2019
Purpose: To make an automatic garage door
*/

   public class GarageDoor{
   
      public static void main(String[] args){ //Main Method
            int user; //The value passed from method setup()
            int code; 
            boolean allow;
            boolean dontAllow;
         
         user = setup(); 
         
         code = assignCode(user);
            if (code == 1){
            
             System.out.println("Here is your access code " + code);
       
            }
         allow = openDoor();
            
            if (allow = true){
               
            System.out.println("The door will now open");
            
            }
            
         dontAllow = closeDoor();
         
            if (allow = false){
               
            System.out.println("The door will now close");
       }
    }
         //The setup method asks user asks the user whether they are a new user or getting access
         //@return user's answer
         public static int setup(){
         
            int userSetup = Integer.parseInt(JOptionPane.showInputDialog("If this is a new device, enter 1. If you're getting access from another device, enter 2."));
                 
                 return userSetup;
           
       }
         //This method reads whether it is a new user or a user getting access. 
         //If they're new, assign them a code
         //@param userSetup is either 1 or 2 based on user input
         //@return a random four digit code as access code, if 1
         public static int assignCode(int userSetup) {
         
         int max = 9999, min = 1001; 
         int code = 0;
          Random randomNumbers = new Random(); //Random number generator 
            
            if (userSetup == 1){
             
              code = randomNumbers.nextInt(((max - min) + 1) + min);
            
                 }
                   return code;
 
        }
         //This is the access button. If user enters one, door opens
         //@return true if one was entered and false if not
         public static boolean openDoor(){
         
           int open = Integer.parseInt(JOptionPane.showInputDialog("Click green to open(1)."));
            
            if (open == 1){
               return true;
            }  
            else {
               return false;
            }
       }
         
         //This method is the "red button". If the user enters two, the door will close.
         public static boolean closeDoor(){
             
           int close = Integer.parseInt(JOptionPane.showInputDialog("Click red to close(2)"));
           
           
           if (close == 2){
           
               return false;
           }
           else {
                  return true;
           }
     }
     
    
}
