public class CallByValue {
    public static void modify(int a , int b) {
        a = a+10;
        b = b+10;
        System.out.println("Inside modify :  a = " + a + " , b = " + b);
    }

    public static void main(String[] args) {
int x = 6 , y =7;
modify(x,y);
        System.out.println("After modify : x = " + x + " ,y = " + y);
    }
}
