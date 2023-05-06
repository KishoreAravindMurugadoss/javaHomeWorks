package knowledgeseeker;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   			    String str="chitra",str1="";
				char ch[]=str.toCharArray();
				for(int i=0;i<ch.length;i++) {
					str1=ch[i]+str1;				
					}
				System.out.println(str1);
				System.out.println(" ");
				
				boolean r = str.equals(str1);
		        if (r == true) {
		            System.out.println("THE GIVEN STRING IS A PALINROME");
		        }
		        else {
		            System.out.println("THE GIVEN STRING IS NOT A PALINROME");
		        }
			}
		}