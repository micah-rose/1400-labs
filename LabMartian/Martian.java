/*****************************************
* Author: Micah Lund
*
* Represents a Martian who has a name
* and keeps tracks of all the Martians
* that have been created
******************************************/

import java.util.Random;

public class Martian {
   // fields
   private String name;
   private static int count;
   private static Random rand = new Random();
   
   // constructors
   public Martian() {
      name = getRandomName();
      count++;
   }
   
   // methods
   public String getRandomName() {
      int n = rand.nextInt(90) + 10;
      char c = (char)(rand.nextInt(26) + 'A');
      return "" + c + n; 
   }
   
   @Override
   public String toString() {
      return name + "\\" + count;
   }
   
   public void doSomething() {
      if (count < 6) {
         System.out.printf("%s is hiding%n", name);
      }
      else {
         System.out.println("ATTACK!"); 
      }   
   }  
   
   public static Martian[] invade(int count){
      Martian[] army = new Martian[count];
      
      for(int i = 0; i < count; i++){
         army[i] = new Martian();
      }
      
      return army;
   }
   
   public static Martian[] invade() {
      return invade(rand.nextInt(9) + 2); //Fix
   } 
}