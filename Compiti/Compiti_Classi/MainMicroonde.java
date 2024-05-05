
import java.util.Scanner;

/*
 * Microonde Whirlpool 
 * 253 W
 * 183,00
 */
class MainMicroonde {
    public static void main(String args[])

    {
        Scanner scanner = new Scanner(System.in);
        Microonde microonde1 = new Microonde();

        System.out.print("Inserisci la marca Del Microonde : ");
        String marca = scanner.nextLine();
        microonde1.setMarca(marca);

        System.out.print("Inserisci Il tipo di alimentazione : ");
        String alimentazione = scanner.nextLine();
        microonde1.setAlimentazione(alimentazione);

        System.out.print("Inserisci il  Prezzo : ");
        double prezzo = Double.parseDouble(scanner.nextLine());
        microonde1.setPrezzo(prezzo);

        microonde1.stampaInfo();
    }
}
