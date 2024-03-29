/**
   Write a Java program to multiply two binary numbers.
   */
import java.util.Scanner;
import java.lang.Math;

public class Ex18{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first binary number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second binary number: ");
        int num2 = in.nextInt();
        
        int[] numbers = new int[10];
        int factor = 0;
        int factor1 = 1;
        int result = 0;
        int reminder = 0;
        int counter = 0;
        
        while(num2 != 0){
            if(num2 % 10 == 1){
                numbers[counter] = num1 * (int)Math.pow(10, counter);
            } else {
                numbers[counter] = 0;
            }
            num2 /= 10;
            counter++;
            System.out.println("Counter = " + counter);
        }
        System.out.println("Counter fora1 = " + counter);
        counter--;
        System.out.println("Counter fora2 = " + counter);
        while(numbers[counter] != 0 || reminder != 0){
            int sum1 = 0;
            for(int i = 0; i < counter; i++){
                sum1 += numbers[i] % 10;
            }
            factor = (sum1 + reminder) % 2;
            if(sum1 + reminder > 1){
                reminder = 1;
            } else {
                reminder = 0;
            }
            for(int i = 0; i < counter; i++){
                numbers[i] /= 10;
            }
            result += factor * factor1;
            factor1 *= 10;
            if(counter > 0){
               counter--; 
            }
        }
        
        System.out.print("Product of two binary numbers = " + result);
    }
    
}
