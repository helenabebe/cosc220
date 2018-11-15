/**
Author: Helen Abebe
Date: November 8th, 2018
Purpose: To construct a program that evaluates a number and determines whether its a prime number 
*/

import java.util.Scanner; //Need this to user scanner class
import java.util.Random; //Need this to use random generator
public class primeNumber{

   public static void main(String[] args){ //Main method
      int number; 
      boolean result = false;
      Random randomNumbers = new Random(); //Random number generator
      number = randomNumbers.nextInt(400)+1; 
      
      System.out.println("The number is " + number);
     
      result = isPrime(number); //Method call for the method isPrime
         if (result == true){
         System.out.println("This number is prime"); 
         }
         else{
         System.out.println("This number is not prime");
         }
     }
      //@param n is the number that is being evaluated
      //@return true if it is prime and false if it is not
      public static boolean isPrime(int n){ //This is the isPrime method
      
         int factor = 0;
         int notFactor = 0;
         int ans = 0;
         for(int i = 1; i < n; i++){
         
            ans = n % i;
               if(ans == 0){
               
                factor++;
                }
            }
                  System.out.println(factor);
               if(factor > 2){
                     return true;
                     } else 
                     {
                      return false;
                     }
      }
         }