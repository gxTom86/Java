public class OperazioniConVariabili
{
	public static void main(String args[])
	{
		int intA, intB, intC;
		float floatA, floatB;
		double doubleA, doubleB;
		
		intA = 7;
		
		intB = 2;
		
		System.out.println(intA/(float)intB);
		
		floatA = intA/(float)intB;
		
		System.out.println(floatA);
		
		floatA = intA/intB;
		
		System.out.println(floatA);
		
		intC = intA/intB;
		
		System.out.println(intC);
		
		intC = (int)((float)intA/intB);
		
		System.out.println(intC);
		
		intC = 7/2;
		
		System.out.println(intC);
		
		intC = (int)(7.0/2);
		
		System.out.println(intC);
		
		doubleA = floatA;
		
		System.out.println(doubleA);
		
		floatB = (float)doubleA;
		
		System.out.println(floatB);
		
		floatB = (float)9.87;
		
		System.out.println(floatB);
		
		floatB = 35.732f;
		
		System.out.println(floatB);
		
	}
}