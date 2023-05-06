
package com.ibmFITNESS;
import java.util.Scanner;
public class NutritionAnalyzer {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strFL[] = new String[]{"apple","mango","banana"};
        for (int i=0; i<strFL.length; i++){
        	System.out.println(strFL[i]);
        	}
        System.out.println("Enter any one fruit from the above list. ");
        String fruit = scan.next();
        if (strFL[0].equals(fruit)){
        	System.out.println("One serving, or one medium apple, provides about 95 calories, 0 gram fat, 1 gram protein, 25 grams carbohydrate, 19 grams sugar (naturally occurring), and 3 grams fiber.");
        	}
        else if (strFL[1].equals(fruit)){
        	System.out.println("Mangos contain over 20 different vitamins and minerals, helping to make them a superfood. 3/4 cup of mango provides 50% of your daily vitamin C, 8% of your daily Vitamin A and 8% of your daily vitamin B6. These nutrients in mango may help support your body's immune system.");
        	}
        else if (strFL[2].equals(fruit)){
        	System.out.println("One serving, or one medium ripe banana, provides about 110 calories, 0 gram fat, 1 gram protein, 28 grams carbohydrate, 15 grams sugar (naturally occurring), 3 grams fiber, and 450 mg potassium.");
        	}
	}
}

