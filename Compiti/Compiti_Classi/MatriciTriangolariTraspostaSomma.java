import java.util.*;

class MatriciTriangolariTraspostaSomma{
    final static int N_MAX = 25;

    public static Random casuale = new Random();

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int n;
        int casMax;
        int cont=0;


        // Input dimensione matrice (n)
        do{
            System.out.println("\n Inserisci la dimensione della matrice :");
            n = input.nextInt();
        
        }while (n<=0 || n>N_MAX);

        //Input valore massimo casuale

        System.out.println("Inserisci il valore casuale massimo da generare : ");
        casMax = input.nextInt();

        //Creazione e inizializzazione matrice triangolare alta

          int[][] matrice = new int[n][n];
          for (int i=0; i<n; i++){
            cont ++;
            for (int j=i; j<n; j++){
                
                if (j>i){
                
                  matrice[i][j] = casuale.nextInt(casMax) + 1;

                }
                if (j==i){

                   matrice[i][j] = cont;
                }
            }
          }

        //stampa matrice
          // Stampa la matrice triangolare alta
        System.out.println("\n Matrice Triangolare ALTA \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%5d", matrice[i][j]);
            System.out.println("\n");}


         // Verifica se la matrice è  triangolare alta
        boolean triangAlta = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i && matrice[i][j] != 0) // Se trova un elemento non nullo sotto la diagonale principale, non è triangolare alta
                    triangAlta = false;
            }
        }

        if (triangAlta)
            System.out.println("\n La matrice è Triangolare ALTA");
        else
            System.out.println("\n La matrice NON è Triangolare ALTA");


            // Calcolo della trasposta
        


        //stampo matrice trasposta
        System.out.println("\n Matrice trasposta\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%5d", matrice[j][i]);// per trovare la triangolare bassa ho invertito [j][i]
            System.out.println("\n");}


         // Verifica se la matrice è  triangolare alta
        boolean triangBassa = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i && matrice[j][i] != 0) // Se trova un elemento non nullo sotto la diagonale principale, non è triangolare alta
                    triangBassa = false;
            }
        }

         if (triangAlta)
            System.out.println("\n La matrice è Triangolare BASSA");
        else
            System.out.println("\n La matrice NON è Triangolare BASSA");

        int [][] matSomma = new int[n][n];

        // trovo matSomma
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matSomma[i][j] = matrice[j][i]+ matrice[i][j];//sommo le due matrici
            }
        }
        //verificare la simmetria somma delle due parti
        boolean simmetriaSomma = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matSomma[i][j] != matSomma[j][i]) {
                    simmetriaSomma = false;
                    break; // Interrompe il ciclo interno al primo elemento non simmetrico trovato
                }
            }
            if (!simmetriaSomma) break; // Interrompe il ciclo esterno se è stata trovata una non-simmetria
        }

        System.out.println("\n Matrice Somma \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%5d", matSomma[i][j]);
            System.out.println("\n");}

            boolean simmetria = true;

            // controllo che nella diagonale ci siano sollo numeri pari
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matSomma[i][j] != matSomma[j][i]){ //ho invertito per sovraporre le diagonali
                    simmetria = false;
                    System.out.println("\n I numeri sulla diagonale non sono pari \n");
                    break;}

            if (matSomma[i][i] != 2*(i+1)){
                simmetria = false;
                System.out.println("\n La somma dei numeri dei numeri delle diagonali ");
                    break;
            }
                
                
            }
         }





      if(simmetria == true){
        System.out.println(" La matrice nella sua diagonale è pari ");
      }

      if(simmetria == false){
        System.out.println(" La matrice nella sua diagonale NON è pari ");
      }









    }
}