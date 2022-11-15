import java.util.Scanner;   // Importo la funzionalità scanner della libreria
import java.util.ArrayList;

class ArrayListEsercizio
{
    public static void main(String[] args)
    {
        //Valorizzo le mie variabile    
        boolean Controllo=true;
        int indiceint=0;
        int indicestring=0;

        //Creo oggetti scanner
        Scanner opzione=new Scanner(System.in);
        Scanner oggetto=new Scanner(System.in);
        Scanner oggettostring= new Scanner(System.in);

        ///Dichiaro L'array per interi e quello per stringhe con liste
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();

        do
        {
            if(Controllo==true)
            {
                
                //Chiedo all'utente quale opzione vuole scegliere dal menu
                System.out.println("----------MENU----------");
                System.out.println("Scelgi 1 per aggiungere,2 per stampare,3 per uscire");
                int opz=opzione.nextInt();

                if(opz==1)
                {
                
                    //Chiedo all'utente se vuole aggiungere 
                    System.out.println("Scelgi se vuoi riempire un array di interi(1) o stringhe(2)");
                    int scelta=oggetto.nextInt();

                    //Chiedo all'utente cosa vuole aggiungere
                    System.out.println("Cosa vuoi aggiungere all'array?");
                    if(scelta==1)
                    {
                        //Ricevo in input il numero da aggiungere all'array
                        int aggiungiInt=oggetto.nextInt();
                        //Inserisco l'elemento nell'array
                        list.add(aggiungiInt);
                        indiceint++; 
                                            
                    }
                  else
                    if(scelta==2)
                    {
                        //Ricevo in input il numero da aggiungere all'array
                        String aggiungiString=oggettostring.nextLine();
                        //Inserisco l'elemento nell'array
                        list2.add(aggiungiString);
                        indicestring++;
                        
                    }
                    //Se la scelta è diversa da quelle indicate mi da un allert e ricomincia dal menu
                    else if(scelta!=1 && scelta!=2)
                        System.out.println("Inserisci una scelta valida!");
                }
                else if(opz==2)
                {
                    //Chiedi all'utente quale array vuole stampare
                    System.out.println("Vuoi stampare l'array di interi(1) o l'array di stringhe(2)?");
                    int scelta=oggetto.nextInt();

                    if(scelta==1)
                    {
                        // Stampo l'array di interi
                        System.out.println("Stampo l'array intero:");
                        for(int i: list)
                            System.out.println(i);
                    }
                    else
                    if(scelta==2)
                    {
                        //Stampo l'array di strighe
                        System.out.println("Stampo l'array di stringhe:");
                        for(String i: list2)
                            System.out.println(i);
                    }
                    //Se la scelta è diversa da quelle indicate mi da un allert e ricomincia dal menu
                    else if(scelta!=1 && scelta!=2)
                    System.out.println("Inserisci una scelta valida!");

                }
                else if(opz==3)
                    Controllo=false;
                //Se la scelta è diversa da quelle indicate mi da un allert e ricomincia dal menu
                else if(opz!=1 && opz!=2 && opz!=3)
                    System.out.println("Inserisci una scelta valida!");
            }
           
        }
        while(Controllo==true);
        
    }
    
}
