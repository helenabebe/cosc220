/**
Author: Helen Abebe
Purpose: To make a program that serves as the lottery 
Date: November 15, 2018
*/

import java.util.Random; //Need this to use random generator
import javax.swing.JOptionPane;
public class Lottery{

   public static void main(String[] args){
	   			
	   		int number; //stores the generated random value
	   		int upperLimit = 10; //upper range for the random number generator object
	   		Random randomNumbers = new Random(); //Random number generator object
            
            //array of length 5
            int[] lotteryNumbers = new int[5]; 
            
            for(int i=0; i<5; i++){
             
            	//generates a random number between 0 to 10 inclusive
            	number = randomNumbers.nextInt(upperLimit)+1;
            	lotteryNumbers[i] = number;
                  
                  //System.out.println(number);
             }
                  boolean result;
                     result = compareNum(lotteryNumbers);
                  
                        if (result == true){
                         JOptionPane.showMessageDialog(null, "You wont the lottery");
                  }
                     else{
                           
                           JOptionPane.showMessageDialog(null, "You did not win the lottery");
                     }
            }
   
            public static boolean compareNum(int lotteryNumbers[]){
            
            int match = 0;
            
            int[] userNum = new int[5];
              
               for(int i=0; i < 5; i++) {
  
                userNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter lottery number "+(i+1)));
              }
                                     
                 for(int i=0; i < 5; i++) {
  
                 if(userNum[i] == lotteryNumbers[i]){         
                  JOptionPane.showMessageDialog(null, "The number " + userNum[i] + " matched");          
                  match++;
             }
              }
              if(match == 5){                          
                return true;
              } else{
            	return false;} 

            }
           }