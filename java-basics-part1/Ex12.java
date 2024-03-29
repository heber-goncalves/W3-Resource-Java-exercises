/**
   Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
   */
import java.util.Scanner;

public class Ex12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        double num1 = in.nextInt();
        System.out.print("Input the second number: ");
        double num2 = in.nextInt();
        System.out.print("Input the third number: ");
        double num3 = in.nextInt();
        
        System.out.println("Average = " + (num1 + num2 + num3) / 3);
    }
}