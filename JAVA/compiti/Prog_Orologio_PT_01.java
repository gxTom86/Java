
import java.util.Scanner;

class Prog_Orologio_PT_01
{
	public static Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		int ore, minuti;

		Orologio_PT_01 orologio1 = new Orologio_PT_01();

		System.out.print("\n Inserire le ore :  ");
		ore = Integer.parseInt(input.nextLine());

		System.out.print("\n Inserire i minuti :  ");
		minuti = Integer.parseInt(input.nextLine());

		Orologio_PT_01 orologio2 = new Orologio_PT_01(ore, minuti);

		orologio1.dimmiOra();

		orologio2.dimmiOra();

		OrologioData_PT_01 orologioData1 = new OrologioData_PT_01(24, 4, 2024, "Martedì");

		OrologioData_PT_01 orologioData2 = new OrologioData_PT_01(ore, minuti, 24, 4, 2024, "Martedì");

		System.out.println("\n -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		orologioData1.dimmiOraData();

		orologioData2.dimmiOraData();

		System.out.println("");
	}
}