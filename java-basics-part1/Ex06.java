/**
   Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
   */
import java.util.Scanner;

public class Ex06{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Subtract: " + (num1 - num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
    }
}
