public class JavaBasic {
    public static void main(String[] args) {
        int n=7;
        for(int line = 1; line <= n;line++){
            for (int star = 1; star <= n- line ; star ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
