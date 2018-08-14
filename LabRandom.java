/**********************
* Author: Micah L
*
* Lab: Random
***********************/

import java.util.Random;

public class LabRandom{
   public static void main(String[] args){
   
   Random rand = new Random();
   int number;
   
      //100 random numbers from 4-7   
      for(int i = 1; i <= 100; i++){
      
         number = rand.nextInt(4)+4;
         System.out.printf("%-5d", number);
         
         if(i%10 == 0){
            System.out.println();
         }

      }  
      System.out.println("\n");
      
      
      //100 multiples of 10 from 10-90 
      for(int i = 1; i <= 100; i++){
      
         number = 10*rand.nextInt(9)+10;
         System.out.printf("%-5d ", number);
      
         if(i%10 == 0){
            System.out.println();
         }

      }     
      System.out.println("\n");    
      
      
      //100 numbers from 901-999
      for(int i = 1; i <= 100; i++){
      
         number = rand.nextInt(98)+901;
         System.out.printf("%-5d ", number);
      
         if(i%10 == 0){
            System.out.println();
         }

      }
      
   }

}