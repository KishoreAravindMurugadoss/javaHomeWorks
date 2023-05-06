package com.test.Testcore1;

public class StringExample {
	public static void main(String args[]) {
		String s="abc";//String literals
		String s1=new String("abc");//New keyword
		
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
	    s.concat("d");//abcd 
		System.out.println("after concat s:"+s);
//		s=s.concat("de");//immutable
////		System.out.println(s);
		s1=s1+"de";//immutable
		System.out.println(s1);
		
	}
}
