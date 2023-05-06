package com.testcore;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int r, sum = 0;
		while (n>0);
		{
			r = n%10;
			n = n/10;
			sum = sum + r^3;
		
		}
		if (temp == sum)
			System.out.println("It is an Armstrong number");
		else
			System.out.println("Not an armstrong number");
	}

}
