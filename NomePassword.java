import javax.crypto.interfaces.PBEKey;
import javax.lang.model.util.ElementScanner6;
import javax.net.ssl.TrustManager;

import java.util.Scanner;   // Importo la funzionalità scanner della libreria
import java.util.ArrayList;



class NomePassword {
    
    public static void main(String[] args)
    {
        //Dichiaro le variabili
        boolean ControlloNP=true;
        boolean Controllo=true;

        //Dichiaro oggetti Scanner
        Scanner oggetto=new Scanner(System.in);
        Scanner oggettostring=new Scanner(System.in);
        Scanner opzione=new Scanner(System.in);

        ///Dichiaro L'array per interi e quello per stringhe con liste
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<String> list2 = new ArrayList<String>();

        do
        {
            if(ControlloNP==true)
            {
                //Richiedi nome e password
                    System.out.println("------Start-----");
                    System.out.println("Inserisci il nome!");
                    String nome=oggetto.nextLine();
                    System.out.println("Inserisci la password!");
                    String password=oggetto.nextLine();

                //Richiedi conferma nome e password
                    System.out.println("Conferma il nome");
                    String confnome=oggetto.nextLine();
                    System.out.println("Conferma la password");
                    String confpassword=oggetto.nextLine();

                //Controlla se il nome e la password coincidono
                    if(nome.equals(confnome) && password.equals(confpassword))
                    {
                        System.out.println("Il nome e la password sono corretti");
                        do
                        {
                            //Chiedo all'utente quale opzione vuole scegliere dal menu
                            System.out.println("----------MENU----------");
                            System.out.println("Scelgi (1) per il sottomenu dei nomi,(2) per il sottomenu dell'età, (3) per stampare, (4) per uscire");
                            int opz=opzione.nextInt();

                            if(opz==1)
                            {
                                //Chiamo il sottomenu per i nomi
                                funzionistring(list2);
                            }
                            else if(opz==2)
                            {
                                //Chiamo il sottomenu per l'età
                                funzionint(list);
                            }
                            else if(opz==3)
                            {
                                //Chiedi all'utente quale array vuole stampare
                                System.out.println("Vuoi stampare la lista dei nomi(1) o la lista dell'età(2)?");
                                int scelta=oggetto.nextInt();

                                if(scelta==1)
                                {
                                    //Stampo l'array di strighe
                                    System.out.println("Stampo la lista di nomi:");
                                    System.out.println(list2);
                                    
                                }
                                else if(scelta==2)
                                {
                                    // Stampo l'array di interi
                                    System.out.println("Stampo la lista di età:");
                                    System.out.println(list);
                                }
                                //Se la scelta è diversa da quelle indicate mi da un allert e ricomincia dal menu
                                else if(scelta!=1 && scelta!=2)
                                System.out.println("Inserisci una scelta valida!");
                            }
                            else if(opz==4)
                            {
                                //Stampo l'array di strighe
                                System.out.println("Ecco la lista aggiornata dei nomi:");
                                System.out.println(list2);
                                // Stampo l'array di interi
                                System.out.println("Ecco la lista aggiornata delle età:");
                                System.out.println(list);
                                
                                
                                //Richiedi se sono queste le modifiche che vuole apportare
                                System.out.println("Sei sicuro di voler apportare queste notifiche? Y/N");
                                String sn=oggettostring.nextLine();
                                if(sn.equalsIgnoreCase("Y"))
                                {
                                    //Richiedi la password per confermare le notifiche
                                    int conta=0;
                                    for(int i=0;i<3;i++)
                                    {
                                    System.out.println("Conferma la tua Password");
                                    String confpassword2=oggetto.nextLine();
                                    if(confpassword2.equals(password))
                                    {
                                        System.out.println("Modifiche apportate!");
                                        Controllo=false;
                                        ControlloNP=false;
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Password sbagliata!");
                                        conta++;
                                    }
                                    }
                                    if(conta>=3)
                                    {
                                    //Torno al menu e ricomincio da capo
                                    System.out.println("Password sbagliata 3 volte. Mi dispiace, torni al menù");
                                    }
                                }

                            }
                            //Se la scelta è diversa da quelle indicate mi da un allert e ricomincia dal menu
                            else if(opz!=1 && opz!=2 && opz!=3 && opz!=4)
                                System.out.println("Inserisci una scelta valida!");
        
                        }
                        while(Controllo==true);
                    }
                    else
                        System.out.println("---Nome o Password non coincidono, inserisci di nuovo entrambi!---");
                }
        }
        while(ControlloNP==true);
    }

    public static void funzionint(ArrayList<Integer> lista)
    {
        Scanner oggetto=new Scanner(System.in);

        System.out.println("-----SottoMenu-----");
        System.out.println("Vuoi Aggiungere(1), Rimuovere(2) o Modificare(3)?");
            int scelta=oggetto.nextInt();
        if(scelta==1)
        {
            //Chiedo all'utente cosa vuole aggiungere
            System.out.println("Aggiungi l'età:");
            //Ricevo in input il numero da aggiungere all'array
                try
                { 
                     int aggiungiInt=oggetto.nextInt();
    
                    //Inserisco l'elemento nell'array
                    lista.add(aggiungiInt);
                 }
                catch(Exception x)
                {
                    System.out.println("Non è un intero");
                }       // Qui si chiude il blocco try e catch
        }
        else if(scelta==2)
        {
            //Chiedo all'utente quale elemento vuole rimuovere
            System.out.println("Inserisci il numero dell'oggetto della lista da eliminare!");
            int rimuovi=oggetto.nextInt();
            lista.remove(rimuovi-1);
        }
        else if(scelta==3)
        {
            //Chiedo all'utente quale elemento voglio modificare
            System.out.println("Inserisci il numero dell'oggetto della lista da modificare!");
            int modifica=oggetto.nextInt();
            //Chiedo all'utente con cosa vuole modificare
            System.out.println("Inserisci la nuova età");
                 int nuovoins=oggetto.nextInt();
    
                    //Modifico l'array 
                    lista.set(modifica-1,nuovoins);
               
        }
        else if(scelta!=1 && scelta!=2 && scelta!=3)
            System.out.println("Inserisci una scelta valida!");

    }

    public static void funzionistring(ArrayList<String> lista)
    {
        Scanner oggetto=new Scanner(System.in);
        Scanner oggettostring=new Scanner(System.in);

        System.out.println("-----SottoMenu-----");
        System.out.println("Vuoi Aggiungere(1), Rimuovere(2) o Modificare(3)?");
            int scelta=oggetto.nextInt();
        if(scelta==1)
        {
            //Chiedo all'utente cosa vuole aggiungere
            System.out.println("Aggiungi il nome:");
            //Ricevo in input il numero da aggiungere all'array
            String aggiungiString=oggettostring.nextLine();
            //Inserisco l'elemento nell'array
                    lista.add(aggiungiString);
        }
        else if(scelta==2)
        {
            //Chiedo all'utente quale elemento vuole rimuovere
            System.out.println("Inserisci il numero dell'oggetto della lista da eliminare!");
            int rimuovi=oggetto.nextInt()-1;
            lista.remove(rimuovi);
        }
        else if(scelta==3)
        {
            //Chiedo all'utente quale elemento voglio modificare
            System.out.println("Inserisci il numero della lista da modificare!");
            int modifica=oggetto.nextInt()-1;
            //Chiedo all'utente con cosa vuole modificare
            System.out.println("Inserisci il nuovo nome");
                 String nuovoins=oggettostring.nextLine();
    
                    //Modifico l'array 
                    lista.set(modifica,nuovoins);
               
        }
        else if(scelta!=1 && scelta!=2 && scelta!=3)
            System.out.println("Inserisci una scelta valida!");

    }
    
}
