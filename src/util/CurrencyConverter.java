package util;

public class CurrencyConverter {
	public static final double TAX = 0.06;
	public static double value(double dol, double dolQuantity) {
		return (dol*dolQuantity*TAX)+(dol*dolQuantity);
	}
}

