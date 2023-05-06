package knowledgeseeker;
import java.util.Scanner;
public class firstInstance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = scan.next();
		System.out.println("Enter the letter to find the first instance of it : ");
		String fletter = scan.next();
		char ch[] = word.toCharArray();
		for (int i=0; i<ch.length; i++) {
		    String sch = Character.toString(ch[i]);
			if (fletter.equals(sch)) {
				System.out.println("The index position of the first instance of " +fletter + " is : "+i);
				break;
			}
		}

	}

}
