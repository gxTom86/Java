
class MaxMinCasuale
{

	public static void main (String args[])

	{
		double max, min, estratto;

		long numeroEstrazioni = 100000000;

		max = Math.random();
		min = Math.random();


		for(int i=1; i<=numeroEstrazioni; i++)
		{
			estratto = Math.random();

			if (max < estratto)
			{
				max = estratto;
			}

			
				if (min > estratto)
				{
					min = estratto;
				}
			
		}
		System.out.println("\n Il massimo è " + max );
		System.out.println("\n il minimo è " + min );
		System.out.println("  ");

	}
}