/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author emann
 */
public class Exercise1 {
    
    public static void main(String[]args){
        
        int[] temps = {28, 13, 42, 21, 0, 17, 64, 33, 12, 76, -51, -18, -9, -7};

        System.out.println("The average temp is " + calcAverage(temps));
        
    }
    
    public static double calcAverage(int[] temps){
        
        double average = 0;
        int divBy = temps.length;
        
        for(int i = 0; i < temps.length; i++){
            
            if(temps[i] > 50 || temps[i] < -50){
                
                divBy = divBy - 1; 
                
            }else{
                
                average = average + temps[i];
                System.out.println(temps[i]);
                
            }            
            
        }
        
        System.out.println(average + " was divided by " + divBy);
        
        average = average / divBy;
        
        return average;
        
    }
    
}
