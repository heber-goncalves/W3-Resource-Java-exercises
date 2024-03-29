/**
   Write a Java program that takes a number as input and prints its multiplication table up to 10.
   */
import java.util.Scanner;

public class Ex07{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input any number: ");
        int num = in.nextInt();
        
        System.out.println("1 x " + num + " = " + (num * 1));
        System.out.println("2 x " + num + " = " + (num * 2));
        System.out.println("3 x " + num + " = " + (num * 3));
        System.out.println("4 x " + num + " = " + (num * 4));
        System.out.println("5 x " + num + " = " + (num * 5));
        System.out.println("6 x " + num + " = " + (num * 6));
        System.out.println("7 x " + num + " = " + (num * 7));
        System.out.println("8 x " + num + " = " + (num * 8));
        System.out.println("9 x " + num + " = " + (num * 9));
        System.out.println("10 x " + num + " = " + (num * 10));
        
    }
}
