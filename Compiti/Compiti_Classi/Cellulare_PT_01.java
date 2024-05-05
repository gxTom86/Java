
class Cellulare_PT_01 extends Telefono_PT_01
{
	private final double COSTO_RISPOSTA = 0.12;
	private final double COSTO_SECONDO = 0.0035;

	public Cellulare_PT_01 (int secondi)
	{
		super(secondi);
	}

	public double costoTelefonata()
	{
		double costo;

		costo = COSTO_RISPOSTA + super.getDurataSecondi() * COSTO_SECONDO;

		return costo;
	}

	//public void stampaTelefonataCellulare()
	
	public void stampaTelefonata()
	{
		double costo = costoTelefonata();

		System.out.println("\n Durata  " + super.getDurataSecondi() + "  [s]  -*-*-*-*-  Costo  " + costo);
	}
}