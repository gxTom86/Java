import java.util.*;

class Esercizio_1_felicio{
	
	public static Scanner scanner  = new Scanner(System.in);
	
	public static void main (String args[]){




//Scrivi un programma Java che verifica se un numero intero è positivo, negativo o zero.


		System.out.println(" Inserisci un numero ");
		int scelta = scanner.nextInt();

		

		if(scelta > 0){

			System.out.println(" il numero è positivo");	
		}

		else if(scelta<0){
			System.out.println(" il numero è negativo ");
		}

		else{
			System.out.println(" il numero è 0 ");
		}
			
			
		



	}
}