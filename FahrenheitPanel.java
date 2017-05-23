
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton Enter;
	
	public FahrenheitPanel(){
	
	inputLabel= new JLabel("Enter Fahrenheit temperature:");
	outputLabel= new JLabel("Temperature in Celsius: ");
	resultLabel= new JLabel("---");
	fahrenheit= new JTextField(5);
	Enter = new JButton ("Enter");
	fahrenheit.addActionListener(new TempListener());
	Enter.addActionListener(new TempListener());
	add(inputLabel);
	add(fahrenheit);
	add(Enter);
	add(outputLabel);
	add(resultLabel);
	
	setPreferredSize(new Dimension(300, 75));
	setBackground(Color.white);
	//fahrenheit.setPreferredSize(new Dimension(20, 50));
	//inputLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
	//outputLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
	//resultLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	
	}
	private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		
		int fahrenheitTemp; 
		double celsiusTemp;
		String text = fahrenheit.getText();
		fahrenheitTemp= Integer.parseInt(text);
		celsiusTemp= (fahrenheitTemp-32) * 5/9;
		resultLabel.setText(Double.toString(celsiusTemp));
		}
		
	}
	}


