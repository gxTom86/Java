
//import java.util.Scanner; // Serve per l'input.

//import java.util.Random; // Serve per creare i numeri casuali.

import java.util.*; // Con l'asterisco importo tutte le classi della
                    // libreria, anziché importarle una alla volta
                    // indicandone il nome.

//import java.lang.Math; // Serve per usare funzioni matematiche.

public class Input_e_Casuale_3CI
{
    // Definisce un oggetto di nome random appartenente alla classe
    // Random; serve per generare numeri casuali.
    private static Random random = new Random();

    // Definisce un oggetto di nome input appartenente alla classe
    // Scanner; serve per leggere l'input di System.in (che è
    // la tastiera).
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
	{
        byte valoreByte;
        short valoreShort;
        int valore, casuale;
        long valoreLong;
        double valoreDouble;
        float valoreFloat;
        String frase;
        char carattere;
        boolean flag;
        
        System.out.print("\n Inserire un valore intero di tipo byte (MAX 127) :  ");
        valoreByte = Byte.parseByte(input.nextLine());
        System.out.print(" Il valore intero di tipo byte inserito è :  " + valoreByte);

        System.out.print("\n\n Inserire un valore intero di tipo short :  ");
        valoreShort = Short.parseShort(input.nextLine());
        System.out.print(" Il valore intero di tipo short inserito è :  " + valoreShort);

        System.out.print("\n\n Inserire un valore intero :  ");
        valore = Integer.parseInt(input.nextLine());
        System.out.print(" Il valore intero inserito è :  " + valore);

        System.out.print("\n\n Inserire un valore intero di tipo long :  ");
        valoreLong = Long.parseLong(input.nextLine());
        System.out.print(" Il valore intero di tipo long inserito è :  " + valoreLong);

        System.out.print("\n\n Inserire un valore double :  ");
		valoreDouble = Double.parseDouble(input.nextLine());
        System.out.print(" Il valore double inserito è :  " + valoreDouble);

        System.out.print("\n\n Inserire un valore float :  ");
        valoreFloat = Float.parseFloat(input.nextLine());
        System.out.print(" Il valore double inserito è :  " + valoreFloat);

        System.out.print("\n\n Inserire una frase :  ");
        frase = input.nextLine();
        System.out.print(" La frase inserita è :  " + frase);

        System.out.print("\n\n Inserire un carattere :  ");
        carattere = input.findInLine(".").charAt(0);
        System.out.print(" Il carattere inserito è :  " + carattere);
		input.nextLine(); // Necessario affinché si possa fare
                        // il successivo input.

        System.out.print("\n\n Inserire un carattere :  ");
        carattere = input.nextLine().charAt(0);
        System.out.print(" Il carattere inserito è :  " + carattere);

        System.out.print("\n\n Inserire un valore booleano :  ");
        flag = Boolean.parseBoolean(input.nextLine());
        System.out.print(" Il valore booleano inserito è :  " + flag);
        
        // Genera un numero casuale cmpreso tra 0 e 1001-1
        casuale = random.nextInt(1001);
		System.out.println("\n\n Valore casuale compreso tra 0 e 1000 :  " + casuale);

        System.out.println("");
    }
}
