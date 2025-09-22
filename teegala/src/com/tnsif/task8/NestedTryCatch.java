package com.tnsif.task8;

public class NestedTryCatch{
    public static void main(String[] args) {
        try {
          
            int[] arr = new int[3];

            try {
              
                arr[2] = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Division by zero is not allowed.");
            }

            
            arr[5] = 20; 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Invalid array index accessed.");
        }

       
    }
}
