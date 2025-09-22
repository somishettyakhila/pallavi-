package com.tnsif.task8;

public class TryCatch {
    public static void main(String[] args) {
        try {
           
            int num = 10 / 0;   
            System.out.println(num);
        } catch (ArithmeticException e) {
            
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Program continues after try-catch block.");
    }
}
