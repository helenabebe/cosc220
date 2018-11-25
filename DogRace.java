/**
Author: Helen Abebe
Date: November 7th
Purpose: To make a program that compares the speed of dogs
*/

import java.util.Arrays;
import javax.swing.JOptionPane;
public class DogRace{

   public static void main(String[] args){
   
      int[] dogSpeed = new int[10]; //An array of all the dogs in the race and their speed
      int userDog = Integer.parseInt(JOptionPane.showInputDialog("Please enter the speed of your pit")); //User enters speed
      dogSpeed[0] = 10;
      dogSpeed[1] = 39;      
      dogSpeed[2] = 82;
      dogSpeed[3] = 71;
      dogSpeed[4] = 32;
      dogSpeed[5] = 22;
      dogSpeed[6] = 76;
      dogSpeed[7] = 59;
      dogSpeed[8] = 48;
      dogSpeed[9] = userDog; 
       
        run(dogSpeed); //Passing the array to run method
         
         int results = run(dogSpeed);
         
            if (results == userDog){
               
               System.out.println("Your dog won the race");
            }
            else { 
               
                System.out.println("Your dog did not win the race");
            
            }
         
      }
         //@param dogSpeed is the array that is being passed to the method
         //@return fastest is the fastest dog of the race
         public static int run(int dogSpeed[]){ 
         
            Arrays.sort(dogSpeed); //Sort the array
                  
            int fastest = 0;
         
            fastest = dogSpeed[9]; //The fastest dog is the last one of the sorted array
                     
               return fastest;
      }  
  
   
}