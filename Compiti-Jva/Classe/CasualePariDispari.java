
import java.util.*;

class CasualePariDispari {
	public static Random casuale = new Random();//

	public static void main(String args[])

	{
		int estratto;

		estratto = casuale.nextInt(10) + 1;

		switch (estratto) {
			case (2):
			case (4):
			case (6):
			case (8):
			case (10): {
				System.out.println("\n Il valore    " + estratto + " è pari");
				break;

			}

			default: {
				System.out.println("\n Il valore    " + estratto + " è dispari");
				break;
			}

		}

		// estratto = casuale.nextInt(20)+1;

		// estratto = (int ) (Math.random()* 10)+1; //<--richiama direttamente la
		// classe// casuale tra 1 e 10

		estratto = (((int) (Math.random() * 100)) % 20) + 1;

		switch (estratto) {
			case (1):
			case (3):
			case (5):
			case (7):
			case (9): {
				System.out.println("\n Il valore    " + estratto + " è dispari");
				break;

			}

			default: {
				System.out.println("\n Il valore    " + estratto + " è fuori dall'intervallo [1-10]");
				break;
			}

		}
	}

}
