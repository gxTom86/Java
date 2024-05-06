
import java.util.Scanner;

class MainCd_02 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);


        
        Cd_02  disco1 = new Cd_02(" ", 0);

        
    }

    public static void dati(Cd_02 disco, Scanner input)
        {

            String scelta;
            String titolo;
            int durata = 0;

            System.out.println("-+-+-+-+-+-+-+-+-+-");
            System.out.println("1 Inserire Nuova canzone ");
            System.out.println("2 Vedere disco ");
            System.out.println("Uscire [*]");

            scelta = input.nextLine();
            System.out.print(" ");
            

            

            do
            {
                switch(scelta)
                {
                    case ("1"):
                    System.out.print("Inserire il titolo : ");
                    titolo = input.nextLine();
                    disco.setTitolo(titolo);
    
                    System.out.println("Inserisci la durata : ");
                    durata = Integer.parseInt(input.nextLine());
                    disco.setDurata(durata);
    
                    break;
    
                    case("2"):
                    System.out.println("Ecco la set-list : ");
                    System.out.println("");
    
                    break;
    
    
                    default:
                    if(!scelta.equals("*"))
                    {
                        System.out.println(" Input non valido ");
                    }
                    break;
                }

                
                
            }while(!scelta.equals("*"));
        }
}
