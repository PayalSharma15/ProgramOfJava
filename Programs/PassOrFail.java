import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        //System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        byte sub1 , sub2 , sub3;
        System.out.println("Enter your marks in physic");
        sub1 = sc.nextByte();
        System.out.println("Enter your marks in biology");
        sub2 = sc.nextByte();
        System.out.println("Enter your marks in mathematics");
        sub3 = sc.nextByte();
        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println("Your overall marks is " +avg);
        if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("Yor are passed");
        }
        else {
            System.out.println("Your are failed");
        }

    }
}
