import java.util.Scanner;   // Importo la funzionalità scanner della libreria
class CicliConArray {
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

        //Chiedo all'utente quanto vuole che sia lungo l'array di interi
        System.out.println("Quanto è grande l'array di interi");
        int lunghint=oggetto.nextInt();

        //Chiedo all'utente quanto vuole che sia lungo l'array di interi
        System.out.println("Quanto è grande l'array di interi");
        int lunghstring=oggetto.nextInt();


        //Dichiaro L'array per interi e quello per stringhe
        int ArrayInt []= new int[lunghint];
        String ArrayString []= new String[lunghstring];

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
                        //Controllo se supera la lunghezza e in caso affermativo do errore
                        if(indiceint>=lunghint)
                             System.out.println("Limite superato!");
                        else
                        {   //Inserisco l'elemento nell'array
                        ArrayInt[indiceint]= aggiungiInt;
                        indiceint++;
                        }
                        
                    }
                  else
                    if(scelta==2)
                    {
                        //Ricevo in input il numero da aggiungere all'array
                        String aggiungiString=oggettostring.nextLine();
                        //Controllo se supera la lunghezza e in caso affermativo do errore
                        if(indicestring>=lunghstring)
                             System.out.println("Limite superato!");
                        else
                        {   //Inserisco l'elemento nell'array
                        ArrayString[indicestring]=aggiungiString;
                        indicestring++;
                        }
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
                        for(int i=0;i<lunghint;i++)
                        {
                            System.out.println(ArrayInt[i]);
                        }
                    }
                    else
                    if(scelta==2)
                    {
                        //Stampo l'array di strighe
                        System.out.println("Stampo l'array di stringhe:");
                        for(int i=0;i<lunghstring;i++)
                        {
                            System.out.println(ArrayString[i]);
                        }
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
