package com.testcore;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		int c;
		try {
			c=a/b;
			int a1[]= null;
			System.out.println(a1[4]);
			
		}
		catch(ArithmeticException e1){
			System.err.println("arithmatic error has occured");
		}
		catch(NullPointerException e2) {
			System.err.println("the array a1 is empty");
		}
		//try {
			int arr[]= {0,1,2,3,4,5,6,7};
			//System.out.println(arr[8]);
		//}
		//catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("this array arr has only "+arr.length+" elements");
		//}
		//catch(Exception e00000) {
			System.out.println("some other exception that I am not aware of has occured.");
			
		}
		finally {
			System.out.println("anyhow the program has been executed");
		}
		
	}

}
