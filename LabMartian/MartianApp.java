/************************************
* Author: Micah Lund
*
* Test client for class Martian.
*************************************/

import java.util.ArrayList;

public class MartianApp {
   public static void main(String[] args) {
      //part1();
      
      Martian[] squad = Martian.invade(2);
         for(Martian m : squad) {
            System.out.println(m.toString());
         }
      
      Martian[] mysterySquad = Martian.invade();
         for(Martian m : mysterySquad) {
            m.doSomething();
         }
   } 
   
   private static void part1() {
      
      Martian m1 = new Martian();
      Martian m2 = new Martian();
      System.out.println(m1 + " " + m2);
      m1.doSomething();
      System.out.println();
      
      Martian[] martians = {new Martian(), new Martian(), new Martian()};
      
      for(Martian el : martians) {
         el.doSomething();
      }
      
      ArrayList<Martian> martianList = new ArrayList<>();
         martianList.add(new Martian());
         martianList.add(new Martian());
         martianList.add(new Martian());
         martianList.add(new Martian());
      
      for(Martian el : martianList) {
         el.doSomething();
      }
   } 
}