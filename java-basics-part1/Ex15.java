/**
   Write a Java program to swap two variables.
   */
import java.util.Scanner;

public class Ex15{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        double num1 = in.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = in.nextDouble();
        
        double numTemp = num1;
        num1 = num2;
        num2 = numTemp;
        
        System.out.println("Numbers swaped!");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }
}
