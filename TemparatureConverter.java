public class TemparatureConverter{
	public static double convertToFahrenheit(double celsius){
		return (celsius*9/5) + 32;
	}
	public static void main(String [] args){
		System.out.println(TemparatureConverter.convertToFahrenheit(25));
	}
	}