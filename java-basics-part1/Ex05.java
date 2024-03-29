/**
   Write a Java program that takes two numbers as input and displays the product of two numbers.
   */
import java.util.Scanner;

public class Ex05{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        
        System.out.println("Product: " + (num1 * num2));
    }
}
