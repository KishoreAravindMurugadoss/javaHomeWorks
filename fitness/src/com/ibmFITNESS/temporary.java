package com.ibmFITNESS;

import java.util.Scanner;

public class mainProg {

	public static void main(String[] args) {
		// scanner variable
        Scanner scan = new Scanner(System.in);
        // food categories
        String strFoodCategory[] = new String[]{"vegetables","fruits","cereals"}; 
        // displaying the categories
        for (int i=0; i<strFoodCategory.length; i++){
        	System.out.println(strFoodCategory[i]);
        	}
        // vegetables list
    	String strVegetableList[] = new String[]{"apple gourd","ash gourd",
    			"beans","beetroot","bitter gourd","bottle gourd","brinjal",
    			"broccoli",
    			"cabbage","capsicum","carrot","cauliflower","celery",
    			"chow chow","corn","cucumber",
    			"drumstick",
    			"field beans",
    			"garlic","ginger","green peas",
    			"lady's finger",
    			"mushroom",
    			"onion",
    			"potato","pumpkin",
    			"radish",
    			"snake beans","snake gourd","spinach","sweet potato",
    			"tomato",};
    	// FRUIT LIST 
    	String strFruitList[] = new String[] {"ackee","apple","apricot","atemoya","avocados",
    			"banana","blackcurrant","blueberry",
    			"cantaloupe","cape gooseberry","chempedak","cherry","coconut","cranberry","custard apple",
    			"dates","dragon fruit",
    			"egg fruit",
    			"fig","fuyu",
    			"gooseberries","grapefruit","guava",
    			"hazelnut","hog plum","honeyberries","honeydew",
    			"jackfruit","jujube",
    			"kiwi",
    			"lime","lychee",
    			"mango","oranges",
    			"papaya","peach","pear","pineapple","pomegranate",
    			"rashberries",
    			"sapota","strawberries",
    			"watermelon"};
    	String strCerealsList[] = new String[] {"amarnath flour","amarnath seeds","arrow root flour",
    			"barley","barnyard millet","buckwheat",
    			"cassava","chia seeds","cornstarch",
    			"dried corn",
    			"finger millet","foxtail millet",
    			"kodo millet",
    			"little millet",
    			"maize","milo",
    			"noodles",
    			"oats",
    			"pasta","puffed rice",
    			"quinoa",
    			"rice","rice flakes","rye",
    			"sago",
    			"vermicelli",
    			"water chestnut","wheat"};
        // print statement to choose a category
        System.out.println("Enter any one category from the above list. ");
        // category input
        String category = scan.next();
        // comparing the input with the available categories
        if (strFoodCategory[0].equals(category)){
        	System.out.println("You have selected the vegetables category.");
        	
            // listing out the vegetables
        	for (int j=0; j<strVegetableList.length; j++){
            	System.out.println(strVegetableList[j]);
            	}
        	System.out.println("Now select any one vegetable form the above list.");
        	String inputVeg = scan.next();
        	if (strVegetableList[0].equals(inputVeg)){   // apple gourd
        		System.out.println("apple gourd  consists of "
        				+ "94% water and "
        				+ "has very few calories, "
        				+ "approximately 66 cal in 100 grams per serving.");
        		}
        	else if (strVegetableList[1].equals(inputVeg)) {  // ash gourd
        		System.out.println("Ash gourd comprises "
        				+ "96% water and is very low in "
        				+ "calories, "
        				+ "fat, "
        				+ "protein, and "
        				+ "carbs. "
        				+ "Yet, it remains rich in fiber and provides small amounts of "
        				+ "various nutrients.");
        		
        	}
        	else if (strVegetableList[2].equals(inputVeg)) {   // beans
        		System.out.println("Beans provide "
        				+ "protein, "
        				+ "fiber, "
        				+ "folate, "
        				+ "iron, "
        				+ "potassium and "
        				+ "magnesium "
        				+ "while containing little or no total fat, trans-fat, "
        				+ "sodium and cholesterol.");
        		
        	}
        	else if (strVegetableList[3].equals(inputVeg)) {   // beetroots
        		System.out.println("Packed with essential nutrients, "
        				+ "beetroots are a great source of "
        				+ "fiber, "
        				+ "folate (vitamin B9), "
        				+ "manganese, "
        				+ "potassium, "
        				+ "iron, and "
        				+ "vitamin C."
        				+ "Nutrition Facts\r\n "
        				+ "Calories: 43.\r\n"
        				+ "Water: 88%\r\n"
        				+ "Protein: 1.6 grams.\r\n"
        				+ "Carbs: 9.6 grams.\r\n"
        				+ "Sugar: 6.8 grams.\r\n"
        				+ "Fiber: 2.8 grams.\r\n"
        				+ "Fat: 0.2 grams");
        		
        	}
        	else if (strVegetableList[4].equals(inputVeg)) {  // bitter gourd
        		System.out.println("100 grams of bitter gourd gives about 19 calories of energy."
        				+ "Around 3.5 grams of carbohydrates and "
        				+ "2.4 grams of fibre are present in 100 grams of karela "
        				+ "while it contains only 150 mg of fats and 930 mg of proteins. "
        				+ "It also has a high water content of 87 grams."
        				+ "Karela is rich in vitamin A and vitamin C.");
        	}
        	else if (strVegetableList[5].equals(inputVeg)) {  // bottle gourd
        		System.out.println(" 100 g of bottle gourd contains 15 calories. "
        				+ "100 g of the edible portion contains 1 g fat. "
        				+ "Its water content is 96%. "
        				+ "It is low in saturated fat, cholesterol, and high in dietary fibre,"
        				+ " vitamin C, riboflavin, zinc, thiamine, iron, "
        				+ "magnesium and manganese.");
        	}
        	else if (strVegetableList[6].equals(inputVeg)) {  // brinjal
        		System.out.println(" Nutrients per Serving\r\n"
        				+ "A 3.5-ounce (100-gram) serving of eggplant has:\r\n"
        				+ "\r\n"
        				+ "Calories: 25\r\n"
        				+ "Protein: 1 gram\r\n"
        				+ "Fat: 0.2 grams\r\n"
        				+ "Carbohydrates: 6 grams\r\n"
        				+ "Fiber: 3 grams\r\n"
        				+ "A serving also has vitamins such as:\r\n"
        				+ "\r\n"
        				+ "Folate: 22 micrograms\r\n"
        				+ "Vitamin A: 23 IUs\r\n"
        				+ "Vitamin C: 2.2 milligrams\r\n"
        				+ "Vitamin K: 3.5 micrograms\r\n"
        				+ "You'll get these minerals in one serving:\r\n"
        				+ "\r\n"
        				+ "Calcium: 9 milligrams\r\n"
        				+ "Iron: 0.23 milligrams\r\n"
        				+ "Magnesium: 14 milligrams\r\n"
        				+ "Phosphorus: 24 milligrams\r\n"
        				+ "Potassium: 229 milligrams\r\n"
        				+ "");
        	}
        	else if (strVegetableList[7].equals(inputVeg)) {  // broccoli
        		System.out.println(" Raw broccoli contains almost "
        				+ "90% water, "
        				+ "7% carbs, "
        				+ "3% protein, and "
        				+ "almost no fat.\r\n"
        				+ "\r\n"
        				+ "Broccoli is very low in calories, "
        				+ "providing only 31 calories per cup (91 grams).\r\n"
        				+ "\r\n"
        				+ "The nutrition facts for 1 cup (91 grams) of raw broccoli are \r\n"
        				+ "Calories: 31\r\n"
        				+ "Water: 89%\r\n"
        				+ "Protein: 2.5 grams\r\n"
        				+ "Carbs: 6 grams\r\n"
        				+ "Sugar: 1.5 grams\r\n"
        				+ "Fiber: 2.4 grams\r\n"
        				+ "Fat: 0.4 grams");
        	}
        	else if (strVegetableList[8].equals(inputVeg)) {   // cabbage
        		System.out.println(" Even though cabbage is very low in calories, "
        				+ "it has an impressive nutrient profile.\r\n"
        				+ "\r\n"
        				+ "In fact, just 1 cup (89 grams) of raw green cabbage contains:\r\n"
        				+ "\r\n"
        				+ "Calories: 22\r\n"
        				+ "Protein: 1 gram\r\n"
        				+ "Fiber: 2 grams\r\n"
        				+ "Vitamin K: 85% of the RDI\r\n"
        				+ "Vitamin C: 54% of the RDI\r\n"
        				+ "Folate: 10% of the RDI\r\n"
        				+ "Manganese: 7% of the RDI\r\n"
        				+ "Vitamin B6: 6% of the RDI\r\n"
        				+ "Calcium: 4% of the RDI\r\n"
        				+ "Potassium: 4% of the RDI\r\n"
        				+ "Magnesium: 3% of the RDI");
        	}
        	else if (strVegetableList[9].equals(inputVeg)) {
        		System.out.println(" Capsicum or bell peppers are "
        				+ "94% water, "
        				+ "5% carbohydrates, "
        				+ "with a very little amount of protein and fat. "
        				+ "These bright coloured vegetables are quite high in "
        				+ "Vitamin C, "
        				+ "Vitamin A, "
        				+ "besides ample amounts of "
        				+ "Vitamins B2, B6, E, niacin, folate and riboflavin.");
        		
        	}
        	else if (strVegetableList[10].equals(inputVeg)) {   // carrots
        		System.out.println(" Carrots’ water content ranges from 86–95%, and "
        				+ "the edible portion consists of around 10% carbs "
        				+ "Carrots contain very little fat and protein."
        				+ "The nutrition facts for two small-to-medium raw carrots (100 grams) are:\r\n"
        				+ "\r\n"
        				+ "Calories: 41\r\n"
        				+ "Water: 88%\r\n"
        				+ "Protein: 0.9 grams\r\n"
        				+ "Carbs: 9.6 grams\r\n"
        				+ "Sugar: 4.7 grams\r\n"
        				+ "Fiber: 2.8 grams\r\n"
        				+ "Fat: 0.2 grams");
        	}
        	else if (strVegetableList[11].equals(inputVeg)) {  // cauliflower
        		System.out.println(" Cauliflower is very low in calories "
        				+ "yet high in vitamins. "
        				+ "In fact, cauliflower contains some of almost every vitamin and mineral "
        				+ "that you need.\r\n"
        				+ "\r\n"
        				+ "Here is an overview of the nutrients found in "
        				+ "1 cup, or 128 grams, of raw cauliflower r\n"
        				+ "\r\n"
        				+ "Calories: 25\r\n"
        				+ "Fiber: 3 grams\r\n"
        				+ "Vitamin C: 77% of the RDI\r\n"
        				+ "Vitamin K: 20% of the RDI\r\n"
        				+ "Vitamin B6: 11% of the RDI\r\n"
        				+ "Folate: 14% of the RDI\r\n"
        				+ "Pantothenic acid: 7% of the RDI\r\n"
        				+ "Potassium: 9% of the RDI\r\n"
        				+ "Manganese: 8% of the RDI\r\n"
        				+ "Magnesium: 4% of the RDI\r\n"
        				+ "Phosphorus: 4% of the RDI");
        	}
        	else if (strVegetableList[12].equals(inputVeg)) {  // celery
        		System.out.println("One medium sized celery stalk (40g) contains 5.6 calories, "
        				+ "1.2g carbohydrates, and "
        				+ "0.3g protein. "
        				+ "\r\n"
        				+ "Calories: 5.6\r\n"
        				+ "Fat: 0.1g\r\n"
        				+ "Sodium: 32mg\r\n"
        				+ "Carbohydrates: 1.2g\r\n"
        				+ "Fiber: 0.6g\r\n"
        				+ "Sugars: 0.5g\r\n"
        				+ "Protein: 0.3g\r\n"
        				+ "Potassium: 104mg\r\n"
        				+ "Sodium: 32mg\r\n"
        				+ "Phosphorus: 9.6mg\r\n"
        				+ "Potassium: 104mg\r\n"
        				+ "Vitamin A: 8.8mcg\r\n"
        				+ "Folate: 14.4mcg\r\n"
        				+ "Vitamin K: 11.7mcg");
        		
        	}
        	else if (strVegetableList[13].equals(inputVeg)) {  // chow chow
        		System.out.println(" Chow Chow\r\n"
        				+ "Total Fat 2.2g. 3%\r\n"
        				+ "Saturated Fat 0.4g. 2%\r\n"
        				+ "Cholesterol 0mg. 0%\r\n"
        				+ "Sodium 1291mg. 54%\r\n"
        				+ "Potassium 490mg. 14%\r\n"
        				+ "Total Carbohydrates 65g. 22%\r\n"
        				+ "Dietary Fiber 3.7g. 15%\r\n"
        				+ "Sugars 59g.");
        	}
        	else if (strVegetableList[14].equals(inputVeg)) {  // corn
        		System.out.println("Corn is high in carbs and packed with "
        				+ "fiber, "
        				+ "vitamins and "
        				+ "minerals. "
        				+ "It’s also relatively low in protein and fat.\r\n"
        				+ "\r\n"
        				+ "One cup (164 grams) of sweet yellow corn contains (5):\r\n"
        				+ "\r\n"
        				+ "Calories: 177 calories\r\n"
        				+ "Carbs: 41 grams\r\n"
        				+ "Protein: 5.4 grams\r\n"
        				+ "Fat: 2.1 grams\r\n"
        				+ "Fiber: 4.6 grams\r\n"
        				+ "Vitamin C: 17% of the daily value (DV)\r\n"
        				+ "Thiamine (vitamin B1): 24% of the DV\r\n"
        				+ "Folate (vitamin B9): 19% of the DV\r\n"
        				+ "Magnesium: 11% of the DV\r\n"
        				+ "Potassium: 10% of the DV");
        	}
        	else if (strVegetableList[15].equals(inputVeg)) {   // cucumber
        		System.out.println("Cucumbers are low in calories "
        				+ "but high in many important vitamins and minerals.\r\n"
        				+ "\r\n"
        				+ "One 11-ounce (300-gram) unpeeled, "
        				+ "raw cucumber contains the following:\r\n"
        				+ "\r\n"
        				+ "Calories: 45\r\n"
        				+ "Total fat: 0 grams\r\n"
        				+ "Carbs: 11 grams\r\n"
        				+ "Protein: 2 grams\r\n"
        				+ "Fiber: 2 grams\r\n"
        				+ "Vitamin C: 14% of the RDI\r\n"
        				+ "Vitamin K: 62% of the RDI\r\n"
        				+ "Magnesium: 10% of the RDI\r\n"
        				+ "Potassium: 13% of the RDI\r\n"
        				+ "Manganese: 12% of the RDI");
        	}
        	else if (strVegetableList[16].equals(inputVeg)) {   // drumstick
        		System.out.println(" One hundred grams of drumsticks contain:\r\n"
        				+ "Energy: 64kCal\r\n"
        				+ "Protein: 9.4g\r\n"
        				+ "Carbohydrates: 8.2g\r\n"
        				+ "Vitamin B3 (niacin): 2.2mg\r\n"
        				+ "Vitamin C: 51.7mg\r\n"
        				+ "Fats: 1.4g\r\n"
        				+ "Dietary Fibre: 2.0g\r\n"
        				+ "Iron: 4mg\r\n"
        				+ "Sodium: 9mg\r\n"
        				+ "Potassium: 337mg");
        	}
        	else if (strVegetableList[17].equals(inputVeg)) {  // field beans
        		System.out.println(" One cup (170 grams) of cooked field beans has:\r\n"
        				+ "\r\n"
        				+ "Calories: 187 calories\r\n"
        				+ "Carbs: 33 grams\r\n"
        				+ "Fat: Less than 1 gram\r\n"
        				+ "Protein: 13 grams\r\n"
        				+ "Fiber: 9 grams\r\n"
        				+ "Folate: 40% of the Daily Value (DV)\r\n"
        				+ "Manganese: 36% of the DV\r\n"
        				+ "Copper: 22% of the DV\r\n"
        				+ "Phosphorous: 21% of the DV\r\n"
        				+ "Magnesium: 18% of the DV\r\n"
        				+ "Iron: 14% of the DV\r\n"
        				+ "Potassium: 13% of the DV\r\n"
        				+ "Thiamine (vitamin B1) and Zinc: 11% of the DV");
        	}
        	else if (strVegetableList[18].equals(inputVeg)) {   // garlic
        		System.out.println(" Garlic is highly nutritious "
        				+ "but has very few calories\r\n"
        				+ "Calorie for calorie, garlic is incredibly nutritious.\r\n"
        				+ "\r\n"
        				+ "A single clove (3 grams) of raw garlic contains:\r\n"
        				+ "\r\n"
        				+ "Manganese: 2% of the daily value (DV)\r\n"
        				+ "Vitamin B6: 2% of the DV\r\n"
        				+ "Vitamin C: 1% of the DV\r\n"
        				+ "Selenium: 1% of the DV\r\n"
        				+ "Fiber: 0.06 grams\r\n"
        				+ "This comes with 4.5 calories, 0.2 grams of protein, and 1 gram of carbs.\r\n"
        				+ "\r\n"
        				+ "Garlic also contains trace amounts of various other nutrients.");
        	}
        	else if (strVegetableList[19].equals(inputVeg)) {   // ginger
        		System.out.println("Ginger Nutrition Facts\r\n"
        				+ "The nutrition information for five slices (11 grams) of ginger is provided by the USDA.1\r\n"
        				+ "\r\n"
        				+ "Calories: 9\r\n"
        				+ "Fat: 0g\r\n"
        				+ "Sodium: 1.4mg\r\n"
        				+ "Carbohydrates: 2g\r\n"
        				+ "Fiber: 0.2g\r\n"
        				+ "Sugar: 0.2g\r\n"
        				+ "Protein: 0.2g\r\n"
        				+ "Magnesium: 4.7mg\r\n"
        				+ "Potassium: 45.6mg");
        	}
        	else if (strVegetableList[20].equals(inputVeg)) {    // green peas
        		System.out.println("Green peas have an impressive nutrition profile.\r\n"
        				+ "\r\n"
        				+ "Their calorie content is fairly low, "
        				+ "with only 62 calories per 1/2-cup (170-gram) serving.\r\n"
        				+ "\r\n"
        				+ "About 70% of those calories come from carbs and "
        				+ "the rest are provided by protein and a small amount of fat.\r\n"
        				+ "\r\n"
        				+ "Furthermore, peas contain just about every vitamin and "
        				+ "mineral you need, in addition to a significant amount of fiber.\r\n"
        				+ "\r\n"
        				+ "A 1/2-cup (170-gram) serving of peas provides the following nutrients:\r\n"
        				+ "\r\n"
        				+ "Calories: 62\r\n"
        				+ "Carbs: 11 grams\r\n"
        				+ "Fiber: 4 grams\r\n"
        				+ "Protein: 4 grams\r\n"
        				+ "Vitamin A: 34% of the RDI\r\n"
        				+ "Vitamin K: 24% of the RDI\r\n"
        				+ "Vitamin C: 13% of the RDI\r\n"
        				+ "Thiamine: 15% of the RDI\r\n"
        				+ "Folate: 12% of the RDI\r\n"
        				+ "Manganese: 11% of the RDI\r\n"
        				+ "Iron: 7% of the RDI\r\n"
        				+ "Phosphorus: 6% of the RDI");
        	}
        	else if (strVegetableList[21].equals(inputVeg)) {   // ladys finger
        		System.out.println("lady's finger boasts an impressive nutrient profile.\r\n"
        				+ "\r\n"
        				+ "One cup (100 grams) of raw lady's finger contains:\r\n"
        				+ "\r\n"
        				+ "Calories: 33\r\n"
        				+ "Carbs: 7 grams\r\n"
        				+ "Protein: 2 grams\r\n"
        				+ "Fat: 0 grams\r\n"
        				+ "Fiber: 3 grams\r\n"
        				+ "Magnesium: 14% of the Daily Value (DV)\r\n"
        				+ "Folate: 15% of the DV\r\n"
        				+ "Vitamin A: 14% of the DV\r\n"
        				+ "Vitamin C: 26% of the DV\r\n"
        				+ "Vitamin K: 26% of the DV\r\n"
        				+ "Vitamin B6: 14% of the DV");
        	}
        	else if (strVegetableList[22].equals(inputVeg)) {   // mushrooms
        		System.out.println("mushrooms are low in calories but pack plenty of nutrients.\r\n"
        				+ "\r\n"
        				+ "One cup (96 grams) of whole white mushrooms provides\r\n"
        				+ "Calories: 21\r\n"
        				+ "Carbs: 3 grams\r\n"
        				+ "Fiber: 1 gram\r\n"
        				+ "Protein: 3 grams\r\n"
        				+ "Fat: 0 grams\r\n"
        				+ "Vitamin D: 33% of the Daily Value (DV)\r\n"
        				+ "Selenium: 16% of the DV\r\n"
        				+ "Phosphorus: 12% of the DV\r\n"
        				+ "Folate: 4% of the DV");
        	}
        	else if (strVegetableList[23].equals(inputVeg)) {  //onions 
        		System.out.println(" Raw onions are very low in calories, "
        				+ "with only 40 calories per 3.5 ounces (100 grams).\r\n"
        				+ "\r\n"
        				+ "By fresh weight, they are "
        				+ "89% water, "
        				+ "9% carbs, and "
        				+ "1.7% fiber, "
        				+ "with tiny amounts of protein and fat.\r\n"
        				+ "\r\n"
        				+ "The main nutrients in 3.5 ounces (100 grams) of raw onions are:\r\n"
        				+ "\r\n"
        				+ "Calories: 40\r\n"
        				+ "Water: 89%\r\n"
        				+ "Protein: 1.1 grams\r\n"
        				+ "Carbs: 9.3 grams\r\n"
        				+ "Sugar: 4.2 grams\r\n"
        				+ "Fiber: 1.7 grams\r\n"
        				+ "Fat: 0.1 grams");
        	}
        	else if (strVegetableList[24].equals(inputVeg)) {  // potatos
        		System.out.println(" The nutrients found in 2/3 cup (100 grams) of boiled potatoes"
        				+ "cooked with the skin but without salt are :\r\n"
        				+ "\r\n"
        				+ "Calories: 87\r\n"
        				+ "Water: 77%\r\n"
        				+ "Protein: 1.9 grams\r\n"
        				+ "Carbs: 20.1 grams\r\n"
        				+ "Sugar: 0.9 grams\r\n"
        				+ "Fiber: 1.8 grams\r\n"
        				+ "Fat: 0.1 grams");
        	}
        	else if (strVegetableList[25].equals(inputVeg)) {  //pumpkin
        		System.out.println("Pumpkin has an impressive nutrient profile.\r\n"
        				+ "\r\n"
        				+ "One cup of cooked pumpkin (245 grams) contains (2):\r\n"
        				+ "\r\n"
        				+ "Calories: 49\r\n"
        				+ "Fat: 0.2 grams\r\n"
        				+ "Protein: 2 grams\r\n"
        				+ "Carbs: 12 grams\r\n"
        				+ "Fiber: 3 grams\r\n"
        				+ "Vitamin A: 245% of the Reference Daily Intake (RDI)\r\n"
        				+ "Vitamin C: 19% of the RDI\r\n"
        				+ "Potassium: 16% of the RDI\r\n"
        				+ "Copper: 11% of the RDI\r\n"
        				+ "Manganese: 11% of the RDI\r\n"
        				+ "Vitamin B2: 11% of the RDI\r\n"
        				+ "Vitamin E: 10% of the RDI\r\n"
        				+ "Iron: 8% of the RDI\r\n"
        				+ "Small amounts of magnesium, phosphorus, zinc, folate and several B vitamins.");
        	}
        	else if (strVegetableList[26].equals(inputVeg)) { //radish
        		System.out.println("Radishes contain small amounts of:\r\n"
        				+ "\r\n"
        				+ "potassium\r\n"
        				+ "folate\r\n"
        				+ "riboflavin\r\n"
        				+ "niacin\r\n"
        				+ "vitamin B-6\r\n"
        				+ "vitamin K\r\n"
        				+ "calcium\r\n"
        				+ "magnesium\r\n"
        				+ "zinc\r\n"
        				+ "phosphorous\r\n"
        				+ "copper\r\n"
        				+ "manganese\r\n"
        				+ "sodium");
        	}
        	else if (strVegetableList[27].equals(inputVeg)) { //snake beans
        		System.out.println("Energy – 47 Kcal\r\n"
        				+ "Carbohydrates – 8.35 g\r\n"
        				+ "Protein – 2.8 g\r\n"
        				+ "Total Fat – 0.40 g\r\n"
        				+ "Folate – 62 µg\r\n"
        				+ "Niacin – 0.410 mg\r\n"
        				+ "Pantothenic acid – 0.055 mg\r\n"
        				+ "Pyridoxine – 0.024 mg\r\n"
        				+ "Riboflavin – 0.110 mg\r\n"
        				+ "Thiamin – 0.107 mg\r\n"
        				+ "Vitamin A – 865 IU\r\n"
        				+ "Vitamin C – 18.8 mg\r\n"
        				+ "Sodium – 4 mg\r\n"
        				+ "Potassium – 240 mg\r\n"
        				+ "Calcium – 50 mg\r\n"
        				+ "Copper – 0.048 µg\r\n"
        				+ "Iron – 0.47 mg\r\n"
        				+ "Magnesium – 44 mg\r\n"
        				+ "Manganese – 0.205 mg\r\n"
        				+ "Phosphorus – 59 mg\r\n"
        				+ "Selenium – 1.5 µg\r\n"
        				+ "Zinc – 0.37 mg");
        	}
        	else if (strVegetableList[28].equals(inputVeg)) {   //Snake gourds
        		System.out.println("Snake gourds are rich in certain nutrients. "
        				+ "These include Vitamin A, B, C, "
        				+ "calcium, iron, magnesium, "
        				+ "iodine and potassium. "
        				+ "They are also rich in antibiotic qualities. "
        				+ "Snake gourds are known to "
        				+ "improve digestion and immunity.");
        		
        	}
        	else if (strVegetableList[29].equals(inputVeg)) { //spinach
            	System.out.println("The nutrition facts for 3.5 ounces (100 grams) of raw spinach are :\r\n"
            			+ "\r\n"
            			+ "Calories: 23\r\n"
            			+ "Water: 91%\r\n"
            			+ "Protein: 2.9 grams\r\n"
            			+ "Carbs: 3.6 grams\r\n"
            			+ "Sugar: 0.4 grams\r\n"
            			+ "Fiber: 2.2 grams\r\n"
            			+ "Fat: 0.4 grams");
            }
        	else if (strVegetableList[30].equals(inputVeg)) { //sweet potato
        		System.out.println("The nutrition facts for 3.5 ounces (100 grams) of raw sweet potatoes are:\r\n"
        				+ "\r\n"
        				+ "Calories: 86\r\n"
        				+ "Water: 77%\r\n"
        				+ "Protein: 1.6 grams\r\n"
        				+ "Carbs: 20.1 grams\r\n"
        				+ "Sugar: 4.2 grams\r\n"
        				+ "Fiber: 3 grams\r\n"
        				+ "Fat: 0.1 grams");
        	}
        	else if (strVegetableList[31].equals(inputVeg)) {   //tomato
        		System.out.println("The water content of tomatoes is around 95%. "
        				+ "The other 5% consists mainly of carbohydrates and fiber.\r\n"
        				+ "\r\n"
        				+ "Here are the nutrients in a small (100-gram) raw tomato:\r\n"
        				+ "\r\n"
        				+ "Calories: 18\r\n"
        				+ "Water: 95%\r\n"
        				+ "Protein: 0.9 grams\r\n"
        				+ "Carbs: 3.9 grams\r\n"
        				+ "Sugar: 2.6 grams\r\n"
        				+ "Fiber: 1.2 grams\r\n"
        				+ "Fat: 0.2 grams");
        	}
        	else {
        		System.out.println("Please enter a vegetable from the above list.");
        	}
        }
        else if (strFoodCategory[1].equals(category)){
        	System.out.println("You have selected the fruits category."
        			+ "\nNow select any one fruit form the list below.");
        	 // listing out the fruits
        	for (int k=0; k<strFruitList.length; k++){
            	System.out.println(strFruitList[k]);
            	}
        	System.out.println("Now select any one fruit form the above list.");
        	String inputFruit = scan.next();
        	if (strFruitList[0].equals(inputFruit)){   //Ackee
        		System.out.println("Ackee Nutrition Facts\r\n"
        				+ "100g of ackee fills a little more than half cup; \r\n"
        				+ "and this serving size has approximately 150 calories; \r\n"
        				+ "15g of fat; 3g of protein and less than 1g of carbohydrates. \r\n"
        				+ "This versatile high fat fruit therefore, \r\n"
        				+ "could be suitable for persons who follow a ketogenic or\r\n "
        				+ "other high fat diet.");
        		}
        	else if (strFruitList[1].equals(inputFruit)) {//apple
        		System.out.println("One serving, or one medium apple, provides about\r\n "
        				+ "95 calories, \r\n"
        				+ "0 gram fat, \r\n"
        				+ "1 gram protein, \r\n"
        				+ "25 grams carbohydrate, \r\n"
        				+ "19 grams sugar (naturally occurring), \r\n"
        				+ "and 3 grams fiber.\r\n");
        	}
        	else if (strFruitList[2].equals(inputFruit)) {
        		System.out.println("Rich in vitamin A,\r\n"
        				+ " beta-carotene, \r\n"
        				+ "and other carotenoids,\r\n"
        				+ " apricots are excellent for promoting eye health. \r\n"
        				+ "Lutein helps to support retina and lens health, \r\n"
        				+ "while carotenoids and vitamin E support overall vision.\r\n "
        				+ "Apricot nutrients also help to reduce the risk of macular \r\n"
        				+ "degeneration and cataracts.\r\n");
        	}
        	else if (strFruitList[3].equals(inputFruit)) {
        		System.out.println("Nutritional Value\r\n"
        				+ "Atemoyas are very high in Vitamin C, \r\n"
        				+ "with one average fruit containing around \r\n"
        				+ "half the daily recommended value of the Vitamin. \r\n"
        				+ "They are also a good source of dietary fiber,\r\n"
        				+ " and contain some protein, calcium, and iron.\r\n");
        	}
        	else if (strFruitList[4].equals(inputFruit)) {
        		System.out.println("A whole medium avocado contains about 240 calories,"
        				+ " 13 grams carbohydrate\r\n,"
        				+ " 3 grams protein,\r\n"
        				+ " 22 grams fat (15 grams monounsaturated\r\n, "
        				+ "                   4 grams polyunsaturated, \r\n"
        				+ "                   3 grams saturated), \r\n"
        				+ "10 grams fiber, and \r\n"
        				+ "11 milligrams sodium. \r\n"
        				+ "Along with their low sodium levels,\r\n"
        				+ " avocados contain no cholesterol.\r\n");
        	}
        	else if (strFruitList[5].equals(inputFruit)) {
        		System.out.println("One serving, or one medium \r\n"
        				+ "ripe banana, provides about \r\n"
        				+ "110 calories, \r\n"
        				+ "0 gram fat, \r\n"
        				+ "1 gram protein, \r\n"
        				+ "28 grams carbohydrate,\r\n"
        				+ " 15 grams sugar (naturally occurring),\r\n"
        				+ " 3 grams fiber, and \r\n"
        				+ "450 mg potassium.\r\n");
        	}
        	else if (strFruitList[6].equals(inputFruit)) {
        		System.out.println("Black currants are high in antioxidants, \r\n"
        				+ "including vitamin C. \r\n"
        				+ "Along with the anthocyanins in black currants, \r\n"
        				+ "these antioxidants can help to give your immune system a boost,\r\n"
        				+ " allowing your body to fight infection and\r\n"
        				+ " viruses more effectively. \r\n"
        				+ "Black currants are rich in an omega-6 fatty acid called\r\n"
        				+ " gamma-linoleic acid.");
        	}
        	else if (strFruitList[7].equals(inputFruit)) {
        		System.out.println("Blueberries are a healthy,\r\n"
        				+ "stress-free food. \r\n"
        				+ "You get fiber, \r\n"
        				+ "vitamin C, \r\n"
        				+ "vitamin K, \r\n"
        				+ "manganese and \r\n"
        				+ "potassium \r\n"
        				+ "in every handful of blueberries \r\n"
        				+ "at just 80 calories per cup. \r\n"
        				+ "They're also low in sodium and \r\n"
        				+ "have virtually no fat.\r\n");
        	}
        	else if (strFruitList[8].equals(inputFruit)) {
        		System.out.println("Canteloupe contains a range of antioxidants, including:\r\n"
        				+ "\r\n"
        				+ "selenium\r\n"
        				+ "beta carotene\r\n"
        				+ "vitamin C\r\n"
        				+ "lutein\r\n"
        				+ "zeaxanthin\r\n"
        				+ "choline");
        	}
        	else if (strFruitList[9].equals(inputFruit)) {
        		System.out.println("Gooseberries are low in calories and fat, yet packed with nutrients.\r\n"
        				+ "\r\n"
        				+ "Just 1 cup (150 grams) of gooseberries contains:\r\n"
        				+ "\r\n"
        				+ "Calories: 66\r\n"
        				+ "Protein: 1 gram\r\n"
        				+ "Fat: less than 1 gram\r\n"
        				+ "Carbs: 15 grams\r\n"
        				+ "Fiber: 7 grams\r\n"
        				+ "Vitamin C: 46% of the Daily Value (DV)\r\n"
        				+ "Vitamin B5: 9% of the DV\r\n"
        				+ "Vitamin B6: 7% of the DV\r\n"
        				+ "Copper: 12% of the DV\r\n"
        				+ "Manganese: 9% of the DV\r\n"
        				+ "Potassium: 6% of the DV\r\n"
        				+ "");
        	}
        	else if (strFruitList[10].equals(inputFruit)) {
        		System.out.println("Antioxidants, dietary fiber and vitamin C present "
        				+ "in cempedak help in maintaining heart health."
        				+ "High potassium content helps in lowering blood pressure.");
        	}
        	else if (strFruitList[11].equals(inputFruit)) {
        		System.out.println("Cherries are low in calories and chock full of "
        				+ "fiber, "
        				+ "vitamins, "
        				+ "minerals, "
        				+ "nutrients, and"
        				+ "other good-for-you ingredients. "
        				+ "You'll get vitamins "
        				+ "                      C, "
        				+ "                     A, and"
        				+ "                     K. "
        				+ "Each long-stemmed fruit delivers "
        				+ "potassium, "
        				+ "magnesium, and "
        				+ "calcium too. "
        				+ "They also bring antioxidants, like "
        				+ "beta-carotene, and "
        				+ "the essential nutrient choline.");
        	}
        	else if (strFruitList[12].equals(inputFruit)) {
        		System.out.println("Calories 160\r\n"
        				+ "Fat	15g\r\n"
        				+ "Sodium	9mg\r\n"
        				+ "Carbohydrates	6.8g\r\n"
        				+ "Fiber	4g\r\n"
        				+ "Sugars	2.8g\r\n"
        				+ "Protein	1.5g\r\n"
        				+ "Potassium	160mg\r\n"
        				+ "Manganese	0.68mg\r\n"
        				+ "Selenium	4.5mcg");
        	}
        	else if (strFruitList[13].equals(inputFruit)) {
        		System.out.println("Cranberries are primarily made up of "
        				+ "carbs and "
        				+ "fiber. "
        				+ "They also boast several vitamins and minerals,"
        				+ " including"
        				+ " manganese, "
        				+ "copper, and "
        				+ "vitamin C,"
        				+ "vitamin E, and "
        				+ "vitamin K1. "
        				+ "Keep in mind that cranberry juice has almost no fiber.");
        	}
        	else if (strFruitList[14].equals(inputFruit)) {
        		System.out.println("A fresh, 100-gram custard apple contains:"
        				+ "Calories – 94\r\n"
        				+ "Proteins – 2.1 gms\r\n"
        				+ "Dietary Fiber – 4.4 gms    \r\n"
        				+ "Total Fat – 0.0 gms\r\n"
        				+ "Carbohydrates – 23.6 gms   ");
        	}
        	else if (strFruitList[15].equals(inputFruit)) {
        		System.out.println("Dates nutrition\r\n"
        				+ "A 3.5-ounce (100-gram) serving of dates provides: "
        				+ "Calories: 282. "
        				+ "Protein: 2.5 grams. "
        				+ "Carbs: 75 grams.");
        	}
        	else if (strFruitList[16].equals(inputFruit)) {
        		System.out.println("Dragon fruit is high in "
        				+ "vitamin C and "
        				+ "other antioxidants, which are good for your immune system."
        				+ "It can boost your iron levels. "
        				+ "Iron is important for moving oxygen through your body and "
        				+ "giving you energy, and"
        				+ "dragon fruit has iron. "
        				+ "And the vitamin C in dragon fruit helps your body take in and use the iron.");
        	}
        	else if (strFruitList[17].equals(inputFruit)) {
        		System.out.println("Pouteria campechiana (commonly known as the cupcake fruit, eggfruit, zapote amarillo or canistel)"
        				+ "is an evergreen tree native to, and"
        				+ "cultivated in, southern Mexico, Belize, Guatemala, and El Salvador.\r\n"
        				+ "Pouteria campechiana.\r\n"
        				+ "Nutritional value per 100 g\r\n"
        				+ "Energy	138.8 kcal (581 kJ)\r\n"
        				+ "Carbohydrates	36.69 g\r\n"
        				+ "Dietary fiber	.10 g\r\n"
        				+ "Fat	.13 g");
        	}
        	else if (strFruitList[18].equals(inputFruit)) {
        		System.out.println("Energy 64 calories. "
        				+ "Protein: 1.5 g. "
        				+ "Carbohydrate: 14.7 g, of which 5.4 g is sugar. "
        				+ "Fiber: 8.0 g.");
        	
        	}
        	else if (strFruitList[19].equals(inputFruit)) {
        		System.out.println("Loaded With Nutrients\r\n"
        				+ "In fact, one persimmon (168 grams) contains: "
        				+ "Calories: 118."
        				+ "Carbs: 31 grams. "
        				+ "Protein: 1 gram.");
        	}
        	else if (strFruitList[20].equals(inputFruit)) {
        		System.out.println("Gooseberries are low in calories and fat "
        				+ "but rich in "
        				+ "dietary fiber, "
        				+ "copper, "
        				+ "manganese,"
        				+ "potassium, and"
        				+ "vitamins C, B5, and B6");
        	}
        	else if (strFruitList[21].equals(inputFruit)) {
        		System.out.println("Amount Per 100 grams\r\n"
        				+ "Calories 42\r\n"
        				+ "Total Fat 0.1 g\r\n"
        				+ "Saturated fat 0 g	\r\n"
        				+ "Cholesterol 0 mg	\r\n"
        				+ "Sodium 0 mg	\r\n"
        				+ "Potassium 135 mg 	3%\r\n"
        				+ "Total Carbohydrate 11 g	  3%\r\n"
        				+ "Dietary fiber 1.6 g	6%\r\n"
        				+ "Sugar 7 g	\r\n"
        				+ "Protein 0.8 g	1%\r\n"
        				+ "Vitamin C	52%	"
        				+ "Calcium	2%\r\n"
        				+ "Iron	0%	"
        				+ "Vitamin D	0%\r\n"
        				+ "Vitamin B6	5%	"
        				+ "Cobalamin	0%\r\n"
        				+ "Magnesium	2%		");
        	}
        	else if (strFruitList[22].equals(inputFruit)) {
        		System.out.println("Guava fruits are amazingly rich in antioxidants, "
        				+ "vitamin C, "
        				+ "potassium, and"
        				+ "fiber. "
        				+ "This remarkable nutrient content gives them many health benefits.");
        	}
        	else if (strFruitList[23].equals(inputFruit)) {
        		System.out.println("Hazelnuts also contain decent amounts of "
        				+ "vitamin B6, "
        				+ "folate, "
        				+ "phosphorus, "
        				+ "potassium and "
        				+ "zinc. "
        				+ "Additionally, they are a rich source of "
        				+ "mono- and polyunsaturated fats and "
        				+ "contain a good amount of"
        				+ "omega-6 and "
        				+ "omega-9 fatty acids, such as oleic acid (1, 2 )");
        	}
        	else if (strFruitList[24].equals(inputFruit)) {
        		System.out.println("Hog-plum contains various"
        				+ "nutrients, "
        				+ "vitamins and "
        				+ "minerals such as "
        				+ "protein, "
        				+ "carbohydrate, "
        				+ "calcium, "
        				+ "iron, "
        				+ "carotene, "
        				+ "vitamin B1, B2, C etc."
        				+ "It is rich source of vitamin C (22.63 mg/100 g) or "
        				+ "ascorbic acid ");
        	}
        	else if (strFruitList[25].equals(inputFruit)) {
        		System.out.println("Calories: 64; "
        				+ "Carbs: 16 grams; "
        				+ "Fiber: 1.4 grams; "
        				+ "Protein: 1 gram; "
        				+ "Fat: 0 grams; "
        				+ "Vitamin C: 53% ");
        	}
        	else if (strFruitList[26].equals(inputFruit)) {
        		System.out.println("One cup of sliced jackfruit offers "
        				+ "157 calories, "
        				+ "1 gram (g) fat, "
        				+ "38 g carbohydrates,"
        				+ "2.8 g protein, and "
        				+ "2.5 g fiber, "
        				+ "Most fruits don't offer much protein. "
        				+ "Three grams per serving is relatively high compared with other fruits,"
        				+ "but it's not as good as meat.");
        	}
        	else if (strFruitList[27].equals(inputFruit)) {
        		System.out.println("Amount Per \r\n"
        				+ "100 grams\r\n"
        				+ "Calories 79\r\n"
        				+ "% Daily Value*\r\n"
        				+ "Total Fat 0.2 g	0%\r\n"
        				+ "Cholesterol 0 mg	0%\r\n"
        				+ "Sodium 3 mg	0%\r\n"
        				+ "Potassium 250 mg	  7%\r\n"
        				+ "Total Carbohydrate 20 g	  6%\r\n"
        				+ "Protein 1.2 g	2%\r\n"
        				+ "Vitamin C	115%	"
        				+ "Calcium	2%\r\n"
        				+ "Iron	2%	"
        				+ "Vitamin B6	  5%\r\n"
        				+ "Cobalamin	0%"
        				+ "Magnesium	2%");
        	}
        	else if (strFruitList[28].equals(inputFruit)) {
        		System.out.println("Kiwis are high in Vitamin C and "
        				+ "dietary fiber and "
        				+ "provide a variety of health benefits. "
        				+ "This tart fruit can support "
        				+ "heart health, "
        				+ "digestive health, and"
        				+ "immunity. "
        				+ "The kiwi is a healthy choice of fruit and "
        				+ "is rich with vitamins and antioxidants.");
        	}
        	else if (strFruitList[29].equals(inputFruit)) {
        		System.out.println("Limes are loaded with nutrients — "
        				+ "particularly vitamin C.\r\n"
        				+ "\r\n"
        				+ "One whole, medium lime (67 grams) provides: \r\n"
        				+ "\r\n"
        				+ "Calories: 20\r\n"
        				+ "Carbs: 7 grams\r\n"
        				+ "Protein: 0.5 grams\r\n"
        				+ "Fiber: 1.9 grams\r\n"
        				+ "Vitamin C: 22% of the Daily Value (DV)\r\n"
        				+ "Iron: 2% of the DV\r\n"
        				+ "Calcium: 2%% of the DV\r\n"
        				+ "Vitamin B6: 2% of the DV\r\n"
        				+ "Thiamin: 2% of the DV\r\n"
        				+ "Potassium: 1% of the RDI");
        	}
        	else if (strFruitList[30].equals(inputFruit)) {
        		System.out.println("Each serving of mango is "
        				+ "fat free, "
        				+ "sodium free and "
        				+ "cholesterol free. "
        				+ "Mangos contain over 20 different vitamins and minerals, "
        				+ "helping to make them a superfood. "
        				+ "3/4 cup of mango provides "
        				+ "50% of your daily vitamin C, "
        				+ "8% of your daily Vitamin A and "
        				+ "8% of your daily vitamin B6.");
        	}
        	else if (strFruitList[31].equals(inputFruit)) {
        		System.out.println("In addition to vitamin C and folate,"
        				+ "oranges provide smaller amounts of other nutrients including "
        				+ "calcium, "
        				+ "potassium, and "
        				+ "thiamine (vitamin B1). "
        				+ "Oranges are a good source of fiber and"
        				+ " a rich source of vitamin C and folate.");
        	}
        	else if (strFruitList[32].equals(inputFruit)) {
        		System.out.println("Papayas are an excellent source of "
        				+ "Vitamin C, "
        				+ "Vitamin A, "
        				+ "Vitamin B, "
        				+ "Vitamin E, and "
        				+ "Vitamin K. "
        				+ "100 grams of ripe papaya consists of "
        				+ "32 calories, "
        				+ "0.6g of protein, "
        				+ "0.1g of fat, "
        				+ "7.2g of carbs and "
        				+ "2.6g of fiber.");
        	}
        	else if (strFruitList[33].equals(inputFruit)) {
        		System.out.println("Nutritional breakdown of peaches\r\n"
        				+ "One raw medium peach (147 grams) has "
        				+ "50 calories, "
        				+ "0.5 grams of fat, "
        				+ "0 grams of cholesterol and sodium, "
        				+ "15 grams of carbohydrate, "
        				+ "13 grams of sugar, "
        				+ "2 grams of fiber and "
        				+ "1 gram of protein. "
        				+ "It provides "
        				+ "6% of your daily vitamin A needs and "
        				+ "15% of daily vitamin C needs.");
        	}
        	else if (strFruitList[34].equals(inputFruit)) {
        		System.out.println("For only 100 calories in a medium sized pear (about 166 grams), "
        				+ "each pear packs in "
        				+ "21% daily value for fiber, "
        				+ "8% Vitamin C, "
        				+ "4% potassium, and "
        				+ "a whole host of health benefits. "
        				+ "Fiber Powerhouse! "
        				+ "Pears rank higher than almost any fruit when it comes to "
        				+ "dietary fiber, with 6 grams or 21% daily value in just one pear.");
        	}
        	else if (strFruitList[35].equals(inputFruit)) {
        		System.out.println("Pineapples are low in calories "
        				+ "but boast an impressive nutrient profile. "
        				+ "Just 1 cup (165 grams) of pineapple chunks contains "
        				+ "the following nutrients:\r\n"
        				+ "Calories: 83\r\n"
        				+ "Fat: 1.7 grams\r\n"
        				+ "Protein: 1 gram\r\n"
        				+ "Carbs: 21.6 grams\r\n"
        				+ "Fiber: 2.3 grams\r\n"
        				+ "Vitamin C: 88% of the Daily Value (DV)\r\n"
        				+ "Manganese: 109% of the DV\r\n"
        				+ "Vitamin B6: 11% of the DV\r\n"
        				+ "Copper: 20% of the DV\r\n"
        				+ "Thiamine: 11% of the DV\r\n"
        				+ "Folate: 7% of the DV\r\n"
        				+ "Potassium: 4% of the DV\r\n"
        				+ "Magnesium: 5% of the DV\r\n"
        				+ "Niacin: 5% of the DV\r\n"
        				+ "Pantothenic acid: 7% of the DV\r\n"
        				+ "Riboflavin: 4% of the DV\r\n"
        				+ "Iron: 3% of the DV");
        	}
        	else if (strFruitList[36].equals(inputFruit)) {
        		System.out.println("A 100 gram serving of pomegranate serves around "
        				+ "18.70 grams of carbohydrates, "
        				+ "1.67 grams of proteins, and "
        				+ "1.2 grams of fat. "
        				+ "A 100-gram serving of pomegranate has "
        				+ "a slightly higher amount of sugar (14 grams), "
        				+ "which is although balanced with about 4 grams of dietary fibres.");
        	}
        	else if (strFruitList[37].equals(inputFruit)) {
        		System.out.println("Calories: 64\r\n"
        				+ "Fat: 0.8g\r\n"
        				+ "Sodium: 0mg\r\n"
        				+ "Carbohydrates: 14.7g\r\n"
        				+ "Fiber: 8g\r\n"
        				+ "Sugars: 5.4g\r\n"
        				+ "Protein: 1.5g\r\n"
        				+ "Vitamin C: 32.2mg\r\n"
        				+ "Magnesium: 27.1mg");
        	}
        	else if (strFruitList[38].equals(inputFruit)) {
        		System.out.println("Calories: 141\r\n"
        				+ "Carbs: 34 grams\r\n"
        				+ "Protein: 0.7 grams\r\n"
        				+ "Fat: 1.8 grams\r\n"
        				+ "Fiber: 9 grams\r\n"
        				+ "Vitamin C: 28% of the Daily Value (DV)\r\n"
        				+ "Folate: 6% of the DV\r\n"
        				+ "Pantothenic acid (B5): 9% of the DV\r\n"
        				+ "Iron: 8% of the DV\r\n"
        				+ "Potassium: 7% of the DV\r\n"
        				+ "Copper: 16% of the DV\r\n"
        				+ "Magnesium: 5% of the DV");
        	}
        	else if (strFruitList[39].equals(inputFruit)) {
        		System.out.println("Strawberries are a good source of "
        				+ "vitamin C, "
        				+ "manganese, "
        				+ "folate (vitamin B9), and "
        				+ "potassium. "
        				+ "They contain small amounts of several other vitamins and minerals.");
        	}
        	else if (strFruitList[40].equals(inputFruit)) {
        		System.out.println("The nutrients in 2/3 cup (100 grams) of raw watermelon are:\r\n"
        				+ "\r\n"
        				+ "Calories: 30\r\n"
        				+ "Water: 91%\r\n"
        				+ "Protein: 0.6 grams\r\n"
        				+ "Carbs: 7.6 grams\r\n"
        				+ "Sugar: 6.2 grams\r\n"
        				+ "Fiber: 0.4 grams\r\n"
        				+ "Fat: 0.2 grams");
        	}
        	else {
        		System.out.println("Please enter a fruit from the above list.");
        	}
        }
        else if (strFoodCategory[2].equals(category)){
        	System.out.println("You have selected the cereals category."
        			+ "\nNow select any one cereal form the list below.");
        	 // listing out the Cereals
        	for (int l=0; l<strCerealsList.length; l++){
            	System.out.println(strCerealsList[l]);
            	}
        	System.out.println("Now select any one cereal form the above list.");
        	String inputCereal = scan.next();
        	if (strCerealsList[0].equals(inputCereal)){   
        		System.out.println("This nutrition information for 1/4 cup (30 grams) "
        				+ "of amaranth flour comes with:\r\n"
        				+ "\r\n"
        				+ "Calories: 110\r\n"
        				+ "Fat: 2g\r\n"
        				+ "Sodium: 6mg\r\n"
        				+ "Carbohydrates: 20g\r\n"
        				+ "Fiber: 3g\r\n"
        				+ "Protein: 4g\r\n"
        				+ "Calcium: 40mg\r\n"
        				+ "Iron: 2.16mg\r\n"
        				+ "Vitamin C: 1.2mg\r\n"
        				+ "");
        		}
        	else if (strCerealsList[1].equals(inputCereal)) {  
        		System.out.println("One cup (246 grams) of cooked amaranth contains "
        				+ "5 grams of fiber and "
        				+ "9 grams of protein. "
        				+ "It also meets 29% of your daily iron needs and "
        				+ "contains a good amount of "
        				+ "magnesium, "
        				+ "phosphorus, and "
        				+ "manganese. "
        				+ "You can use amaranth as a substitute for other grains, "
        				+ "such as rice or couscous.");
        		
        	}
        	else if (strCerealsList[2].equals(inputCereal)) {  
        		System.out.println("Arrowroot flour, 1 cup\r\n"
        				+ "Protein 0.38 g\r\n"
        				+ "Total lipid (fat) 0.13 g\r\n"
        				+ "Carbohydrate, by difference 112.83 g\r\n"
        				+ "Energy (kcal)	456.96 g\r\n"
        				+ "Fiber, total dietary 4.35 g");
        		
        	}
        	else if (strCerealsList[3].equals(inputCereal)) {  
        		System.out.println("one-cup serving (about 157g) of cooked, pearled barley consists of:\r\n"
        				+ "Calories: 193\r\n"
        				+ "Fat: 0.7g\r\n"
        				+ "Sodium: 4.7mg\r\n"
        				+ "Carbs: 44.3g\r\n"
        				+ "Fiber: 6g\r\n"
        				+ "Sugars: 0.4g\r\n"
        				+ "Protein: 3.6g");
        		
        	}
        	else if (strCerealsList[4].equals(inputCereal)) {  
        		System.out.println("A serving of barnyard millets (25g, raw) gives "
        				+ "75 calories and "
        				+ "1.5g of protein, "
        				+ "68 % carbohydrate, and "
        				+ "less than 400 kcal/100 gms and "
        				+ "is ideal for those who follow a diet. "
        				+ "And no, Barnyard millet is not just a fasting millet; "
        				+ "it is wholesome enough to be included in everyone's daily meals across ages.");
        		
        	}
        	else if (strCerealsList[5].equals(inputCereal)) {  
        		System.out.println("One cup of cooked buckwheat contains about "
        				+ "155 calories, with "
        				+ "6 grams of protein, "
        				+ "1 gram of fat, "
        				+ "33 grams of carbohydrate, and "
        				+ "5 grams of fiber. "
        				+ "These groats are packed with "
        				+ "manganese, "
        				+ "magnesium, "
        				+ "phosphorus, "
        				+ "niacin, "
        				+ "zinc, "
        				+ "folate, and "
        				+ "vitamin B6.");
        		
        	}
        	else if (strCerealsList[6].equals(inputCereal)) {  
        		System.out.println("Cassava: Nutritional Values\r\n"
        				+ "\r\n"
        				+ "The following nutrients are present in 100 grams of cooked cassava:\r\n"
        				+ "\r\n"
        				+ "Calories: 191\r\n"
        				+ "Fibre: 2 grams\r\n"
        				+ "Carbohydrates: 40 grams\r\n"
        				+ "Fat: 3 grams\r\n"
        				+ "Protein: 1.5 grams\r\n"
        				+ "Monounsaturated Fat: 0.908 grams\r\n"
        				+ "Sodium: 205 milligrams\r\n"
        				+ "Sugars: 1.67 grams\r\n"
        				+ "Dietary Fibre: 1.8 grams");
        		
        	}
        	else if (strCerealsList[7].equals(inputCereal)) {  
        		System.out.println("One tablespoon (tbsp) of chia seeds contains about "
        				+ "69 calories, as well as, roughly:\r\n"
        				+ "\r\n"
        				+ "2 grams (g) protein\r\n"
        				+ "5 g fat (1 g saturated, "
        				+ "7 g polyunsaturated, "
        				+ "1 g monounsaturated, and "
        				+ "0 g trans)\r\n"
        				+ "6 g carbs\r\n"
        				+ "5 g fiber\r\n"
        				+ "Chia seeds also contain a number of vitamins and minerals. "
        				+ "One tbsp offers: (4)\r\n"
        				+ "\r\n"
        				+ "2 milligrams (mg) phosphorus (about 11 percent of an adult’s recommended daily value, or DV)\r\n"
        				+ "7 mg calcium (8 percent of DV)\r\n"
        				+ "8 mg potassium (1 percent of DV)\r\n"
        				+ "2 mg phosphorus (11 percent of DV)\r\n"
        				+ "5 IU vitamin A\r\n"
        				+ "2 mg vitamin C (1 percent of DV)\r\n"
        				+ "1 mg vitamin E (1 percent of DV)");
        		
        	}
        	else if (strCerealsList[8].equals(inputCereal)) {  
        		System.out.println("1-tablespoon serving (8 grams) of cornstarch.\r\n"
        				+ "\r\n"
        				+ "Calories: 30\r\n"
        				+ "Fat: 0g\r\n"
        				+ "Sodium: 0mg\r\n"
        				+ "Carbs: 7g\r\n"
        				+ "Fiber: 0g\r\n"
        				+ "Sugars: 0g\r\n"
        				+ "Protein: 0g");
        		
        	}
        	else if (strCerealsList[9].equals(inputCereal)) {  
        		System.out.println("Corn, dried (Navajo) contains "
        				+ "386 calories per 100 g serving. "
        				+ "This serving contains "
        				+ "5.2 g of fat, "
        				+ "9.9 g of protein and "
        				+ "75 g of carbohydrate. "
        				+ "The latter is 5.4 g sugar and 2.5 g of dietary fiber, "
        				+ "the rest is complex carbohydrate."
        				+ "Corn, dried (Navajo) contains 0.8 g of saturated fat and "
        				+ "8 mg of cholesterol per serving.");
        		
        	}
        	else if (strCerealsList[10].equals(inputCereal)) {  
        		System.out.println("Finger millet contains about "
        				+ "5–8% protein, "
        				+ "1–2% ether extractives, "
        				+ "65–75% carbohydrates, "
        				+ "15–20% dietary fiber and "
        				+ "2.5–3.5% minerals. "
        				+ "It has the highest calcium content among all cereals (344 mg/100 g).");
        		
        	}
        	else if (strCerealsList[11].equals(inputCereal)) {  
        		System.out.println("Foxtail millet per 100 gm is "
        				+ "fat (4.3gm), "
        				+ "minerals (3gm), "
        				+ "protein (12.3gm), "
        				+ "calcium (31mg), "
        				+ "carbohydrate (60.9gm), "
        				+ "phosphorous (290mg) and "
        				+ "dietary fibre (14gm).");
        		
        	}
        	else if (strCerealsList[12].equals(inputCereal)) {  
        		System.out.println("Kodo millet grain contains "
        				+ "8.3 per cent protein."
        				+ "It contains high amount of crude fiber (9%) as compared to wheat (1.2%). "
        				+ "It provides 353 Kcal energy per for 100 gm of grain. "
        				+ "Kodo millet contains "
        				+ "66.6% carbohydrate, "
        				+ "2.4% minerals, "
        				+ "1.4% fat and "
        				+ "2% ash.");
        		
        		
        	}
        	else if (strCerealsList[13].equals(inputCereal)) {  
        		System.out.println("The nutritional values Per 100g are "
        				+ "Carbs-60.9 gm, "
        				+ "Fat-5.2 gm, "
        				+ "Iron-9.3 gm, "
        				+ "Phosphorus-220 mg, "
        				+ "Iron-9.3 mg, "
        				+ "Calcium-17 mg, "
        				+ "Calories-329 kcal, and "
        				+ "magnesium-114 mg.");
        		
        	}
        	else if (strCerealsList[14].equals(inputCereal)) {  
        		System.out.println("Maize contains about:\r\n"
        				+ "\r\n"
        				+ "70-87% (carbohydrates) starch (amylose and amylopectin), \r\n"
        				+ "6-13% protein. \r\n"
        				+ "4% fat, \r\n"
        				+ "2-6% oil\r\n"
        				+ "1-3% sugar\r\n"
        				+ "The 100g of maize offer 365 Kcal energy");
        		
        	}
        	else if (strCerealsList[15].equals(inputCereal)) {  
        		System.out.println("Milo\r\n"
        				+ "Total Fat 4.2g. 6%\r\n"
        				+ "Saturated Fat 2.4g. 12%\r\n"
        				+ "Sodium 26mg. 1%\r\n"
        				+ "Total Carbohydrates 16g. 5%\r\n"
        				+ "Dietary Fiber 0.8g. 3%\r\n"
        				+ "Sugars 12g.\r\n"
        				+ "Protein 4.3g.");
        		
        	}
        	else if (strCerealsList[16].equals(inputCereal)) {  
        		System.out.println("One serving of noodles contains these nutrients (2):\r\n"
        				+ "\r\n"
        				+ "Calories: 188\r\n"
        				+ "Carbs: 27 grams\r\n"
        				+ "Total fat: 7 grams\r\n"
        				+ "Saturated fat: 3 grams\r\n"
        				+ "Protein: 4 grams\r\n"
        				+ "Fiber: 0.9 grams\r\n"
        				+ "Sodium: 861 mg\r\n"
        				+ "Thiamine: 43% of the RDI\r\n"
        				+ "Folate: 12% of the RDI\r\n"
        				+ "Manganese: 11% of the RDI\r\n"
        				+ "Iron: 10% of the RDI\r\n"
        				+ "Niacin: 9% of the RDI\r\n"
        				+ "Riboflavin: 7% of the RDI");
        		
        	}
        	else if (strCerealsList[17].equals(inputCereal)) {  
        		System.out.println("Calories: 95.\r\n"
        				+ "Protein: 5 grams.\r\n"
        				+ "Fat: 3 grams.\r\n"
        				+ "Carbohydrates: 27 grams.\r\n"
        				+ "Fiber: 4 grams.\r\n"
        				+ "Sugar: 1 gram.");
        		
        	}
        	else if (strCerealsList[18].equals(inputCereal)) {  
        		System.out.println("Calories	 221\r\n"
        				+ "Fat 	1.3g \r\n"
        				+ "Sodium 	1mg \r\n"
        				+ "Carbohydrates 	 43.2g\r\n"
        				+ "Fiber 	 2.5g\r\n"
        				+ "Sugars 	0.8g\r\n"
        				+ "Protein 	 8.1g\r\n"
        				+ "Iron 	 1.01mg\r\n"
        				+ "Folate 	 115mcg\r\n"
        				+ "Thiamin 	 0.42mcg");
        		
        	}
        	else if (strCerealsList[19].equals(inputCereal)) {  
        		System.out.println("Calories	402cal\r\n"
        				+ "Total fat	0.5gr\r\n"
        				+ "Saturated Fat	0.1gr\r\n"
        				+ "Cholesterol	0mg\r\n"
        				+ "Carbohydrates	90gr\r\n"
        				+ "Dietary fibers	1.7gr\r\n"
        				+ "Protein	6gr\r\n"
        				+ "Calcium	6mg\r\n"
        				+ "Magnesium	25mg\r\n"
        				+ "Iron	31.7mg\r\n"
        				+ "Vitamin B6	0.1mg\r\n"
        				+ "Thiamin	0.21mg\r\n"
        				+ "Riboflavin	0.01mg\r\n"
        				+ "Niacin	4.1mg\r\n"
        				+ "Natrium	3mg\r\n"
        				+ "Kalium	113mg");
        		
        	}
        	else if (strCerealsList[20].equals(inputCereal)) {  
        		System.out.println("Cooked quinoa comprises "
        				+ "71% carbohydrates, "
        				+ "14.6% protein, and "
        				+ "14.2% fat. "
        				+ "One cup (185 grams) of cooked quinoa contains "
        				+ "222 calories.");
        		
        	}
        	else if (strCerealsList[21].equals(inputCereal)) {  
        		System.out.println("1 cup (186g) of cooked, enriched, short-grain white rice.\r\n"
        				+ "Calories: 242\r\n"
        				+ "Fat: 0.4g\r\n"
        				+ "Sodium: 0mg\r\n"
        				+ "Carbohydrates: 53.4g\r\n"
        				+ "Fiber: 0.6g\r\n"
        				+ "Sugars: 0g\r\n"
        				+ "Protein: 4.4g\r\n"
        				+ "Manganese:0.7mg\r\n"
        				+ "Iron: 2.7mg\r\n"
        				+ "Thiamin: 0.3mg");
        		
        	}
        	else if (strCerealsList[22].equals(inputCereal)) {  
        		System.out.println("Cereal, rice flakes contains "
        				+ "103 calories per 27 g serving. "
        				+ "This serving contains 0.3 g of fat, "
        				+ "1.8 g of protein and "
        				+ "23 g of carbohydrate. "
        				+ "The latter is 3.3 g sugar and 0.2 g of dietary fiber, "
        				+ "the rest is complex carbohydrate. "
        				+ "Cereal, rice flakes contains 0.1 g of saturated fat and "
        				+ "0 mg of cholesterol per serving.");
        		
        	}
        	else if (strCerealsList[23].equals(inputCereal)) {  
        		System.out.println("Nutrients per Serving\r\n"
        				+ "A one-fourth cup serving of rye flakes contains: "
        				+ "Calories: 98. "
        				+ "Protein: 4 grams. "
        				+ "Fat: 1 gram.");
        		
        	}
        	else if (strCerealsList[24].equals(inputCereal)) {  
        		System.out.println("Below is the nutritional information per 3.5 pounds (100 grams) of sago (7):\r\n"
        				+ "\r\n"
        				+ "Calories: 332\r\n"
        				+ "Protein: less than 1 gram\r\n"
        				+ "Fat: less than 1 gram\r\n"
        				+ "Carbs: 83 grams\r\n"
        				+ "Fiber: less than 1 gram\r\n"
        				+ "Zinc: 11% of the Reference Daily Intake (RDI)");
        		
        	}
        	else if (strCerealsList[25].equals(inputCereal)) {  
        		System.out.println("Saturated Fat 0.3ggrams\r\n"
        				+ "Trans Fat 0g r\n"
        				+ "Cholesterol 0mg \r\n"
        				+ "Sodium 1.4mgmilligrams\r\n"
        				+ "Potassium 62mgmilligrams\r\n"
        				+ "Total Carbohydrates 43g\r\n"
        				+ "Dietary Fiber 2.5g\r\n"
        				+ "Sugars 0.8g\r\n"
        				+ "Protein 8.1g\r\n"
        				+ "Vitamin A  0%\r\n"
        				+ "Vitamin C  0%\r\n"
        				+ "1% Calcium");
        		
        	}
        	else if (strCerealsList[26].equals(inputCereal)) {  
        		System.out.println("Nutrients per Serving\r\n"
        				+ "A half-cup serving of sliced water chestnuts contains: "
        				+ "Calories: 45. "
        				+ "Protein: 1 gram. "
        				+ "Fat: 0 grams.");
        		
        	}
        	else if (strCerealsList[27].equals(inputCereal)) {  
        		System.out.println("Wheat and Nutrition\r\n"
        				+ "15 grams of protein. "
        				+ "10.6 grams of dietary fiber. "
        				+ "71.2 grams of carbohydrates. "
        				+ "38 milligrams of calcium.");
        		
        	}
        	else {
        		System.out.println("Please enter a cereal from the above list.");
        	}
        }
        else {
        	System.out.println("Please enter a valid category");
        }
	}

}
