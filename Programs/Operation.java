import java.util.*;
import java.lang.*;
public class Operation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Addition is " + (num1 + num2) );
        System.out.println("Subtraction is " + (num1 - num2) );
        System.out.println("Multiplication is " + (num1 * num2) );
        System.out.println("Division is " + (num1 / num2) );
        System.out.println("Modulo is " + (num1 % num2 ));


    }

}