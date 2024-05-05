
class Telefono_PT_01
{
	private final double COSTO_MINUTO = 0.15;
	private int durataSecondi;
	private int durataMinuti;

	public Telefono_PT_01(int secondi)
	{
		durataSecondi = secondi;

		if (durataSecondi % 60 != 0)
			durataMinuti = (durataSecondi/60) + 1;

		else
			durataMinuti = durataSecondi/60;
	}

	public int getDurataSecondi()
	{
		return durataSecondi;
	}

	public int getDurataMinuti()
	{
		return durataMinuti;
	}

	public double costoTelefonata()
	{
		return durataMinuti * COSTO_MINUTO;
	}

	public void stampaTelefonata()
	{
		double costo = costoTelefonata();

		System.out.println("\n Durata  " + durataSecondi + "  [s] -*-*-*-*-  " + durataMinuti + "  [mim]  -*-*-*-*-  Costo  " + costo);
	}
}