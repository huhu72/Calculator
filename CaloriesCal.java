package CaloriesCalc;

import java.util.Scanner;
public class CaloriesCal {

	public static void main(String args[] ){
		 Scanner input = new Scanner(System.in);
		
		 System.out.println("Enter Weight");
		 double weight = input.nextDouble();
		 double cal = ((weight) * (15));
		 double p = (weight * 1.2);
		 double fat = (((cal - (p * 4)) * .25) / 9);
		 double carb = ((cal) - (fat * 9) - (p * 4)) / 4;
		 System.out.println("Calories ="+ (int)(cal)) ;  
		 System.out.println("Carbs =" + (int)(carb));
		 System.out.println("Fat =" + (int)(fat));
		 System.out.println("Protein ="+ (int)(p));System.out.println("Are you cutting 1=yes 0=no");
		 
		 double cutting =input.nextDouble();
		 double cut = cutting ;
		   
		 if  (cut ==1){	  
			 
			 double cal1 = ((weight) * (15)) - 250;
			 double p1 = (weight * 1.2);
			 double fat1 = (((cal1 - (p1 * 4)) * .25) / 9);
			 double carb1 = ((cal1) - (fat1 * 9) - (p * 4)) / 4;
			 System.out.println("Calories ="+ (int)(cal1)) ;  
			 System.out.println("Carbs =" + (int)(carb1));
			 System.out.println("Fat =" + (int)(fat1));
			 System.out.println("Protein ="+ (int)(p1));
		 
			 
		 }
		 if (cut ==1){
			 System.out.println("Done");
		 }else if (cut ==0){
		 System.out.println("Are you bulking 1=yes 0=no");
		 
		 double bulking =input.nextDouble();
		 double bulk = bulking ;
		
		   
		 if  (bulk ==1){	  
			
			 double cal1 = ((weight) * (15)) + 250;
			 double p1 = (weight * 1.2);
			 double fat1 = (((cal1 - (p1 * 4)) * .25) / 9);
			 double carb1 = ((cal1) - (fat1 * 9) - (p * 4)) / 4;
			 System.out.println("Calories ="+ (int)(cal1)) ;  
			 System.out.println("Carbs =" + (int)(carb1));
			 System.out.println("Fat =" + (int)(fat1));
			 System.out.println("Protein ="+ (int)(p1));
		 }else if (bulk ==0) {
			 double cal1 = ((weight) * (15));
			 double p1 = (weight * 1.2);
			 double fat1 = (((cal1 - (p1 * 4)) * .25) / 9);
			 double carb1 = ((cal1) - (fat1 * 9) - (p * 4)) / 4;
			 System.out.println("Calories ="+ (int)(cal1)) ;  
			 System.out.println("Carbs =" + (int)(carb1));
			 System.out.println("Fat =" + (int)(fat1));
			 System.out.println("Protein ="+ (int)(p1));
			 
		 }
		 
		 }
		 
		
		 
		 
	}
}



