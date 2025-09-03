import java.util.Scanner;
public class ElseIfStatement {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=17 && age>=1) {
            System.out.println("You are Teenager");
        }
        else if (age>=18) {
            System.out.println("You are Adult");
        } else if (age>=60) {
            System.out.println("You are Senior Citizen");
        }
        else {
            System.out.println("You are not Exist");
    }
    }
}
