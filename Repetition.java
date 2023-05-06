package knowledgeseeker;
import java.util.Scanner;
class Repetition {
 public static void main(String [] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the word : ");
     String word = scan.next();
		System.out.println("Enter the letter to find the number of occurence of it : ");
		String Cletter = scan.next();
		char ch[] = word.toCharArray();
		int count = 0;
		for (int i =0; i<ch.length; i++){
		    String sch = Character.toString(ch[i]);
		    if (Cletter.equals(sch)){
		        count = count+1;
		    }
		}
		System.out.println("The letter "+Cletter+" has occured "+count+" times in "+word );
     
     
 }
}
