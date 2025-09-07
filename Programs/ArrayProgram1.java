public class ArrayProgram1 {
    public static void main(String[] args) {
        float [] marks = {74.3f,78.5f,90.0f,68.9f,72.4f};
        float sum = 0;
        for(float elements : marks){
            sum=sum+elements;
        }
        System.out.println("The value of sum is :" + sum);
    }
}
