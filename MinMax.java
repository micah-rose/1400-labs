/*********************
* Author: Micah L
*
* Lab: MinMax
*********************/

import java.util.Scanner;

public class MinMax {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
      System.out.print("Number 1: ");
      int number1 = input.nextInt();
      System.out.print("Number 2: ");
      int number2 = input.nextInt();
   
      if (number1 < number2) {
         System.out.printf("%d is less than %d.", number1, number2);
      }
      if (number1 > number2) {
         System.out.printf("%d is greater than %d.", number1, number2);
      }
      if (number1 == number2){
         System.out.printf("%d is equal to %d.", number1, number2);
      }
   } 
}