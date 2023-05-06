package knowledgeseeker;
import java.util.Scanner;
class lastInstance {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the word : ");
    StringBuilder s1 = new StringBuilder (scan.next());
	System.out.println("Enter the letter to find the last instance of it : ");
	String Lletter = (scan.next());
	StringBuilder s2 = s1.reverse();
	System.out.println("reversed string: "+s2 +"  ");
	char chs2[] = s2.toString().toCharArray();
	for (int i=0; i<chs2.length; i++) {
	    String sch = Character.toString(chs2[i]);
	    if (Lletter.equals(sch)) {
	       int k= chs2.length-1-i;
	        System.out.println("The index position of the first instance of " +Lletter + " is : "+k);
			break;
			}
	    }
	}
    }

