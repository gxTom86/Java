
class OrologioData_PT_01 extends Orologio_PT_01
{
	private int giornoNum;
	private int mese;
	private int anno;
	private String giorno;

	public OrologioData_PT_01(int giornoNum, int mese, int anno, String giorno)
	{
		this.giornoNum = giornoNum;
		this.mese = mese;
		this.anno = anno;
		this.giorno = giorno;
	}

	public OrologioData_PT_01(int ora, int minuti, int giornoNum, int mese, int anno, String giorno)
	{
		super(ora,minuti);

		this.giornoNum = giornoNum;
		this.mese = mese;
		this.anno = anno;
		this.giorno = giorno;
	}

	public void dimmiOraData()
	{
		super.dimmiOra();

		System.out.println("\n  " + giornoNum + "/" + mese + "/" + anno + "  oggi è  " + giorno);
	}

}