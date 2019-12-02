import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class Version6 extends JFrame implements ActionListener {
	private JFrame frame = new JFrame();
	private JComboBox<String> comboBox = new JComboBox<String>();
	private JTextPane weightTextBox = new JTextPane();
	private JTextPane carbTextBox = new JTextPane();
	private JTextPane proteinTextBox = new JTextPane();
	private JTextPane caloriesTextBox = new JTextPane();
	private JTextPane fatTextBox = new JTextPane();
	private JTextPane proteinCaloriesTextBox = new JTextPane();
	private JTextPane carbCaloriesTextBox = new JTextPane();
	private JTextPane fatCaloriesTextBox = new JTextPane();
	private JButton CalculateBtn = new JButton("Calculate");
	private JButton btnSubtract = new JButton("Subtract");
	private JButton btnSave = new JButton("Save");
	private JButton btnAdd = new JButton("Add");
	private JRadioButton maleRadioButton = new JRadioButton("Male");
	private JRadioButton femaleRadioButton = new JRadioButton("Female");
	private int multiplier;

	public static void main(String[] args) {
		Version6 myFrame = new Version6();

		myFrame.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.frame.setLocationRelativeTo(null);
		myFrame.frame.setVisible(true);
	}

	Version6() {

		frame.setBounds(100, 100, 313, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Weight:");
		lblNewLabel.setBounds(6, 10, 88, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblCalories = new JLabel("Calories:");
		lblCalories.setBounds(33, 30, 61, 16);
		frame.getContentPane().add(lblCalories);

		JLabel lblProtein = new JLabel("Protein:");
		lblProtein.setBounds(40, 50, 61, 16);
		frame.getContentPane().add(lblProtein);

		JLabel lblCarb = new JLabel("Carb:");
		lblCarb.setBounds(55, 70, 61, 16);
		frame.getContentPane().add(lblCarb);

		JLabel lblFat = new JLabel("Fat:");
		lblFat.setBounds(55, 90, 61, 16);
		frame.getContentPane().add(lblFat);

		weightTextBox.setBounds(93, 10, 43, 16);
		weightTextBox.setEditable(true);
		frame.getContentPane().add(weightTextBox);

		carbTextBox.setBounds(93, 70, 43, 16);
		carbTextBox.setEditable(false);
		frame.getContentPane().add(carbTextBox);

		proteinTextBox.setBounds(93, 50, 43, 16);
		proteinTextBox.setEditable(false);
		frame.getContentPane().add(proteinTextBox);

		caloriesTextBox.setBounds(93, 30, 43, 16);
		caloriesTextBox.setEditable(false);
		frame.getContentPane().add(caloriesTextBox);

		comboBox.setBounds(148, 5, 108, 27);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Maintain", "Cut", "Bulk" }));
		comboBox.setSelectedIndex(0);
		frame.getContentPane().add(comboBox);

		fatTextBox.setBounds(93, 90, 43, 16);
		fatTextBox.setEditable(false);
		frame.getContentPane().add(fatTextBox);

		JLabel lblProteinCalories = new JLabel("Protein Calories:");
		lblProteinCalories.setBounds(148, 50, 105, 16);
		frame.getContentPane().add(lblProteinCalories);

		JLabel lblCarbCalories = new JLabel("Carb Calories:");
		lblCarbCalories.setBounds(164, 70, 88, 16);
		frame.getContentPane().add(lblCarbCalories);

		JLabel lblFatCalories = new JLabel("Fat Calories:");
		lblFatCalories.setBounds(174, 90, 78, 16);
		frame.getContentPane().add(lblFatCalories);

		proteinCaloriesTextBox.setBounds(262, 50, 43, 16);
		proteinCaloriesTextBox.setEditable(false);
		frame.getContentPane().add(proteinCaloriesTextBox);

		carbCaloriesTextBox.setBounds(262, 70, 43, 16);
		carbCaloriesTextBox.setEditable(false);
		frame.getContentPane().add(carbCaloriesTextBox);

		fatCaloriesTextBox.setBounds(262, 90, 43, 16);
		fatCaloriesTextBox.setEditable(false);
		frame.getContentPane().add(fatCaloriesTextBox);

		CalculateBtn.setBounds(33, 130, 117, 29);
		CalculateBtn.addActionListener(this);
		frame.getContentPane().add(CalculateBtn);

		btnSubtract.setBounds(188, 110, 117, 29);
		btnSubtract.addActionListener(this);
		frame.getContentPane().add(btnSubtract);

		btnSave.setBounds(188, 130, 117, 29);
		btnSave.addActionListener(this);
		frame.getContentPane().add(btnSave);

		btnAdd.setBounds(33, 110, 117, 29);
		btnAdd.addActionListener(this);
		frame.getContentPane().add(btnAdd);

		maleRadioButton.setBounds(148, 30, 61, 23);
		maleRadioButton.addActionListener(this);
		frame.getContentPane().add(maleRadioButton);

		femaleRadioButton.setBounds(223, 30, 78, 23);
		femaleRadioButton.addActionListener(this);
		frame.getContentPane().add(femaleRadioButton);

		// The Group, make sure only one button is selected at a time in the
		// group
		ButtonGroup editableGroup = new ButtonGroup();
		editableGroup.add(femaleRadioButton);
		editableGroup.add(maleRadioButton);
	}

	public void actionPerformed(ActionEvent e) {
		int currentFat = 0;
		int currentCalories = 0;

		String selectionValue = (String) (comboBox.getSelectedItem());

		if (maleRadioButton.isSelected()) {
			multiplier = 15;

		} else if (femaleRadioButton.isSelected()) {
			multiplier = 12;
		} else {
			JOptionPane.showMessageDialog(null, "Please selected a gender");
		}
		if (maleRadioButton.isSelected() || femaleRadioButton.isSelected()) {
			if (e.getSource() == CalculateBtn) {

				if (selectionValue.equals("Maintain")) {
					maintenance(multiplier);
				}

				else if (selectionValue.equals("Cut")) {
					cut(multiplier);
				}

				else if (selectionValue.equals("Bulk")) {
					bulk(multiplier);
				}

			}
			currentCalories = Integer.parseInt(caloriesTextBox.getText());
			if (e.getSource() == btnSubtract) {

				try {

					if (selectionValue.equals("Maintain")) {

						subtraction(currentCalories);
						currentFat = Integer.parseInt(fatTextBox.getText().replace(" g", ""));
						if (currentFat < 0) {
							maintenance(multiplier);
							JOptionPane.showMessageDialog(null, "Cant be negative!");
						}

					}

					else if (selectionValue.equals("Cut")) {

						if (currentCalories > cut(multiplier)) {
							cut(multiplier);
						}

						else {
							subtraction(currentCalories);
						}
					}

					else if (selectionValue.equals("Bulk")) {

						if (currentCalories > bulk(multiplier)) {
							bulk(multiplier);
						}

						else {
							subtraction(currentCalories);
						}
					}
				}

				catch (NumberFormatException event) {
					JOptionPane.showMessageDialog(null, "Input must be Integer!");
				}
			}

			currentCalories = Integer.parseInt(caloriesTextBox.getText());

			if (e.getSource() == btnAdd) {

				try {

					if (selectionValue.equals("Maintain")) {

						if (currentCalories < maintenance(multiplier)) {
							maintenance(multiplier);
						}

						else {
							add(currentCalories);
						}

					}

					else if (selectionValue.equals("Cut")) {

						if (currentCalories < cut(multiplier)) {
							cut(multiplier);
						}

						else {
							add(currentCalories);
						}

					}

					else if (selectionValue.equals("Bulk")) {

						if (currentCalories < bulk(multiplier)) {
							bulk(multiplier);
						}

						else {
							add(currentCalories);
						}

					}
				}

				catch (NumberFormatException event) {
					JOptionPane.showMessageDialog(null, "Input must be Integer!");
				}

			}
		}
	}

	public int maintenance(int multiplier) {

		String userInput = weightTextBox.getText();

		Maintain test = new Maintain();
		test.setMultiplier(multiplier);
		int calories = test.calorieMath(userInput);
		int proteinMacro = test.proteinMacroMath(calories);
		int proteinCalories = test.proteinMath(proteinMacro);
		int fatCalories = test.fatMath(calories, proteinCalories);
		int fatMacro = test.fatMacroMath(fatCalories);
		int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
		int carbMacro = test.carbMacro(carbCalories);
		setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

		return calories;

	}

	/*
	 * Macro calculations for losing weight
	 */

	public int cut(int multiplier) {

		String userInput = weightTextBox.getText();

		Cut test = new Cut();
		test.setMultiplier(multiplier);
		int calories = test.calorieMath(userInput);
		int proteinMacro = test.proteinMacroMath(calories);
		int proteinCalories = test.proteinMath(proteinMacro);
		int fatCalories = test.fatMath(calories, proteinCalories);
		int fatMacro = test.fatMacroMath(fatCalories);
		int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
		int carbMacro = test.carbMacro(carbCalories);
		setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

		return calories;
	}

	/*
	 * Macro calculations for gaining weight
	 */

	public int bulk(int multiplier) {

		String userInput = weightTextBox.getText();

		Bulk test = new Bulk();
		test.setMultiplier(multiplier);
		int calories = test.calorieMath(userInput);
		int proteinMacro = test.proteinMacroMath(calories);
		int proteinCalories = test.proteinMath(proteinMacro);
		int fatCalories = test.fatMath(calories, proteinCalories);
		int fatMacro = test.fatMacroMath(fatCalories);
		int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
		int carbMacro = test.carbMacro(carbCalories);
		setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

		return calories;
	}

	/*
	 * When the button is pressed, it will subtract 250 calories with respect to
	 * the different options in the combo box
	 */

	public int subtraction(int cal) {
		String selectionValue = (String) (comboBox.getSelectedItem());

		if (selectionValue.equals("Maintain")) {

			Maintain test = new Maintain();
			int calories = test.sub(cal);
			int proteinMacro = test.proteinMacroMath(calories);
			int proteinCalories = test.proteinMath(proteinMacro);
			int fatCalories = test.fatMath(calories, proteinCalories);
			int fatMacro = test.fatMacroMath(fatCalories);
			int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
			int carbMacro = test.carbMacro(carbCalories);
			setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

			return calories;

		} else if (selectionValue.equals("Bulk")) {
			Bulk test = new Bulk();
			int calories = test.sub(cal);
			int proteinMacro = test.proteinMacroMath(calories);
			int proteinCalories = test.proteinMath(proteinMacro);
			int fatCalories = test.fatMath(calories, proteinCalories);
			int fatMacro = test.fatMacroMath(fatCalories);
			int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
			int carbMacro = test.carbMacro(carbCalories);
			setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);
			return calories;
		} else if (selectionValue.equals("Cut")) {
			Cut test = new Cut();
			int calories = test.sub(cal);
			int proteinMacro = test.proteinMacroMath(calories);
			int proteinCalories = test.proteinMath(proteinMacro);
			int fatCalories = test.fatMath(calories, proteinCalories);
			int fatMacro = test.fatMacroMath(fatCalories);
			int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
			int carbMacro = test.carbMacro(carbCalories);
			setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

			return calories;
		}
		return 0;
	}

	/*
	 * When the button is pressed, it will add 250 calories with respect to the
	 * different options in the combo box
	 */

	public int add(int cal) {

		String selectionValue = (String) (comboBox.getSelectedItem());
		if (selectionValue.equals("Maintain")) {

			Maintain test = new Maintain();
			int calories = test.add(cal);
			int proteinMacro = test.proteinMacroMath(calories);
			int proteinCalories = test.proteinMath(proteinMacro);
			int fatCalories = test.fatMath(calories, proteinCalories);
			int fatMacro = test.fatMacroMath(fatCalories);
			int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
			int carbMacro = test.carbMacro(carbCalories);
			setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

			return calories;

		} else if (selectionValue.equals("Bulk")) {
			Bulk test = new Bulk();
			int calories = test.add(cal);
			int proteinMacro = test.proteinMacroMath(calories);
			int proteinCalories = test.proteinMath(proteinMacro);
			int fatCalories = test.fatMath(calories, proteinCalories);
			int fatMacro = test.fatMacroMath(fatCalories);
			int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
			int carbMacro = test.carbMacro(carbCalories);
			setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);
			return calories;
		} else if (selectionValue.equals("Cut")) {
			Cut test = new Cut();
			int calories = test.add(cal);
			int proteinMacro = test.proteinMacroMath(calories);
			int proteinCalories = test.proteinMath(proteinMacro);
			int fatCalories = test.fatMath(calories, proteinCalories);
			int fatMacro = test.fatMacroMath(fatCalories);
			int carbCalories = test.carbMath(calories, fatCalories, proteinCalories);
			int carbMacro = test.carbMacro(carbCalories);
			setText(calories, proteinMacro, proteinCalories, carbMacro, carbCalories, fatMacro, fatCalories);

			return calories;
		}
		return 0;

	}

	public void setText(int calories, int proteinMacro, int proteinCalories, int carbMacro, int carbCalories,
			int fatMacro, int fatCalories) {

		this.proteinTextBox.setText(Integer.toString(proteinMacro) + " g");
		this.caloriesTextBox.setText(Integer.toString(calories));
		this.fatTextBox.setText(Integer.toString(fatMacro) + " g");
		this.carbTextBox.setText(Integer.toString(carbMacro) + " g");
		this.fatCaloriesTextBox.setText(Integer.toString(fatCalories));
		this.proteinCaloriesTextBox.setText(Integer.toString(proteinCalories));
		this.carbCaloriesTextBox.setText(Integer.toString(carbCalories));

	}
}
