package knowledgeseeker;

public class palindromeNo {

	public static void main(String[] args) {
		int n=345;
		int r, sum = 0, re = 0;
		
		while (n>0);{
		
			r=n%10;
			re= re*10+r;
			n=n/10;
			sum = sum+r;
		}
		System.out.println(r);
			}
		}