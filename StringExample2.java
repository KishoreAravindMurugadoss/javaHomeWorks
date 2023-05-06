package com.test.Testcore1;
//To do one Content comparsion and Reference comparsion example
public class StringExample2 {

	public static void main(String[] args) {
		String s1="Hello";//New constant will be created in string constant pool
		String s2="Hello";//It will check in String Constant pool. (if there it will point the existing one)
		String s3=new String("Hello");
		String s4=s3;
		
		//Reference comparasion
		System.out.println("Reference comparsion");//It will compare whether both element address are same 
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false. Because s3 stored in heap and s1 is stored in String constant pool
		System.out.println(s3==s4);//true
		
		//Content comparasion
		System.out.println("Content comparsion");//It will compare whether both element value are same
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s4));//true

	}

}
