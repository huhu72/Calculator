
public class Maintain {

	private int calories;
	private int protein;
	private int proteinCalories;
	private int fat;
	private int fatCalories;
	private int carb;
	private int carbCalories;
	private int multiplier;

	private static final double PROTEIN_PERCENTAGE = .8;
	private static final double FAT_PERCENTAGE = .20;

	public Maintain() {
		this.calories = 0;
		this.protein = 0;
		this.proteinCalories = 0;
		this.fat = 0;
		this.fatCalories = 0;
		this.carb = 0;
		this.carbCalories = 0;

	}

	public void setCalories(int cals) {
		this.calories = cals;
	}

	public int getCalories() {
		return this.calories;
	}
	
	public int getMultiplier(){
		return this.multiplier;
	}

	public void setProteinMacro(int proteinMacro) {
		this.protein = proteinMacro;
	}

	public int getProteinMacro() {
		return this.protein;
	}

	public void setProteinCalories(int proteinCalories) {

		this.proteinCalories = proteinCalories;

	}

	public void setFatCalories(int fatCalories) {

		this.fatCalories = fatCalories;

	}

	public void setFatMacro(int fatMacro) {

		this.fat = fatMacro;

	}

	public void setCarbCalories(int carbCarlories) {
		this.carbCalories = carbCarlories;
	}

	public void setCarbMacro(int carbMacro) {

		this.carb = carbMacro;

	}
	public void setMultiplier(int multiplier){
		this.multiplier = multiplier;
	}

	public int calorieMath(String userInput) {
		calories = Integer.parseInt(userInput) * 15;
		return calories;
	}

	public int proteinMacroMath(int cal) {
		protein = (int) (cal * PROTEIN_PERCENTAGE) / 4;
		return protein;

	}

	public int proteinMath(int protein) {
		proteinCalories = (protein * 4);
		return proteinCalories;
	}

	public int fatMath(int calories, int proteinCalories) {
		fatCalories = (int) ((calories - proteinCalories) * FAT_PERCENTAGE);

		return fatCalories;

	}

	public int fatMacroMath(int fatCalories) {
		fat = fatCalories / 9;
		return fat;

	}

	public int carbMath(int calories, int fatCalories, int proteinCalories) {
		carbCalories = calories - fatCalories - proteinCalories;
		return carbCalories;
	}

	public int carbMacro(int carbCalories) {
		carb = carbCalories / 4;
		return carb;
	}
	public int add(int cal) {
		this.calories = cal + 250;

		return calories;
	}
	public int sub(int cal) {
		this.calories = cal - 250;

		return calories;
	}

	

}
