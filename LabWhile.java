/******************
* Author: Micah L
*
* Lab: While
*******************/

import java.util.Scanner;

public class LabWhile{
   
   public static void main(String[] args){
   
      multiplyNumbers();
   }
   
   public static void multiplyNumbers(){
      Scanner input = new Scanner(System.in);
      
      int product = 1;
      
      System.out.print("Provide a number, enter 0 to quit: ");
      int number = input.nextInt();
      
      while(number != 0){
      
         product = product * number;
      
         System.out.print("Provide a number, enter 0 to quit: ");
         number = input.nextInt();
         
      }
      
      System.out.printf("Product is %d", product);

   }
}