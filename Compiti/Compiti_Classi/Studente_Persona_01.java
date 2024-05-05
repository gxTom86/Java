import java.util.Random;
import java.util.Scanner;

class Studente_Persona_01 extends Persona_01
{
	private Scanner input = new Scanner (System.in);
	private Random casuale = new Random (System.in);

	private String Classe; 
                     /* 
                    Specializzare vuol dire andare ad introdurre nuovi attributi e metodi nella sottoclasse
				    Se si va nella superclasse avviene una generalizzazione mentre andandon nella sottoclasse
				    si ha una specializzazione 
                    */

    private double voti[]= new double[10];
	private int numVoti;
    private String classe;

	public Studente_Persona_01 (String nome, String cognome, String classe)
	{
		super(cognome, nome);
		this.classe = classe;
	}

	public void assegnaVoti()
	{
		System.out.println("\n Quanti voti vuoi inserire? : ");
		numVoti = Integer.parseInt(input.nextLine());

		for (int i=0; i<numVoti; i++)
		{
			voti[i] = casuale.nextInt(8) + 3; // Genera un numero intero da 3 a 10
		}
	}

    public Double mediaVoti()
	{
        int somma = 0;
        double media;

        for(int i=0; i<numVoti; i++)
        {
            somma+=voti[i];

            media = ((int)(((double) somma / numVoti) * 100)) / 100.0; //troncamento
        }
        return media;
    }
	public void stampaVoti () 
    {

        //super.stampaInfo(); //posso fare tutto qua sfruttando la super.

        System.out.println("\n Classe : " + classe);
        System.out.println("\n Voti : " + voti);

        for(int i=0; i<numVoti; i++)
        {
            System.out.println(" "+ voti[i]);
        
            System.out.println(" ");
        }
    }


}