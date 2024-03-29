/**
   Write a Java program to add two binary numbers.
   */
import java.util.Scanner;

public class Ex17{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first binary number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second binary number: ");
        int num2 = in.nextInt();
        
        int factor = 0;
        int factor1 = 1;
        int result = 0;
        int reminder = 0;
        
        while(num1 != 0 || num2 !=0 || reminder != 0){  
            factor = (num1 % 10 + num2 % 10 + reminder) % 2;
            if(num1 % 10 + num2 % 10 + reminder > 1){
                reminder = 1;
            } else {
                reminder = 0;
            }
            num1 /= 10;
            num2 /= 10;
            result += factor * factor1;
            factor1 *= 10;
        }
        
        System.out.println("Sum of two binary numbers = " + result);
    }
}
