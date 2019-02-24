package util;

public class CurrencyConverter {

	public static float dollarToReal(float dollar, int quanty)
	{
		return (float)dollar*quanty*1.06f;
	}
}
