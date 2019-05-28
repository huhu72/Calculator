import java.util.Scanner;

public class Better {
	
	public static void main (String[]args){
	
	
		 Scanner input = new Scanner(System.in);
		 final double P_CAL = 4; // CALORIES PER GRAM OF PROTEIN
		 
		 final double F_CAL = 9; // CALORIES PER GRAM OF FAT
		 
		 final double C_CAL = P_CAL; // CALORIES PER GRAMS OF CARBS
		 
		 final double F_P   = .25; // FAT PERCENTAGE USED TO CALCULATE AMOUNT OF FAT
		 
		 final double C_C   = 15; // THE CALORIE CONSTANT FOR CALULATING CALORIES NEEDED FROM WEIGHT 
		 
		 final double MAIN_P_C = .8; // THE PROTEIN CONSTANT FOR MAINTENANCE CALORIES
		 
		 final double CUT_P_C = 1.2; // THE PROTEIN CONSTANT FOR CUT CALORIES 
		 
		 final double BULK_P_C = MAIN_P_C; // THE PROTEIN CONSTANT FOR BULK CALORIES 
		
	
		 
	 //Asking for weight
		 System.out.println("Enter Weight");
		 
		
	 //Lets the user to input their weight
		 
		String weightS = input.nextLine(); 
		
	//This will check to see if the user inputs a string or a int. 
		
	//If the user inputs ints, the program will continue
		
	if (Character.isDigit(weightS.charAt(0)) && Character.isDigit(weightS.charAt(1)) && Character.isDigit(weightS.charAt(2))){
			
	//Converts the user input into a string
		
		int weight = Integer.parseInt(weightS);
		
	//calculating the maintenance calories from weight
		
		double cal = (weight * C_C);
		 
	// calc protein
		 
		double p = (weight * MAIN_P_C);
		 
	// cal fat
		
		double fat = (((cal - (p * P_CAL)) * F_P) / F_P);
	
	// calc carb
	
		double carb = (cal - (fat * F_CAL) - (p * P_CAL)) / C_CAL;
	
	// display cal
	
		System.out.println("Calories ="+ (int)(cal)) ;  
		
	// display carb
		
		System.out.println("Carbs =" + (int)(carb));
		
	// display fat
		
	    System.out.println("Fat =" + (int)(fat));
		
	// asks if cutting or not
		
	    System.out.println ("Protein ="+ (int)(p));System.out.println("Are you cutting Yes or No");
	
	//Gets user input 
	    
		 String cut = input.next();
		
    //displays cutting calories 
		 
		 if  (cut.equals("Yes") || cut.equals("yes")){	  
			 
			 cal = cal - 250;
			 p = (weight * CUT_P_C);
			 double fat1 = (((cal - (p * P_CAL)) * F_P) / F_CAL);
			 double carb1 = ((cal - (fat1 * F_CAL) - (p * P_CAL)) / C_CAL);
			 System.out.println("Calories ="+ (int)(cal)) ;  
			 System.out.println("Carbs =" + (int)(carb1));
			 System.out.println("Fat =" + (int)(fat1));
			 System.out.println("Protein ="+ (int)(p));
			 System.out.println("DONE!");
			 System.exit(0);
		 
		 }
	// ends the program 

	// if user is not cutting, program will continue
    // asks the user if they are bulking if they answered no 	
		
		 	else { 
	
		 		if (cut.equals("No")|| (cut.equals("no"))){
		
		 		System.out.println("Are you bulking Yes or No");
		 }
			 }	 
	//Gets user input to see if they are bulking or not 
		 
		 String bulk = input.next();
		 
			
	//displays calories for bulking  
		 		
		 if  (bulk.equals("Yes") || bulk.equals("yes")){
			
			 cal = cal + 250;
			 p = (weight * BULK_P_C);
			 double fat1 = (((cal - (p * P_CAL)) * F_P) / F_CAL);
			 double carb1 = (cal - (fat1 * F_CAL) - (p * P_CAL)) / C_CAL;
			 System.out.println("Calories ="+ (int)(cal)) ;  
			 System.out.println("Carbs =" + (int)(carb1));
			 System.out.println("Fat =" + (int)(fat1));
			 System.out.println("Protein ="+ (int)(p));
			 System.exit(0);
		 }
		 
	// displays maintenance calories
		 			
		 else {
		 		if (bulk.equals("No")|| (cut.equals("no"))){
			 
			 System.out.println("Since you're not Cutting or Bulking, here are your maintenace calories");
			 
			 
			 p = (weight * MAIN_P_C);
			 double fat1 = (((cal - (p * P_CAL)) * F_P) / F_CAL);
			 double carb1 = (cal - (fat1 * F_CAL) - (p * P_CAL)) / C_CAL;
			 System.out.println("Calories = "+ (int)(cal)) ;  
			 System.out.println("Carbs = " + (int)(carb1));
			 System.out.println("Fat = " + (int)(fat1));
			 System.out.println("Protein = "+ (int)(p));
			 
		 					}
		 			}
		}
		
		else {
			System.out.println("ERROR: Please enter a 3 digit number");
		}
		
	input.close();
	
	 
		 
	}
}

 	 
		 
		 
		 
	
	




