import java.util.Random;
/**
Author : Helen Abebe
Date: Feb 
Purpose
*/

public class inputValid_random{

   public static void main(String[] args){
   
      int total = 0;
      Random randomNumbers = new Random(); //Random number generator 
     int[] rands = new int[5]; 

      for(int i = 0; i <= 5; i++){

      rands[i] = randomNumbers.nextInt(5) + 1;
      System.out.println(rands[i]);
  }
       //total = total += rands[i];
       //System.out.println(total);
  // }

}

}