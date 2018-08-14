/*****************
* Author: Micah L
*
* Lab: Employee
*****************/

public class Employee {

   //fields
   private String firstName;
   private String lastName;
   private double salary;
   
   //constructor
   public Employee(String firstName, String lastName, double salary){
      this.firstName = firstName;
      this.lastName = lastName;
      setSalary(salary);
   }
   
   //methods
   
   public String getFirstName(){
      return firstName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public double getSalary(){
      return salary;
   }
   
   public void setSalary(double s){
      if (s >= 0){
         salary = s;
      }
   }
}