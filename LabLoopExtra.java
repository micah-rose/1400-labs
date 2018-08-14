/********************
* Author: Micah L
*
* Lab: Loop Extra
*********************/

import java.util.Random;

public class LabLoopExtra{
   public static void main(String[] args){
      Random rand = new Random();
      
      for(int i = 0; i < 35; i++){
         int number = rand.nextInt(31)-10;
         
         if (number % 6 == 0){
            System.out.printf("%2d  ", number);
         }
         
         else if(number > 0){
            System.out.printf("%2s  ", 'p');
         }
         
         else if (number < 0){
            System.out.printf("%2s  ", 'n');
         }
        
         
         if(i%7 == 6){
            System.out.println();
         }

      }
   }

}