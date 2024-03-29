/**
   Write a Java program to print the area and perimeter of a circle.
   */
import java.util.Scanner;
import java.lang.Math;

public class Ex11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input any radius value: ");
        Double num = in.nextDouble();
        
        System.out.println("Perimeter is = " + (num * 2 * Math.PI));
        System.out.println("Area is = " + (Math.pow(num, 2) * Math.PI));
    }
}
