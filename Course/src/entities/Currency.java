package entities;

public class Currency {
	
	public static double IOF = 0.06;
	
	public static double converter(double price, double dollar) {
		return dollar * price * ( 1 + IOF);
	}
	
}
