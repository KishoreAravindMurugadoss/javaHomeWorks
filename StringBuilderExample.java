package com.test.Testcore1;
//Find the given string is palindrome or not using pre defined reverse function
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hello");
		StringBuilder s1=new StringBuilder("Hello");

		System.out.println(s==s1);//Reference comparsion
		System.out.println(s.equals(s1));//Reference comparsion
		System.out.println((s.toString()).equals(s1.toString()));
		s.append(" world");
		System.out.println("Value of s:"+s);
		System.out.println("Value of s:After the Append:"+s);
		s.reverse();
		System.out.println("Value of s:After the reverse:"+s);

		

	}

}
