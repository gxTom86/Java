class Prog_StudenteLaureato
{
	public static void main(String args[])
	{
	Studente studente[] = new Studente[50];
	StudenteLaureato[] studenteLaureato = new StudenteLaureato[25];


	studente[0] = new Studente("Tiziana","De medici","t334gr");
	studente[1] = new Studente("Giulia","Esposito","4rg545");
	studente[2] = new Studente("Leo","Shjjmd","dfert");
	studente[3] = new Studente("Tiziana","Ostillo","jhry5989");
	studente[4] = new Studente("Cristina","Sborrurz","hruejf4");

	StudenteLaureato[0] = new studente("Tiziana","De medici","t334gr","La mia vita"," Torino",1492);
	StudenteLaureato[1] = new studente("Leo","Shjjmd","dfert","La mia Repubblica","Milano",2003);
	StudenteLaureato[2] = new studente("Giovanni","Verga","1d45g","Le emmoroidi","Genova",2006);

		for(int i=0; i<5; i++)
		{
			System.out.println(" "+ studenti[i].stampaDati());
		}

			for(int i=0; i<3; i++)
			{
			System.out.println(" " + studenteLaureato[i].stampaDati);
			}

				for(int i=0; i<3;i++)
				{
					if(studenteLaureato[i].equals("Milano"))//mettere la equals
					{
						System.out.println(studenteLaureato[i].stampaDati);
					}
				}
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(studenteLaureato[i].getNome == studente[j].getNome && studenteLaureato[i].getCognome == studente[j].getCognome)
			{
			System.out.println("studenteLaureato[i].stampaDati");
			}
		}
	}

	for(int i=0;i<3;i++)
	{
		if(Repubblica.indexOf(studenteLaureato[i].getTitoloTesi() != -1))
		{
			System.out.println(" " + studenteLaureato[i].stampaDati());
		}
	}


	}

}