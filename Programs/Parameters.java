public class Parameters {
    public static int multiply(int a, int b ) {
        int Product = a * b;
        return Product ;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int Product = multiply(a,b);
        System.out.println("Product of  " + a + "and" + b + " = " + Product);
    }
}
