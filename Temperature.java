
public class Temperature {
	private double ftemp; //Fahrenheit Temp
	public Temperature(double f) {
		ftemp = f;
	}
	public void setFahrenheit(double f) {
		ftemp = f;
	}
	public double getFahrenheit() {
		return ftemp;
	}
	public double getCelsius() {
		double c = (5.0/9.0) * (ftemp - 32);  //converting fahrenheit temp to celsius.
		return c;
	}
	public double getKelvin() {
		double k = (getCelsius() + 273); // converting farhenheit to celsius then to kelvin.
		return k;
				
	}
}
