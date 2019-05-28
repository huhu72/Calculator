import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BetterV4  extends JFrame implements ActionListener{

/*
 * Label Variables
 */
	private JLabel weightLabel;
	private JLabel caloriesLabel;
	private JLabel proteinLabel;
	private JLabel proteinCaloriesLabel;
	private JLabel carbLabel;
	private JLabel carbCaloriesLabel;
	private JLabel fatLabel;
	private JLabel fatCaloriesLabel;
	private JLabel informationLabel;

/*
 * ComoboBox to let the user select the different options
 */
	
	private JComboBox<String> selectionList;
	
/*
 * Buttons 	
 */
	
	private JButton calculateButton;
	private JButton subButton;
	private JButton addButton;

/*
 * TextFields to display the information
 */
	
	private JTextField weightTextBox;
	private JTextField caloriesTextBox;
	private JTextField proteinTextBox;
	private JTextField proteinCaloriesTextBox;
	private JTextField fatTextBox;
	private JTextField fatCaloriesTextBox;
	private JTextField carbTextBox;
	private JTextField carbCaloriesTextBox;

/*
 * Used for the combobox
 */
	
	private String[] caloriesList = {"Maintain", "Cut", "Bulk"};

	//private String selectionValue = (String)(selectionList.getSelectedItem());
/*
 * Default constructor
 * Creates the GUI layout
 */
	BetterV4(){
		
		GridBagConstraints positionConst = null;
		
		setTitle("Calories Calculator");
		
		weightLabel = new JLabel("Enter Weight:");
		caloriesLabel = new JLabel("Calories:");
		proteinLabel = new JLabel("Protein:");
		proteinCaloriesLabel = new JLabel("Protein Calories:");
		carbLabel = new JLabel("Carbohydrate:");
		carbCaloriesLabel = new JLabel("Carb Calories:");
		fatLabel = new JLabel("Fat:");
		fatCaloriesLabel = new JLabel("Fat Calories:");
		informationLabel = new JLabel("<html> * You should only need to use the <br> add and subtratction once because <br> your weight has changed. </html>");

/*
 * Creating the text box
 */
		
		weightTextBox = new JTextField(3);
		weightTextBox.setEditable(true);
		weightTextBox.setText("");
		
		caloriesTextBox = new JTextField(3);
		caloriesTextBox.setEditable(false);
		caloriesTextBox.setText("");
		
		proteinTextBox = new JTextField(3);
		proteinTextBox.setEditable(false);
		proteinTextBox.setText("");
		
		proteinCaloriesTextBox = new JTextField(3);
		proteinCaloriesTextBox.setEditable(false);
		proteinCaloriesTextBox.setText("");
		
		carbTextBox = new JTextField(3);
		carbTextBox.setEditable(false);
		carbTextBox.setText("");
		
		carbCaloriesTextBox = new JTextField(3);
		carbCaloriesTextBox.setEditable(false);
		carbCaloriesTextBox.setText("");
		
		fatTextBox = new JTextField(3);
		fatTextBox.setEditable(false);
		fatTextBox.setText("");
		
		fatCaloriesTextBox = new JTextField(3);
		fatCaloriesTextBox.setEditable(false);
		fatCaloriesTextBox.setText("");

/*
 * Creating the combobox
 */
		
		selectionList = new JComboBox<String>(caloriesList);
	    selectionList.setSelectedIndex(0);

/*
 * Creating the buttons
 */
	    
	    calculateButton = new JButton("Calculate");
	    subButton = new JButton("-250 Calories");
	    addButton = new JButton("+250 Calories");
/*
 * When the buttons are pressed, it will trigger the program to run	    
 */
	    
	    calculateButton.addActionListener(this);
	    subButton.addActionListener(this);
	    addButton.addActionListener(this);
/*
 * Designing the layour and showing all the labels, comboBox, text field and buttons	    
 */
	    
	    setLayout(new GridBagLayout());
	    positionConst = new GridBagConstraints();
	    
	    positionConst.gridx = 0;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(weightLabel, positionConst);
	    positionConst.gridx = 1;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(weightTextBox, positionConst);
	    
	    positionConst.gridx = 0;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(caloriesLabel, positionConst);
	    positionConst.gridx = 1;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(caloriesTextBox, positionConst);
	    
	    positionConst.gridx = 0;
	    positionConst.gridy = 2;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(proteinLabel, positionConst);
	    positionConst.gridx = 1;
	    positionConst.gridy = 2;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(proteinTextBox, positionConst);
	    positionConst.gridx = 2;
	    positionConst.gridy = 2;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(proteinCaloriesLabel, positionConst);
	    positionConst.gridx = 3;
	    positionConst.gridy = 2;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(proteinCaloriesTextBox, positionConst);
	    
	    positionConst.gridx = 0;
	    positionConst.gridy = 3;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(carbLabel, positionConst);
	    positionConst.gridx = 1;
	    positionConst.gridy = 3;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(carbTextBox, positionConst);
	    positionConst.gridx = 2;
	    positionConst.gridy = 3;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(carbCaloriesLabel, positionConst);
	    positionConst.gridx = 3;
	    positionConst.gridy = 3;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(carbCaloriesTextBox, positionConst);
	    
	    positionConst.gridx = 0;
	    positionConst.gridy = 4;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(fatLabel, positionConst);
	    positionConst.gridx = 1;
	    positionConst.gridy = 4;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(fatTextBox, positionConst);
	    positionConst.gridx = 2;
	    positionConst.gridy = 4;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(fatCaloriesLabel, positionConst);
	    positionConst.gridx = 3;
	    positionConst.gridy = 4;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(fatCaloriesTextBox, positionConst);
	    
	    positionConst.gridx = 2;
	    positionConst.gridy = 5;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(calculateButton, positionConst);
	    
	   //if( selectionValue == "Cut" || selectionValue == "Bulk"){
		   
	    positionConst.gridx = 1;
	    positionConst.gridy = 5;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(subButton, positionConst);
	  
	    positionConst.gridx = 3;
	    positionConst.gridy = 5;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(addButton, positionConst);
	    
	  // }
	   
	    positionConst.gridx = 2;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(selectionList, positionConst);   
	    
	    positionConst.gridx = 2;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(informationLabel, positionConst); 
	    
	}
	
/*
 * Macro calculations for maintaining weight	
 */
	
	public int maintenance() {
		
		 String userInput = null;      
	     int calories = 0;
	     int protein = 0;        
	     int proteinCalories = 0;
	     int fat = 0;
	     int fatCalories = 0;
	     int carb = 0;
	     int carbCalories= 0;
	     
	     final double PROTEIN_PERCENTAGE = .8;
	     final double FAT_PERCENTAGE   = .20;
		  
	     userInput = weightTextBox.getText();
	     
	     calories = Integer.parseInt(userInput) * 15;
	     
	     protein = (int) (Integer.parseInt(userInput) * PROTEIN_PERCENTAGE);
	     proteinCalories = (int) protein * 4;
	     
	     fatCalories = (int) (FAT_PERCENTAGE * (calories - proteinCalories));
	     fat = fatCalories / 9;
	     
	     carbCalories = calories - fatCalories - proteinCalories;
	     carb = carbCalories / 4;
	     
	     setText(calories, protein, proteinCalories, carb, carbCalories, fat, fatCalories);
	     
	     return calories;
	}
	
/*
 * Macro calculations for losing weight	
 */
	
	public int cut(){
		
		 String userInput = null;  
	     int calories = 0;
	     int protein = 0; 
	     int proteinCalories = 0;
	     int fat = 0;
	     int fatCalories = 0;
	     int carb = 0;
	     int carbCalories= 0;
	     
	     final double PROTEIN_PERCENTAGE = 1.1;
	     final double FAT_PERCENTAGE   = .20;
		  
	     userInput = weightTextBox.getText();
	     
	     calories = Integer.parseInt(userInput) * 15 - 250;
	     
	     protein = (int) (Integer.parseInt(userInput) * PROTEIN_PERCENTAGE);
	     proteinCalories = (int) protein * 4;
	     
	     fatCalories = (int) (FAT_PERCENTAGE * (calories - proteinCalories));
	     fat = fatCalories / 9;
	     
	     carbCalories = calories - fatCalories - proteinCalories;
	     carb = carbCalories / 4;
	     
	     setText(calories, protein, proteinCalories, carb, carbCalories, fat, fatCalories);
	     
		 return calories;
		
	}

/*
 * Macro calculations for gaining weight
 */
	
	public int bulk(){
		
		 String userInput = null;   
	     int calories = 0;
	     int protein = 0; 
	     int proteinCalories = 0;
	     int fat = 0;
	     int fatCalories = 0;
	     int carb = 0;
	     int carbCalories= 0;
	     
	     final double PROTEIN_PERCENTAGE = .8;
	     final double FAT_PERCENTAGE   = .25;
		  
	     userInput = weightTextBox.getText();
	     
	     calories = Integer.parseInt(userInput) * 15 + 250;
	     
	     protein = (int) (Integer.parseInt(userInput) * PROTEIN_PERCENTAGE);
	     proteinCalories = (int) protein * 4;
	     
	     fatCalories = (int) (FAT_PERCENTAGE * (calories - proteinCalories));
	     fat = fatCalories / 9;
	     
	     carbCalories = calories - fatCalories - proteinCalories;
	     carb = carbCalories / 4;
	     
	     setText(calories, protein, proteinCalories, carb, carbCalories, fat, fatCalories);
	     
	     return calories;
	     
	}

/*
 * When the button is pressed, it will subtract 250 calories with respect to the different options in the combo box
 */
	
	public void subtraction(int cal){
		
		 String userInput = null;  
		 String selectionValue = (String)(selectionList.getSelectedItem());
	     int protein = 0; 
	     int proteinCalories = 0;
	     int fat = 0;
	     int fatCalories = 0;
	     int carb = 0;
	     int carbCalories= 0;
	     int calories = cal;
	     double PROTEIN_PERCENTAGE = .8;
	     double FAT_PERCENTAGE   = .20;
	     
	     if(selectionValue == "Cut"){	    	 
	       PROTEIN_PERCENTAGE = 1.1;	     
	     }
	     
	     if (selectionValue == "Bulk"){	    	 
		     FAT_PERCENTAGE   = .25;	    	 
	     }
		  
	     userInput = weightTextBox.getText();
	     
	     calories = calories - 250;
	     
	     protein = (int) (Integer.parseInt(userInput) * PROTEIN_PERCENTAGE);
	     proteinCalories = (int) protein * 4;
	     
	     fatCalories = (int) (FAT_PERCENTAGE * (calories - proteinCalories));
	     fat = fatCalories / 9;
	     
	     carbCalories = calories - fatCalories - proteinCalories;
	     carb = carbCalories / 4;
	     
	     setText(calories, protein, proteinCalories, carb, carbCalories, fat, fatCalories);
	     
	}

/*
 * When the button is pressed, it will add 250 calories with respect to the different options in the combo box
 */
	
	public void add(int cal){
		
		 String userInput = null;  
		 String selectionValue = (String)(selectionList.getSelectedItem());
	     int protein = 0; 
	     int proteinCalories = 0;
	     int fat = 0;
	     int fatCalories = 0;
	     int carb = 0;
	     int carbCalories= 0;
	     int calories = cal;
	     double PROTEIN_PERCENTAGE = .8;
	     double FAT_PERCENTAGE   = .20;
	     
	     if(selectionValue == "Cut"){	    	 
	       PROTEIN_PERCENTAGE = 1.1;	     
	     }
	     
	     else if (selectionValue == "Bulk"){	    	 
		   FAT_PERCENTAGE   = .25;	    	 
	     }
		  
	     userInput = weightTextBox.getText();
	     
	     calories = calories + 250;
	     
	     protein = (int) (Integer.parseInt(userInput) * PROTEIN_PERCENTAGE);
	     proteinCalories = (int) protein * 4;
	     
	     fatCalories = (int) (FAT_PERCENTAGE * (calories - proteinCalories));
	     fat = fatCalories / 9;
	     
	     carbCalories = calories - fatCalories - proteinCalories;
	     carb = carbCalories / 4;
	     
	     setText(calories, protein, proteinCalories, carb, carbCalories, fat, fatCalories);		
	}

/*
 * Displays all the information to the textfields
 */
	
	public void setText(int calories, int protein, int proteinCalories, int carb, int carbCalories, int fat, int fatCalories ){
		
		  proteinTextBox.setText(Integer.toString(protein) + " g");
		  caloriesTextBox.setText(Integer.toString(calories));
		  fatTextBox.setText(Integer.toString(fat) + " g");
		  carbTextBox.setText(Integer.toString(carb) + " g");
		  
		  fatCaloriesTextBox.setText(Integer.toString(fatCalories));
		  proteinCaloriesTextBox.setText(Integer.toString(proteinCalories));
		  carbCaloriesTextBox.setText(Integer.toString(carbCalories));
		  
	}

/*
 *Code for the buttons and combobox
 */
	
	public void actionPerformed(ActionEvent e) {
		
		 String selectionValue = (String)(selectionList.getSelectedItem());
		
		 if(e.getSource() == calculateButton){
			 
			try{
				if(selectionValue == "Maintain"){	 
	    		 maintenance();
		        }
	    	 
				else if(selectionValue == "Cut"){
		    	  cut();
		        }
		      
				else if(selectionValue == "Bulk"){		    	  
		    	  bulk();		    	  
		        }
		     }
		     
		     catch(NumberFormatException event) {		    	 
		    		JOptionPane.showMessageDialog(null, "Input must be Integer!");		    		
		     } 
			
		 }
		 
		int currentCalories = Integer.parseInt(caloriesTextBox.getText());
		System.out.println(currentCalories);
		if(e.getSource() == subButton){
			
			try{
				
				if(selectionValue == "Maintain"){
				
					if(currentCalories > maintenance()){
					maintenance();					
					}
				
					else{							
						subtraction(currentCalories);
						/*int currentFat = Integer.parseInt(fatTextBox.getText());
						if(currentFat< 0){
							maintenance();
							JOptionPane.showMessageDialog(null, "Cant be negative!");		 
						}*/
					}
				
				}
			
				else if(selectionValue == "Cut"){
				
					if(currentCalories > cut()){
						cut();					
					}
				
					else{				
						subtraction(currentCalories);				
					}
				}
			
				else if(selectionValue == "Bulk"){
				
					if(currentCalories > bulk()){					
						bulk();					
					}
				
					else{				
						subtraction(currentCalories);				
					}		
			    }
		    } 
		
			catch(NumberFormatException event) {		    	 
	    		JOptionPane.showMessageDialog(null, "Input must be Integer!");	    		
	    	} 
		}
		
		currentCalories = Integer.parseInt(caloriesTextBox.getText());
		
		if(e.getSource() == addButton){
			
			try{
			
				if(selectionValue == "Maintain"){
				
					if(currentCalories < maintenance()){					
						maintenance();					
					}
				
					else{						
						add(currentCalories);					
					}
				
				}
			
				else if(selectionValue == "Cut"){
				
					if(currentCalories < cut()){					
						cut();				
					}
					
					else{					
						add(currentCalories);					
					}
				
				}
			
				else if(selectionValue == "Bulk"){
				
					if(currentCalories < bulk()){					
						bulk();					
					}
				
					else{					
						add(currentCalories);					
					}
				
				}
			}
			
			catch(NumberFormatException event) {		    	 
	    		JOptionPane.showMessageDialog(null, "Input must be Integer!");	    		
	    	} 
			
		}
		
	}
		
	
	public static void main(String[] args) {
	      
	      BetterV4 myFrame = new BetterV4();

	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      myFrame.pack();
	      myFrame.setLocationRelativeTo(null);
	      myFrame.setVisible(true);
	      
	      JOptionPane.showMessageDialog(myFrame, "This is just an estimation of your macros. To use this, measure your weight in the morning every day for a whole week. \n"
					+ "Once you have done that eatting the estimated amount of macros, take the average of your weights and compare it to your starting weight. \n"
					+ "if your weight didnt change, then this is your maintenance macros. From there you can decide if you want to cut or bulk ");
	      
	   }

}
