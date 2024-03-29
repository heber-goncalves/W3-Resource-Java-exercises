/**
   Write a Java program to print the area and perimeter of a rectangle.
   */
import java.util.Scanner;

public class Ex13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the rectangle width: ");
        double width = in.nextDouble();
        System.out.print("Input the rectangle height: ");
        double height = in.nextDouble();
        
        
        System.out.println("Perimeter = " + (width * 2 + height * 2));
        System.out.println("Area = " + (width * height));
    }
}
