package com.test.Testcore1;
//Find the given string is palindrome or not using user defined reverse function
public class StringManipulartion {

	public static void main(String[] args) {
		String str="Hello world",str1="";
		char ch[]=str.toCharArray(); //{'H','e','l','l','o',' ','w','o','r','l','d'}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]+str1);
			str1=ch[i]+str1;//H+"" //e+"H" //l+eH //l+leH
		}
		System.out.println(str1);
	}

}
