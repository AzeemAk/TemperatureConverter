import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab1aRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat formatDouble = new DecimalFormat("#.00");  //formating output so doubles don't show repeating/long decimal values.
		Scanner kb = new Scanner(System.in);  // setting up user input from keyboard.
		System.out.println("Hello, please enter a temperature in Fahrenheit: ");
		double f = kb.nextDouble(); // a variable to hold a Fahrenheit temp input by the user.
		Temperature temp = new Temperature(f); 
		System.out.println("Celsius: " + formatDouble.format(temp.getCelsius())); // outputting the temperature conversions to Celsius and Kelvin.
		System.out.println("Kelvin: " + formatDouble.format(temp.getKelvin()));
		
	}

}
