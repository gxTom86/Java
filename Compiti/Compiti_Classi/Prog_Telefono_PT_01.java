
class Prog_Telefono_PT_01
{
	public static void main (String[] args)
	{
		Telefono_PT_01 telefonata1 = new Telefono_PT_01(10);
		Telefono_PT_01 telefonata2 = new Telefono_PT_01(100);
		Telefono_PT_01 telefonata3 = new Telefono_PT_01(179);
		Telefono_PT_01 telefonata4 = new Telefono_PT_01(240);

		telefonata1.stampaTelefonata();
		telefonata2.stampaTelefonata();
		telefonata3.stampaTelefonata();
		telefonata4.stampaTelefonata();

		Cellulare_PT_01 telefonataCell1 = new Cellulare_PT_01(100);
		Cellulare_PT_01 telefonataCell2 = new Cellulare_PT_01(200);

		telefonataCell1.stampaTelefonata();
		telefonataCell2.stampaTelefonata();

		//telefonataCell1.stampaTelefonataCellulare();
		//telefonataCell2.stampaTelefonataCellulare();

		System.out.println("");
	}
}