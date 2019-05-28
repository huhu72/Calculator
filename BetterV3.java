import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;

public class BetterV3 {
	
	public static int intDetection () throws InputMismatchException{
		
		Scanner input = new Scanner(System.in);
		
		Boolean Int = false;
		
		int weight = 0;
		
		while (!Int){
			
			try{
				
				 weight = input.nextInt();
				 Int = true;
				 
			}
			
			catch( InputMismatchException e){
				System.out.println("Error Please Enter a number");
				input.nextLine();
				
			}
			
		}
		
		return weight;
		
	}
	
public static String stringDetection(){
	
	Scanner input = new Scanner(System.in);
	
	String answer = input.nextLine();

	
	return answer;
	
}
	public static void maitenanceCalories(int weight, double calorieM, double protein_cal, double fat_cal, double carb_cal){
		
		final double PROTEIN_CONSTANT = .8; // THE PROTEIN CONSTANT FOR MAINTENANCE CALORIES
		
		final double FAT_PERCENTAGE   = .20; // FAT PERCENTAGE USED TO CALCULATE AMOUNT OF FAT
		 
		double calories = weight * calorieM;
		
		double protein = weight * PROTEIN_CONSTANT;
		
		double fat = (( calories - ( protein * protein_cal)) * FAT_PERCENTAGE ) / fat_cal ;

		double carb = ( calories - ( fat * fat_cal ) - ( protein * protein_cal )) / carb_cal ;
		
		System.out.println("Calories : " + (int) calories);
		System.out.println("Carbs : " + (int) carb + "g");
		System.out.println("Protein : " + (int) protein + "g");
		System.out.println("Fat : " + (int) fat + "g");
	
	}

	private static void cutCalories(int weight, double calorieM, double protein_cal, double fat_cal, double carb_cal) {
		
		final double  PROTEIN_CONSTANT = 1.2;
		
		final double FAT_PERCENTAGE = .20;
		
		double calories = weight * calorieM - 250;
		
		double protein = weight * PROTEIN_CONSTANT;
		
		double fat = (( calories - ( protein * protein_cal)) * FAT_PERCENTAGE ) / fat_cal ;

		double carb = ( calories - ( fat * fat_cal ) - ( protein * protein_cal )) / carb_cal ;
		
		System.out.println("Calories : " + (int) calories);
		System.out.println("Carbs : " + (int) carb + "g");
		System.out.println("Protein : " + (int) protein + "g");
		System.out.println("Fat : " + (int) fat + "g");
		
		
	}
	
private static void bulkCalories(int weight, double calorieM, double protein_cal, double fat_cal, double carb_cal) {
		
		final double  PROTEIN_CONSTANT = .8;
		
		final double FAT_PERCENTAGE = .25;
		
		double calories = weight * calorieM + 250;
		
		double protein = weight * PROTEIN_CONSTANT;
		
		double fat = (( calories - ( protein * protein_cal)) * FAT_PERCENTAGE ) / fat_cal ;

		double carb = ( calories - ( fat * fat_cal ) - ( protein * protein_cal )) / carb_cal ;
		
		System.out.println("Calories : " + (int) calories);
		System.out.println("Carbs : " + (int) carb + "g");
		System.out.println("Protein : " + (int) protein + "g");
		System.out.println("Fat : " + (int) fat + "g");
		
		
	}
	
	public static void main(String[] args) throws InputMismatchException {
		
		 final double PROTEIN_CALORIES = 4; // CALORIES PER GRAM OF PROTEIN
		 
		 final double FAT_CALORIES = 9; // CALORIES PER GRAM OF FAT
		 
		 final double CARB_CALORIES = PROTEIN_CALORIES; // CALORIES PER GRAMS OF CARBS
		 
		 final double CALORIE_MULTIPLIER   = 15; // THE CALORIE CONSTANT FOR CALULATING CALORIES NEEDED FROM WEIGHT. "calorieM"
		
		System.out.println("Enter your weight: ");
		
		int weight = intDetection();
		
		System.out.println("Are you Cutting, Bulking, or Maintaining");
		
		String response =stringDetection();
		
		while(!(response.equalsIgnoreCase("cutting") || response.equalsIgnoreCase("bulking") || response.equalsIgnoreCase("maintaining"))){
			
			System.out.println("Error Please try again");
			
			System.out.println("Are you Cutting, Bulking, or Maintaining");
			
			response =stringDetection();
		}
		
		if( response.equalsIgnoreCase("cutting") ){
			
			cutCalories(weight, CALORIE_MULTIPLIER, PROTEIN_CALORIES, FAT_CALORIES, CARB_CALORIES);
			
		}
		
		if (response.equalsIgnoreCase("bulking")){
			
			bulkCalories(weight, CALORIE_MULTIPLIER, PROTEIN_CALORIES, FAT_CALORIES, CARB_CALORIES);
			
		}
		
		if (response.equalsIgnoreCase("maintaining")){
			
		System.out.println("Your Maintenance Calrories are : " );
		maitenanceCalories( weight, CALORIE_MULTIPLIER, PROTEIN_CALORIES, FAT_CALORIES, CARB_CALORIES );
		
		}
		/*//Creates a GUI frame
		 
		// Construct the JFrame object
	      JFrame appFrame = new JFrame();

	      // Set the frame's width (400) and height (250) in pixels
	      appFrame.setSize(400, 250);
	      
	      // Set the frame's title
	      appFrame.setTitle("Calorie Calculator");
	      
	      // Set the program to exit when the user
	      // closes the frame
	      appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      // Make the frame visible to the user
	      appFrame.setVisible(true);
		 
	*/
	}

	
}
