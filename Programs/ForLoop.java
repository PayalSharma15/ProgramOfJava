public class ForLoop {
    public static void main(String[] args) {
       int n=100;
        System.out.println("Even");
        for(int i = 0 ; i<=n ;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd");
        for(int i = 0 ; i<=n ;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
