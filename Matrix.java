/*************************
* Author: Micah L
*
* Lab: 2D Array - Matrix
**************************/
import java.util.Arrays;

public class Matrix{

   //fields
   private int m;
   private int n;
   private double[][] data;
   
   //constructors
   public Matrix(int m, int n){
      data = new double[m][n];
      for(int i = 0; i < m; i++){
         for(int j = 0; j < n; j++){
            data[i][j]= Math.random();
         }
      }
   }
   
   //copy Constructor
   public Matrix(double[][] data){
      this.data = Arrays.copyOf(data, data.length);
      for(int i = 0; i < data.length; i++){
         this.data[i] = Arrays.copyOf(data[i], data[i].length);
      }
      
      this.m = data.length;
      this.n = data[0].length;
   }
   
   //methods
   public Matrix plus(Matrix other){
      Matrix result = new Matrix(this.data);
      for(int i = 0; i < m; i++){
         for(int j = 0; j < n; j++){
            result.data[i][j] += other.data[i][j];
         }
      }
		return result;
   }
   
   public Matrix minus(Matrix other){
      Matrix result = new Matrix(this.data);
      for(int i = 0; i < m; i++){
         for(int j = 0; j < n; j++){
            result.data[i][j] -= other.data[i][j];
         }
      }
		return result;
   }
   
   //print method
   public void print(){
      for (double[] row: data){
         for(double el: row){
            System.out.printf("%5.2f ", el);
         }
         System.out.println();
      }
   }
  
   // = = = = = = = = = = = = = = = = = = = = 
   // T e s t  C l i e n t
   
   public static void main(String[] args){
      //3x3 array mA1 
      double[][] matrixArray1 = {
         {3,5,7}, 
         {2,4,8}, 
         {5,7,4}};
 
      Matrix mA1 = new Matrix(matrixArray1);
         System.out.println("mA1: ");
         mA1.print();
         System.out.println(); 
      
      //3x3 array mA2   
      double[][] matrixArray2 = {
         {2,4,6}, 
         {3,6,9}, 
         {4,8,3}};
      
      Matrix mA2 = new Matrix(matrixArray2);
         System.out.println("mA2: ");
         mA2.print();
         System.out.println();    
      
      //plus mA1 and mA2
      System.out.println("mA1 + mA2: ");
      (mA1.plus(mA2)).print();
      System.out.println();
      
      //minus m2 and matrixArray2
      System.out.println("mA1 - mA2: ");
      (mA1.minus(mA2)).print();
      System.out.println();
   }
}