/**********************
* Author: Micah L
*
* Lab: Time Table
**********************/

import java.util.Scanner;

public class LabTimeTable{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
   
   
      System.out.println("Time Table");
      System.out.print("Number 1 to 10: ");
      int number = input.nextInt();
      System.out.println();
   
   for (int i = 1; i <= 10; i += 1){
   
      int product = i*number;
   
      System.out.printf("%2d * %d = %-2d",  i, number, product);
      System.out.printf("%10d * %d = %-2d%n", i, number+1, i*(number+1));
   
   }
   
   }
}