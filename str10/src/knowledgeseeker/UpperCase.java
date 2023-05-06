package knowledgeseeker;
import java.util.Scanner;
class UpperCase{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text that you want to convert into Upper Case : ");
        String word = scan.next();
        System.out.println(word.toUpperCase());
    }
}