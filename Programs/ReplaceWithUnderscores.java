//Write a java program to replace spaces with underscores
public class ReplaceWithUnderscores {
    public static void main(String[] args) {
        String text = "This  is  paragraph  written  by  me";
        text = text.replace(" ","_");
        System.out.println(text);
    }
}
