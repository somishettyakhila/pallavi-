package com.tnsif.task8;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[5] / 0; 
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You are trying to access an invalid array index.");
        } 
        catch (Exception e) {
            System.out.println("Some other error occurred");
        }

       
    }
}
