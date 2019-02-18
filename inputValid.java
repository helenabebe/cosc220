import java.util.ArrayList; 
import javax.swing.JOptionPane;
/* 
Author: Helen Abebe
Date: Feb 1, 2019
Purpose: To make an automatic garage door
*/

public class inputValid{


      public static void main(String[] args){
      
         int total = 0;
         int userInput;
         
         ArrayList<Integer> num = new ArrayList<Integer>();
        
        userInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1-5"));
 
            do {
               
               for(int i = 0; i <= num.size(); i++){
                  num.add(i);
                  total += num.get(i);
                  System.out.println(total);
               }
            
          }
            
       
            while (userInput != 1 || userInput != 2 || userInput != 3 || userInput != 4 || userInput != 5); 
          
                 
              
          
      
}

}