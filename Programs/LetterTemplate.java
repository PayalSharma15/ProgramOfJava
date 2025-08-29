//Write a java program to fill in a letter template which looks like below:
//letter = "Dear <|name|> , Thanks a lot !"
public class LetterTemplate  {
    public static void main(String[] args) {

    String LetterTemplate = "Dear <|name|> , Thanks a lot ";
    LetterTemplate = LetterTemplate.replace("<|name|>" ,"Payal");
        System.out.println(LetterTemplate);
}
}
