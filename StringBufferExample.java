package com.test.Testcore1;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=new StringBuffer("Hello");
//		String s=sb.toString();
//		String s1=sb1.toString();
		System.out.println(sb);

		System.out.println(sb==sb1);
		System.out.println((sb.toString()).equals(sb1.toString()));
		sb.append(" world");
		System.out.println(sb);
	}

}
