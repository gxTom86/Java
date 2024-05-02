
class Orologio_PT_01
{
	private int ora;
	private int minuti;

	public Orologio_PT_01()
	{
		ora = 10;
		minuti = 10;
	}

	public Orologio_PT_01(int ora, int minuti)
	{
		this.ora = ora;
		this.minuti = minuti;
	} 

	public void dimmiOra()
	{ 
		System.out.println("\n  " + ora + ":" + minuti);
	}
}