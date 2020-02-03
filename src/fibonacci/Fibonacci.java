package fibonacci;

import java.util.Scanner;
/**
 *
 * @author Mateusz Utracki-Janeta
 */
public class Fibonacci {

    static public Scanner input = new Scanner(System.in); 
    public static int count;
    public static void main(String[] args) {
        
        System.out.print("Please enter the number of fibonacci numbers to be produced: ");
        count = input.nextInt();
        countFibonacci(count);        
    }
    
    public static void countFibonacci(int count)
    {
        int num1=0,num2=1,num3,i;
        System.out.println("Fibonacci sequence: "); 
        System.out.println("0 " + num1);    
        System.out.println("1 " + num2);
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
         num3=num1+num2;    
         System.out.println(i + " " + num3);
         num1=num2;    
         num2=num3;    
        }
    }
    
}
