import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class EsercizioVettori
{
	public static Scanner scanner  = new Scanner(System.in);

	public static void main (String args[])
	{


		System.out.println("Quanti elementi vuoi utilizzare ?");
		int elementi = scanner.nextInt();

		if (elementi > 30 )
		{
		
			System.out.println("Il valore inserito deve essere minore [30]");
			System.exit(0);
	
		}

		if (elementi < 0 )
		{
			System.out.print("Il valore inserito non deve essere minore di [0]");
			System.exit(0);
		}


			System.out.println("Qual è il numero massimo da generare :  ");
			int maxValore = scanner.nextInt();

			
			int vNumeri[]= new int[30];

			int vMaggioriPari[]= new int[30];

			int vMinoriDispari[]= new int[30];


	
	


			Random random = new Random();

			int max = 0;

			int min = maxValore;

			float vMediaPari = 0;

			int sommaPari = 0;

			int contatorePari = 0;

			float vMediaDispari = 0;

			int sommaDispari = 0;

			int contatoreDispari = 0;


				
				for(int i=0; i<elementi; i++)
			{
				vNumeri[i] = random.nextInt(maxValore) + 1;

				System.out.println("Ecco il numeri generati : " + vNumeri[i]);

				if (vNumeri[i] > max)

					{
						 max = vNumeri[i];

					}

				if (vNumeri[i] < min)
				{
					min =  vNumeri[i];
				}
			
			}
				

				
				for(int i=0; i<elementi; i++)

				{

					if (vNumeri[i] % 2 == 0)

					{
							sommaPari += vNumeri[i];

							contatorePari ++;

					}
						
							else{
								sommaDispari += vNumeri[i];

								contatoreDispari ++;
							}
						

							
							
				

				}

				 vMediaPari =(sommaPari/(float)contatorePari);

				vMediaDispari =((float)sommaDispari/contatoreDispari);


			System.out.println("\n il numero massimo è : " + max);
			
			System.out.println("\n il numero minimo è : " + min);
			
			System.out.println("\n la media dei numeri pari è: " + vMediaPari);

			System.out.println("\n la media dei dispari è: " + vMediaDispari);




			for (int i = 0; i < elementi; i++)
				{


					if (vNumeri[i] % 2 == 0 && vNumeri[i] > vMediaPari)

				{
					vMaggioriPari[i] = vNumeri[i];

					
				}


					if (vNumeri[i] % 2 != 0 && vNumeri[i] < vMediaDispari)
					
					{

						vMinoriDispari[i] = vNumeri[i];

						System.out.println("\n il vettore con numeri dispari minore della media dispari : " + vMinoriDispari[i]);
						System.out.println("\n il vettore pari superiori alla media dei pari : " + vMaggioriPari[i]);

					}
				}

				

			




			


		



		}
	}



