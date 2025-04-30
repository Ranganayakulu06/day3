public class TravelConverter{
	public static double kilometerToMiles(double kilometer){
		return kilometer * 0.621371;
	}
	public static void main(String [] args){
		double doubleResult=kilometerToMiles(10);
		System.out.println(doubleResult);
}
}
	